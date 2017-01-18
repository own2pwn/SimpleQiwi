package ru.sample.qiwi.Externalsystems;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.sample.qiwi.Helpers.StringHelper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by Дмитрий Астахов on 21.12.2016.
 */
public abstract class HTTPSGetExternalSystem extends HTTPSExternalSystem {
    private Logger log = LoggerFactory.getLogger(getClass());

    public HTTPSGetExternalSystem(String connectionString) {
        super(connectionString);
    }

    @Override
    protected HttpEntity getHttpEntity(List<NameValuePair> requestParams) throws Exception {
        return null;
    }

    protected URI generateURI(List<NameValuePair> requestParams, URI uri) throws Exception {
        try {
            uri = new URIBuilder(uri).setParameters(requestParams).build();
        } catch (URISyntaxException e) {
            throw new Exception("Ошибка генерации URL: " + e.getMessage(), e);
        }

        return  uri;
    }

    /**
     * Запрос к API внешней системы
     * @param uri Адрес обращения
     * @return Сырой ответ от внешней систмы
     * @throws Exception
     */
    protected HttpEntity requestRawApi(List<NameValuePair> requestParams, URI uri) throws Exception {

        HttpEntity result = null;

        if(StringHelper.isNullOrEmpty(uri.toString())) {
            throw new Exception("Отсутвует параметр url");
        }

        uri = generateURI(requestParams, uri);

        log.debug("Пытаемся открыть {}", uri.toString());
        HttpGet httpGet = new HttpGet(uri);
        HttpClientContext context = HttpClientContext.create();

        setHeaders(httpGet);

        CloseableHttpResponse response = getHHTPClient().execute(httpGet, context);
        result = response.getEntity();
        return result;
    }


    protected void setHeaders(HttpGet httpGet) {

    }
}
