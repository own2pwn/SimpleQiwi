
package ru.sample.qiwi.beelinesoap;

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
@WebServiceClient(name = "ScoringAndVerificationService", targetNamespace = "urn:gf-scoring-verification:wsdl", wsdlLocation = "file:/C:/Users/\u0414\u043c\u0438\u0442\u0440\u0438\u0439%20\u0410\u0441\u0442\u0430\u0445\u043e\u0432/AppData/Local/Temp/tempdir8076691759686742632.tmp/Scoring_1.wsdl")
public class ScoringAndVerificationService
    extends Service
{

    private final static URL SCORINGANDVERIFICATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException SCORINGANDVERIFICATIONSERVICE_EXCEPTION;
    private final static QName SCORINGANDVERIFICATIONSERVICE_QNAME = new QName("urn:gf-scoring-verification:wsdl", "ScoringAndVerificationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/\u0414\u043c\u0438\u0442\u0440\u0438\u0439%20\u0410\u0441\u0442\u0430\u0445\u043e\u0432/AppData/Local/Temp/tempdir8076691759686742632.tmp/Scoring_1.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SCORINGANDVERIFICATIONSERVICE_WSDL_LOCATION = url;
        SCORINGANDVERIFICATIONSERVICE_EXCEPTION = e;
    }

    public ScoringAndVerificationService() {
        super(__getWsdlLocation(), SCORINGANDVERIFICATIONSERVICE_QNAME);
    }

    public ScoringAndVerificationService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SCORINGANDVERIFICATIONSERVICE_QNAME, features);
    }

    public ScoringAndVerificationService(URL wsdlLocation) {
        super(wsdlLocation, SCORINGANDVERIFICATIONSERVICE_QNAME);
    }

    public ScoringAndVerificationService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SCORINGANDVERIFICATIONSERVICE_QNAME, features);
    }

    public ScoringAndVerificationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ScoringAndVerificationService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ScoringAndVerificationInterface
     */
    @WebEndpoint(name = "ScoringAndVerificationPort")
    public ScoringAndVerificationInterface getScoringAndVerificationPort() {
        return super.getPort(new QName("urn:gf-scoring-verification:wsdl", "ScoringAndVerificationPort"), ScoringAndVerificationInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ScoringAndVerificationInterface
     */
    @WebEndpoint(name = "ScoringAndVerificationPort")
    public ScoringAndVerificationInterface getScoringAndVerificationPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:gf-scoring-verification:wsdl", "ScoringAndVerificationPort"), ScoringAndVerificationInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SCORINGANDVERIFICATIONSERVICE_EXCEPTION!= null) {
            throw SCORINGANDVERIFICATIONSERVICE_EXCEPTION;
        }
        return SCORINGANDVERIFICATIONSERVICE_WSDL_LOCATION;
    }

}
