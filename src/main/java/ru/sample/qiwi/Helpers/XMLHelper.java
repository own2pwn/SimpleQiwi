package ru.sample.qiwi.Helpers;

import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
//import ru.axiomatika.axilink.api.exceptions.AxiLinkException;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.*;
import java.io.*;
import java.util.Map;

/**
 * Created by tikhonin on 10.12.2015.
 */
public class XMLHelper {
    public static Document parseXml(String xml) throws IOException, SAXException, ParserConfigurationException {
        return parseXml(xml, "UTF-8");
    }

    public static Document parseXml(String xml, String sourceEncoding) throws ParserConfigurationException, IOException, SAXException {
        Document doc = null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        builder = factory.newDocumentBuilder();
        doc = builder.parse(new ByteArrayInputStream(xml.getBytes(sourceEncoding)));
        return doc;
    }
//    public static Document parseXml(String xml) throws ParserConfigurationException, IOException, SAXException {
//        Document doc = null;
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder builder = null;
//        builder = factory.newDocumentBuilder();
//        doc = builder.parse(new ByteArrayInputStream(xml.getBytes()));
//        return doc;
//    }

    public static XPathExpression prepareXPath(String xpathExpression) throws XPathExpressionException {
        XPathExpression expr = null;
        XPathFactory xpathFactory = XPathFactory.newInstance();
        XPath xpath = xpathFactory.newXPath();
        expr = xpath.compile(xpathExpression);
        return expr;
    }

    public static String evaluateXPath(Document document, String xpathExpression) {
        return (String) evaluateXPath(document, xpathExpression, XPathConstants.STRING);
    }

    public static Object evaluateXPath(Document document, String xpathExpression, QName returnType) {
        try {
            XPathExpression expr = prepareXPath(xpathExpression);
            return expr.evaluate(document, returnType);
        } catch (Exception e) {
            return null;
        }
    }

    public static String transformXml(String xml, String xsl) throws TransformerException {
        StringReader xmlReader = new StringReader(xml);
        StringReader xslReader = new StringReader(xsl);
        StringWriter writer = new StringWriter();
        TransformerFactory Factory = TransformerFactory.newInstance();
        Transformer transformer = null;
        transformer = Factory.newTransformer(new StreamSource(xslReader));

        transformer.transform(new StreamSource(xmlReader), new StreamResult(writer));

        return writer.toString();
    }

    public static String mergeXml(String parentXml, String childXml, String parentRootNodeName) throws IOException, SAXException, ParserConfigurationException, TransformerException {
        return mergeXml(parentXml, childXml, parentRootNodeName, "");
    }

    public static String mergeXml(String parentXml, String childXml, String parentRootNodeName, String childRootNodeName) throws ParserConfigurationException, SAXException, IOException, TransformerException {
        Document parentDocument = XMLHelper.parseXml(parentXml);
        Document childDocument = XMLHelper.parseXml(childXml);

        return mergeXml(parentDocument, childDocument, parentRootNodeName, childRootNodeName);
    }

    public static String mergeXml(Document parentDocument, Document childDocument, String parentRootNodeName) throws TransformerException, UnsupportedEncodingException {
        return mergeXml(parentDocument, childDocument, parentRootNodeName, "");
    }

    public static String mergeXml(Document parentDocument, Document childDocument, String parentRootNodeName, String childRootNodeName) throws TransformerException, UnsupportedEncodingException {
        return convertToString(mergeXmlDocument(parentDocument, childDocument, parentRootNodeName, childRootNodeName));
    }

    public static Document mergeXmlDocument(Document parentDocument, Document childDocument, String parentRootNodeName) {
        return mergeXmlDocument(parentDocument, childDocument, parentRootNodeName, "");
    }

    public static Document mergeXmlDocument(Document parentDocument, Document childDocument, String parentRootNodeName, String childRootNodeName) {
        Node parentNode = parentDocument.getElementsByTagName(parentRootNodeName).item(0);


        if (StringHelper.isNullOrEmpty(childRootNodeName)) {
            Node childNode = childDocument.getElementsByTagName("*").item(0);
            parentNode.appendChild(parentDocument.importNode(childNode, true));
        } else {
            NodeList childNodeList = childDocument.getElementsByTagName(childRootNodeName).item(0).getChildNodes();
            for (int i = 0; i < childNodeList.getLength(); i++) {
                Node childNode = childNodeList.item(i);
                parentNode.appendChild(parentDocument.importNode(childNode, true));
            }
        }

        return parentDocument;
    }

    public static String convertToString(Document document) throws TransformerException, UnsupportedEncodingException {
        return convertToString(document, "UTF-8");
    }

    public static String convertToString(Document document, String encoding) throws TransformerException, UnsupportedEncodingException {
        String result = null;
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = null;
        transformer = tf.newTransformer();
        //transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        if (!StringHelper.isNullOrEmpty(document.getXmlEncoding())) {
            transformer.setOutputProperty(OutputKeys.ENCODING, document.getXmlEncoding());
        }
        //StringWriter writer = new StringWriter();
        ByteArrayOutputStream writer = new ByteArrayOutputStream();
        transformer.transform(new DOMSource(document), new StreamResult(writer));
        //result = writer.getBuffer().toString();
        result = writer.toString(encoding);
        return result;
    }

//    public static String convertToString(Document document) throws TransformerException, UnsupportedEncodingException {
//        String result = null;
//        TransformerFactory tf = TransformerFactory.newInstance();
//        Transformer transformer = null;
//        transformer = tf.newTransformer();
//        //transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
//        if (!StringHelper.isNullOrEmpty(document.getXmlEncoding())) {
//            transformer.setOutputProperty(OutputKeys.ENCODING, document.getXmlEncoding());
//        }
//        //StringWriter writer = new StringWriter();
//        ByteArrayOutputStream writer = new ByteArrayOutputStream();
//        transformer.transform(new DOMSource(document), new StreamResult(writer));
//        //result = writer.getBuffer().toString();
//        result = writer.toString();
//        return result;
//    }

    public static Document generateEmptyXmlDocument(String rootName) throws ParserConfigurationException {
        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        documentBuilder = documentFactory.newDocumentBuilder();
        Document documentResult = documentBuilder.newDocument();
        Element rootElement = documentResult.createElement(rootName);
        documentResult.appendChild(rootElement);

        return documentResult;
    }

    public static Document generateXmlFromParams(String params, String name) throws Exception, ParserConfigurationException {
        Map<String, String> inputParams = StringHelper.splitParamsStringToMap(params);

        return generateXmlFromParams(inputParams, name);
    }

    public static Document generateXmlFromParams(Map<String, String> params, String name) throws Exception, ParserConfigurationException {
        Document documentResult = generateEmptyXmlDocument(name);
        Element rootElement = documentResult.getDocumentElement();

        for (Map.Entry<String, String> param : params.entrySet()) {
            Element paramElement = documentResult.createElement(param.getKey());
            paramElement.setTextContent(param.getValue());
            rootElement.appendChild(paramElement);
        }

        return documentResult;
    }

    /**
     * Преобразование Json в Xml
     *
     * @param input Json текст
     * @return Xml Документ
     * @throws ParserConfigurationException
     */
    public static Document convertJsonToXml(String input) throws Exception {
        return convertJsonToXml(new JSONObject(input), null);
    }

    /**
     * Преобразование Json в Xml
     *
     * @param input    Json текст
     * @param rootName Имя корневого узла
     * @return Xml Документ
     * @throws ParserConfigurationException
     */
    public static Document convertJsonToXml(String input, String rootName) throws Exception {
        return convertJsonToXml(new JSONObject(input), rootName);
    }

    /**
     * Преобразование Json в Xml
     *
     * @param input    Объект типа Json
     * @param rootName Имя корневого узла
     * @return Xml Документ
     * @throws ParserConfigurationException
     */
    public static Document convertJsonToXml(Object input, String rootName) throws Exception {
        // Проверяем корректность входных данных
        if (StringHelper.isNullOrEmpty(rootName)) {
            if (((JSONObject) input).length() == 1) {
                rootName = ((JSONObject) input).keys().next();
                input = ((JSONObject) input).get(rootName);
            } else {
                throw new Exception("Имя корневого элемента не задано или " +
                        "Json на верхнем уровне не состоит из одного элемента JSONObject");
            }
        }

        Document output = generateEmptyXmlDocument(rootName); // Выходной документ
        Element rootElement = output.getDocumentElement(); // Корневой элемент документа
        Node arrayNode = null;          // Корневой узел для элемента JSONObject
        JSONArray jsonArray = null;     // Массив JSONObject
        JSONObject jsonObject = null;   // Класс, в котором хранятся пары ключ/значение

        // Определяем тип корневого элемента
        if (input instanceof JSONObject) {
            jsonObject = (JSONObject) input;

            parseJSONObject(jsonObject, output, rootElement);

        } else if (input instanceof JSONArray) {
            jsonArray = (JSONArray) input;

            parseJSONArray(jsonArray, output, rootElement, rootName);
        } else {
            throw new Exception("Некорректный тип входного элемента Json");
        }

        return output;
    }

    /**
     * Парсинг JSONObject
     *
     * @param input    Входной Json
     * @param output   Выходной документ
     * @param rootNode Элемент выходного документа(Node) в который идет запись параметров при парсинге
     * @throws ParserConfigurationException
     * @throws ExternalSystemException
     */
    private static void parseJSONObject(JSONObject input, Document output, Node rootNode) throws Exception {
        Document partResult = null; // Документ возвращенный часть
        NodeList nodeList = null;   // Массив элементов эквивалентных JSONArray
        Node textNode = null;       // Значение ноды
        Node node = null;           // Узел документа
        Object value = null;        // Значение JSON элемента

        // Проходим по всем элементам верхнего уровня
        for (String key : input.keySet()) {
            value = input.opt(key);

            if (value instanceof JSONObject) {
//                partResult = convertJsonToXml(input.getJSONObject(key), key);
//                node = output.importNode(partResult.getElementsByTagName(key).item(0), true);
//                rootNode.appendChild(node);
//
                node = output.createElement(key);
                parseJSONObject(input.getJSONObject(key), output, node);
                rootNode.appendChild(node);
            } else if (value instanceof JSONArray) {
//                partResult = convertJsonToXml(input.getJSONArray(key), key);
//
//                nodeList = ((Element) partResult.getFirstChild()).getElementsByTagName(key);
//                for (int j = 0; j < nodeList.getLength(); j++) {
//                    node = output.importNode(nodeList.item(j), true);
//                    rootNode.appendChild(node);
//                }
//
                parseJSONArray(input.getJSONArray(key), output, rootNode, key);
            } else {
                if (key.startsWith("@") || key.startsWith("-")) { // Атрибут узла
                    ((Element) rootNode).setAttribute(key.substring(1), value.toString());
                } else if (key.startsWith("#") || key.equals("content")) { // Значение узла
                    textNode = output.createTextNode(value.toString());
                    rootNode.appendChild(textNode);
                } else { // Элемент узла
                    node = output.createElement(key);
                    textNode = output.createTextNode(value.toString());
                    node.appendChild(textNode);
                    rootNode.appendChild(node);
                }
            }
        }
    }

    private static void parseJSONArray(JSONArray input, Document output, Node rootNode, String rootName) throws Exception {
        Document partResult = null; // Документ возвращенный часть
        NodeList nodeList = null;   // Массив элементов эквивалентных JSONArray
        Node textNode = null;       // Значение ноды
        Node node = null;           // Узел документа
        Object value = null;        // Значение JSON элемента
        Node arrayNode = null;
        JSONArray jsonArray = null;     // Массив JSONObject
        JSONObject jsonObject = null;   // Класс, в котором хранятся пары ключ/значение

        // Проходим по всем элементам верхнего уровня
        for (int i = 0; i < input.length(); i++) {
            value = input.get(i);

            if (value instanceof JSONArray) {
                arrayNode = output.createElement(rootName);

                parseJSONArray((JSONArray)value, output, arrayNode, "array");

                rootNode.appendChild(arrayNode);
            } else if (value instanceof String) { // Обрабатываем массив состоящий из одного текстового элемента. Пример: ["Test"]
                // Создаем корневой элемент для JSONObject
                arrayNode = output.createElement(rootName);

                textNode = output.createTextNode((String) value);
                arrayNode.appendChild(textNode);

                // Добавляем элемент JSONObject к выходу
                rootNode.appendChild(arrayNode);
            } else if (value instanceof JSONObject) {
                jsonObject = (JSONObject) value;

                // Создаем корневой элемент для JSONObject
                arrayNode = output.createElement(rootName);

                parseJSONObject(jsonObject, output, arrayNode);

                // Добавляем элемент JSONObject к выходу
                rootNode.appendChild(arrayNode);
            }
        }
    }
}

