package ru.sample.qiwi;

import com.sun.xml.internal.ws.fault.ServerSOAPFaultException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ru.sample.qiwi.Externalsystems.AbstractExternalSystem;
import ru.sample.qiwi.Helpers.StringHelper;
import ru.sample.qiwi.Helpers.XMLHelper;
import ru.sample.qiwi.soap.cre2.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.ws.WebServiceException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by Дмитрий Астахов on 14.11.2016.
 */
public class CREInvoker2 extends AbstractExternalSystem{
    private Logger log = LoggerFactory.getLogger(getClass());

    CREInvoker2() {
        super(null);
    }

    public void main() throws Exception {
        String input = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<personRequest>\n" +
                "    <actAddrCity>Москва</actAddrCity>\n" +
                "    <actAddrCountry>ru</actAddrCountry>\n" +
                "    <actAddrPostal>123123</actAddrPostal>\n" +
                "    <actAddrRegion>77</actAddrRegion>\n" +
                "    <actAddrStreet>улица</actAddrStreet>\n" +
                "    <amount>123</amount>\n" +
                "    <currency>rub</currency>\n" +
                "    <dateOfBirth>1980-11-11</dateOfBirth>\n" +
                "    <firstName>Георгий</firstName>\n" +
                "    <idNum>123456</idNum>\n" +
                "    <idSeries>1234</idSeries>\n" +
                "    <idType>21</idType>\n" +
                "    <issueAuthority>кем выдан</issueAuthority>\n" +
                "    <issueDate>2001-11-11</issueDate>\n" +
                "    <issueLocation>место</issueLocation>\n" +
                "    <middleName>Георгиевич</middleName>\n" +
                "    <placeOfBirth>Магадан</placeOfBirth>\n" +
                "    <reason>99</reason>\n" +
                "    <regAddrCity>МОСКВА</regAddrCity>\n" +
                "    <regAddrCountry>ru</regAddrCountry>\n" +
                "    <regAddrPostal>321123</regAddrPostal>\n" +
                "    <regAddrRegion>77</regAddrRegion>\n" +
                "    <regAddrStreet>улица</regAddrStreet>\n" +
                "    <lastName>Кустов</lastName>\n" +
                "</personRequest>\n";

        log.info("(Credit Registry)Вызов сервиса Credit Registry");

        ProcessRequestData request = null;
        try {
            request = createProcessRequestData(input);
        } catch (InvocationTargetException | IllegalAccessException | ParserConfigurationException | SAXException | IOException | DatatypeConfigurationException | ParseException e) {
            throw new Exception("(Credit Registry)Ошибка формирования запроса к сервису Credit Registry", e);
        }

        SingleFormatService service = new SingleFormatService_Service().getSingleFormatServiceHttpPort();

        ProcessRequestOut response = null;
        try {
            response = service.processRequestWSI(request);
        } catch (WebServiceException e) {
            throw new Exception("(Credit Registry)Сетевая ошибка отправки запроса к сервису Credit Registry:" + e.getMessage(), e);
        }

        String xmlResponse = null;
        try {
            xmlResponse = parseProcessRequestOut(response);
        } catch (ParserConfigurationException | TransformerException | UnsupportedEncodingException e) {
            throw new Exception("(Credit Registry)Ошибка разбора ответа от сервиса Credit Registry", e);
        }

//        return xmlResponse;
    }

    /**
     * Создание XMLGregorianCalendar из строки даты
     * @param input Дата
     * @return Дата XMLGregorianCalendar
     * @throws DatatypeConfigurationException
     * @throws ParseException
     */
    public XMLGregorianCalendar createXMLGregorianCalendar(String input, String format) throws DatatypeConfigurationException, ParseException {
        Pattern pattern = Pattern.compile(format.replaceAll("\\w", "\\\\d"));
        SimpleDateFormat formatter = new SimpleDateFormat(format);

        if (!pattern.matcher(input).matches()) {
            log.info("(Credit Registry)Дата {} введена некорректно", input);
            input = "1990-01-01";
        }

        GregorianCalendar c = new GregorianCalendar();
        c.setTime(formatter.parse(input));

        return  DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
    }

    /**
     * Преобразование данных в формат CRE
     * @param inputXML Входные данные
     * @return Данные в формате SOAP CRE
     * @throws Exception
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     */
    public ProcessRequestData createProcessRequestData(String inputXML) throws Exception, InvocationTargetException, IllegalAccessException, ParserConfigurationException, SAXException, IOException, DatatypeConfigurationException, ParseException {
        ProcessRequestData request = new ProcessRequestData();
        ObjectFactory objectFactory = new ObjectFactory();

        Document doc = XMLHelper.parseXml(inputXML);

        ConnectorCode connectorCode = new ConnectorCode();
        connectorCode.setConnectorCode("1011");

        //
        AuthData authData = new AuthData();
        authData.setLogin("login");
        authData.setPassword("password");

        PersonRequestData personData = new PersonRequestData();

        // Формирования массива из методов класса ConnectorPersonRequest
        Method[] methodArr = PersonRequestData.class.getMethods();
        Map<String, Method> methods = new HashMap<String, Method>();
        for(Method m : methodArr) {
            methods.put(m.getName(), m);
        }

        // Формирования массива из методов класса ObjectFactory
        methodArr = ObjectFactory.class.getMethods();
        Map<String, Method> objectFactoryMethods = new HashMap<String, Method>();
        for(Method m : methodArr) {
            objectFactoryMethods.put(m.getName(), m);
        }

        Node node = null; // Обрабатываемый узел
        Method method = null; // Метод set'ClassName' класса ConnectorPersonRequest
        Method objectFactoryMethod = null; // Метод createConnectorPersonRequest'ClassName' класса ObjectFactory
        String methodName = null; // Название метода, пример: setDateType
        String objectFactoryMethodName = null; // Название метода, пример: createConnectorPersonRequestDateType
        Object objParam = null; // Объект класса параметров
        NodeList nodeList = doc.getDocumentElement().getChildNodes(); // Список эелементов в теге response

        for (int i = 0; i < nodeList.getLength(); ++i) {
            node = nodeList.item(i);

            // Не зполняем если значение в поле отсутствует
            if (StringHelper.isNullOrEmpty(node.getTextContent())) {
                continue;
            }

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                methodName = "set" + setStartWithUpperCase(node.getNodeName());
                objectFactoryMethodName = "createPersonRequestData" + setStartWithUpperCase(node.getNodeName());

                objParam = node.getTextContent();
                if (objParam == null) {
                    objParam = "";
                }

                method = methods.get(methodName);

                if (objectFactoryMethods.containsKey(objectFactoryMethodName)) {
                    objectFactoryMethod = objectFactoryMethods.get(objectFactoryMethodName);
                    objectFactoryMethodName = objectFactoryMethod.getParameterTypes()[0].getName();

                    try {
                        if (objectFactoryMethodName.contains("Integer")) {
                            objParam = Integer.parseInt((String) objParam);
                        } else if (objectFactoryMethodName.contains("XMLGregorianCalendar")) {
                            objParam = createXMLGregorianCalendar((String) objParam, "yyyy-MM-dd");
                        }
                    } catch (DatatypeConfigurationException | ParseException | NumberFormatException e) {
                        throw new Exception("(Credit Registry)Ошибка формирования поля " + node.getNodeName());
                    }

                    objParam = objectFactoryMethod.invoke(objectFactory, objParam);
                } else {
                    try {
                        objParam = createXMLGregorianCalendar((String)objParam, "yyyy-MM-dd");
                    } catch (DatatypeConfigurationException | ParseException e) {
                        throw new Exception("(Credit Registry)Ошибка формирования даты в поле " + node.getNodeName());
                    }
                }

                method.invoke(personData, objParam);
            }
        }

        request.setCacheUse(0);
        request.setConnectorCode(connectorCode);
        request.setDateTimeApplication(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
        request.setUid(UUID.randomUUID().toString());
        request.setUidApplication(UUID.randomUUID().toString());
        request.setAuthData(authData);
        request.getPersonParam().add(personData);

        return request;
    }

    /**
     * Преобразование ответа CRE в XML
     * @param response Ответ CRE
     * @return Ответ CRE в формате XML
     * @throws ParserConfigurationException
     * @throws TransformerException
     * @throws UnsupportedEncodingException
     */
    public String parseProcessRequestOut(ProcessRequestOut response) throws Exception {
        Document doc = null;

        Map<String, String> params = new HashMap<String, String>();
        params.put("cacheUse", response.getCacheUse().getValue().toString());
        params.put("created", dateToString(response.getCreated().toGregorianCalendar().getTime(), "yyyy-MM-dd"));
        params.put("reportCode", response.getReportCode().getValue());
        params.put("uid", response.getUid().getValue());
        params.put("response", response.getResponse().get(0));
        params.put("uidApplication", response.getUidApplication().getValue());

        doc = XMLHelper.generateXmlFromParams(params, "response");

        return XMLHelper.convertToString(doc);
    }

    /**
     * Преобразование строки, чтобы она начиналась с заглавной буквы
     * @param input Строка в нижнем регистре
     * @return Строка, первая буква которой в верхнем регистре
     */
    public String setStartWithUpperCase(String input) {
        return Character.toUpperCase(input.charAt(0)) + input.substring(1);
    }

    /**
     * Преобразование даты в строку с заданным форматом
     * @param date Дата
     * @param format Формат даты
     * @return Стрка даты в заданном формате
     */
    public static String dateToString(Date date, String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);

        return dateFormat.format(date);
    }

    public static String getCurrentDate(String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        Date date = new Date();

        return dateFormat.format(date);
    }
}
