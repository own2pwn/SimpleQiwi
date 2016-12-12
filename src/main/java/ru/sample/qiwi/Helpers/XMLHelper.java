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

    public static Document generateXmlFromJson(String input, String rootName) throws ParserConfigurationException {
        JSONObject inputJson = new JSONObject(input);
        Document output = generateEmptyXmlDocument(rootName);
        Element rootElement = null;
        Node node = null;

        Object value = null;
        for (String key : inputJson.keySet()) {
            value = inputJson.get(key);

            if (value.getClass().getName().contains("JSONObject")) {

            } else if (value.getClass().getName().contains("JSONArray")) {

            } else {
                rootElement = output.getDocumentElement();
                node = output.createElement(key);
                node.setTextContent((String) value);
                rootElement.appendChild(node);
            }
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

