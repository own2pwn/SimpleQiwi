
package ru.sample.qiwi.soap.ru.mbtc.afs;

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
@WebServiceClient(name = "matchService", targetNamespace = "http://mbtc.ru/afs/definitions", wsdlLocation = "http://icrs.demo.nbki.ru/nbch-afs?wsdl")
public class MatchService
    extends Service
{

    private final static URL MATCHSERVICE_WSDL_LOCATION;
    private final static WebServiceException MATCHSERVICE_EXCEPTION;
    private final static QName MATCHSERVICE_QNAME = new QName("http://mbtc.ru/afs/definitions", "matchService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://icrs.demo.nbki.ru/nbch-afs?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MATCHSERVICE_WSDL_LOCATION = url;
        MATCHSERVICE_EXCEPTION = e;
    }

    public MatchService() {
        super(__getWsdlLocation(), MATCHSERVICE_QNAME);
    }

    public MatchService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MATCHSERVICE_QNAME, features);
    }

    public MatchService(URL wsdlLocation) {
        super(wsdlLocation, MATCHSERVICE_QNAME);
    }

    public MatchService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MATCHSERVICE_QNAME, features);
    }

    public MatchService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MatchService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Match
     */
    @WebEndpoint(name = "matchBindingPort")
    public Match getMatchBindingPort() {
        return super.getPort(new QName("http://mbtc.ru/afs/definitions", "matchBindingPort"), Match.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Match
     */
    @WebEndpoint(name = "matchBindingPort")
    public Match getMatchBindingPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://mbtc.ru/afs/definitions", "matchBindingPort"), Match.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MATCHSERVICE_EXCEPTION!= null) {
            throw MATCHSERVICE_EXCEPTION;
        }
        return MATCHSERVICE_WSDL_LOCATION;
    }

}
