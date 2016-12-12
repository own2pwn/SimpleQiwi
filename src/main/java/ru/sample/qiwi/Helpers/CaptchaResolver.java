package ru.sample.qiwi.Helpers;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tikhonin on 29.01.2016.
 */
public class CaptchaResolver {
    CloseableHttpClient httpclient;
    HttpPost postRequest;
    HttpPost postResponse;
    String accessKey;
    //TODO: перенести настройки капчи в глобальные настройки
    int maxRetryCount = 5;
    int sleepTime = 3000;

    private Logger log = LoggerFactory.getLogger(getClass());

    public CaptchaResolver(String accessKey) {
        //TODO: кэшировать httpclient
        httpclient = HttpClients.createDefault();
        postRequest = new HttpPost("http://service-captcha-lab.com/in.php");
        postResponse = new HttpPost("http://service-captcha-lab.com/res.php");
        this.accessKey = accessKey;
    }

    public String resolveCaptcha(String image) throws Exception {
        String result = null;

        String id = sendCaptcha(image);
        result = getResult(id);

        return result;
    }

    private String sendCaptcha(String image) throws Exception {
        String result = "";

        List<NameValuePair> requestParams = new ArrayList<NameValuePair>();
        requestParams.add(new BasicNameValuePair("method", "base64"));
        requestParams.add(new BasicNameValuePair("key", accessKey));
        requestParams.add(new BasicNameValuePair("body", image));

        UrlEncodedFormEntity requestEntitty = new UrlEncodedFormEntity(requestParams, Consts.UTF_8);
        postRequest.setEntity(requestEntitty);

        CloseableHttpResponse response = null;
        response = httpclient.execute(postRequest);
        HttpEntity responseEntity = response.getEntity();
        String responseString = EntityUtils.toString(responseEntity);

        log.debug("(ServiceCaptchaLab)Капча отправлена на распознование. Ответ от сервиса: {}", responseString);

        String code = responseString.substring(0, 2);
        if (code.equalsIgnoreCase("er")) {
            throw new Exception("Ошибка отправки капчи в сервис ServiceCaptchaLab: " + responseString);
        }

        result = responseString.substring(3);

        return result;
    }

    private String getResult(String id) throws Exception {
        String result = null;
        List<NameValuePair> requestParams = new ArrayList<NameValuePair>();
        //requestParams.add(new BasicNameValuePair("key", "80fzsmhjligbt4uqhq6cvu8xu1dsuop3"));
        requestParams.add(new BasicNameValuePair("key", accessKey));
        requestParams.add(new BasicNameValuePair("action", "get"));
        requestParams.add(new BasicNameValuePair("id", id));
        UrlEncodedFormEntity requestEntitty = new UrlEncodedFormEntity(requestParams, Consts.UTF_8);
        postResponse.setEntity(requestEntitty);

        log.debug("(ServiceCaptchaLab)Пытаемся получить резульат");

        int retry = 0;
        while(retry < maxRetryCount){
            try {
                log.debug("Ждем {}мс", sleepTime);
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                //e.printStackTrace();
                throw new Exception("Ошибка ожидания ответа распознования капчи от сервиса ServiceCaptchaLab: " + e.getMessage(), e);
            }
            String responseString = requestResult();

            log.debug("(ServiceCaptchaLab)Получен ответ от сервиса: {}", responseString);

            String code = responseString.substring(0, 2);
            if(code.equalsIgnoreCase("er")) {
                throw new Exception("Ошибка распознования капчи сервисом ServiceCaptchaLab: " + responseString);
                //break;
            }
            else if(code.equalsIgnoreCase("ok")) {
                result = responseString.substring(3);
                break;
            }

            log.debug("(ServiceCaptchaLab)Капча еще не распознана. Пробуем еще раз");

            retry++;
        }

        if(result == null){
            throw new Exception("Ошибка ожидания распознования капчи сервисом ServiceCaptchaLab после" + retry + " попыток по " + sleepTime + "мс");
        }

        return result;
    }

    private String requestResult() throws Exception {
        String result = null;
        CloseableHttpResponse response = null;
        try {
            response = httpclient.execute(postResponse);
            HttpEntity responseEntity = response.getEntity();
            result = EntityUtils.toString(responseEntity, "UTF-8");

        } catch (Exception e) {
            //e.printStackTrace();
            throw new Exception("Сетевая ошибка при обработки капчи сервисом ServiceCaptchaLab: " + e.getMessage(), e);
        }

        return result;
    }


}
