package ru.sample.qiwi;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import ru.sample.qiwi.Externalsystems.HTTPSGetExternalSystem;
import ru.sample.qiwi.Helpers.StringHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Дмитрий Астахов on 29.12.2016.
 */
public class CleverDataInvoker extends HTTPSGetExternalSystem {
    public CleverDataInvoker() {
        super("");
    }

    @Override
    protected HttpEntity getHttpEntity(List<NameValuePair> requestParams) throws Exception {
        return null;
    }

    public void main(String input) throws Exception {
        Map<String, String> inputParams = StringHelper.splitParamsStringToMap(input);
        String profileId = inputParams.get("profileId");

        List<NameValuePair> requestParams = new ArrayList<NameValuePair>();
        requestParams.add(new BasicNameValuePair("dealId", inputParams.get("dealId")));

        String response = null;
//        requestApi(requestParams, url + profileId);

        JSONObject responseJSON = new JSONObject(response);

        try {
            responseJSON.put("response", new JSONObject(response));
        } catch (JSONException e) {
            throw new Exception("(CleverData)Ошибка разбора ответа от сервиса CleverData: " + response, e);
        }

//        return XML.toString(responseJSON);
    }
}
