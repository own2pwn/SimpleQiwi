
package ru.sample.qiwi.beelinesoap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.sample.qiwi.beelinesaop package. 
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

    private final static QName _GetScoringAndVerification3SdPartyResponse_QNAME = new QName("urn:gf-scoring-verification:types", "getScoringAndVerification3sdPartyResponse");
    private final static QName _GetScoringSMSRequest_QNAME = new QName("urn:gf-scoring-verification:types", "getScoringSMSRequest");
    private final static QName _GetScoringSMSCallBackRequest_QNAME = new QName("urn:gf-scoring-verification:types", "getScoringSMSCallBackRequest");
    private final static QName _GetScoringRequestOfSubscriberResponse_QNAME = new QName("urn:gf-scoring-verification:types", "getScoringRequestOfSubscriberResponse");
    private final static QName _GetScoringSMSCallBackResponse_QNAME = new QName("urn:gf-scoring-verification:types", "getScoringSMSCallBackResponse");
    private final static QName _GetScoringAndVerification3SdPartyCallBackRequest_QNAME = new QName("urn:gf-scoring-verification:types", "getScoringAndVerification3sdPartyCallBackRequest");
    private final static QName _GetScoringAndVerification3SdPartyRequest_QNAME = new QName("urn:gf-scoring-verification:types", "getScoringAndVerification3sdPartyRequest");
    private final static QName _Fault_QNAME = new QName("urn:gf-scoring-verification:types", "fault");
    private final static QName _GetScoringSMSResponse_QNAME = new QName("urn:gf-scoring-verification:types", "getScoringSMSResponse");
    private final static QName _Approval3RdPartyResponse_QNAME = new QName("urn:gf-scoring-verification:types", "approval3rdPartyResponse");
    private final static QName _GetScoringAndVerification3SdPartyCallBackResponse_QNAME = new QName("urn:gf-scoring-verification:types", "getScoringAndVerification3sdPartyCallBackResponse");
    private final static QName _Approval3RdPartyRequest_QNAME = new QName("urn:gf-scoring-verification:types", "approval3rdPartyRequest");
    private final static QName _GetScoringRequestOfSubscriberRequest_QNAME = new QName("urn:gf-scoring-verification:types", "getScoringRequestOfSubscriberRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.sample.qiwi.beelinesaop
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResultVerification }
     * 
     */
    public ResultVerification createResultVerification() {
        return new ResultVerification();
    }

    /**
     * Create an instance of {@link GetScoringAndVerification3SdPartyResponse }
     * 
     */
    public GetScoringAndVerification3SdPartyResponse createGetScoringAndVerification3SdPartyResponse() {
        return new GetScoringAndVerification3SdPartyResponse();
    }

    /**
     * Create an instance of {@link GetScoringAndVerification3SdPartyCallBackRequest }
     * 
     */
    public GetScoringAndVerification3SdPartyCallBackRequest createGetScoringAndVerification3SdPartyCallBackRequest() {
        return new GetScoringAndVerification3SdPartyCallBackRequest();
    }

    /**
     * Create an instance of {@link GetScoringAndVerification3SdPartyCallBackRequest.Result }
     * 
     */
    public GetScoringAndVerification3SdPartyCallBackRequest.Result createGetScoringAndVerification3SdPartyCallBackRequestResult() {
        return new GetScoringAndVerification3SdPartyCallBackRequest.Result();
    }

    /**
     * Create an instance of {@link GetScoringAndVerification3SdPartyRequest }
     * 
     */
    public GetScoringAndVerification3SdPartyRequest createGetScoringAndVerification3SdPartyRequest() {
        return new GetScoringAndVerification3SdPartyRequest();
    }

    /**
     * Create an instance of {@link GetScoringSMSCallBackRequest }
     * 
     */
    public GetScoringSMSCallBackRequest createGetScoringSMSCallBackRequest() {
        return new GetScoringSMSCallBackRequest();
    }

    /**
     * Create an instance of {@link Approval3RdPartyRequest }
     * 
     */
    public Approval3RdPartyRequest createApproval3RdPartyRequest() {
        return new Approval3RdPartyRequest();
    }

    /**
     * Create an instance of {@link Approval3RdPartyResponse }
     * 
     */
    public Approval3RdPartyResponse createApproval3RdPartyResponse() {
        return new Approval3RdPartyResponse();
    }

    /**
     * Create an instance of {@link GetScoringAndVerification3SdPartyCallBackResponse }
     * 
     */
    public GetScoringAndVerification3SdPartyCallBackResponse createGetScoringAndVerification3SdPartyCallBackResponse() {
        return new GetScoringAndVerification3SdPartyCallBackResponse();
    }

    /**
     * Create an instance of {@link GetScoringSMSResponse }
     * 
     */
    public GetScoringSMSResponse createGetScoringSMSResponse() {
        return new GetScoringSMSResponse();
    }

    /**
     * Create an instance of {@link Fault }
     * 
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link GetScoringSMSCallBackResponse }
     * 
     */
    public GetScoringSMSCallBackResponse createGetScoringSMSCallBackResponse() {
        return new GetScoringSMSCallBackResponse();
    }

    /**
     * Create an instance of {@link GetScoringSMSRequest }
     * 
     */
    public GetScoringSMSRequest createGetScoringSMSRequest() {
        return new GetScoringSMSRequest();
    }

    /**
     * Create an instance of {@link LegalEntity }
     * 
     */
    public LegalEntity createLegalEntity() {
        return new LegalEntity();
    }

    /**
     * Create an instance of {@link VerificationInfo }
     * 
     */
    public VerificationInfo createVerificationInfo() {
        return new VerificationInfo();
    }

    /**
     * Create an instance of {@link Scoring }
     * 
     */
    public Scoring createScoring() {
        return new Scoring();
    }

    /**
     * Create an instance of {@link Verification }
     * 
     */
    public Verification createVerification() {
        return new Verification();
    }

    /**
     * Create an instance of {@link Individual }
     * 
     */
    public Individual createIndividual() {
        return new Individual();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link ResultVerification.Info }
     * 
     */
    public ResultVerification.Info createResultVerificationInfo() {
        return new ResultVerification.Info();
    }

    /**
     * Create an instance of {@link GetScoringAndVerification3SdPartyResponse.ResultScoring }
     * 
     */
    public GetScoringAndVerification3SdPartyResponse.ResultScoring createGetScoringAndVerification3SdPartyResponseResultScoring() {
        return new GetScoringAndVerification3SdPartyResponse.ResultScoring();
    }

    /**
     * Create an instance of {@link GetScoringAndVerification3SdPartyCallBackRequest.Result.ResultScoring }
     * 
     */
    public GetScoringAndVerification3SdPartyCallBackRequest.Result.ResultScoring createGetScoringAndVerification3SdPartyCallBackRequestResultResultScoring() {
        return new GetScoringAndVerification3SdPartyCallBackRequest.Result.ResultScoring();
    }

    /**
     * Create an instance of {@link GetScoringAndVerification3SdPartyRequest.Request }
     * 
     */
    public GetScoringAndVerification3SdPartyRequest.Request createGetScoringAndVerification3SdPartyRequestRequest() {
        return new GetScoringAndVerification3SdPartyRequest.Request();
    }

    /**
     * Create an instance of {@link GetScoringSMSCallBackRequest.Result }
     * 
     */
    public GetScoringSMSCallBackRequest.Result createGetScoringSMSCallBackRequestResult() {
        return new GetScoringSMSCallBackRequest.Result();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoringAndVerification3SdPartyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-scoring-verification:types", name = "getScoringAndVerification3sdPartyResponse")
    public JAXBElement<GetScoringAndVerification3SdPartyResponse> createGetScoringAndVerification3SdPartyResponse(GetScoringAndVerification3SdPartyResponse value) {
        return new JAXBElement<GetScoringAndVerification3SdPartyResponse>(_GetScoringAndVerification3SdPartyResponse_QNAME, GetScoringAndVerification3SdPartyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoringSMSRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-scoring-verification:types", name = "getScoringSMSRequest")
    public JAXBElement<GetScoringSMSRequest> createGetScoringSMSRequest(GetScoringSMSRequest value) {
        return new JAXBElement<GetScoringSMSRequest>(_GetScoringSMSRequest_QNAME, GetScoringSMSRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoringSMSCallBackRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-scoring-verification:types", name = "getScoringSMSCallBackRequest")
    public JAXBElement<GetScoringSMSCallBackRequest> createGetScoringSMSCallBackRequest(GetScoringSMSCallBackRequest value) {
        return new JAXBElement<GetScoringSMSCallBackRequest>(_GetScoringSMSCallBackRequest_QNAME, GetScoringSMSCallBackRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoringSMSCallBackResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-scoring-verification:types", name = "getScoringRequestOfSubscriberResponse")
    public JAXBElement<GetScoringSMSCallBackResponse> createGetScoringRequestOfSubscriberResponse(GetScoringSMSCallBackResponse value) {
        return new JAXBElement<GetScoringSMSCallBackResponse>(_GetScoringRequestOfSubscriberResponse_QNAME, GetScoringSMSCallBackResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoringSMSCallBackResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-scoring-verification:types", name = "getScoringSMSCallBackResponse")
    public JAXBElement<GetScoringSMSCallBackResponse> createGetScoringSMSCallBackResponse(GetScoringSMSCallBackResponse value) {
        return new JAXBElement<GetScoringSMSCallBackResponse>(_GetScoringSMSCallBackResponse_QNAME, GetScoringSMSCallBackResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoringAndVerification3SdPartyCallBackRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-scoring-verification:types", name = "getScoringAndVerification3sdPartyCallBackRequest")
    public JAXBElement<GetScoringAndVerification3SdPartyCallBackRequest> createGetScoringAndVerification3SdPartyCallBackRequest(GetScoringAndVerification3SdPartyCallBackRequest value) {
        return new JAXBElement<GetScoringAndVerification3SdPartyCallBackRequest>(_GetScoringAndVerification3SdPartyCallBackRequest_QNAME, GetScoringAndVerification3SdPartyCallBackRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoringAndVerification3SdPartyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-scoring-verification:types", name = "getScoringAndVerification3sdPartyRequest")
    public JAXBElement<GetScoringAndVerification3SdPartyRequest> createGetScoringAndVerification3SdPartyRequest(GetScoringAndVerification3SdPartyRequest value) {
        return new JAXBElement<GetScoringAndVerification3SdPartyRequest>(_GetScoringAndVerification3SdPartyRequest_QNAME, GetScoringAndVerification3SdPartyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-scoring-verification:types", name = "fault")
    public JAXBElement<Fault> createFault(Fault value) {
        return new JAXBElement<Fault>(_Fault_QNAME, Fault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoringSMSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-scoring-verification:types", name = "getScoringSMSResponse")
    public JAXBElement<GetScoringSMSResponse> createGetScoringSMSResponse(GetScoringSMSResponse value) {
        return new JAXBElement<GetScoringSMSResponse>(_GetScoringSMSResponse_QNAME, GetScoringSMSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Approval3RdPartyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-scoring-verification:types", name = "approval3rdPartyResponse")
    public JAXBElement<Approval3RdPartyResponse> createApproval3RdPartyResponse(Approval3RdPartyResponse value) {
        return new JAXBElement<Approval3RdPartyResponse>(_Approval3RdPartyResponse_QNAME, Approval3RdPartyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoringAndVerification3SdPartyCallBackResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-scoring-verification:types", name = "getScoringAndVerification3sdPartyCallBackResponse")
    public JAXBElement<GetScoringAndVerification3SdPartyCallBackResponse> createGetScoringAndVerification3SdPartyCallBackResponse(GetScoringAndVerification3SdPartyCallBackResponse value) {
        return new JAXBElement<GetScoringAndVerification3SdPartyCallBackResponse>(_GetScoringAndVerification3SdPartyCallBackResponse_QNAME, GetScoringAndVerification3SdPartyCallBackResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Approval3RdPartyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-scoring-verification:types", name = "approval3rdPartyRequest")
    public JAXBElement<Approval3RdPartyRequest> createApproval3RdPartyRequest(Approval3RdPartyRequest value) {
        return new JAXBElement<Approval3RdPartyRequest>(_Approval3RdPartyRequest_QNAME, Approval3RdPartyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoringSMSCallBackRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-scoring-verification:types", name = "getScoringRequestOfSubscriberRequest")
    public JAXBElement<GetScoringSMSCallBackRequest> createGetScoringRequestOfSubscriberRequest(GetScoringSMSCallBackRequest value) {
        return new JAXBElement<GetScoringSMSCallBackRequest>(_GetScoringRequestOfSubscriberRequest_QNAME, GetScoringSMSCallBackRequest.class, null, value);
    }

}
