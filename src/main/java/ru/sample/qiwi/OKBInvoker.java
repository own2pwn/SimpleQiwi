package ru.sample.qiwi;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicNameValuePair;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import ru.sample.qiwi.Externalsystems.HTTPSExternalSystem;
import ru.sample.qiwi.Helpers.XMLHelper;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Дмитрий Астахов on 29.08.2016.
 */
public class OKBInvoker extends HTTPSExternalSystem{
    OKBInvoker() {
        super(null);
    }

    protected String getUrl(){
        return "https://test.rb-ei.com/cpuEnquiry.asp";
    }

    @Override
    protected HttpEntity getHttpEntity(List<NameValuePair> requestParams) throws Exception{
        ByteArrayEntity requestEntitty = null;
        try {
            requestEntitty = new ByteArrayEntity(requestParams.get(0).getValue().getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new Exception("Ошибка преобразования XML в строку(НБКИ)", e);
        }
        return requestEntitty;
    }

    @Override
    public void setHeaders(HttpPost httpPost) {
//        httpPost.setHeader("Subscriber", "123456");
//        httpPost.setHeader("Group", "GROUP");
//        httpPost.setHeader("User", "IVANOV");
//        httpPost.setHeader("Password", "123");
//        httpPost.setHeader("Function", "20");
        httpPost.setHeader(HttpHeaders.CONTENT_TYPE, "text/xml");
//        post.setHeader("Request", ""); // TODO: XML запрос
    }

    public void main() throws Exception{
        Document doc = null;
        String result = null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        builder = factory.newDocumentBuilder();
        doc = builder.parse(new File("okb_request.xml"));
        String xmlFile = XMLHelper.convertToString(doc);

        List<NameValuePair> requestParams = new ArrayList<NameValuePair>();
        requestParams.add(new BasicNameValuePair("Subscriber", "123456"));
        requestParams.add(new BasicNameValuePair("Group", "GROUP"));
        requestParams.add(new BasicNameValuePair("User", "IVANOV"));
        requestParams.add(new BasicNameValuePair("Password", "123"));
        requestParams.add(new BasicNameValuePair("Function", "20"));
        requestParams.add(new BasicNameValuePair("Request", xmlFile));

        HttpEntity response = requestRawApi(requestParams);

    }

    public static String encryptionRequest(String source) {
        String result = "";
        Character character;

        for (int i = 0; i < source.length(); i++) {
            character = source.charAt(i);
//            if ()
        }


        return result;
    }
}
