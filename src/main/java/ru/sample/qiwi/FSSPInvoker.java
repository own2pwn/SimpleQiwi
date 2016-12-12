package ru.sample.qiwi;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.bouncycastle.util.encoders.Base64;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.sample.qiwi.Helpers.CaptchaResolver;
import ru.sample.qiwi.Helpers.StringHelper;
import ru.sample.qiwi.Helpers.XMLHelper;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tikhonin on 29.01.2016.
 */
public class FSSPInvoker {
    CloseableHttpClient httpclient;
    //HttpClientContext context;

    Pattern patternColumn1;
    Pattern patternColumn3;
    Pattern patternColumn5;

    static final String FSSP_URL = "http://is.fssprus.ru/ajax_search";

    private Logger log = LoggerFactory.getLogger(getClass());

    public FSSPInvoker() {

        httpclient = HttpClients.custom().setUserAgent("Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2526.111 Safari/537.36").build();

        patternColumn1 = Pattern.compile("(.+)\\s+от\\s+(\\d+\\.\\d+\\.\\d+)\\s*(.*)");
        patternColumn3 = Pattern.compile("(\\d+\\.\\d+\\.\\d+)\\s(.+)");
        //patternColumn5 = Pattern.compile("([^:]+)(:\\s(\\d+\\.\\d+) руб\\.)?");
        patternColumn5 = Pattern.compile("([^:]+)(:\\s(\\d+\\.\\d+).*)?"); //.* - необходим, т.к. применяется для всей строки
    }

    public void main() throws Exception {
        String input = "liv_address_region=50;client_surname=ФЁДОРОВ;client_name=АЛЕКСЕЙ;client_middlename=;client_birthdate=1991-04-22";
        log.info("Вызов сервиса ФССП");
        String result;
        org.w3c.dom.Document document = invokeRaw(input);
        try {
            result = XMLHelper.convertToString(document);
        } catch (TransformerException | UnsupportedEncodingException e) {
            throw new Exception("(ФССП)Ошибка преобразования результируещего XML", e);
        }
    }

    public org.w3c.dom.Document invokeRaw(String input) throws Exception {
        Map<String, String> inputParams = StringHelper.splitParamsStringToMap(input);
        //System.out.println(" ==  config == ");
        String transform = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<xsl:stylesheet version=\"1.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\">\n" +
                "    <xsl:output method=\"xml\" indent=\"yes\"/>\n" +
                "\n" +
                "    <xsl:template match=\"/\">\n" +
                "        <xsl:element name=\"SCORISTA\">\n" +
                "            <xsl:call-template name=\"fillAttributesByElements\"/>\n" +
                "        </xsl:element>\n" +
                "    </xsl:template>\n" +
                "\n" +
                "\n" +
                "    <!-- ********************* FUNCTIONS ********************* -->\n" +
                "\n" +
                "    <xsl:template name=\"fillAttributesByElements\">\n" +
                "        <xsl:for-each select=\"*\">\n" +
                "            <xsl:choose>\n" +
                "                <xsl:when test=\"not(*) and not(*[*])\">\n" +
                "                    <xsl:attribute name=\"{local-name()}\"><xsl:value-of select=\".\"/></xsl:attribute>\n" +
                "                </xsl:when>\n" +
                "            </xsl:choose>\n" +
                "        </xsl:for-each>\n" +
                "\n" +
                "        <xsl:for-each select=\"*\">\n" +
                "            <xsl:choose>\n" +
                "                <xsl:when test=\"name()='response'\">\n" +
                "                    <xsl:element name=\"Response_SCR\">\n" +
                "                        <xsl:call-template name=\"fillOldAttributes\"/>\n" +
                "                        <xsl:call-template name=\"fillAttributesByElements\"/>\n" +
                "                    </xsl:element>\n" +
                "                </xsl:when>\n" +
                "                <xsl:when test=\"name()='result' and name(..)='segment'\">\n" +
                "                    <xsl:element name=\"result_segment_SCR\">\n" +
                "                        <xsl:call-template name=\"fillOldAttributes\"/>\n" +
                "                        <xsl:call-template name=\"fillAttributesByElements\"/>\n" +
                "                    </xsl:element>\n" +
                "                </xsl:when>\n" +
                "                <xsl:when test=\"name()='trustRating' and name(..)='trustRating'\">\n" +
                "                    <xsl:element name=\"trustRating_TR_SCR\">\n" +
                "                        <xsl:call-template name=\"fillOldAttributes\"/>\n" +
                "                        <xsl:call-template name=\"fillAttributesByElements\"/>\n" +
                "                    </xsl:element>\n" +
                "                </xsl:when>\n" +
                "                <xsl:when test=\"(name(..)='phones' and name(../..)='creditHistory') or (name(..)='result' and name(../..)='phones' and name(../../..)='creditHistory')\">\n" +
                "                    <xsl:element name=\"{local-name()}_PH_ADD_SCR\">\n" +
                "                        <xsl:call-template name=\"fillOldAttributes\"/>\n" +
                "                        <xsl:call-template name=\"fillAttributesByElements\"/>\n" +
                "                    </xsl:element>\n" +
                "                </xsl:when>\n" +
                "                <xsl:when test=\"name(..)='creditHistory90' and name(../..)='additional'\">\n" +
                "                    <xsl:element name=\"{local-name()}_CH_90_ADD_SCR\">\n" +
                "                        <xsl:call-template name=\"fillOldAttributes\"/>\n" +
                "                        <xsl:call-template name=\"fillAttributesByElements\"/>\n" +
                "                    </xsl:element>\n" +
                "                </xsl:when>\n" +
                "                <xsl:when test=\"name(..)='trustRating45' and name(../..)='additional'\">\n" +
                "                    <xsl:element name=\"{local-name()}_TR45_ADD_SCR\">\n" +
                "                        <xsl:call-template name=\"fillOldAttributes\"/>\n" +
                "                        <xsl:call-template name=\"fillAttributesByElements\"/>\n" +
                "                    </xsl:element>\n" +
                "                </xsl:when>\n" +
                "                <xsl:when test=\"name(..)='trustRating90' and name(../..)='additional'\">\n" +
                "                    <xsl:element name=\"{local-name()}_TR90_ADD_SCR\">\n" +
                "                        <xsl:call-template name=\"fillOldAttributes\"/>\n" +
                "                        <xsl:call-template name=\"fillAttributesByElements\"/>\n" +
                "                    </xsl:element>\n" +
                "                </xsl:when>\n" +
                "                <xsl:when test=\"name(..)='fssp' and name(../..)='additional'\">\n" +
                "                    <xsl:element name=\"{local-name()}_FSSP_ADD_SCR\">\n" +
                "                        <xsl:call-template name=\"fillOldAttributes\"/>\n" +
                "                        <xsl:call-template name=\"fillAttributesByElements\"/>\n" +
                "                    </xsl:element>\n" +
                "                </xsl:when>\n" +
                "                <xsl:when test=\"name(..)='truthQuestions' and name(../..)='additional'\">\n" +
                "                    <xsl:element name=\"{local-name()}_TQ_ADD_SCR\">\n" +
                "                        <xsl:call-template name=\"fillOldAttributes\"/>\n" +
                "                        <xsl:call-template name=\"fillAttributesByElements\"/>\n" +
                "                    </xsl:element>\n" +
                "                </xsl:when>\n" +
                "                <xsl:when test=\"name(..)='additional' or name(../..)='additional'\">\n" +
                "                    <xsl:element name=\"{local-name()}_ADD_SCR\">\n" +
                "                        <xsl:call-template name=\"fillOldAttributes\"/>\n" +
                "                        <xsl:call-template name=\"fillAttributesByElements\"/>\n" +
                "                    </xsl:element>\n" +
                "                </xsl:when>\n" +
                "                <xsl:when test=\"*\">\n" +
                "                    <xsl:element name=\"{local-name()}_SCR\">\n" +
                "                        <xsl:call-template name=\"fillOldAttributes\"/>\n" +
                "                        <xsl:call-template name=\"fillAttributesByElements\"/>\n" +
                "                    </xsl:element>\n" +
                "                </xsl:when>\n" +
                "            </xsl:choose>\n" +
                "        </xsl:for-each>\n" +
                "    </xsl:template>\n" +
                "\n" +
                "    <xsl:template name=\"fillOldAttributes\">\n" +
                "        <xsl:for-each select=\"@*\">\n" +
                "            <xsl:attribute name=\"{local-name()}\"><xsl:value-of select=\".\"/></xsl:attribute>\n" +
                "        </xsl:for-each>\n" +
                "    </xsl:template>\n" +
                "\n" +
                "</xsl:stylesheet>";

        //input = input.replaceAll("\\p{C}","");
        XMLHelper.parseXml(input);

        input = XMLHelper.transformXml(input, transform).trim();

        String region = inputParams.get("liv_address_region");//34;
        String lastName = inputParams.get("client_surname");//"Сидоров";
        String firstName = inputParams.get("client_name");//"Александр";
        String patronymic = inputParams.get("client_middlename");//"";
        String birthdate = inputParams.get("client_birthdate");//"23.01.1981";

        if(StringHelper.isNullOrEmpty(region, lastName, firstName)) {
            throw new Exception("Не заполнены обязательные поля(liv_address_region, client_surname, client_name) для поиска в базе ФССП.");
        }

        DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        try {
            birthdate = formatter.format(StringHelper.parseAxicreditDate(birthdate));
        } catch (ParseException e) {
            throw new Exception("(ФССП)Дата рождения(client_birthdate) имеет не верынй формат", e);
        }

        try {
            Integer.parseInt(region);
        } catch (NumberFormatException e) {
            throw new Exception("(ФССП)Поле 'Регион'(liv_address_region) имеет не правильный формат.");
        }

        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        try {
            documentBuilder = documentFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new Exception("Ошибка генерации XML:" + e.getMessage(), e);
        }
        org.w3c.dom.Document documentResult = documentBuilder.newDocument();
        org.w3c.dom.Element rootElement = documentResult.createElement("FSSP");
        documentResult.appendChild(rootElement);

        HttpClientContext context = HttpClientContext.create();

        int retry = 0;

        String dataPageSource;
        Document dataPage = null;

        boolean success = false;

        String captchaPageSource = requestCaptchaPage(context, region, lastName, firstName, patronymic, birthdate);
        Document captchaPage = parseCaptchaPage(captchaPageSource);

        while(retry < 10) {
            //проверяем возможно по нашим старым кукам мы уже можем получить ответ
            if (captchaPage.select("#captcha-popup").size() == 0) {
                dataPage = captchaPage;
                success = true;
                break;
            }
//            String captchaImage = parseCaptchaFromCaptchaPage(captchaPage);
//
//            //CaptchaResolver cr = new CaptchaResolver("80fzsmhjligbt4uqhq6cvu8xu1dsuop3");
//            //TODO: кэшировать CaptchaResolver
//            CaptchaResolver cr = new CaptchaResolver(this.getConnectionParams().get("captchaResolverAccessKey"));
//            String captcha = null;
//            try {
//                captcha = cr.resolveCaptcha(captchaImage);
//            } catch (CaptchaException e) {
//                throw new Exception("(ФССП)Ошибка капчи: " + e.getMessage(), e);
//            } catch (IOException e) {
//                throw new Exception("(ФССП)Ошибка капчи: " + e.getMessage(), e);
//            }
//
//            log.debug("(ФССП)Капча распознана: " + captcha);
//
//            dataPageSource = requestDataPage(context, region, lastName, firstName, patronymic, birthdate, captcha);
//            dataPage = parseDataPage(dataPageSource);

            dataPage = tryResolveCaptcha(captchaPage, context, region, lastName, firstName, patronymic, birthdate);

            if (dataPage.select("#captcha-popup").size() == 0) {
                success = true;
                break;
            }

            captchaPage = dataPage;
            retry++;

            log.debug("(ФССП)При запросе данных выдалась капча. Пробуем еще раз.");
        }

        if(success == false) {
            throw new Exception("(ФССП)Ошибка сервиса ФССП(после " + retry + " попытки)");
        }

        //String result = parseDataFromDataPage(dataPage);
        parseDataFromDataPage(dataPage, documentResult);

        Integer pages = parsePagesFromDataPages(dataPage);
        for(int i = 2; i <= pages; i++) {
            dataPageSource = requestDataPage(context, region,lastName, firstName, patronymic, birthdate, i);
            dataPage = parseDataPage(dataPageSource);
            if (dataPage.select("#captcha-popup").size() > 0) {
                retry = 0;
                success = false;
                while(retry < 5) {
//                    String captchaImage = parseCaptchaFromCaptchaPage(dataPage);
//
//                    //CaptchaResolver cr = new CaptchaResolver("80fzsmhjligbt4uqhq6cvu8xu1dsuop3");
//                    //TODO: кэшировать CaptchaResolver
//                    CaptchaResolver cr = new CaptchaResolver(this.getConnectionParams().get("captchaResolverAccessKey"));
//                    String captcha = null;
//                    try {
//                        captcha = cr.resolveCaptcha(captchaImage);
//                    } catch (CaptchaException e) {
//                        throw new Exception("(ФССП)Ошибка капчи: " + e.getMessage(), e);
//                    } catch (IOException e) {
//                        throw new Exception("(ФССП)Ошибка капчи: " + e.getMessage(), e);
//                    }
//
//                    dataPageSource = requestDataPage(context, region, lastName, firstName, patronymic, birthdate, captcha);
//                    dataPage = parseDataPage(dataPageSource);
                    dataPage = tryResolveCaptcha(dataPage, context, region, lastName, firstName, patronymic, birthdate);
                    dataPageSource = requestDataPage(context, region,lastName, firstName, patronymic, birthdate, i);
                    dataPage = parseDataPage(dataPageSource);

                    if (dataPage.select("#captcha-popup").size() == 0) {
                        success = true;
                        break;
                    }

                    retry++;
                }
                if(success == false) {
                    throw new Exception("(ФССП)Ошибка сервиса на странице " + i + " ФССП(после " + retry + " попытки)");
                }
            }

            parseDataFromDataPage(dataPage, documentResult);
        }

        return documentResult;
    }

    private String requestCaptchaPage(HttpClientContext context, String region, String lastName, String firstName, String patronymic, String birthdate) throws Exception, Exception {
        URI uri = generateURI(region,lastName, firstName, patronymic, birthdate, "");
        HttpGet httpGet = new HttpGet(uri);

        HttpEntity responseEntity = null;
        String responseString = null;

        try {
            CloseableHttpResponse response = httpclient.execute(httpGet, context);
            responseEntity = response.getEntity();
            responseString = EntityUtils.toString(responseEntity);
        } catch (IOException e) {
            //e.printStackTrace();
            throw new Exception("(ФССП)Сетевая ошибка получения ответа(страница капчи) от ФССП: " + e.getMessage(), e);
        }

        log.debug("(ФССП)Страница с капчей получена");

        return responseString;
    }

    private Document parseCaptchaPage(String captchaPage) throws Exception {
        Document page;

        try {
            JSONObject json = new JSONObject(captchaPage);
            page = Jsoup.parse(json.getString("data"));
        } catch (JSONException e) {
            throw new Exception("(ФССП)Ошибка разбора JSON ответа от сервиса ФССП: " + e.getMessage(), e);
        }

        log.debug("(ФССП)Страница с капчей разобрана");

        return page;
    }

    private String parseCaptchaFromCaptchaPage(Document captchaPage) throws Exception {
        Element el;

        el = captchaPage.select("img").first();
        if(el == null) {
            throw new Exception("(ФССП)Ошибка разбора страницы с капчей от сервиса ФССП");
        }
        String captchaImage = el.attr("src");
        captchaImage = captchaImage.substring(23, captchaImage.length());

        log.debug("(ФССП)Ссылка на капчу разобрана");

        return captchaImage;
    }

//    private boolean isCaptchaRequested(Document page) {
//        return page.select("#captcha-popup").size() == 0;
//    }
//
    private Document tryResolveCaptcha(Document captchaPage, HttpClientContext context, String region, String lastName, String firstName, String patronymic, String birthdate) throws Exception, Exception {
        String captchaImage = parseCaptchaFromCaptchaPage(captchaPage);

        List<String> command = new ArrayList<String>();
        command.add("c:\\Work\\tesseract\\tesseract.exe");
        command.add("stdin");
        command.add("stdout");
        command.add("-l");
        command.add("rus");
        command.add("-psm");
        command.add("6");
        command.add("--user-patterns");
        command.add("c:\\Work\\tesseract\\pattern.txt");
        command.add("-c");
        command.add("language_model_penalty_non_freq_dict_word=0");
        command.add("language_model_penalty_non_dict_word=0");
        ProcessBuilder builder = new ProcessBuilder(command);
        builder.redirectInput();
        Process proc = builder.start();

        OutputStream stdin = proc.getOutputStream();
        stdin.write(OCR.main(Base64.decode(captchaImage.getBytes())));
        stdin.flush();
        stdin.close();

        String inputStream = IOUtils.toString(proc.getInputStream(), "UTF-8");
        inputStream = StringHelper.getNumbersLetters(inputStream.trim());

        Path path = Paths.get("c:\\Work\\tesseract\\test_img\\capcha.jpg");
        byte[] data = Files.readAllBytes(path);
        //CaptchaResolver cr = new CaptchaResolver("80fzsmhjligbt4uqhq6cvu8xu1dsuop3");
        //TODO: кэшировать CaptchaResolver
//        CaptchaResolver cr = new CaptchaResolver("80fzsmhjligbt4uqhq6cvu8xu1dsuop3");
//        String captcha = null;
//        try {
//            captcha = cr.resolveCaptcha(new String(Base64.encode(data)));
//        } catch (Exception e) {
//            throw new Exception("(ФССП)Ошибка капчи: " + e.getMessage(), e);
//        }

        FileOutputStream writer = new FileOutputStream("C:\\Work\\tesseract\\test_img\\" + inputStream + ".jpg");
        writer.write(Base64.decode(captchaImage.getBytes()));
        writer.flush();
        writer.close();

        log.debug("(ФССП)Капча распознана: " + inputStream);

        String dataPageSource = requestDataPage(context, region, lastName, firstName, patronymic, birthdate, inputStream);
        Document dataPage = parseDataPage(dataPageSource);

        return dataPage;
    }

    private String requestDataPage(HttpClientContext context, String region, String lastName, String firstName, String patronymic, String birthdate, String captcha) throws Exception, Exception {
        URI uri = generateURI(region, lastName, firstName, patronymic, birthdate, captcha);
        HttpGet httpGet = new HttpGet(uri);

        HttpEntity responseEntity = null;
        String responseString = null;

        try {
            CloseableHttpResponse response = httpclient.execute(httpGet, context);
            responseEntity = response.getEntity();
            responseString = EntityUtils.toString(responseEntity);

        } catch (IOException e) {
            //e.printStackTrace();
            throw new Exception("(ФССП)Сетевая ошибка получения ответа(страница данных) от ФССП: " + e.getMessage(), e);
        }

        log.debug("(ФССП)Страница с данными получена");

        return responseString;
    }

    private String requestDataPage(HttpClientContext context, String region, String lastName, String firstName, String patronymic, String birthdate, Integer page) throws Exception, Exception {
        URI uri = generateURI(region, lastName, firstName, patronymic, birthdate, page);
        HttpGet httpGet = new HttpGet(uri);

        HttpEntity responseEntity = null;
        String responseString = null;

        try {
            CloseableHttpResponse response = httpclient.execute(httpGet, context);
            responseEntity = response.getEntity();
            responseString = EntityUtils.toString(responseEntity);

        } catch (IOException e) {
            //e.printStackTrace();
            throw new Exception("(ФССП)Сетевая ошибка получения ответа(страница данных) от ФССП: " + e.getMessage(), e);
        }

        log.debug("(ФССП)Страница {} с данными получена", page);

        return responseString;
    }

    private Document parseDataPage(String dataPage) throws Exception {
        Document page;

        try {
            JSONObject json = new JSONObject(dataPage);
            String data = json.getString("data");
            page = Jsoup.parse(data);
        } catch (JSONException e) {
            throw new Exception("(ФССП)Ошибка разбора JSON ответа от сервиса ФССП: " + e.getMessage() ,e);
        }

        log.debug("(ФССП)Страница с данными разобрана");

        return  page;
    }

    private void parseDataFromDataPage(Document dataPage, org.w3c.dom.Document resultDocument) throws Exception {
        if(dataPage.select(".results .empty").size() > 0) {
            return;
        }

        Element table = dataPage.select("table").first();
        if(table == null) {
            throw new Exception("(ФССП)Ошибка разбора HTML ответа от сервиса ФССП: тэг table не найден");
        }

        List<Element> tableElements = table.select("tr");

        org.w3c.dom.Element fssp = resultDocument.getDocumentElement();

        Matcher matcher = null;

        DateFormat formatterDate = new SimpleDateFormat("dd.MM.yyyy");

        for(Element tr : tableElements) {
            List<Element> tdElements = tr.select("td");
            List<Element> thElements = tr.select("th");

            if(tdElements.size() < 8 && thElements.size() < 8) {
                int colspan = 0;
                for(Element td : tdElements) {
                    if(td.hasAttr("colspan")) {
                        colspan += Integer.parseInt(td.attr("colspan"));
                    }
                }
                if(colspan < 8) {
                    throw new Exception("(ФССП)Ошибка разбора HTML ответа от сервиса ФССП: таблица несоответствует формату (td.count= " + tdElements.size() + ", th.count= " + thElements.size() + ", colspan=" + colspan + ")");
                }
            }
            else if(tdElements.size() > 0) {
                String id_exec_production = "";
                String begin_dt = "";
                String end_dt = "";
                String end_descr = "";
                String exec_prod_reason = "";
                String debt_sum = "0";

                org.w3c.dom.Element fsspResponse = resultDocument.createElement("FSSP_response");

                matcher = patternColumn1.matcher(tdElements.get(1).text());
                if(matcher.matches()) {
                    id_exec_production = matcher.group(1);
                    begin_dt = matcher.group(2);
                    try {
                        begin_dt = StringHelper.formatAxicreditDate(formatterDate.parse(begin_dt));
                    } catch (ParseException e) {
                        //e.printStackTrace();
                        log.error("Ошибка преобразования даты в ответе ФССП: " + begin_dt);
                    }
                }


                matcher = patternColumn3.matcher(tdElements.get(3).text());
                if(matcher.matches()) {
                    end_dt = matcher.group(1);
                    end_descr = matcher.group(2);
                    try {
                        end_dt = StringHelper.formatAxicreditDate(formatterDate.parse(end_dt));
                    } catch (ParseException e) {
                        //e.printStackTrace();
                        log.error("Ошибка преобразования даты в ответе ФССП: " + end_dt);
                    }
                }

                matcher = patternColumn5.matcher(tdElements.get(5).text());
                if(matcher.matches()) {
                    exec_prod_reason = matcher.group(1);
                    if(matcher.groupCount() > 2) {
                        debt_sum = matcher.group(3);
                    }

                    if(StringHelper.isNullOrEmpty(debt_sum)) {
                        debt_sum = "0";
                    }
                }

                fsspResponse.setAttribute("id_exec_production", id_exec_production);
                fsspResponse.setAttribute("begin_dt", begin_dt);
                fsspResponse.setAttribute("end_dt", end_dt);
                fsspResponse.setAttribute("end_descr", end_descr);
                fsspResponse.setAttribute("exec_prod_reason", exec_prod_reason);
                fsspResponse.setAttribute("debt_sum", debt_sum);

                fssp.appendChild(fsspResponse);
            }
        }

        log.debug("(ФССП)Данные с страницы данных получены");
        return;
    }

    private Integer parsePagesFromDataPages(Document dataPage) {
        List<Element> pages = dataPage.select(".pagination a");

        //текущая без ссылки => -1
        //есть ссылка "Следующая" => +1
        //т.е. количество страниц = количеству ссылок

        log.debug("(ФССП)Количество страниц с данными получены: " + pages.size());

        return pages.size();
    }

    private URI generateURI(String region, String lastName, String firstName, String patronymic, String birthdate, String captcha) throws Exception {
        URI uri = null;
        try {
            uri = new URIBuilder(FSSP_URL)
                    .setParameter("system", "ip")
                    .setParameter("is[extended]", "1")
                    .setParameter("is[variant]", "1")
                    .setParameter("is[region_id][0]", region)
                    .setParameter("is[last_name]", lastName)
                    .setParameter("is[first_name]", firstName)
                    .setParameter("is[patronymic]", patronymic)
                    .setParameter("is[date]", birthdate)
                    .setParameter("code", captcha)
                    .build();
        } catch (URISyntaxException e) {
            //e.printStackTrace();
            throw new Exception("(ФССП)Ошибка генерации URL: " + e.getMessage(), e);
        }

        return  uri;
    }

    private URI generateURI(String region, String lastName, String firstName, String patronymic, String birthdate, Integer page) throws Exception {
        URI uri = null;

        try {
            uri = new URIBuilder(FSSP_URL)
                    .setParameter("system", "ip")
                    .setParameter("is[extended]", "1")
                    .setParameter("is[variant]", "1")
                    .setParameter("is[region_id][0]", region)
                    .setParameter("is[last_name]", lastName)
                    .setParameter("is[first_name]", firstName)
                    .setParameter("is[patronymic]", patronymic)
                    .setParameter("is[date]", birthdate)
                    .setParameter("page", page.toString())
                    .build();
        } catch (URISyntaxException e) {
            //e.printStackTrace();
            throw new Exception("(ФССП)Ошибка генерации URL: " + e.getMessage(), e);
        }

        return  uri;
    }
}
