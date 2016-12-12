package ru.sample.qiwi;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.json.XML;
import ru.sample.qiwi.Externalsystems.HTTPSExternalSystem;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Дмитрий Астахов on 23.11.2016.
 */
public class MegafonInvoker extends HTTPSExternalSystem {
    public MegafonInvoker() {
        super("");
    }

    @Override
    protected HttpEntity getHttpEntity(List<NameValuePair> requestParams) throws Exception {
        StringEntity se = new StringEntity(requestParams.get(0).getValue(), ContentType.APPLICATION_JSON);
        se.setContentEncoding("UTF-8");

        return se;
    }

    @Override
    protected String getUrl() {
        return null;
    }

    public void main() throws Exception {
        String input = "{     'ApplicationName': 'AppName',     'Method': 'GetStreetClientScore',     'Param': {         'Model': 'Model',         'Phones': ['89262221133'],         'Emails': [\"ab@d3.re\"],         'Sex': 1,         'BD': '19571122',         'FirstName': 'Иван',          'MiddleName': 'Иванович',         'SecondName': 'Сидоров'     },     'ProductName': 'ProdName',     'Login': 'YourLogin',     'Token': '0123456789ABCDEF0123456789ABCDEF' }";
        String msisdn = null;

        JSONObject requestJSON = XML.toJSONObject(input);

        msisdn = requestJSON.getString("msisdn");
        requestJSON = requestJSON.getJSONObject("request");

        String request = XML.toString(requestJSON);

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("json", request));

        HttpResponse response = null;
        try {
            setConnectionSetting(TMFEnum.PKIX, SSLCEnum.TLSv1_2);
            response = (HttpResponse) requestRawApi(params);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // TODO: проверка корректности ответа
        if (response.getStatusLine().getStatusCode() != HttpURLConnection.HTTP_OK){
            String error = null;
            switch (response.getStatusLine().getStatusCode()){
                case HttpURLConnection.HTTP_BAD_REQUEST:
                    error = "некорректный запрос (например, ошибка парсинга JSON-документа, некорректный формат поля msisdn)";
                    break;
                case HttpURLConnection.HTTP_NOT_FOUND:
                    error = "некорректный url запроса";
                    break;
                case HttpURLConnection.HTTP_INTERNAL_ERROR:
                    error = "внутренняя ошибка сервиса, запрос может быть повторен через некоторое время";
                    break;
            }

            throw new Exception("(Megafon)Ошибка разбора ответа от сервиса Megafon, статус:" + response.getStatusLine().getStatusCode() + ", ошибка:" + error);
        }

        JSONObject responseJSON = new JSONObject();
        try {
            requestJSON.put("response", new JSONObject(EntityUtils.toString(response.getEntity())));
        } catch (IOException e) {
            e.printStackTrace();
        }

//        return response;
    }
}
