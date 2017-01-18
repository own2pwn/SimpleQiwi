package ru.sample.qiwi;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ru.sample.qiwi.Externalsystems.AbstractExternalSystem;
import ru.sample.qiwi.Externalsystems.HTTPSExternalSystem;
import ru.sample.qiwi.Helpers.HashHelper;
import ru.sample.qiwi.Helpers.StringHelper;
import ru.sample.qiwi.Helpers.XMLHelper;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Дмитрий Астахов on 10.01.2017.
 */
public class HashInvoker extends AbstractExternalSystem {
    public HashInvoker() {
        super("Application/AXI/application_e/@client_surname_hash=Application/AXI/application_e/@client_surname;" +
                "Application/AXI/application_e/NBKI_hash/client_surname_hash=Application/AXI/application_e/NBKI/nbki_nbki/@client_surname;");
    }

    public void main() throws Exception {
        String input = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<Application DeliveryOptionCode=\"DD\"\n" +
                "             ProcessingRequestType=\"DA\"\n" +
                "             StrategySelectionRandomNumber=\"41\"\n" +
                "             Timestamp=\"2017-01-10T12:29:55+03:00\"\n" +
                "             TransactionId=\"167772191:33d18056:158fceba26e:13cb\">\n" +
                "\t<AXI>\n" +
                "\t\t<application_e \tclient_middlename=\"НИКОЛАЕВИЧ\"\n" +
                "\t\t               \tclient_name=\"АЛЕКСЕЙ\"\n" +
                "\t\t               \tclient_surname=\"РУСАК\">\n" +
                "\t\t\t<NBKI>\n" +
                "\t\t\t\t<nbki_nbki client_middlename=\"НИКОЛАЕВИЧ\"\n" +
                "\t\t\t\t           client_name=\"АЛЕКСЕЙ\"\n" +
                "\t\t\t\t           client_surname=\"РУСАК\"/>\n" +
                "\t\t\t</NBKI>\n" +
                "\t\t</application_e>\n" +
                "\t</AXI>\n" +
                "</Application>";

        Map<String, String> hashElements = this.getConnectionParams();
        Document inputDoc = XMLHelper.parseXml(input);
        String destination, source, nodeValue;
        String[] splitDestination;
        NodeList nodeList;
        Node node, appendNode;

        for(Map.Entry<String, String> element : hashElements.entrySet()) {
            destination = element.getKey();
            source = element.getValue();

            nodeValue = XMLHelper.evaluateXPath(inputDoc, source);
            nodeValue = StringHelper.toHexString(HashHelper.getSHA1Hash(nodeValue));

            splitDestination = destination.split("/");
            if (inputDoc.getElementsByTagName(splitDestination[0]).getLength() != 1) {
                throw new Exception("Ошибка формирования выходного элемента, корневые элементы не совпадают: " + splitDestination[0]);
            }

            node = inputDoc.getDocumentElement();
            for (int i = 1; i < splitDestination.length - 1; i++) {
                nodeList = ((Element)node).getElementsByTagName(splitDestination[i]);

                if (nodeList.getLength() == 0) {
                    appendNode = inputDoc.createElement(splitDestination[i]);
                    node = node.appendChild(appendNode);
                } else {
                    node = nodeList.item(0);
                }
            }

            destination = splitDestination[splitDestination.length - 1];
            if (destination.contains("@")) {
                ((Element)node).setAttribute(destination.substring(1), nodeValue);
            } else if (destination.length() > 0) {
                appendNode = inputDoc.createElement(destination);
                node = node.appendChild(appendNode);

                appendNode = inputDoc.createTextNode(nodeValue);
                node.appendChild(appendNode);
            }
        }

        String result = XMLHelper.convertToString(inputDoc);

//        return result;
    }


}
