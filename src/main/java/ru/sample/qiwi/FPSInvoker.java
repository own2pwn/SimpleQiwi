package ru.sample.qiwi;

import com.sun.xml.internal.ws.fault.ServerSOAPFaultException;
import org.apache.axis2.AxisFault;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ru.sample.qiwi.Helpers.XMLHelper;
import ru.sample.qiwi.fpspartner.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Дмитрий Астахов on 26.08.2016.
 */
public class FPSInvoker {
    public void main() throws Exception, ParseException {
        Document doc = null;
        String result = null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        builder = factory.newDocumentBuilder();
        doc = builder.parse(new File("Fps_request.xml"));
        String xmlFile = XMLHelper.convertToString(doc);

        // Инциализация параметров запроса
        FPSPartnerServiceStub fps = new FPSPartnerServiceStub();
        NewApplication request = createRequestCreditHistory(xmlFile);

        // Запрос "Кредитная история"
        NewApplicationResponse response = null;
        try {
            response = fps.newApplication(request);
        } catch (AxisFault e) {
            throw new Exception("(FPS)Сетевая ошибка отправки запроса \"Кредитная история\" к сервису FPS: " + e.getMessage());
        }

        if (response.getStatus() != StatusType.value1) {
            throw new Exception("(FPS)Ошибка разбора ответа \"Кредитная история\" от сервиса FPS");
        }

        String applicationid = response.getApplicationid().getP100Type();

        OutputVector outputVector = createRequestOutputVector(applicationid);

        // Запросы "Выходной вектор"
        OutputVectorResponse responseOutputVector = null;
        try {
            responseOutputVector = fps.outputVector(outputVector);
        } catch (AxisFault e) {
            throw new Exception("(FPS)Сетевая ошибка отправки запроса \"Выходной вектор\" к сервису FPS: " + e.getMessage());
        }

        if (responseOutputVector.getStatus() != StatusType.value1) {
            throw new Exception("(FPS)Ошибка разбора ответа \"Выходной вектор\" от сервиса FPS");
        }

        String responseXML = parseResponseOutputVector(responseOutputVector);
    }

    public NewApplication createRequestCreditHistory(String inputXML) throws Exception, IOException, SAXException, ParserConfigurationException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        NewApplication request = new NewApplication();
        Document doc = XMLHelper.parseXml(inputXML);

        // Формирования массива из методов класса NewApplication
        Method[] methodArr = NewApplication.class.getMethods();
        Map<String, Method> methods = new HashMap<String, Method>();
        for(Method m : methodArr) {
            methods.put(m.getName(), m);
        }

        P50Type p50 = null;
        P100Type p100 = new P100Type();
        PartneridType partnerid = new PartneridType();
        DatetimeType datetime = new DatetimeType();
        Node node = null; // Обрабатываемый узел
        Method method = null; // Метод set'ClassName' класса NewApplication
        String methodName = null; // Название метода, пример: setDateType
        Object objParam = null; // Объект передаваемый
        Class classParam = null;
        Method methodParams = null;
        NodeList nodeList = doc.getDocumentElement().getChildNodes(); // Список эелементов в теге response

        for (int i = 0; i < nodeList.getLength(); ++i) {
            node = nodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                methodName = "set" + setStartWithUpperCase(node.getNodeName());

                method = methods.get(methodName);

                classParam = method.getParameterTypes()[0];
                java.lang.reflect.Constructor[] con = classParam.getConstructors();

                if (con.length == 0) {
                    objParam = getValue(classParam, node.getTextContent());
                } else {
                    objParam = classParam.newInstance();
                    methodParams = classParam.getMethod("set" + getClassName(classParam.getName()), String.class);

                    try {
                        methodParams.invoke(objParam, node.getTextContent());
                    } catch (InvocationTargetException e) {
                        throw new Exception("(FPS)Ошибка формирования запроса: поле " + node.getNodeName() + " введено неверно"); // TODO: Изменить Exception
                    }
                }

                method.invoke(request, objParam);
            }
        }

        p50 = new P50Type();
        p50.setP50Type("admin"); // TODO: getConnectionParams: Login
        request.setLogin(p50);

        p50 = new P50Type();
        p50.setP50Type("password"); // TODO: getConnectionParams: Password
        request.setPassword(p50);

        partnerid.setPartneridType("101"); // TODO: getConnectionParams: Partnerid
        request.setPartnerid(partnerid);

        p100.setP100Type(String.valueOf(randInt()));
        request.setApplicationid(p100);

        datetime.setDatetimeType(getCurrentDate("dd.MM.yyyy HH:mm:ss"));
        request.setApplicationdate(datetime);

        return request;
    }

    public OutputVector createRequestOutputVector(String applicationdid) {
        OutputVector outputVector = new OutputVector();

        P50Type p50 = null;
        P100Type p100 = new P100Type();
        PartneridType partnerid = new PartneridType();
        DatetimeType datetime = new DatetimeType();
        ApplicanttypenumType applicantEnum = new ApplicanttypenumType();
        ApplicanttypeType applicant = ApplicanttypeType.value1;

        p50 = new P50Type();
        p50.setP50Type("admin"); // TODO: getConnectionParams: Login
        outputVector.setLogin(p50);

        p50 = new P50Type();
        p50.setP50Type("admin"); // TODO: getConnectionParams: Password
        outputVector.setPassword(p50);

        partnerid.setPartneridType("101"); // TODO: getConnectionParams: Partnerid
        outputVector.setPartnerid(partnerid);

        p100.setP100Type(applicationdid);
        outputVector.setApplicationid(p100);

        outputVector.setApplicanttype(applicant);

        datetime.setDatetimeType(getCurrentDate("dd.MM.YYYY HH:MM:SS"));
        outputVector.setApplicationdate(datetime);

        applicantEnum.setApplicanttypenumType("1");
        outputVector.setApplicanttypenum(applicantEnum);

        return outputVector;
    }

    public String parseResponseOutputVector(OutputVectorResponse response) throws Exception {
        Document doc = null;

        Map<String, String> params = new HashMap<String, String>();
        params.put("applicationid", response.getApplicationid().getP100Type());
        params.put("status", response.getStatus().getValue());
        params.put("mainrules", response.getMainrules().getP1024Type());
        params.put("mainscorevalue", response.getMainscorevalue().getP15Type());
        params.put("specificrules", response.getSpecificrules().getP1024Type());
        params.put("applicationsfound", response.getApplicationsfound().getP15Type());

        doc = XMLHelper.generateXmlFromParams(params, "response");

        return XMLHelper.convertToString(doc);
    }

    public String setStartWithUpperCase(String input) {
        return Character.toUpperCase(input.charAt(0)) + input.substring(1);
    }

    public String getClassName(String input) {
        return input.substring(input.lastIndexOf(".") + 1);
    }

    public Object getValue(Class srcClass, String input) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Field[] fields = srcClass.getFields();
        Object object = null;
        Method method = null;
        String result;

        for(Field f : fields) {
            if (!f.getName().startsWith("value")) {
                continue;
            }

            object = f.get(new Object());
            method = object.getClass().getMethod("getValue");
            result = (String)method.invoke(object);

            if (result.equals(input)) {
                return object;
            }
        }

        return null;
    }

    public static String getCurrentDate(String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        Date date = new Date();

        return dateFormat.format(date);
    }

    /**
     * Returns a pseudo-random number between min and max, inclusive.
     * The difference between min and max can be at most
     * <code>Integer.MAX_VALUE - 1</code>.
     *
     * @param min Minimum value
     * @param max Maximum value.  Must be greater than min.
     * @return Integer between min and max, inclusive.
     * @see java.util.Random#nextInt(int)
     */
    public static int randInt(int min, int max) {
        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public static int randInt() {
        Random rand = new Random();
        int randomNum = rand.nextInt();

        return randomNum;
    }
}