package ru.sample.qiwi;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import ru.nbch.fraud.hash.Hash;
import ru.sample.qiwi.Externalsystems.HTTPSExternalSystem;
import ru.sample.qiwi.Helpers.StringHelper;
import ru.sample.qiwi.Helpers.XMLHelper;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Дмитрий Астахов on 22.08.2016.
 */
public class YandexMoneyInvoker extends HTTPSExternalSystem{
    YandexMoneyInvoker() {
        super(null);
    }

    @Override
    protected String getUrl() {
        return "https://bo-demo02.yamoney.ru:9094/webservice/iddata/api/idDataCheck";
    }

    @Override
    protected HttpEntity getHttpEntity(List<NameValuePair> requestParams) throws Exception {
//        StringEntity entityXML = null;
//        entityXML = new StringEntity(requestParams.get(0).getValue(), "windows-1251");
//        entityXML.setContentType("text/xml");
//
//        return entityXML;

        UrlEncodedFormEntity requestEntitty = null;

        try {
            requestEntitty = new UrlEncodedFormEntity(requestParams, "Windows-1251");
        } catch (UnsupportedEncodingException e) {
            throw new Exception("(Яндекс Deposite)Ошибка формирования запроса к сервису Яндекс");
        }

        return requestEntitty;
    }

    @Override
    public void setHeaders(HttpPost httpPost) {
//        httpPost.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
    }


    public void main() throws Exception {
        String name = "Иван";
        String lastname = "Иванов";
        String patronomyc = "Иванович";
        String seria = "1815";
        String number = "123456";
        String fioNumber = "";
        String walletNumber = "410039303350";
        String agentId = "200957"; // TODO: getConnectionParams: agentid

        name       = StringHelper.transliterate(StringHelper.replaceYoToYe(name.toUpperCase()));
        lastname   = StringHelper.transliterate(StringHelper.replaceYoToYe(lastname.toUpperCase()));
        patronomyc = StringHelper.transliterate(StringHelper.replaceYoToYe(patronomyc.toUpperCase()));

        fioNumber += lastname + "_" + name + "_" + patronomyc + "_" + seria + number;

        try {
            fioNumber = Base64.encodeBase64String(sha1(fioNumber).getBytes("windows-1251"));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            throw new Exception("(Яндекс FIO)Ошибка формирования запроса к сервису Яндекс", e); // TODO: Exception
        }

//        String inputXML = "<?xml version=\"1.0\" encoding=\"windows-1251\"?>\n" +
//                "<REQUEST>\n" +
//                "    <ACT_ID>" + agentId + "</ACT_ID>\\n\" +\n" +
//                "                \"    <VERSION>2.50</VERSION>\\n\" +\n" +
//                "                \"    <DSTACNT_NR>" + walletNumber + "</DSTACNT_NR>\\n\" +\n" +
//                "                \"    <ID_DATA>\\n\" +\n" +
//                "                \"        <IDDOC_HASH>" + fioNumber + "</IDDOC_HASH>\\n\" +\n" +
//                "                \"    </ID_DAT>\n" +
//                "</REQUEST>";
//
//        List<NameValuePair> requestParams = new ArrayList<NameValuePair>();
//        requestParams.add(new BasicNameValuePair("xml", inputXML));

        String ID_DATA = "<?xml version=\"1.0\" encoding=\"windows-1251\"?>\n" +
                "   <ID_DATA>\n" +
                "<IDDOC_HASH>" + fioNumber + "</IDDOC_HASH>\n" +
                "   </ID_DATA>\n";

        List<NameValuePair> requestParams = new ArrayList<NameValuePair>();
        requestParams.add(new BasicNameValuePair("ACT_ID", "idDataCheck"));
        requestParams.add(new BasicNameValuePair("VERSION", "2.50"));
        requestParams.add(new BasicNameValuePair("DSTACNT_NR", walletNumber));
        requestParams.add(new BasicNameValuePair("ID_DATA", ID_DATA));

        setConnectionSetting(TMFEnum.PKIX, SSLCEnum.TLSv1_2);
        String result = null;
        try {
            result = requestApi(requestParams);
        } catch (Exception e) {
            throw new Exception("(Яндекс FIO)Сетевая ошибка отправки запроса к сервису Яндекс", e); // TODO: Exception
        }

        Document doc = null;
        try {
            doc = XMLHelper.parseXml(result);
        } catch (IOException | SAXException | ParserConfigurationException e) {
            throw new Exception("(Яндекс FIO)Ошибка разбора ответа от сервиса Яндекс", e);
        }

        Node errorElem = doc.getElementsByTagName("response").item(0);
        if (errorElem.getAttributes().getNamedItem("code").getNodeValue() != "0"){
            String errorMessage = null;
            try {
                errorMessage = new String(XMLHelper.evaluateXPath(doc, "/response/error/tech-message").getBytes("Cp1251"));
            } catch (UnsupportedEncodingException e) {
                throw new Exception("(Яндекс FIO)Ошибка разбора ответа от сервиса Яндекс", e); // TODO: Exception
            }

            throw new Exception("(Яндекс FIO)Ошибка разбора ответа от сервиса Яндекс: " + errorMessage); // TODO: Exception
        }
    }

    public static String sha1(String input) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        input = "ZORIN_MAKSIM_R'EVICH_3210881008";
        MessageDigest mDigest = MessageDigest.getInstance("SHA-1");
        byte[] result = mDigest.digest(input.getBytes("Cp1251"));
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();
    }
}
