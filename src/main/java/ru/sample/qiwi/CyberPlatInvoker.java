package ru.sample.qiwi;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import ru.sample.qiwi.Externalsystems.HTTPSExternalSystem;
import ru.sample.qiwi.Helpers.CMSHelper2;
import ru.sample.qiwi.Helpers.StringHelper;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.nio.charset.UnsupportedCharsetException;
import java.nio.file.Files;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 * Created by Дмитрий Астахов on 30.11.2016.
 */
public class CyberPlatInvoker extends HTTPSExternalSystem {
    private static Pattern patternResponse = Pattern.compile("\\d*");

    public CyberPlatInvoker() {
        super("");
    }

    @Override
    protected HttpEntity getHttpEntity(List<NameValuePair> requestParams) throws Exception {
        StringEntity entityXML = null;

        try {
            entityXML = new StringEntity(requestParams.get(0).getValue(), "UTF-8");
            entityXML.setContentType("application/x-www-form-urlencoded");
        } catch (UnsupportedCharsetException e) {
            throw new Exception("(CyberPlat)Ошибка формирования запроса к сервису CyberPlat", e);
        }

        return entityXML;
//        UrlEncodedFormEntity requestEntitty = null;
//
//        try {
//            requestEntitty = new UrlEncodedFormEntity(requestParams, "UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            throw new Exception("(CyberPlat)Ошибка формирования запроса к сервису CyberPlat");
//        }
//
//        return requestEntitty;
    }

    @Override
    public void setHeaders(HttpPost httpPost) {
//        String sd = this.getConnectionParams().get("dealer");
//        String ap = this.getConnectionParams().get("placereceiving");
//        String op = this.getConnectionParams().get("operator");

//        httpPost.setHeader(HttpHeaders.USER_AGENT, "Apache-HttpClient ver. 4.5.1, SD: " + sd + ", AP: " + ap + ", OP: " + op);
        httpPost.setHeader("X-CyberPlat-Proto", "SHA1RSA");
    }

    @Override
    protected String getUrl() {
        return "http://requestb.in/pzljhdpz";
    }

    public void main() throws Exception {
        String input = "phone=79262221133;";
        Map<String, String> inputParams = StringHelper.splitParamsStringToMap(input);

        List<NameValuePair> requestParams = new ArrayList<NameValuePair>();
        requestParams.add(new BasicNameValuePair("SD", inputParams.get("dealer"))); // TODO: this.getConnectionParams().get("dealer")
        requestParams.add(new BasicNameValuePair("AP", inputParams.get("placereceiving"))); // TODO: this.getConnectionParams().get("placereceiving")
        requestParams.add(new BasicNameValuePair("OP", inputParams.get("operator"))); // TODO: this.getConnectionParams().get("operator")
        requestParams.add(new BasicNameValuePair("SESSION", UUID.randomUUID().toString().substring(0, 20)));
        requestParams.add(new BasicNameValuePair("NUMBER", inputParams.get("phone")));
        requestParams.add(new BasicNameValuePair("ACCEPT_KEYS", inputParams.get("acceptkeys"))); // TODO: ???? this.getConnectionParams().get("acceptkeys")
        requestParams.add(new BasicNameValuePair("QUEST_TYPE", inputParams.get("questtype"))); // TODO: this.getConnectionParams().get("questtype")

        String request = "";
        request = "'CERT=" + "" + "\r\n" +
                "SD=" + inputParams.get("dealer") + "\r\n" +
                "AP=" + inputParams.get("placereceiving") + "\r\n" +
                "OP=" + inputParams.get("operator") + "\r\n" +
                "SESSION=" + UUID.randomUUID().toString().substring(0, 20) + "\r\n" +
                "NUMBER=" + inputParams.get("phone") + "\r\n" +
                "ACCEPT_KEYS=" + inputParams.get("acceptkeys") + "\r\n" +
                "QUEST_TYPE=" + inputParams.get("questtype");

        String normalizeRequest = request.trim();
        normalizeRequest = normalizeRequest.replaceAll("[ \r\n\t]", "");

        PrivateKey pk = getPrivateKey("");
        String signature = CMSHelper2.toBase64(CMSHelper2.signatureSign(normalizeRequest.getBytes(), pk, "Sha1WithRSA"));

        request = "BEGIN\r\n" + request + "\r\nEND\r\n"
                + "BEGIN SIGNATURE\r\n" + signature + "\r\nEND SIGNATURE\r\n";

        setConnectionSetting(TMFEnum.PKIX, SSLCEnum.TLSv1_2);
        String response = requestApi(requestParams);

        // TODO: проверка корректности ответа
        try {
            Integer.parseInt(response);
        } catch (NumberFormatException e) {
            throw new Exception("(CyberPlat)Ошибка разбора ответа от сервиса MTC ошибка:" + response);
        }

        //return response;
    }

    public static PrivateKey getPrivateKey(String filename)
            throws Exception {

        byte[] keyBytes = Files.readAllBytes(new File(filename).toPath());

        PKCS8EncodedKeySpec spec =
                new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePrivate(spec);
    }
}
