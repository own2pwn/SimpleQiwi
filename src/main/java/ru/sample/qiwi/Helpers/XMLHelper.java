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
     * @param input Json текст
     * @param rootName Имя корневого узла
     * @return Xml документ
     * @throws ParserConfigurationException
     */
    public static Document generateXmlFromJson(String input, String rootName) throws Exception {
        return generateXmlFromJson(new JSONObject(input), rootName);
    }

    /**
     * Преобразование Json в Xml
     * @param input Объект типа Json
     * @param rootName Имя корневого узла
     * @return Xml документ
     * @throws ParserConfigurationException
     */
    public static Document generateXmlFromJson(Object input, String rootName) throws Exception {
        Document output = generateEmptyXmlDocument(StringHelper.escapeXmlString(rootName)); // Выходной документ
        Document partResult = null; // Документ возвращенный часть
        Element rootElement = null; // Корневой элемент документа
        NodeList nodeList = null;   // Массив элементов эквивалентных JSONArray
        Node textNode = null;       // Значение ноды
        Node node = null;           // Узел документа
        Object value = null;        // Значение JSON элемента

        // Определяем тип корневого элемента
        if (input instanceof JSONObject) {
            JSONObject localInput = (JSONObject)input;

            // Проходим все элементы верхнего уровня
            for (String key : localInput.keySet()) {
                value = localInput.opt(key);

                // Проверка типа значения
                if (value instanceof JSONObject) { // Рекурсивно обрабатываем содержимое элемента
                    partResult = generateXmlFromJson(localInput.getJSONObject(key), key);
                    node = output.importNode(partResult.getFirstChild(), true);
                    output.getDocumentElement().appendChild(node);
                } else if (value instanceof JSONArray) { // Ркурсивно обрабатываем массив
                    partResult = generateXmlFromJson(localInput.getJSONArray(key), key);

                    nodeList = ((Element)partResult.getFirstChild()).getElementsByTagName(key);
                    for(int j = 0; j < nodeList.getLength(); j++) {
                        node = output.importNode(nodeList.item(j), true);
                        output.getDocumentElement().appendChild(node);
                    }
                } else { // Обычный элемент
                    node = output.createElement(StringHelper.escapeXmlString(key));
                    textNode = output.createTextNode(StringHelper.escapeXmlString(value.toString()));
                    node.appendChild(textNode);
                    output.getDocumentElement().appendChild(node);
                }
            }
        } else if (input instanceof JSONArray) {
            JSONArray localInput = (JSONArray)input; // Массив JSONObject
            Node arrayNode = null; // Корневой узел для элемента JSONObject

            // Перебираем все элементы массива
            for(int i = 0; i < localInput.length(); i++) {
                JSONObject arrayInput = (JSONObject)localInput.get(i);

                // Создаем корневой элемент для JSONObject
                rootElement = output.getDocumentElement();
                arrayNode = output.createElement(StringHelper.escapeXmlString(rootName));

                // Проходим по всем элементам верхнего уровня
                for (String key : arrayInput.keySet()) {
                    value = arrayInput.opt(key);

                    if (value instanceof JSONObject) {
                        partResult = generateXmlFromJson(arrayInput.getJSONObject(key), key);
                        node = output.importNode(partResult.getElementsByTagName(key).item(0), true);
                        output.getDocumentElement().appendChild(node);
                    } else if (value instanceof JSONArray) {
                        partResult = generateXmlFromJson(arrayInput.getJSONObject(key), key);

                        nodeList = ((Element)partResult.getFirstChild()).getElementsByTagName(key);
                        for(int j = 0; j < nodeList.getLength(); j++) {
                            node = output.importNode(nodeList.item(j), true);
                            output.getDocumentElement().appendChild(node);
                        }
                    } else {
                        if (key.startsWith("@")) { // Атрибут узла
                            ((Element)arrayNode).setAttribute(StringHelper.escapeXmlString(key.substring(1)),
                                    StringHelper.escapeXmlString(value.toString()));
                        } else if (key.startsWith("#") || key.equals("content")) { // Значение узла
                            textNode = output.createTextNode(StringHelper.escapeXmlString(value.toString()));
                            arrayNode.appendChild(textNode);
                        } else { // Элемент узла
                            node = output.createElement(StringHelper.escapeXmlString(key));
                            textNode = output.createTextNode(StringHelper.escapeXmlString(value.toString()));
                            node.appendChild(textNode);
                            arrayNode.appendChild(node);
                        }
                    }
                }

                // Добавляем элемент JSONObject к выходу
                rootElement.appendChild(arrayNode);
            }
        } else {
            throw new Exception("Обшика преобразования Json в Xml");
        }

        return output;
    }

//    public static Document generateXmlFromJson(JSONObject input) throws ParserConfigurationException {
//        JSONObject inputJson = new JSONObject(input);
//        Document output = generateEmptyXmlDocument(rootName);
//        Element rootElement = null;
//        Node node = null;
//
//        Object value = null;
//        for (String key : inputJson.keySet()) {
//            value = inputJson.get(key);
//
//            if (value.getClass().getName().contains("JSONObject")) {
//
//            } else if (value.getClass().getName().contains("JSONArray")) {
//
//            } else {
//                rootElement = output.getDocumentElement();
//                node = output.createElement(key);
//                node.setTextContent((String) value);
//                rootElement.appendChild(node);
//            }
//        }
//
//        return output;
//    }
}

