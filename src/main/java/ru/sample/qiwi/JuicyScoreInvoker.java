package ru.sample.qiwi;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.json.XML;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ru.sample.qiwi.Externalsystems.HTTPSExternalSystem;
import ru.sample.qiwi.Helpers.XMLHelper;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Дмитрий Астахов on 02.12.2016.
 */
public class JuicyScoreInvoker extends HTTPSExternalSystem {

    public JuicyScoreInvoker() {
        super("");
    }

    @Override
    protected HttpEntity getHttpEntity(List<NameValuePair> requestParams) throws Exception {
        UrlEncodedFormEntity requestEntitty = null;

        try {
            requestEntitty = new UrlEncodedFormEntity(requestParams, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new Exception("(JuicyScore)Ошибка формирования запроса к сервису JuicyScore");
        }

        return requestEntitty;
    }

    @Override
    public void setHeaders(HttpPost httpPost) {
        httpPost.setHeader("session", "session"); // TODO: this.getConnectionParams().get("session")
    }

    public void main() throws Exception {
        String input = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<request>\n" +
                "   <channel>SITE</channel>\n" +
                "   <is_js/>\n" +
                "   <ip/>\n" +
                "   <useragent/>\n" +
                "   <time_zone/>\n" +
                "   <time_local/>\n" +
                "   <time_utc3/>\n" +
                "   <ph_country>7</ph_country>\n" +
                "   <phone>904000</phone>\n" +
                "   <mail>kamakin7</mail>\n" +
                "   <referrer/>\n" +
                "   <tenor>30</tenor>\n" +
                "   <amount>15000</amount>\n" +
                "   <response_content_type>xml</response_content_type>\n" +
                "</request>\n";

        Document doc = null;
        try {
             doc = XMLHelper.parseXml(input);
        } catch (IOException | SAXException | ParserConfigurationException e) {
            throw new Exception("(JuicyScore)Ошибка разбора входного запроса", e);
        }

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("account_id", "123")); // TODO: this.getConnectionParams().get("login")
        params.add(new BasicNameValuePair("client_id", String.valueOf(randInt())));

        NodeList nodeList = doc.getElementsByTagName("request").item(0).getChildNodes();
        Node node = null;
        for (int i = 0; i < nodeList.getLength(); i++) {
            node = nodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                params.add(new BasicNameValuePair(node.getNodeName(), node.getTextContent()));
            }
        }

        String response = requestApi(params);

        doc = XMLHelper.parseXml(response);
        if (doc.getElementsByTagName("Success").item(0).getTextContent().equals(0)) {
            String errorMessage = doc.getElementsByTagName("Comments").item(0).getTextContent();
            throw new Exception("(JuicyScore)Ошибка разбора ответа от сервиса JuicyScore: " + errorMessage);
        }

//        return response;
    }

    /**
     * Рандомное целое число
     *
     * @return Целое число
     */
    public static int randInt() {
        Random rand = new Random();
        int randomNum = rand.nextInt();

        return randomNum < 0 ? -randomNum : randomNum;
    }
}
