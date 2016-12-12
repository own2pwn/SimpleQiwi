package ru.sample.qiwi;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import ru.sample.qiwi.Externalsystems.HTTPSExternalSystem;
import ru.sample.qiwi.Helpers.StringHelper;
import ru.sample.qiwi.Helpers.XMLHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Дмитрий Астахов on 21.11.2016.
 */
public class MailInvoker extends HTTPSExternalSystem {
    public MailInvoker() {
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
        return "https://r9.mail.ru/score/";
    }

    public void main() throws Exception {
        String input = "Phones=89262221133;Emails=ab@d3.re;Sex=1;BD=19571122;FirstName=Иван;MiddleName=Иванович;SecondName=Сидоров";
        Map<String, String> inputParams = StringHelper.splitParamsStringToMap(input);

        setConnectionSetting(TMFEnum.PKIX, SSLCEnum.TLSv1_2);
        String request = createRequest(inputParams);

        List<NameValuePair> requestParams = new ArrayList<NameValuePair>();
        requestParams.add(new BasicNameValuePair("json", request));

        String response = requestApi(requestParams);

//        response = XML.toString(new JSONObject(response));

        // TODO: проверка корректности ответа
        JSONObject responseJSON = new JSONObject(response);
        if (responseJSON.has("error")) {
            responseJSON = responseJSON.getJSONObject("error");
            throw new Exception("(Mail)Ошибка разбора ответа от сервиса Mail code=" + responseJSON.getInt("code") // TODO: ExternalSystemException
                    + "; message=" + responseJSON.getString("message")
                    + "; description=" + responseJSON.getString("description"));
        }

        //return response;
    }

    public String createRequest(Map<String, String> params) {
        JSONObject requestJSON = new JSONObject();

        String ApplicationName= "ApplicationName";
        String Method = "GetStreetClientScore";
        String ProductName = "ProductName";
        String Login = "Login";
        String Token = "Token";

        //        requestParams.put("ApplicationName", this.getConnectionParams().get("ApplicationName"));
//        requestParams.put("Method", this.getConnectionParams().get("Method"));
//        requestParams.put("ProductName", this.getConnectionParams().get("ProductName"));
//        requestParams.put("Login", this.getConnectionParams().get("Login"));
//        requestParams.put("Token", this.getConnectionParams().get("Token"));

        requestJSON.put("ApplicationName", ApplicationName);
        requestJSON.put("Method", Method);
        requestJSON.put("ProductName", ProductName);
        requestJSON.put("Login", Login);
        requestJSON.put("Token", Token);

        JSONArray arrayJSON = null;
        JSONObject requestJSONParam = new JSONObject();
        Object value = null;
        String[] listParams = null;
        for (Map.Entry<String, String> entry : params.entrySet()) {
            value = entry.getValue();

            if (entry.getKey().endsWith("s")) {
                arrayJSON = new JSONArray();

                listParams = ((String)value).split(",");
                for (int i = 0; i < listParams.length; i++) {
                    arrayJSON.put(listParams[i]);
                }

                value = arrayJSON;
            }
            requestJSONParam.put(entry.getKey(), value);
        }

        requestJSON.put("Params", requestJSONParam);

        return requestJSON.toString();
    }

    public static JSONObject generateEmptyJSON(String rootName) {
        JSONObject result = new JSONObject();
        result.put(rootName, "");

        return result;
    }

    public JSONObject generateJSONFromParams(Map<String, String> params, String name) {
        JSONObject result = generateEmptyJSON(name);
        //JSONObject rootElement = result.getJSONObject(name);

        result.put(name, generateJSONFromParams(params));

        return result;
    }

    public JSONObject generateJSONFromParams(Map<String, String> params) {
        JSONObject result = new JSONObject();

        for (Map.Entry<String, String> entry : params.entrySet()) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

    public JSONObject generateJSONFromParams(String params, String name) throws Exception {
        Map<String, String> inputParams = StringHelper.splitParamsStringToMap(params);

        return generateJSONFromParams(inputParams, name);
    }
}
