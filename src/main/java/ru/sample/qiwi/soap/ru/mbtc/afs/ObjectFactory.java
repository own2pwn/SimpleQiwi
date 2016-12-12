
package ru.sample.qiwi.soap.ru.mbtc.afs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.sample.qiwi.soap.ru.mbtc.afs package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AfsRequest_QNAME = new QName("http://mbtc.ru/afs", "afsRequest");
    private final static QName _AfsResponse_QNAME = new QName("http://mbtc.ru/afs", "afsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.sample.qiwi.soap.ru.mbtc.afs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AfsResponseType }
     * 
     */
    public AfsResponseType createAfsResponseType() {
        return new AfsResponseType();
    }

    /**
     * Create an instance of {@link AfsRequestType }
     * 
     */
    public AfsRequestType createAfsRequestType() {
        return new AfsRequestType();
    }

    /**
     * Create an instance of {@link MatchResultType }
     * 
     */
    public MatchResultType createMatchResultType() {
        return new MatchResultType();
    }

    /**
     * Create an instance of {@link MatchType }
     * 
     */
    public MatchType createMatchType() {
        return new MatchType();
    }

    /**
     * Create an instance of {@link NodeField }
     * 
     */
    public NodeField createNodeField() {
        return new NodeField();
    }

    /**
     * Create an instance of {@link LinkType }
     * 
     */
    public LinkType createLinkType() {
        return new LinkType();
    }

    /**
     * Create an instance of {@link SNAType }
     * 
     */
    public SNAType createSNAType() {
        return new SNAType();
    }

    /**
     * Create an instance of {@link AuthType }
     * 
     */
    public AuthType createAuthType() {
        return new AuthType();
    }

    /**
     * Create an instance of {@link NodeType }
     * 
     */
    public NodeType createNodeType() {
        return new NodeType();
    }

    /**
     * Create an instance of {@link AppDataRequest }
     * 
     */
    public AppDataRequest createAppDataRequest() {
        return new AppDataRequest();
    }

    /**
     * Create an instance of {@link AfsType }
     * 
     */
    public AfsType createAfsType() {
        return new AfsType();
    }

    /**
     * Create an instance of {@link ClientType }
     * 
     */
    public ClientType createClientType() {
        return new ClientType();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link EmployerType }
     * 
     */
    public EmployerType createEmployerType() {
        return new EmployerType();
    }

    /**
     * Create an instance of {@link DocType }
     * 
     */
    public DocType createDocType() {
        return new DocType();
    }

    /**
     * Create an instance of {@link VehicleType }
     * 
     */
    public VehicleType createVehicleType() {
        return new VehicleType();
    }

    /**
     * Create an instance of {@link SalePointType }
     * 
     */
    public SalePointType createSalePointType() {
        return new SalePointType();
    }

    /**
     * Create an instance of {@link ApplicationType }
     * 
     */
    public ApplicationType createApplicationType() {
        return new ApplicationType();
    }

    /**
     * Create an instance of {@link PhoneType }
     * 
     */
    public PhoneType createPhoneType() {
        return new PhoneType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link DetailsType }
     * 
     */
    public DetailsType createDetailsType() {
        return new DetailsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mbtc.ru/afs", name = "afsRequest")
    public JAXBElement<AfsRequestType> createAfsRequest(AfsRequestType value) {
        return new JAXBElement<AfsRequestType>(_AfsRequest_QNAME, AfsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mbtc.ru/afs", name = "afsResponse")
    public JAXBElement<AfsResponseType> createAfsResponse(AfsResponseType value) {
        return new JAXBElement<AfsResponseType>(_AfsResponse_QNAME, AfsResponseType.class, null, value);
    }

}
