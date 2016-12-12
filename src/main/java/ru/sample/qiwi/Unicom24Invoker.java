//package ru.sample.qiwi;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.apache.http.NameValuePair;
//import org.apache.http.client.HttpClient;
//import org.apache.http.conn.ClientConnectionManager;
//import org.apache.http.conn.scheme.Scheme;
//import org.apache.http.conn.scheme.SchemeRegistry;
//import org.apache.http.conn.ssl.SSLSocketFactory;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.http.message.BasicNameValuePair;
//import org.json.JSONObject;
//import org.json.XML;
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.Node;
//import org.w3c.dom.NodeList;
//import ru.sample.qiwi.Externalsystems.HTTPSExternalSystem;
//import ru.sample.qiwi.Helpers.StringHelper;
//import ru.sample.qiwi.Helpers.XMLHelper;
//
//import javax.net.ssl.SSLContext;
//import javax.net.ssl.TrustManager;
//import javax.net.ssl.X509TrustManager;
//import java.io.IOException;
//import java.security.cert.CertificateException;
//import java.security.cert.X509Certificate;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
///**
// * Created by Дмитрий Астахов on 23.08.2016.
// */
//public class Unicom24Invoker {
//    public static void main(String[] args) throws Exception{
//        HTTPSExternalSystem hes = new HTTPSExternalSystem(null);
//
////        log.info("Вызов сервиса Unicom24");
//        Map<String, String> inputParams = StringHelper.splitParamsStringToMap(args[0]);
//
//        if (StringHelper.isNullOrEmpty(inputParams.get("first_name"), inputParams.get("middle_name"), inputParams.get("second_name"), inputParams.get("passport"))) {
//            throw new Exception("(Unicom24)Не заполнены обязательные поля(first_name, middle_name, second_name, passport) для поиска в сервисе Unicom24.");
//        }
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        String jsonRequest = null;
//        try {
//            jsonRequest = objectMapper.writeValueAsString(inputParams);
//        } catch (Exception e) {
//            throw new Exception("(Unicom24)Ошибка генерации JSON:" + e.getMessage(), e);
//            //e.printStackTrace();
//        }
//
//        StringBuffer result = new StringBuffer();
//        List<NameValuePair> requestParams = new ArrayList<NameValuePair>();
//        requestParams.add(new BasicNameValuePair("json", jsonRequest));
//        String responseString = "{\"error\":{\"first_name\":[\"Это поле обязательно.\"],\"second_name\":[\"Это поле обязательно.\"],\"passport\":[\"Это поле обязательно.\"]}}";
//        try {
//            hes.setConnectionSetting(HTTPSExternalSystem.TMFEnum.PKIX, HTTPSExternalSystem.SSLCEnum.TLSv1_2);
//            responseString = hes.requestApi(requestParams);
//        } catch (IOException e) {
//            throw new Exception("(Unicom24)Сетевая ошибка отправки запроса сервису Unicom24:" + e.getMessage(), e);
//        }
//
//
//        JSONObject responseJson = new JSONObject(responseString);
//        JSONObject rootJson = new JSONObject();
//        rootJson.put("response", responseJson);
//        String responseXml = XML.toString(rootJson);
//
//        Document responseDocument = null;
//        try {
//            responseDocument = XMLHelper.parseXml(responseXml);
//        } catch (Exception e) {
//            throw new Exception("(Unicom24)Ошибка разбора ответа(запрос результатов обработки) от сервиса Unicom24", e);
//        }
//
//        //TODO: проверить "result"\"error"
//        if(responseDocument.getElementsByTagName("error").getLength() > 0) {
//            String errorMessage = "(Unicom24)Ответа от сервиса Unicom24 содержит ошибки:";
//            NodeList errorElements = responseDocument.getElementsByTagName("error").item(0).getChildNodes();
//            for(int i = 0; i< errorElements.getLength(); i++) {
//                errorMessage += errorElements.item(i).getNodeName() + " - " + errorElements.item(i).getTextContent() + "; ";
//            }
//            throw new Exception(errorMessage);
//        }
//
//        //TODO: проверить вырезать результативную часть НБКИ
//        Document resultDocument = null;
//        try {
//            resultDocument = XMLHelper.generateEmptyXmlDocument("product");
//        } catch (Exception e) {
//            throw new Exception("(Unicom24)Ошибка создания XML", e);
//        }
//
//        Element preplyElement = resultDocument.createElement("preply");
//        resultDocument.getDocumentElement().appendChild(preplyElement);
//
//        if(responseDocument.getElementsByTagName("report").getLength() < 1) {
//            if (responseDocument.getElementsByTagName("detail").getLength() > 0) {
//                String errorMessage = "(Unicom24) Ответа от сервиса Unicom24 содержит ошибки:";
//                errorMessage += XMLHelper.evaluateXPath(responseDocument, "/response/detail");
//                throw new Exception(errorMessage);
//            }
//            else
//                throw new Exception("(Unicom24)Структура ответа не корректна. Отсутствует тэг report.");
//        }
//
//        Node reportElement = resultDocument.importNode(responseDocument.getElementsByTagName("report").item(0), true);
//        preplyElement.appendChild(reportElement);
//
//        String result123 = null;
//        try {
//            result123 = XMLHelper.convertToString(resultDocument);
//        } catch (Exception e) {
//            throw new Exception("(Unicom24)Ошибка преобразования результируещего XML", e);
//        }
//
//        //return result;
//    }
//
//    public static HttpClient wrapClient(HttpClient base) {
//        try {
////            CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
////            credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials("kos33@mail.ru", "1234567"));
////            ((DefaultHttpClient)base).getCredentialsProvider().setCredentials(credentialsProvider);
//            SSLContext ctx = SSLContext.getInstance("TLS");
//            X509TrustManager tm = new X509TrustManager() {
//
//                public void checkClientTrusted(X509Certificate[] xcs, String string) throws CertificateException {
//                }
//
//                public void checkServerTrusted(X509Certificate[] xcs, String string) throws CertificateException {
//                }
//
//                public X509Certificate[] getAcceptedIssuers() {
//                    return null;
//                }
//            };
//            ctx.init(null, new TrustManager[]{tm}, null);
//            SSLSocketFactory ssf = new SSLSocketFactory(ctx);
//            ssf.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
//            ClientConnectionManager ccm = base.getConnectionManager();
//            SchemeRegistry sr = ccm.getSchemeRegistry();
//            sr.register(new Scheme("https", ssf, 443));
//
//            return new DefaultHttpClient(ccm, base.getParams());
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            return null;
//        }
//    }
//}
