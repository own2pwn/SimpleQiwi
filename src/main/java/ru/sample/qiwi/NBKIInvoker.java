package ru.sample.qiwi;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.ContentInfo;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.SignedData;
import ru.sample.qiwi.Externalsystems.HTTPSExternalSystem;
import ru.sample.qiwi.Helpers.CMSHelper;
import ru.sample.qiwi.Helpers.StringHelper;
import ru.sample.qiwi.Helpers.XMLHelper;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tikhonin on 18.01.2016.
 */
public class NBKIInvoker extends HTTPSExternalSystem {

    private Logger log = LoggerFactory.getLogger(getClass());

    public NBKIInvoker() {
        super("");
    }

    @Override
    protected HttpEntity getHttpEntity(List<NameValuePair> requestParams) throws Exception {
        ByteArrayEntity requestEntitty = null;
        try {
            requestEntitty = new ByteArrayEntity(requestParams.get(0).getValue().getBytes("Cp1251"));
        } catch (UnsupportedEncodingException e) {
            throw new Exception("Ошибка преобразования XML в строку(НБКИ)", e);
        }
        return requestEntitty;
    }

    @Override
    public void setHeaders(HttpPost httpPost) {
        httpPost.setHeader(HttpHeaders.CONTENT_TYPE, "text/xml");
    }

    @Override
    protected String getUrl() {
        return "https://icrs.demo.nbki.ru/universalService";
//        return "https://icrs.demo.nbki.ru/doubleData";
    }

    public String main() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        builder = factory.newDocumentBuilder();
        String input = XMLHelper.convertToString(builder.parse(new File("DoubleData_request.xml")), "cp1251");

        log.info("Вызов сервиса НБКИ");
        String membercode = "MF01BB000000";
        String userid = "MF01BB000012";
        String password = "VvJHB8zS";

        if(StringHelper.isNullOrEmpty(membercode, userid, password)) {
            throw new Exception("Не заполнены учетные данные для доступа к сервису НБКИ(membercode, userid, password).");
        }

        Document documentRequest = null;
        try {
            //т.к. в самом xml стоит указание кодировки Windows-1251
            documentRequest = XMLHelper.parseXml(input, "Cp1251");
            //documentRequest = XMLHelper.parseXml(input);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new Exception("Ошибка разбора входного XML(НБКИ)", e);
        }
        documentRequest.getElementsByTagName("MemberCode").item(0).setTextContent(membercode);
        documentRequest.getElementsByTagName("Password").item(0).setTextContent(password);
        documentRequest.getElementsByTagName("UserID").item(0).setTextContent(userid);

        String xml = null;
        try {
            //т.к. в самом xml стоит указание кодировки Windows-1251
            xml = XMLHelper.convertToString(documentRequest, "Cp1251");
            //xml = XMLHelper.convertToString(documentRequest);
        } catch (TransformerException | UnsupportedEncodingException e) {
            throw new Exception("Ошибка преобразования XML в строку(НБКИ)", e);
        }

        List<NameValuePair> requestParams = new ArrayList<NameValuePair>();
        requestParams.add(new BasicNameValuePair("xml", xml));

        HttpEntity response = null;
//        setConnectionSetting(TMFEnum.PKIX, SSLCEnum.TLSv1_2);
        try {
            response = requestRawApi(requestParams);
        } catch (IOException e) {
            throw new Exception("Сетевая ошибка отправки запроса сервису НБКИ:" + e.getMessage(), e);
        }

        String result = null;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            response.writeTo(baos);
        } catch (IOException e) {
            //e.printStackTrace();
            throw new Exception("Сетевая ошибка получения ответа от сервиса НБКИ:" + e.getMessage(), e);
        }
        byte[] resultBytes = baos.toByteArray();
        String rawResult = null;
        try {
            rawResult = new String(resultBytes, "cp1251");
        } catch (UnsupportedEncodingException e) {
            throw new Exception("Ошибка декодирования(неверная кодировка) ответа от сервиса НБКИ");
        }

        //если ошибка то приходит без цифровой подписи
        Document doc = null;
        try {
            doc = XMLHelper.parseXml(rawResult);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            //если ошибка то продолжаем
            //throw new Exception("Ошибка разбора XML ответ от сервиса НБКИ", e);
        }
        if(doc != null && doc.getElementsByTagName("ctErr").getLength() > 0) {
            Node errorElement = doc.getElementsByTagName("ctErr").item(0);
            throw new Exception("Ошибка ответа сервиса НБКИ: " + errorElement.getTextContent());
        }

        //byte[] ar3 = decrypt(resultBytes);
        byte[] ar3 = new byte[0];
        try {
            ar3 = CMSHelper.unsignPKCS7(resultBytes);
        } catch (Asn1Exception | IOException e) {
            throw new Exception("Ошибка дешифрования ответа от сервиса НБКИ:" + e.getMessage(), e);
        }

        try {
            result = new String(ar3, "Cp1251");
        } catch (UnsupportedEncodingException e) {
            //e.printStackTrace();
            throw new Exception("Ошибка декодирования(неверная кодировка) ответа от сервиса НБКИ");
        }

        try {
            doc = XMLHelper.parseXml(result);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new Exception("Ошибка разбора XML ответ от сервиса НБКИ", e);
        }

        if(doc != null && doc.getElementsByTagName("ctErr").getLength() > 0) {
            Node errorElement = doc.getElementsByTagName("ctErr").item(0);

            //проверка на код возврата 1: No subject found for this inquiry(This is an informational reply, not an error. Your inquiry received a no hit.)
            NodeList nodeList = ((Element)errorElement).getElementsByTagName("Code");
            if(nodeList.getLength() > 0) {
                if(nodeList.item(0).getTextContent().trim().equalsIgnoreCase("1")) {
                    return result;
                }
            }
            throw new Exception("Ответа от сервиса НБКИ содержит ошибки: " + errorElement.getTextContent());
        }

        return result;
    }
}
