package ru.sample.qiwi;

import com.objsys.asn1j.runtime.Asn1Exception;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import org.apache.commons.codec.binary.Hex;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemWriter;
import org.hibernate.tuple.component.CompositeBasedBasicAttribute;
import org.json.XML;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import ru.CryptoPro.JCP.JCP;
import ru.sample.qiwi.Externalsystems.AbstractExternalSystem;
import ru.sample.qiwi.Externalsystems.HTTPSExternalSystem;
import ru.sample.qiwi.Helpers.CMSHelper;
import ru.sample.qiwi.Helpers.CMSHelper2;
import ru.sample.qiwi.Helpers.StringHelper;
import ru.sample.qiwi.Helpers.XMLHelper;

import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by Дмитрий Астахов on 19.09.2016.
 */
public class YandexDepositeInvoker extends HTTPSExternalSystem {
    public YandexDepositeInvoker(String connectionString) {
        super(connectionString);
    }

    @Override
    protected HttpEntity getHttpEntity(List<NameValuePair> requestParams) throws Exception {
        StringEntity se = new StringEntity(requestParams.get(0).getValue(), ContentType.create("application/pkcs7-mime"));

        return se;
//        MultipartEntityBuilder builder = null;
//
//        try {
//            builder = MultipartEntityBuilder.create();
//            byte[] request = Hex.decodeHex(requestParams.get(0).getValue().toCharArray());
////
//            builder.addBinaryBody("application/pkcs7-mime", request, ContentType.create("application/pkcs7-mime"), "request");
////            builder.addTextBody("Request", requestParams.get(0).getValue(), ContentType.create("application/pkcs7-mime"));
//            builder.setBoundary("wayDxR2Q62aZDeJOGimw5sD6gQWJH6Ko5LvaVF0K");
//            builder.setCharset(Consts.UTF_8);
//        } catch (Exception e) {
//            throw new Exception("(Финкарта)Ошибка формирования запроса к сервису Финкарта", e);
//        }
//
//        return builder.build();
    }

    @Override
    public void setHeaders(HttpPost httpPost) {
//        httpPost.setHeader(HttpHeaders.CONTENT_TYPE, "multipart/form-data; boundary=wayDxR2Q62aZDeJOGimw5sD6gQWJH6Ko5LvaVF0K");
//        httpPost.setHeader(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate, br");
//        httpPost.setHeader(HttpHeaders.USER_AGENT, "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36");
//        httpPost.setHeader(HttpHeaders.ACCEPT, "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
    }

    @Override
    protected String getUrl() {
        return "https://bo-demo02.yamoney.ru:9094/webservice/deposition/api/testDeposition";
//        return "http://requestb.in/13gp0gv1";
    }

    public YandexDepositeInvoker() {super("az");}

    public void main() throws Exception {
        String phoneNumber = "4100322407607";
        String agentId = "201326"; // TODO: this.getConnectionParams().get("agentid");
        String storeName = "yandex"; // TODO: this.getConnectionParams().get("storename");
        String password = "1234"; // TODO: this.getConnectionParams().get("password");
        String url = "https://bo-demo02.yamoney.ru:9094/webservice/deposition/api/testDeposition"; // TODO: this.getConnectionParams().get("url");
        String dateTime = getCurrentDate("YYYY-MM-dd HH:mm:ss.SSS") + 'Z';
        dateTime = dateTime.replace(' ', 'T');

        String inputXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<testDepositionRequest agentId=\"" + agentId + "\"\n" +
                "                       clientOrderId=\"" + randInt() + "\" \n" +
                "                       requestDT=\"" + dateTime + "\"\n" +
                "                       dstAccount=\"" + phoneNumber + "\"\n" +
                "                       amount=\"10.00\"\n" +
                "                       currency=\"10643\"\n" +
                "                       contract=\"\"/>";

        KeyStore keyStore = KeyStore.getInstance("pkcs12");
        keyStore.load(new FileInputStream("C:\\Users\\Дмитрий Астахов\\Downloads\\dd_yandex.p12"), "123456".toCharArray());
//
//        CertificateFactory fact = CertificateFactory.getInstance("X.509");
//        FileInputStream is = new FileInputStream ("C:\\Users\\Дмитрий Астахов\\Downloads\\200957.cer");
//        X509Certificate cer = (X509Certificate) fact.generateCertificate(is);
////        PrivateKey pk = get("C:\\Users\\Дмитрий Астахов\\Downloads\\private.key");
//        PrivateKey pk = get("C:\\Users\\Дмитрий Астахов\\Downloads\\openssl-0.9.8h-1-bin\\bin\\private.der");

        byte[] cms = null;
        try {
            password = CMSHelper2.signPEM(inputXML.getBytes(), (PrivateKey) keyStore.getKey(".0.dd_yandex", "123456".toCharArray()), (X509Certificate) keyStore.getCertificate(".0.dd_yandex"));
            cms = CMSHelper.signPKCS7((PrivateKey) keyStore.getKey(".0.dd_yandex", "123456".toCharArray()), keyStore.getCertificate(".0.dd_yandex"), "123456", inputXML.getBytes());
//            cms = CMSHelper.signPKCS7(storeName, password, inputXML.getBytes("UTF-8"));
//            cms = CMSHelper.createPKCS7(inputXML.getBytes("UTF-8"), (PrivateKey) keyStore.getKey(".0.dd_yandex", "123456".toCharArray()), (X509Certificate) keyStore.getCertificate(".0.dd_yandex"));
        } catch (UnrecoverableKeyException | CertificateException | NoSuchAlgorithmException | KeyStoreException | IOException | InvalidKeyException | SignatureException | NoSuchProviderException | Asn1Exception e) {
            throw new Exception("Ошибка CryptoPro: " + e.getMessage(), e);
        }

//        CloseableHttpClient httpclient = HttpClients.createDefault();
//        HttpPost httpPost = new HttpPost(url);
//
//        HttpEntity requestEntitty = new ByteArrayEntity(cms, ContentType.create("application/pkcs7-mime"));
//        httpPost.setEntity(requestEntitty);
        byte[] result = null;
        String resultString = null;
        HttpEntity responseEntity;

        List<NameValuePair> requestParams = new ArrayList<NameValuePair>();
//        requestParams.add(new BasicNameValuePair("cms", password));
        requestParams.add(new BasicNameValuePair("cms", "-----BEGIN PKCS7-----\n" + Base64.encode(cms) + "\n-----END PKCS7-----"));

        setConnectionSetting(TMFEnum.PKIX, SSLCEnum.TLSv1_2);
        responseEntity = requestRawApi(requestParams);


//
//        CloseableHttpResponse response = null;
//        try {
//            response = httpclient.execute(httpPost);
//        } catch (IOException e) {
//            throw new Exception("(Яндекс Deposite)Сетевая ошибка отправки запроса сервису Яндекс:" + e.getMessage(), e);
//        }

//        HttpEntity responseEntity = response.getEntity();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            responseEntity.writeTo(baos);
        } catch (IOException e) {
            throw new Exception("(Яндекс Deposite)Сетевая ошибка отправки запроса сервису Яндекс:" + e.getMessage(), e);
        }

        String responseString = baos.toString();
        responseString = responseString.replaceAll("-----BEGIN PKCS7-----\\n", "");
        responseString = responseString.replaceAll("\\n-----END PKCS7-----", "");

        byte[] resultBytes = Base64.decode(responseString);
        try {
            result = CMSHelper.unsignPKCS7(resultBytes);
        } catch (NullPointerException | Asn1Exception | IOException e) {
            throw new Exception("(Яндекс Deposite)Ошибка дешифрования ответа от сервиса Яндекс:" + e.getMessage(), e);
        }

        try {
            resultString = new String(result, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new Exception("(Яндекс Deposite)Ошибка декодирования(неверная кодировка) ответа от сервиса Яндекс");
        }

        Document doc = null;
        try {
            doc = XMLHelper.parseXml(resultString);
        } catch (IOException | SAXException | ParserConfigurationException e) {
            throw new Exception("(Яндекс Deposite)Ошибка разбора ответа от сервиса Яндекс", e);
        }

        Node errorElem = doc.getElementsByTagName("testDepositionResponse").item(0);
        String status = errorElem.getAttributes().getNamedItem("status").getNodeValue();
        if (status != "0"){
            String errorMessage = null;
            try {
                errorMessage = new String(XMLHelper.evaluateXPath(doc, "/testDepositionResponse/@error").getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new Exception("(Яндекс Deposite)Ошибка ответа от сервиса Яндекс: status=" + status);
            }

            throw new Exception("(Яндекс Deposite)Ошибка ответа от сервиса Яндекс: error=" + errorMessage + " status=" + status);
        }

        String identification;
        if (doc.getElementsByTagName("identification").getLength() > 0) {
            identification = doc.getElementsByTagName("identification").item(0).getFirstChild().getTextContent();
        }

//        return identification;
    }

    public static int randInt() {
        Random rand = new Random();
        int randomNum = rand.nextInt();

        return randomNum < 0 ? -randomNum: randomNum;
    }

    public static String getCurrentDate(String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        Date date = new Date();

        return dateFormat.format(date);
    }

    public static PrivateKey get(String filename)
            throws Exception {

//        File f = new File(filename);
//        FileInputStream fis = new FileInputStream(f);
//        DataInputStream dis = new DataInputStream(fis);
//        byte[] keyBytes = new byte[(int) f.length()];
//        dis.readFully(keyBytes);
//        dis.close();

        byte[] keyBytes = Files.readAllBytes(new File(filename).toPath());

//        PrivateKeyInfo pkInfo = PrivateKeyInfo.getInstance(keyBytes);
//        ASN1Encodable encodable = pkInfo.parsePrivateKey();
//        ASN1Primitive primitive = encodable.toASN1Primitive();
//        byte[] privateKeyPKCS1 = primitive.getEncoded();

//        PemObject pemObject = new PemObject("RSA PRIVATE KEY", keyBytes);
//        StringWriter stringWriter = new StringWriter();
//        PemWriter pemWriter = new PemWriter(stringWriter);
//        pemWriter.writeObject(pemObject);
//        pemWriter.close();
//        String pemString = stringWriter.toString();

        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");

        return kf.generatePrivate(spec);
    }
}
