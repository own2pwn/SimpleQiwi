package ru.sample.qiwi;

import com.sun.xml.internal.ws.api.message.Headers;
import com.sun.xml.internal.ws.developer.WSBindingProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ru.sample.qiwi.Externalsystems.AbstractExternalSystem;
import ru.sample.qiwi.Helpers.DateHelper;
import ru.sample.qiwi.Helpers.StringHelper;
import ru.sample.qiwi.Helpers.XMLHelper;
import ru.sample.qiwi.soap.cre.*;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by Дмитрий Астахов on 10.11.2016.
 */
public class CREInvoker extends AbstractExternalSystem {
    private Logger log = LoggerFactory.getLogger(getClass());

    CREInvoker() {
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
                "    <dateOfReport>2008-01-01</dateOfReport>\n" +
                "    <firstname>Георгий</firstname>\n" +
                "    <idNum>123456</idNum>\n" +
                "    <idSeries>1234</idSeries>\n" +
                "    <idType>21</idType>\n" +
                "    <issueAuthority>кем выдан</issueAuthority>\n" +
                "    <issueDate>2001-11-11</issueDate>\n" +
                "    <issueLocation>место</issueLocation>\n" +
                "    <middlename>Георгиевич</middlename>\n" +
                "    <placeOfBirth>Магадан</placeOfBirth>\n" +
                "    <reason>99</reason>\n" +
                "    <regAddrCity>МОСКВА</regAddrCity>\n" +
                "    <regAddrCountry>ru</regAddrCountry>\n" +
                "    <regAddrPostal>321123</regAddrPostal>\n" +
                "    <regAddrRegion>77</regAddrRegion>\n" +
                "    <regAddrStreet>улица</regAddrStreet>\n" +
                "    <surname>Кустов</surname>\n" +
                "</personRequest>\n";

        ConnectorPersonRequest request = createRequest(input);
        request = createPersonRequest(input);
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put("login", Collections.singletonList(this.getConnectionParams().get("login")));
        headers.put("password", Collections.singletonList(this.getConnectionParams().get("password")));
        headers.put("cacheUse", Collections.singletonList("1"));
        headers.put("connectorCode", Collections.singletonList(this.getConnectionParams().get("connectorCode")));

        ConnectorService service = new ConnectorService_Service().getConnectorServiceHttpPort();
        ((BindingProvider) service).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, headers);
//
//        ((WSBindingProvider) service).setOutboundHeaders(
//                Headers.create(new QName("login"), this.getConnectionParams().get("login")),
//                Headers.create(new QName("password"), this.getConnectionParams().get("password")),
//                Headers.create(new QName("cacheUse"), "1"),
//                Headers.create(new QName("connectorCode"), this.getConnectionParams().get("connectorCode"))
//        );


        ConnectorResponse response;
        response = service.getPerson(request);
        String xmlResponsee = parsePersonResponse(response);

//        return xmlResponsee;
    }

    public ConnectorPersonRequest createRequest(String input) throws ParserConfigurationException, SAXException, IOException, DatatypeConfigurationException, ParseException {
        Document doc = XMLHelper.parseXml(input);
        ConnectorPersonRequest request = new ConnectorPersonRequest();
        ObjectFactory objectFactory = new ObjectFactory();

        if (!StringHelper.isNullOrEmpty(XMLHelper.evaluateXPath(doc, "personRequest/idType"))) {
            request.setIdType(objectFactory.createConnectorPersonRequestIdType(Integer.parseInt(XMLHelper.evaluateXPath(doc, "personRequest/idType"))));
        } else {
            log.info("(CRE)Отсутствует или не заполнено поле idType");
        }

        request.setSurname(objectFactory.createConnectorPersonRequestSurname(XMLHelper.evaluateXPath(doc, "personRequest/surname")));
        request.setFirstname(objectFactory.createConnectorPersonRequestFirstname(XMLHelper.evaluateXPath(doc, "personRequest/firstname")));
        request.setMiddlename(objectFactory.createConnectorPersonRequestMiddlename(XMLHelper.evaluateXPath(doc, "personRequest/middlename")));
        request.setIssueAuthority(objectFactory.createConnectorPersonRequestIssueAuthority(XMLHelper.evaluateXPath(doc, "personRequest/issueAuthority")));
        request.setIssueDate(createXMLGregorianCalendar(XMLHelper.evaluateXPath(doc, "personRequest/issueDate")));
        request.setIssueLocation(objectFactory.createConnectorPersonRequestIssueLocation(XMLHelper.evaluateXPath(doc, "personRequest/issueLocation")));

        request.setIdNum(objectFactory.createConnectorPersonRequestIdNum(XMLHelper.evaluateXPath(doc, "personRequest/idNum")));
        request.setIdSeries(objectFactory.createConnectorPersonRequestIdSeries(XMLHelper.evaluateXPath(doc, "personRequest/idSeries")));
        request.setPlaceOfBirth(objectFactory.createConnectorPersonRequestPlaceOfBirth(XMLHelper.evaluateXPath(doc, "personRequest/placeOfBirth")));
        request.setDateOfBirth(createXMLGregorianCalendar(XMLHelper.evaluateXPath(doc, "personRequest/dateOfBirth")));

        request.setRegAddrCity(objectFactory.createConnectorPersonRequestRegAddrCity(XMLHelper.evaluateXPath(doc, "personRequest/regAddrCity")));
        request.setRegAddrCountry(objectFactory.createConnectorPersonRequestRegAddrCountry(XMLHelper.evaluateXPath(doc, "personRequest/regAddrCountry")));
        request.setRegAddrPostal(objectFactory.createConnectorPersonRequestRegAddrPostal(XMLHelper.evaluateXPath(doc, "personRequest/regAddrPostal")));
        request.setRegAddrRegion(objectFactory.createConnectorPersonRequestRegAddrRegion(XMLHelper.evaluateXPath(doc, "personRequest/regAddrRegion")));
        request.setRegAddrStreet(objectFactory.createConnectorPersonRequestRegAddrStreet(XMLHelper.evaluateXPath(doc, "personRequest/regAddrStreet")));

        request.setActAddrCity(objectFactory.createConnectorPersonRequestActAddrCity(XMLHelper.evaluateXPath(doc, "personRequest/actAddrCity")));
        request.setActAddrCountry(objectFactory.createConnectorPersonRequestActAddrCountry(XMLHelper.evaluateXPath(doc, "personRequest/actAddrCountry")));
        request.setActAddrPostal(objectFactory.createConnectorPersonRequestActAddrPostal(XMLHelper.evaluateXPath(doc, "personRequest/actAddrPostal")));
        request.setActAddrRegion(objectFactory.createConnectorPersonRequestActAddrRegion(XMLHelper.evaluateXPath(doc, "personRequest/actAddrRegion")));
        request.setActAddrStreet(objectFactory.createConnectorPersonRequestActAddrStreet(XMLHelper.evaluateXPath(doc, "personRequest/actAddrStreet")));

        request.setAmount(objectFactory.createConnectorPersonRequestAmount(XMLHelper.evaluateXPath(doc, "personRequest/amount")));
        request.setCurrency(objectFactory.createConnectorPersonRequestCurrency(XMLHelper.evaluateXPath(doc, "personRequest/currency")));
        request.setDateOfReport(objectFactory.createConnectorPersonRequestDateOfReport(createXMLGregorianCalendar(XMLHelper.evaluateXPath(doc, "personRequest/dateOfReport"))));
        request.setReason(objectFactory.createConnectorPersonRequestReason(XMLHelper.evaluateXPath(doc, "personRequest/reason")));

        return request;
    }

    public XMLGregorianCalendar createXMLGregorianCalendar(String input) throws DatatypeConfigurationException, ParseException {
        Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        if (!pattern.matcher(input).matches()) {
            log.info("(CRE)Дата {} введена некорректно", input);
            input = "1990-01-01";
        }

        GregorianCalendar c = new GregorianCalendar();
        c.setTime(formatter.parse(input));

        return  DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
    }

    public ConnectorPersonRequest createPersonRequest(String inputXML) throws Exception {
        ConnectorPersonRequest request = new ConnectorPersonRequest();
        ObjectFactory objectFactory = new ObjectFactory();

        Document doc = XMLHelper.parseXml(inputXML);

        // Формирования массива из методов класса ConnectorPersonRequest
        Method[] methodArr = ConnectorPersonRequest.class.getMethods();
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
                objectFactoryMethodName = "createConnectorPersonRequest" + setStartWithUpperCase(node.getNodeName());

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
                            objParam = createXMLGregorianCalendar((String) objParam);
                        }
                    } catch (DatatypeConfigurationException | ParseException | NumberFormatException e) {
                        throw new Exception("(CRE)Ошибка формирования поля " + node.getNodeName());
                    }

                    objParam = objectFactoryMethod.invoke(objectFactory, objParam);
                } else {
                    try {
                        objParam = createXMLGregorianCalendar((String)objParam);
                    } catch (DatatypeConfigurationException | ParseException e) {
                        throw new Exception("(CRE)Ошибка формирования даты в поле " + node.getNodeName());
                    }
                }

                method.invoke(request, objParam);
            }
        }

        return request;
    }

    /**
     * Преобразование строки, чтобы она начиналась с заглавной буквы
     * @param input Стррока в нижнем регистре
     * @return Строка, первая буква которой в верхнем регистре
     */
    public String setStartWithUpperCase(String input) {
        return Character.toUpperCase(input.charAt(0)) + input.substring(1);
    }

    public String parsePersonResponse(ConnectorResponse response) throws Exception {
        Document doc = null;

        Map<String, String> params = new HashMap<String, String>();
        params.put("cacheUse", response.getCacheUse().getValue().toString());
        params.put("created", dateToString(response.getCreated().toGregorianCalendar().getTime(), "yyyy-MM-dd"));
        params.put("reportCode", response.getReportCode().getValue());
        params.put("uid", response.getUid().getValue());
        params.put("response", response.getResponse().getValue());
        params.put("requestFor", response.getRequestFor());

        doc = XMLHelper.generateXmlFromParams(params, "response");

        return XMLHelper.convertToString(doc);
    }

    public static String dateToString(Date date, String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);

        return dateFormat.format(date);
    }
}
