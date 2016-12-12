package ru.sample.qiwi.Externalsystems;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import ru.CryptoPro.JCP.JCP;
import ru.sample.qiwi.Helpers.StringHelper;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import java.io.*;
import java.security.*;
import java.util.List;

/**
 * Created by tikhonin on 18.01.2016.
 */
public abstract class HTTPSExternalSystem {
//    @Autowired
//    ConfigurationService configurationService;
    public enum ValueStringEnum {
    ;
        private String strType;

        ValueStringEnum(String str) {
            this.strType = str;
        }

        public String getType() {
            return this.strType;
        }
    }

    public enum TMFEnum {
        GostX509("GostX509"), PKIX("PKIX"), SHA512withRSA("SHA512withRSA");

        private String strType;

        TMFEnum(String str){
            this.strType = str;
        }

        public String getType(){
            return this.strType;
        }
    }

    public enum SSLCEnum {
        GostTLS("GostTLS"), TLSv1_2("TLSv1.2");

        private String strType;

        SSLCEnum(String str){
            this.strType = str;
        }

        private String getType(){
            return this.strType;
        }
    }

    private TMFEnum tmfi;
    private SSLCEnum sslci;

    public CloseableHttpClient httpClient;

//    private Logger log = LoggerFactory.getLogger(getClass());

    public HTTPSExternalSystem(String connectionString) {
       // super(connectionString);
        setConnectionSetting(TMFEnum.GostX509, SSLCEnum.GostTLS);
    }

    public void setConnectionSetting(TMFEnum _tmfi, SSLCEnum _sslci){
        tmfi  = _tmfi;
        sslci = _sslci;
    }

    /**
     * Получение HTTP клиента
     * @return HTTP клиент
     * @throws ExternalSystemCryptoException
     */
    public CloseableHttpClient getHHTPClient() throws Exception {
        if (httpClient == null) {
            System.setProperty("javax.net.debug", "ssl");
            System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
            System.setProperty("org.apache.commons.logging.simplelog.showdatetime", "true");
            System.setProperty("org.apache.commons.logging.simplelog.log.httpclient.wire.header", "debug");
            System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.commons.httpclient", "debug");

            SSLContext sc = null;
            try {
                KeyStore trustStore = KeyStore.getInstance(JCP.HD_STORE_NAME);
                trustStore.load(new FileInputStream("C:/CryptoPro/Certificate Stores/certs"), "changeit".toCharArray());
//                log.debug("TrustStore загружен");

                KeyStore keyStore = KeyStore.getInstance("pkcs12");
                keyStore.load(new FileInputStream("C:\\Users\\Дмитрий Астахов\\Downloads\\dd_yandex.p12"), "123456".toCharArray());
//                keyStore.load(new FileInputStream("C:\\Users\\Дмитрий Астахов\\Downloads\\user_60.p12"), "dhn7GF".toCharArray());
                KeyManagerFactory kmf = KeyManagerFactory.getInstance("PKIX"); //PKIX
                kmf.init(keyStore, "123456".toCharArray());
//                kmf.init(keyStore, "dhn7GF".toCharArray());




                TrustManagerFactory tmf = TrustManagerFactory.getInstance(tmfi.getType());
//                TrustManagerFactory tmf = TrustManagerFactory.getInstance("PKIX");
                tmf.init(trustStore);
//                log.debug("TrustStore инициализирован");

                sc = SSLContext.getInstance(sslci.getType());
//                sc = SSLContext.getInstance("TLSv1.2");
                sc.init(kmf.getKeyManagers(), tmf.getTrustManagers(), SecureRandom.getInstance(JCP.CP_RANDOM, JCP.PROVIDER_NAME));
//                sc.init(null, tmf.getTrustManagers(), SecureRandom.getInstance(JCP.CP_RANDOM, JCP.PROVIDER_NAME));

//                log.debug("SSL контекст инициализирован");
            } catch (Exception e) {
                //e.printStackTrace();
                throw new Exception("Ошибка инициализации CryptoPro: " + e.getMessage(), e);
            }
//            } catch (Exception e) {
//                //e.printStackTrace();
//                throw new Exception("Ошибка инициализации CryptoPro: " + e.getMessage(), e);
//            } catch (Exception e) {
//                //e.printStackTrace();
//                throw new Exception("Ошибка инициализации CryptoPro: " + e.getMessage(), e);
//            } catch (IOException e) {
//                //e.printStackTrace();
//                throw new Exception("Ошибка инициализации CryptoPro: " + e.getMessage(), e);
//            } catch (NoSuchAlgorithmException e) {
//                //e.printStackTrace();
//                throw new Exception("Ошибка инициализации CryptoPro: " + e.getMessage(), e);
//            } catch (NoSuchProviderException e) {
//                //e.printStackTrace();
//                throw new Exception("Ошибка инициализации CryptoPro: " + e.getMessage(), e);
//            } catch (KeyManagementException e) {
//                //e.printStackTrace();
//                throw new Exception("Ошибка инициализации CryptoPro: " + e.getMessage(), e);
//            }

            //CloseableHttpClient httpclient = HttpClients.createDefault();
//            httpClient = HttpClients.custom().setSSLContext(sc).build();
            if(getCredentialsProvider() == null) {
                httpClient = HttpClients.custom().setSSLContext(sc).build();
            }
            else {
                httpClient = HttpClients.custom().setSSLContext(sc).setDefaultCredentialsProvider(getCredentialsProvider()).build();
            }
//            log.info("HttpClient кэширован");
        }

        return httpClient;
    }

    public CredentialsProvider getCredentialsProvider() throws NoSuchAlgorithmException {
        return null;
    }

    /**
     * Запрос ко API внешней системы
     * @param requestParams Параметры запроса
     * @return Сырой ответ от внешней систмы
     * @throws IOException
     * @throws AxiLinkException
     * @throws ExternalSystemCryptoException
     */
    public HttpEntity requestRawApi(List<NameValuePair> requestParams) throws Exception {

        HttpEntity result = null;

//        String url = "https://unicom24.ru/api/fch/v1/sync_create/";
//        String url = "https://ratservice-data.qiwi.com/scorephone.aspx";
//        String url = "https://test.rb-ei.com/cpuEnquiry.asp";
//        String url = "https://reqxml.f-karta.ru/prod/request_test.php";
//        String url = "https://calypso.yamoney.ru:443/";
//        String url = "https://api.scorista.ru/mixed/xml";
        String url = getUrl();
        if(StringHelper.isNullOrEmpty(url)) {
            throw new Exception("Отсутвует параметр url");
        }

//        StringEntity stringEntitty = new StringEntity(requestParams.get(0).getValue(), ContentType.APPLICATION_XML);
//        stringEntitty.setContentEncoding("UTF-8");

//        log.debug("Пытаемся открыть {}", url);
        HttpPost httpPost = new HttpPost(url);
        HttpEntity requestEntitty = getHttpEntity(requestParams);
        httpPost.setEntity(requestEntitty);

        setHeaders(httpPost);

        CloseableHttpResponse response = getHHTPClient().execute(httpPost);
        result = response.getEntity();
        return result;
    }

    /**
     * Запрос ко API внешней системы
     * @param requestParams Параметры запроса
     * @return Ответ от внешней систмы
     * @throws IOException
     * @throws AxiLinkException
     * @throws ExternalSystemCryptoException
     */
    public String requestApi(List<NameValuePair> requestParams) throws Exception {

        String result = null;
        HttpEntity responseEntity = requestRawApi(requestParams);
        result = EntityUtils.toString(responseEntity);
        return result;
    }

    /**
     * Запрос ко API внешней системы
     * @param requestParams Параметры запроса
     * @param codec Кодировка ответа от внешней системы
     * @return Ответ от внешней систмы
     * @throws IOException
     * @throws AxiLinkException
     * @throws ExternalSystemCryptoException
     */
    protected String requestApi(List<NameValuePair> requestParams, String codec) throws Exception {

        String result = null;
        HttpEntity responseEntity = requestRawApi(requestParams);
        result = EntityUtils.toString(responseEntity, codec);
        return result;
    }

    /**
     * Формирование HttpEntity на основе парметров запроса к API внешней системы
     * @param requestParams Парметры запроса
     * @return
     */
    protected abstract HttpEntity getHttpEntity(List<NameValuePair> requestParams) throws Exception;

    public void setHeaders(HttpPost httpPost) {
        httpPost.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
    }

    protected String getUrl() {
        return "";
    }
}
