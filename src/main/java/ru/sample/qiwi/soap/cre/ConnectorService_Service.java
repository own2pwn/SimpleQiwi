
package ru.sample.qiwi.soap.cre;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
//@WebServiceClient(name = "ConnectorService", targetNamespace = "http://creditregistry.ru/2007/webservice/ConnectorService", wsdlLocation = "file:/C:/Users/\u0414\u043c\u0438\u0442\u0440\u0438\u0439%20\u0410\u0441\u0442\u0430\u0445\u043e\u0432/AppData/Local/Temp/tempdir5437372176297062972.tmp/ConnectorService_1.wsdl")
@WebServiceClient(name = "ConnectorService", targetNamespace = "http://creditregistry.ru/2007/webservice/ConnectorService", wsdlLocation = "http://10.1.2.207:8180/credit_registry/xservices/ConnectorService?wsdl")
public class ConnectorService_Service
    extends Service
{

    private final static URL CONNECTORSERVICE_WSDL_LOCATION;
    private final static WebServiceException CONNECTORSERVICE_EXCEPTION;
    private final static QName CONNECTORSERVICE_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "ConnectorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.1.2.207:8180/credit_registry/xservices/ConnectorService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONNECTORSERVICE_WSDL_LOCATION = url;
        CONNECTORSERVICE_EXCEPTION = e;
    }

    public ConnectorService_Service() {
        super(__getWsdlLocation(), CONNECTORSERVICE_QNAME);
    }

    public ConnectorService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONNECTORSERVICE_QNAME, features);
    }

    public ConnectorService_Service(URL wsdlLocation) {
        super(wsdlLocation, CONNECTORSERVICE_QNAME);
    }

    public ConnectorService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONNECTORSERVICE_QNAME, features);
    }

    public ConnectorService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConnectorService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ConnectorService
     */
    @WebEndpoint(name = "ConnectorServiceHttpPort")
    public ConnectorService getConnectorServiceHttpPort() {
        return super.getPort(new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "ConnectorServiceHttpPort"), ConnectorService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConnectorService
     */
    @WebEndpoint(name = "ConnectorServiceHttpPort")
    public ConnectorService getConnectorServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "ConnectorServiceHttpPort"), ConnectorService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONNECTORSERVICE_EXCEPTION!= null) {
            throw CONNECTORSERVICE_EXCEPTION;
        }
        return CONNECTORSERVICE_WSDL_LOCATION;
    }

}
