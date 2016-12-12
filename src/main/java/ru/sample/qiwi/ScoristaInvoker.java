package ru.sample.qiwi;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.message.BasicNameValuePair;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import ru.sample.qiwi.Externalsystems.HTTPSExternalSystem;
import ru.sample.qiwi.Helpers.HashHelper;
import ru.sample.qiwi.Helpers.StringHelper;
import ru.sample.qiwi.Helpers.XMLHelper;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathConstants;
import java.io.File;
import java.io.IOException;
import java.nio.charset.UnsupportedCharsetException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Дмитрий Астахов on 02.09.2016.
 */
public class ScoristaInvoker extends HTTPSExternalSystem {
    private long sleepTime = 15000; // Время задержки между запросом "Требование экспертизы" и "Кредитное решение"
    private long sleepTimeRepeat = 5000; // Время задержки между повторным запросом "Кредитное решение"

    ScoristaInvoker() {
        super(null);
    }

    @Override
    protected String getUrl() {
        return "https://api.scorista.ru/mixed/xml";
    }

    @Override
    protected HttpEntity getHttpEntity(List<NameValuePair> requestParams) throws Exception {
        StringEntity stringEntitty = null;

        try {
            stringEntitty = new StringEntity(requestParams.get(0).getValue(), "UTF-8");
        } catch (UnsupportedCharsetException e) {
            throw new Exception("(Скориста)Ошибка формирования запроса к сервису Скориста:" + e.getMessage());
        }

        return stringEntitty;
    }

    @Override
    public void setHeaders(HttpPost httpPost) {
        String username = "afedorov@domadengi.ru"; // TODO: getConnectionParams: username
        String secret = "3bfc749673a699a6ca810cc40e83da6457cda8ef"; // TODO: getConnectionParams: secret
        String nonce = null;
        String password = null;

        try {
            nonce = StringHelper.toHexString(HashHelper.getSHA1Hash(UUID.randomUUID().toString())); // UniqId TODO: ???????????????
            password = StringHelper.toHexString(HashHelper.getSHA1Hash(nonce + secret));
        } catch (NoSuchAlgorithmException e) {
//            throw new Exception(""); TODO: Exception
        }

        httpPost.setHeader(HttpHeaders.CONTENT_TYPE, "application/xml");
        httpPost.setHeader("username", username);
        httpPost.setHeader("nonce", nonce);
        httpPost.setHeader("password", password);
    }

    public void main() throws ParserConfigurationException, IOException, SAXException, TransformerException, Exception {
        String status = null;
        String errorMessage = null;
        String response = null;
        Document doc = null;
        String result = null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        builder = factory.newDocumentBuilder();
        doc = builder.parse(new File("Scorista_request.xml"));

        // Получение данных Equifax из запроса
        builder = factory.newDocumentBuilder();
        Document equifaxDoc = builder.newDocument();
        Node equifaxNode = (Node) XMLHelper.evaluateXPath(doc, "/form/Equifax", XPathConstants.NODE);
        equifaxNode = equifaxDoc.importNode(equifaxNode, true);
        equifaxDoc.appendChild(equifaxNode);

        // Обработка данных Equifax, преобразование данных в Base64
        String equifax = XMLHelper.convertToString(equifaxDoc);
        equifax = equifax.replace("encoding=\"UTF-8\"", "encoding=\"windows-1251\"");
        setNodeValueXML(doc, "/form/Equifax", Base64.encodeBase64String(equifax.getBytes("cp1251")));
        String xmlFile = XMLHelper.convertToString(doc);

        List<NameValuePair> requestParams = new ArrayList<NameValuePair>();
        requestParams.add(new BasicNameValuePair("xml", xmlFile));

        setConnectionSetting(TMFEnum.PKIX, SSLCEnum.TLSv1_2);

        // Запрос "Требование экспертизы"
        try {
            response = requestApi(requestParams);
        } catch (Exception e) {
            throw new Exception("(Скориста)Ошибка отправки запроса \"Требование экспертизы\": " + e.getMessage());
        }

//        errorMessage = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><response><status>ERROR</status><error><code>403</code><message>Not authorized</message></error></response>";
        if (response.contains("<html>")) {
            errorMessage = response.substring(response.indexOf("<title>") + 7, response.indexOf("</title>"));
            throw new Exception("(Скориста)Ошибка ответа \"Требование экспертизы\" от сервиса Скориста: " + errorMessage);
        }

        try {
            doc = XMLHelper.parseXml(response);
        } catch (IOException | SAXException | ParserConfigurationException e) {
            throw new Exception("(Скориста)Ошибка ответа \"Требование экспертизы\" от сервиса Скориста: " + e.getMessage());
        }

        status = doc.getElementsByTagName("status").item(0).getFirstChild().getNodeValue();
        if (status.equals("ERROR")) {
            errorMessage = XMLHelper.evaluateXPath(doc, "/response/error/message");
            throw new Exception("(Скориста)Ошибка ответа \"Требование экспертизы\" от сервиса Скориста: " + errorMessage);
        }

        // Получаем id заявки
        String requestID = doc.getElementsByTagName("requestid").item(0).getFirstChild().getNodeValue();

        // TODO: задерка 10 секунд
//        log.debug("Ждем {}мс", sleepTime);
        Thread.sleep(sleepTime);

        // Создаем запрос "Кредитное решение"
        String requestLoanDecision = "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                "<requestID>" + requestID + "</requestID>\n";

        requestParams.clear();
        requestParams.add(new BasicNameValuePair("xml", requestLoanDecision));
        int countRequest = 0; // Количество запросов

        // Производим запросы к сервису Скориста, по запросу "Кредитное решение"
        do {
            // TODO: задерка 5 секунд
//            log.debug("Ждем {}мс", sleepTimeRepeat);
            Thread.sleep(sleepTimeRepeat);

            // Запрос "Кредитное решение"
            try {
                response = requestApi(requestParams);
            } catch (Exception e) {
                throw new Exception("(Скориста)Ошибка отправки запроса \"Кредитное решение\" к сервису Скориста: " + e.getMessage());
            }

            // Обработка ответа
            try {
                doc = XMLHelper.parseXml(response);
            } catch (IOException | SAXException | ParserConfigurationException e) {
                throw new Exception("(Скориста)Ошибка ответа \"Кредитное решение\" от сервиса Скориста: " + e.getMessage());
            }

            status = doc.getElementsByTagName("status").item(0).getFirstChild().getNodeValue().toUpperCase();
            if (status.equals("ERROR")) {
                errorMessage = XMLHelper.evaluateXPath(doc, "/response/error/message");
                throw new Exception("(Скориста)Ошибка ответа сервиса Скориста по запросу \"Кредитное решение\": " + errorMessage);
            } else if (status.equals("DONE")) {
                break;
            }

            // log.debug("(Скориста)При запросе данные не выдались. Пробуем еще раз."); // TODO: log

            ++countRequest;
        } while (!status.equals("DONE"));// TODO: (countRequest > 0);

        if (countRequest == 0 && (status.equals("CHECK") || status.equals("PROCESS"))) {
            throw new Exception("(Скориста)Количество попыток обращений к сервису Скориста истекло, последний шаг: " + status);
        }

//        return response;
    }

    /**
     * Присвоение значений ноду
     * @param doc Документ XML
     * @param path Путь к ноду
     * @param data Данные для записи
     */
    public static void setNodeValueXML(Document doc, String path, String data) {
        Node node = null;

        node = (Node) XMLHelper.evaluateXPath(doc, path, XPathConstants.NODE);
        removeChilds(node);
        node.appendChild(doc.createTextNode("tmp"));
        node.getFirstChild().setNodeValue(data);
    }

    /**
     * Удаление дочерних узлов
     * @param node Корневой узел
     */
    public static void removeChilds(Node node) {
        while (node.hasChildNodes())
            node.removeChild(node.getFirstChild());
    }
}
