package ru.sample.qiwi;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import ru.sample.qiwi.Externalsystems.HTTPSExternalSystem;
import ru.sample.qiwi.Helpers.StringHelper;

import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Created by Дмитрий Астахов on 22.11.2016.
 */
public class MTCInvoker extends HTTPSExternalSystem {
    private static Pattern patternResponse = Pattern.compile("\\d*");

    public MTCInvoker() {
        super("");
    }

    @Override
    protected HttpEntity getHttpEntity(List<NameValuePair> requestParams) throws Exception {
        UrlEncodedFormEntity requestEntitty = null;

        try {
            requestEntitty = new UrlEncodedFormEntity(requestParams, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new Exception("(MTC)Ошибка формирования запроса к сервису Яндекс");
        }

        return requestEntitty;
    }

    @Override
    public void setHeaders(HttpPost httpPost) {
        httpPost.setHeader("X-Customer-Id", "Customer-Id");
        httpPost.setHeader("X-Authorization", "Authorization");

//        httpPost.setHeader("X-Customer-Id", this.getConnectionParams().get("customerid"));
//        httpPost.setHeader("X-Authorization", this.getConnectionParams().get("authorization"));
    }

    @Override
    protected String getUrl() {
        return null;
    }

    public void main() throws Exception {
        String input = "phone=79262221133;model=TestModel;passport=1815123456;birthdate=22111957;firstName=Иван;middleName=Иванович;secondName=Сидоров";
        Map<String, String> inputParams = StringHelper.splitParamsStringToMap(input);

        String fullName;
        fullName = inputParams.get("secondName").replace(" ", "_") + " ";
        fullName += inputParams.get("firstName").replace(" ", "_") + " ";
        fullName += inputParams.get("middleName").replace(" ", "_");

        List<NameValuePair> requestParams = new ArrayList<NameValuePair>();
        requestParams.add(new BasicNameValuePair("model", inputParams.get("model")));
        requestParams.add(new BasicNameValuePair("passport", inputParams.get("passport")));
        requestParams.add(new BasicNameValuePair("birthdate", inputParams.get("birthdate")));
        requestParams.add(new BasicNameValuePair("fullname", fullName));
        requestParams.add(new BasicNameValuePair("agreement", inputParams.get("agreement")));

        setConnectionSetting(TMFEnum.PKIX, SSLCEnum.TLSv1_2);
        String response = requestApi(requestParams);

        // TODO: проверка корректности ответа
        try {
            Integer.parseInt(response);
        } catch (NumberFormatException e) {
            throw new Exception("(MTC)Ошибка разбора ответа от сервиса MTC ошибка:" + response);
        }

        //return response;
    }
}
