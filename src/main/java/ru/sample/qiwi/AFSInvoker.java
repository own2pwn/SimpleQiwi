package ru.sample.qiwi;

import com.sun.xml.internal.ws.fault.ServerSOAPFaultException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.DefaultHttpClient;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import ru.sample.qiwi.Externalsystems.HTTPSExternalSystem;
import ru.sample.qiwi.Helpers.StringHelper;
import ru.sample.qiwi.Helpers.XMLHelper;
import ru.sample.qiwi.encryptnormmodule.EncryptNormModule;
import ru.sample.qiwi.encryptnormmodule.Hash;
import ru.sample.qiwi.soap.ru.mbtc.afs.*;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Дмитрий Астахов on 18.08.2016.
 */
public class AFSInvoker {
    private static String url = "http://icrs.demo.nbki.ru/nbch-afs";
    private EncryptNormModule encryptNormModule = new EncryptNormModule();


    public void main() throws Exception, ParseException  {
        Document doc = null;
        String result = null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        builder = factory.newDocumentBuilder();
        doc = builder.parse(new File("AFS_request.xml"));
        String xmlFile = XMLHelper.convertToString(doc);

        String[] hashInput = {"AFS_request.xml"};
        ru.nbch.fraud.hash.Hash.main(hashInput);
        String b = encryptNormModule.run(xmlFile);

        // Инциализация параметров запроса
        MatchService matchSevice = new MatchService(); // Создаем сервис
        Match port = matchSevice.getMatchBindingPort(); // Создаем порт

        AfsRequestType request = createRequestAFS(b);

        // Запрос
        AfsResponseType response = null;
        try {
            response = port.match(request);
        } catch (ServerSOAPFaultException e) {
            throw new Exception("(AFS)Ошибка запроса к сервису AFS:" + e.getMessage());
        }

        result = parseResponseAFS(response);
    }

    public static String parseResponseAFS(AfsResponseType response) throws Exception, ParserConfigurationException{
        String resultXML = null;
        Document doc = null;

        Map<String, String> params = new HashMap<String, String>();
        params.put("action", response.getAction());
        params.put("correlationId", response.getCorrelationId());
        params.put("ruleSetId", response.getRuleSetId());
        params.put("duration", String.valueOf(response.getDuration()));
        params.put("appId", response.getAppId());
        params.put("appVersion", String.valueOf(response.getAppVersion()));
        params.put("appsCount", String.valueOf(response.getAppsCount()));
        params.put("rulesCount", String.valueOf(response.getRulesCount()));
        params.put("matchCount", String.valueOf(response.getMatchCount()));
        params.put("matchResult", null);

        doc = XMLHelper.generateXmlFromParams(params, "response");

        Document docMatch = null;
        Node node = null;
        Node nodeChild;

        if (response.getMatchCount() != null) {
            MatchType match = null;
            node = doc.getElementsByTagName("matchResult").item(0);
            for (int i = 0; i < response.getMatchCount(); i++) {
                match = response.getMatchResult().getMatch().get(i);
                params.clear();

                if (match.getAppId() != null) {
                    params.put("appId", match.getAppId());
                }

                if (match.getDescription() != null) {
                    params.put("description", match.getDescription());
                }

                if (match.getRule() != null) {
                    params.put("rule", match.getRule());
                }

                params.put("appVersion", String.valueOf(match.getAppVersion()));

                if (match.getNew() != null) {
                    params.put("new", String.valueOf(match.getNew()));
                }

                docMatch = XMLHelper.generateXmlFromParams(params, "match");
                nodeChild = doc.importNode(docMatch.getDocumentElement(), true);
                node.appendChild(nodeChild);
            }
        }

        resultXML = XMLHelper.convertToString(doc);

        return resultXML;
    }

    public static AfsRequestType createRequestAFS(String inputXML) throws ParserConfigurationException, IOException, SAXException{
        AfsRequestType request = new AfsRequestType(); // Запрос
        Document doc = XMLHelper.parseXml(inputXML);

        // Логин и пароль
        AuthType auth = new AuthType();
        auth.setLogin("MF01BB000012"); // TODO: getConnectionParams: Login
        auth.setPassword("VvJHB8zS"); // TODO: getConnectionParams: Password
        request.setAuth(auth);

        // Set Action
        request.setAction("matchupdate");
        request.setRuleSetId("MAIN_2"); // TODO: Какое правило использовать?

        // Start Application
        ApplicationType application = new ApplicationType();
        application.setMemberCode("MF01BB000012"); // TODO: getConnectionParams: MemberCode
        application.setDate(getCurrentDate("dd.MM.yyyy"));
        application.setId("452521"); // TODO: Уникальный номер заявки

        // Start Application -> Details
        DetailsType details = new DetailsType();
        details.setTotalCredit(BigDecimal.valueOf(15000));
        details.setCurrency(Td17.RUB);

        // End Application -> Details
        application.setDetails(details);

        // Start Application -> Client
        ClientType client = new ClientType();
        client.setId(BigInteger.valueOf(1));
        client.setApplicantType((byte)1);
        client.setSurname(XMLHelper.evaluateXPath(doc, "Applications/Application/client/surname"));
        client.setFirstname(XMLHelper.evaluateXPath(doc, "Applications/Application/client/firstname"));
        client.setMiddlename(XMLHelper.evaluateXPath(doc, "Applications/Application/client/middlename"));
        client.setBirthdate(XMLHelper.evaluateXPath(doc, "Applications/Application/client/birthdate"));
        client.setBirthPlace(XMLHelper.evaluateXPath(doc, "Applications/Application/client/birthPlace"));
        client.setCitizenship(Td18.fromValue(XMLHelper.evaluateXPath(doc, "Applications/Application/client/citizenship")));
        client.setEducation(Byte.parseByte(XMLHelper.evaluateXPath(doc, "Applications/Application/client/education")));
        client.setGender(Byte.parseByte(XMLHelper.evaluateXPath(doc, "Applications/Application/client/gender")));

        // Start Application -> Client -> Doc
        DocType docAfs = new DocType();
        docAfs.setDocType((byte)21); // Тип документа: паспорт
        docAfs.setSeriesNumber(XMLHelper.evaluateXPath(doc, "Applications/Application/client/doc/seriesNumber"));
        docAfs.setIssueDate(XMLHelper.evaluateXPath(doc, "Applications/Application/client/doc/issueDate"));

        client.getDoc().add(docAfs);
        // End Application -> Client -> Doc

        // Start Application -> Client -> Address
        AddressType address = new AddressType();
        address.setAddrType((byte)2); // Фактический адрес
        address.setCountry(Td18.fromValue(XMLHelper.evaluateXPath(doc, "Applications/Application/client/address/country")));
        address.setCity(XMLHelper.evaluateXPath(doc, "Applications/Application/client/address/city"));
        address.setStreet(XMLHelper.evaluateXPath(doc, "Applications/Application/client/address/street"));
        address.setHouse(XMLHelper.evaluateXPath(doc, "Applications/Application/client/address/house"));
        address.setBlock(XMLHelper.evaluateXPath(doc, "Applications/Application/client/address/block"));
        address.setBuilding(XMLHelper.evaluateXPath(doc, "Applications/Application/client/address/building"));
        address.setApartment(XMLHelper.evaluateXPath(doc, "Applications/Application/client/address/apartment"));

        client.getAddress().add(address);
        // End Application -> Client -> Address

        // Start Application -> Client -> Phone
        PhoneType phone = new PhoneType();
        phone.setPhoneType((byte)4); // Мобильный телефон
        phone.setNumber(XMLHelper.evaluateXPath(doc, "Applications/Application/client/phone/number"));

        client.getPhone().add(phone);
        // End Application -> Client -> Phone

        application.getClient().add(client);
        // End Application -> Client

        request.setApplication(application);
        // End Application

        return request;
    }

    /**
     * Получение текущей даты
     * @param format Формат даты
     * @return Дата в формате format
     */
    public static String getCurrentDate(String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        Date date = new Date();

        return dateFormat.format(date);
    }
}
