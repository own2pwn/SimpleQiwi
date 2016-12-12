package ru.sample.qiwi;

import org.apache.commons.codec.binary.*;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ru.nbch.fraud.hash.Hash;
import ru.sample.qiwi.Externalsystems.HTTPSExternalSystem;
import ru.sample.qiwi.Helpers.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathConstants;
import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Дмитрий Астахов on 29.08.2016.
 */
public class FinkartaInvoker extends HTTPSExternalSystem {
    private static final String archiveName = "testFinkarta_req.zip";
    private static final String archivedFileName = "testData_req.xml";
    String URL = "https://dd.axicredit.ru/ps/services/ProcessServer";

    FinkartaInvoker() {
        super(null);
    }

    @Override
    protected String getUrl() {

//        return "https://reqxml.f-karta.ru/prod/request.php";
//        return URL;
//        return "https://demo.axicredit.ru/ps/services/ProcessServer";
        return "https://dd.axicredit.ru/ps/services/ProcessServer";
    }

    @Override
    protected HttpEntity getHttpEntity(List<NameValuePair> requestParams) throws Exception {

        return null;
//        MultipartEntityBuilder builder = null;
//
//        try {
//            builder = MultipartEntityBuilder.create();
////            byte[] request = Hex.decodeHex(requestParams.get(0).getValue().toCharArray());
//
////            builder.addBinaryBody("file", request, ContentType.APPLICATION_OCTET_STREAM, archiveName);
//            builder.addTextBody("xml", requestParams.get(0).getValue(), ContentType.APPLICATION_XML);
//            builder.setBoundary("wayDxR2Q62aZDeJOGimw5sD6gQWJH6Ko5LvaVF0K");
//            builder.setCharset(Consts.UTF_8);
//        } catch (Exception e) {
//            throw new Exception("(Финкарта)Ошибка формирования запроса к сервису Финкарта", e);
//        }
//
//        return builder.build();
    }

    @Override
    public void setHeaders(HttpPost httpPost) {
//        httpPost.setHeader(HttpHeaders.CONTENT_TYPE, "multipart/form-data; boundary=wayDxR2Q62aZDeJOGimw5sD6gQWJH6Ko5LvaVF0K");
//        httpPost.setHeader(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate, br");
//        httpPost.setHeader(HttpHeaders.USER_AGENT, "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36");
//        httpPost.setHeader(HttpHeaders.ACCEPT, "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
//        httpPost.setHeader(HttpHeaders.HOST, "dd.axicredit.ru");
    }

    public void main(String url) throws Exception {
        URL = url;
        String input = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<request id=\"1123123\" date=\"12.12.2012 10:10:10\" request_type=\"ALL\">\n" +
                "    <person_data>\n" +
                "        <person record_id=\"1\"\n" +
                "                type=\"1\"\n" +
                "                hash_last_name=\"Иванов\"\n" +
                "                hash_first_name=\"Петр\"\n" +
                "                hash_middle_name=\"Сидорович\"\n" +
                "                hash_birth_date=\"19.06.1990\"\n" +
                "                hash_birth_place=\"Волгоград\"\n" +
                "                sex=\"1\"\n" +
                "                hash_inn=\"978546132546978\"\n" +
                "                hash_snils=\"978546132546978\" >\n" +
                "            <person_addresses>\n" +
                "                <address record_id=\"1\"\n" +
                "                         address_type=\"2\"\n" +
                "                         address_index=\"400000\"\n" +
                "                         address_region=\"Московская область\"\n" +
                "                         address_city_name=\"Москва\"\n" +
                "                         hash_address_street_name=\"Заворуева\"\n" +
                "                         hash_address_building_number=\"25\"\n" +
                "                         hash_address_flat_number=\"36\"/>\n" +
                "            </person_addresses>\n" +
                "            <person_phones>\n" +
                "                <phone record_id=\"1\"\n" +
                "                       phone_type=\"3\"\n" +
                "                       phone_number=\"9277899889\"/>\n" +
                "            </person_phones>\n" +
                "            <person_docs>\n" +
                "                <doc record_id=\"1\"\n" +
                "                     doc_type=\"\"\n" +
                "                     hash_doc_serial=\"1815\"\n" +
                "                     hash_doc_number=\"13246\"\n" +
                "                     hash_doc_issue_date=\"14.04.2015\"\n" +
                "                     doc_issue_auth=\"Орган, выдавший документ\"/>\n" +
                "            </person_docs>\n" +
                "            <person_cards>\n" +
                "                <card record_id=\"1\"\n" +
                "                      card_number=\"1234561234566789\"\n" +
                "                      card_exp_date=\"01.06.2018\"/>\n" +
                "            </person_cards>\n" +
                "        </person>\n" +
                "    </person_data>\n" +
                "</request>";

        Document doc = null;
        doc = XMLHelper.parseXml(input);

//        String[] arr = {"C:\\Work\\SimpleQiwi\\nbch_fraud.jar\\input.xml"};
//        Hash.main(arr);

        // TODO: Заполнение полей
        setNodeValueXML(doc, "/request/@date", (new SimpleDateFormat("dd.MM.yyyy HH:mm:ss")).format(new Date())); // Установка текущей даты-времени
        setNodeValueXML(doc, "/request/@id", String.valueOf(randInt())); // Установка ID

        try {
            input = XMLHelper.convertToString(doc);
        } catch (TransformerException | UnsupportedEncodingException e) {
            throw new Exception("(Финкарта)Ошибка преобразования документа в строку", e);
        }

        try {
            input = normalizeHashingRequest(input);
        } catch (ParseException | ParserConfigurationException | SAXException | IOException | NoSuchAlgorithmException | TransformerException e) {
            throw new Exception("(Финкарта)Ошибка нормализации-хеширования запроса к сервису Финкарта", e);
        }

        byte[] archiveRequest = null;
        try {
            archiveRequest = ZipHelper.archivingData(input, archivedFileName);
        } catch (IOException e) {
            throw new Exception("(Финкарта)Ошибка архивирования запроса к сервису Финкарта", e);
        }
//        System.setProperty("jsse.enableSNIExtension", "false");
        List<NameValuePair> requestParams = new ArrayList<NameValuePair>();
//        requestParams.add(new BasicNameValuePair("archive", new String(Hex.encodeHex(archiveRequest))));
        requestParams.add(new BasicNameValuePair("archive", input));

        setConnectionSetting(TMFEnum.PKIX, SSLCEnum.TLSv1_2);
        HttpEntity response = null;
        try {
            response = requestRawApi(requestParams);
        } catch (Exception e) {
            throw new Exception("(Финкарта)Ошибка отправки запроса к сервису Финкарта", e);
        }

        System.out.println("\n\n\n##################################################");
        System.out.println("Ответ полученный на запрос по адресу " + getUrl() + ":");
        System.out.println(EntityUtils.toString(response));
        return;
//
//        String responseXML;
//        try {
//            responseXML = ZipHelper.unarchivingData(response.getContent());
//        } catch (Exception e) {
//            throw new Exception("(Финкарта)Ошибка разархивирования запроса от сервиса Финкарта", e);
//        }
//
//        try {
//            doc = XMLHelper.parseXml(responseXML);
//        } catch (IOException | SAXException | ParserConfigurationException e) {
//            throw new Exception("(Финкарта)Ошибка разбора ответа от сервиса Финкарта", e);
//        }
//
//        // TODO: сделать обработку ошибок, в тестовом доступе ошибок не выдается
//        if (!XMLHelper.evaluateXPath(doc, "/results/file/xsd/@answer").equals("No errors")) {
//            throw new Exception("(Финкарты)Ошибка ответа от сервиса Финкарта: ");
//        }

//        return responseXML;
    }

    /**
     * Нормализация и хеширование полей запроса
     * @param source Запрос
     * @return Обработанный запрос
     * @throws ParseException
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws TransformerException
     */
    public static String normalizeHashingRequest(String source) throws Exception {
        Document doc = XMLHelper.parseXml(source);

        List<String> hashTextAttributes = new ArrayList<String>();
        hashTextAttributes.add("request/person_data/person/@hash_last_name");
        hashTextAttributes.add("request/person_data/person/@hash_first_name");
        hashTextAttributes.add("request/person_data/person/@hash_middle_name");
        hashTextAttributes.add("request/person_data/person/@hash_birth_place");
        hashTextAttributes.add("request/person_data/person/@hash_inn");
        hashTextAttributes.add("request/person_data/person/@hash_snils");
        hashTextAttributes.add("request/person_data/person/person_addresses/address/@hash_address_street_name");
        hashTextAttributes.add("request/person_data/person/person_addresses/address/@hash_address_building_number");
        hashTextAttributes.add("request/person_data/person/person_addresses/address/@hash_address_flat_number");
        hashTextAttributes.add("request/person_data/person/person_docs/doc/@hash_doc_serial");
        hashTextAttributes.add("request/person_data/person/person_docs/doc/@hash_doc_number");
//        hashTextAttributes.add("request/check_hash/@hash");

        List<String> hashDateAttributes = new ArrayList<String>();
        hashDateAttributes.add("request/person_data/person/@hash_birth_date");
        hashDateAttributes.add("request/person_data/person/person_docs/doc/@hash_doc_issue_date");

        // Обработка текстовых полей
        Node node = null;
        for (int i = 0; i < hashTextAttributes.size(); i++) {
            node = (Node) XMLHelper.evaluateXPath(doc, hashTextAttributes.get(i), XPathConstants.NODE);
            node.setNodeValue(normalizeHashingField(node.getNodeValue(), false));
        }

        // Обработка полей с датой
        for (int i = 0; i < hashDateAttributes.size(); i++) {
            node = (Node) XMLHelper.evaluateXPath(doc, hashDateAttributes.get(i), XPathConstants.NODE);
            node.setNodeValue(normalizeHashingField(node.getNodeValue(), true));
        }

        String result = XMLHelper.convertToString(doc);

        return result;
    }

    /**
     * Таранслитирование строки по стандарту Финкарты
     * @param source Исходная строка в верхнем регистре
     * @return Транслитированная строка
     */
    public static String translitirate(String source) {
        String result = "";
        Map<Character, String> alphabet = new HashMap<Character, String>();
        alphabet.put('А', "A");
        alphabet.put('Б', "B");
        alphabet.put('В', "V");
        alphabet.put('Г', "G");
        alphabet.put('Д', "D");
        alphabet.put('Е', "E");
        alphabet.put('Ё', "E");
        alphabet.put('Ж', "ZH");
        alphabet.put('З', "Z");
        alphabet.put('И', "I");
        alphabet.put('Й', "Y");
        alphabet.put('К', "K");
        alphabet.put('Л', "L");
        alphabet.put('М', "M");
        alphabet.put('Н', "N");
        alphabet.put('О', "O");
        alphabet.put('П', "P");
        alphabet.put('Р', "R");
        alphabet.put('С', "S");
        alphabet.put('Т', "T");
        alphabet.put('У', "U");
        alphabet.put('Ф', "F");
        alphabet.put('Х', "KH");
        alphabet.put('Ц', "TS");
        alphabet.put('Ч', "CH");
        alphabet.put('Ш', "SH");
        alphabet.put('Щ', "SHCH");
        alphabet.put('Ъ', "\"\"");
        alphabet.put('Ы', "Y");
        alphabet.put('Ь', "''");
        alphabet.put('Э', "E");
        alphabet.put('Ю', "YU");
        alphabet.put('Я', "YA");

        String c;

        for (int i = 0; i < source.length(); i++) {
            c = Character.toString(source.charAt(i));

            if (alphabet.containsKey(c.charAt(0))) {
                c = alphabet.get(c.charAt(0));
            }

            result = result.concat(c);
        }
        return result;
    }

    /**
     * Нормализация и хеширование поля
     * @param source Исходаные данные
     * @param date   Флаг, является ли source типом дата
     * @return Нормализованная и хешированная строка
     * @throws NoSuchAlgorithmException
     * @throws ParseException
     */
    public static String normalizeHashingField(String source, boolean date) throws NoSuchAlgorithmException, ParseException {
//        String result = source.toUpperCase();
//
//        if (date) {
//            result = DateHelper.convertDateFormat(source, "dd.MM.YYYY", "YYYY-MM-dd");
//        } else {
//            result = StringHelper.getNumbersLetters(result);
//            result = translitirate(result);
//        }
//
//        result = StringHelper.toHexString(HashHelper.getGOST2012512Hash(result));
//
//        return result;

        String result = source.toUpperCase();

        result = StringHelper.getNumbersLetters(result);
        result = translitirate(result);

        result = StringHelper.toHexString(HashHelper.getGOST2012512Hash(result));

        return result;
    }

    /**
     * Установка значения в узел
     * @param doc  Документ XML
     * @param path Путь к узлу
     * @param data Устанавливаемое значение
     */
    public static void setNodeValueXML(Document doc, String path, String data) {
        Node node = null;

        node = (Node) XMLHelper.evaluateXPath(doc, path, XPathConstants.NODE);
        node.setNodeValue(data);
    }

    /**
     * Рандомное целое число
     * @return Целое число
     */
    public static int randInt() {
        Random rand = new Random();
        int randomNum = rand.nextInt();

        return randomNum < 0 ? -randomNum: randomNum;
    }
}
