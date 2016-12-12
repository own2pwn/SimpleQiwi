package ru.sample.qiwi;

import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.*;
import org.apache.http.message.BasicNameValuePair;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import org.apache.http.client.methods.HttpPost;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ru.sample.qiwi.Externalsystems.HTTPSExternalSystem;
import ru.sample.qiwi.Helpers.StringHelper;
import ru.sample.qiwi.Helpers.XMLHelper;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by ������� ������� on 15.08.2016.
 */
public class QiwiInvoker extends HTTPSExternalSystem {
    private static CloseableHttpClient httpClient;
    private static String  phone;
    private static Pattern patternPhoneNumber = Pattern.compile("\\d{10}");
    private static String  url = "https://scoring-data.qiwi.com/scorephone.aspx";

    public QiwiInvoker(String connectionString) {
        super(connectionString);
    }
    public QiwiInvoker() {
        super("123123");
    }

    public void main() throws Exception, ParseException{
        //HTTPSExternalSystem hes = new HTTPSExternalSystem(null);
        phone = "9275089798";
        String extId = UUID.randomUUID().toString().replaceAll("-", "").substring(12); // Получаем букво-числовой id длинной 20 символов

        if (!patternPhoneNumber.matcher(phone).matches()){
            throw new Exception("Телефонный номер введен неверно");
        }

        // Теги файла XML завпроса
        Map<String, String> inputParams = new HashMap<String, String>();
        inputParams.put("extId", extId);
        inputParams.put("number", phone);
        inputParams.put("params", null);

        inputParams.put("type", "12312312");

        // Формирование XML
        Document doc = XMLHelper.generateXmlFromParams(inputParams, "request");

        doc.getElementsByTagName("type").item(0).getFirstChild().setTextContent("00000000");
        String azaza = XMLHelper.convertToString(doc);

        // Добавление аттрибутов к елементу params
        Element paramsElem = (Element)doc.getDocumentElement().getElementsByTagName("params").item(0);
        paramsElem.setAttribute("startdate", "2015-01-01");
        paramsElem.setAttribute("type", "y");
        paramsElem.setAttribute("count", "1");

        // Формирование XML для передачи
        String inputXML = XMLHelper.convertToString(doc);
        StringEntity entityXML = new StringEntity(inputXML, "UTF-8");
        entityXML.setContentType("text/xml");

        List<NameValuePair> requestParams = new ArrayList<NameValuePair>();
        requestParams.add(new BasicNameValuePair("xml", inputXML));

        setConnectionSetting(TMFEnum.PKIX, SSLCEnum.TLSv1_2);
        HttpEntity response = requestRawApi(requestParams);
        System.out.println("\nSending 'POST' request to URL : " + url);
//        System.out.println("Post parameters : " + post.getEntity());
        System.out.println("Response Code : " +
                response.getContent());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getContent(), "UTF-8"));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        // Првоерка ответа на валидность
        try {
            doc = XMLHelper.parseXml(result.toString());
        } catch (Exception e) {
            throw new Exception("Ошибка разбора ответа(запрос авторизации) от сервиса  QIWI", e);
        }

        String error = null;
        String rr = null;

        // Проверяем значение поля Result ответного XML
        rr = XMLHelper.evaluateXPath(doc, "/Response/Result");
        rr=null;
        if (StringHelper.isNullOrEmpty(rr) || rr.equals("ОК")) {
            // Достаем из XML описание ошибки
            error = XMLHelper.evaluateXPath(doc, "/Response/Description");

            throw new Exception("Ошибка ответа(запрос авторизации) от сервиса QIWI: " + error);
        }

        System.out.println(result.toString());
    }

    public static HttpClient wrapClient(HttpClient base) {
        try {
            SSLContext ctx = SSLContext.getInstance("TLS");
            X509TrustManager tm = new X509TrustManager() {

                public void checkClientTrusted(X509Certificate[] xcs, String string) throws CertificateException {
                }

                public void checkServerTrusted(X509Certificate[] xcs, String string) throws CertificateException {
                }

                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            };
            ctx.init(null, new TrustManager[]{tm}, null);
            SSLSocketFactory ssf = new SSLSocketFactory(ctx);
            ssf.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            ClientConnectionManager ccm = base.getConnectionManager();
            SchemeRegistry sr = ccm.getSchemeRegistry();
            sr.register(new Scheme("https", ssf, 443));
            return new DefaultHttpClient(ccm, base.getParams());
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    protected HttpEntity getHttpEntity(List<NameValuePair> requestParams) throws Exception {
        return new UrlEncodedFormEntity(requestParams);
    }

    @Override
    protected String getUrl() {
        return url;
    }
}
