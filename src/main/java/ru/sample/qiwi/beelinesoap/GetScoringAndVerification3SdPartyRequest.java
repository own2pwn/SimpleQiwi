
package ru.sample.qiwi.beelinesoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetScoringAndVerification3sdPartyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetScoringAndVerification3sdPartyRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pwd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="approval" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="client" type="{urn:gf-scoring-verification:types}Client" minOccurs="0"/>
 *         &lt;element name="request">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="scoring" type="{urn:gf-scoring-verification:types}Scoring" minOccurs="0"/>
 *                   &lt;element name="verification" type="{urn:gf-scoring-verification:types}Verification" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetScoringAndVerification3sdPartyRequest", propOrder = {
    "login",
    "pwd",
    "requestId",
    "msisdn",
    "approval",
    "client",
    "request"
})
public class GetScoringAndVerification3SdPartyRequest {

    @XmlElement(required = true)
    protected String login;
    @XmlElement(required = true)
    protected String pwd;
    protected long requestId;
    @XmlElement(required = true)
    protected String msisdn;
    protected boolean approval;
    protected Client client;
    @XmlElement(required = true)
    protected GetScoringAndVerification3SdPartyRequest.Request request;

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the pwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * Sets the value of the pwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPwd(String value) {
        this.pwd = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     */
    public long getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     */
    public void setRequestId(long value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the approval property.
     * 
     */
    public boolean isApproval() {
        return approval;
    }

    /**
     * Sets the value of the approval property.
     * 
     */
    public void setApproval(boolean value) {
        this.approval = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link GetScoringAndVerification3SdPartyRequest.Request }
     *     
     */
    public GetScoringAndVerification3SdPartyRequest.Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetScoringAndVerification3SdPartyRequest.Request }
     *     
     */
    public void setRequest(GetScoringAndVerification3SdPartyRequest.Request value) {
        this.request = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="scoring" type="{urn:gf-scoring-verification:types}Scoring" minOccurs="0"/>
     *         &lt;element name="verification" type="{urn:gf-scoring-verification:types}Verification" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "scoring",
        "verification"
    })
    public static class Request {

        protected Scoring scoring;
        protected Verification verification;

        /**
         * Gets the value of the scoring property.
         * 
         * @return
         *     possible object is
         *     {@link Scoring }
         *     
         */
        public Scoring getScoring() {
            return scoring;
        }

        /**
         * Sets the value of the scoring property.
         * 
         * @param value
         *     allowed object is
         *     {@link Scoring }
         *     
         */
        public void setScoring(Scoring value) {
            this.scoring = value;
        }

        /**
         * Gets the value of the verification property.
         * 
         * @return
         *     possible object is
         *     {@link Verification }
         *     
         */
        public Verification getVerification() {
            return verification;
        }

        /**
         * Sets the value of the verification property.
         * 
         * @param value
         *     allowed object is
         *     {@link Verification }
         *     
         */
        public void setVerification(Verification value) {
            this.verification = value;
        }

    }

}
