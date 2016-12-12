
package ru.sample.qiwi.beelinesoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetScoringAndVerification3sdPartyCallBackRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetScoringAndVerification3sdPartyCallBackRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pwd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="result">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="resultApproval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="resultVerification" type="{urn:gf-scoring-verification:types}ResultVerification" minOccurs="0"/>
 *                     &lt;element name="resultScoring" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fault" type="{urn:gf-scoring-verification:types}Fault" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetScoringAndVerification3sdPartyCallBackRequest", propOrder = {
    "login",
    "pwd",
    "requestId",
    "msisdn",
    "result",
    "fault"
})
public class GetScoringAndVerification3SdPartyCallBackRequest {

    @XmlElement(required = true)
    protected String login;
    @XmlElement(required = true)
    protected String pwd;
    protected long requestId;
    @XmlElement(required = true)
    protected String msisdn;
    @XmlElement(required = true)
    protected GetScoringAndVerification3SdPartyCallBackRequest.Result result;
    protected Fault fault;

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
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link GetScoringAndVerification3SdPartyCallBackRequest.Result }
     *     
     */
    public GetScoringAndVerification3SdPartyCallBackRequest.Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetScoringAndVerification3SdPartyCallBackRequest.Result }
     *     
     */
    public void setResult(GetScoringAndVerification3SdPartyCallBackRequest.Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link Fault }
     *     
     */
    public Fault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fault }
     *     
     */
    public void setFault(Fault value) {
        this.fault = value;
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
     *         &lt;choice>
     *           &lt;element name="resultApproval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="resultVerification" type="{urn:gf-scoring-verification:types}ResultVerification" minOccurs="0"/>
     *           &lt;element name="resultScoring" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
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
        "resultApproval",
        "resultVerification",
        "resultScoring"
    })
    public static class Result {

        protected String resultApproval;
        protected ResultVerification resultVerification;
        protected GetScoringAndVerification3SdPartyCallBackRequest.Result.ResultScoring resultScoring;

        /**
         * Gets the value of the resultApproval property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResultApproval() {
            return resultApproval;
        }

        /**
         * Sets the value of the resultApproval property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultApproval(String value) {
            this.resultApproval = value;
        }

        /**
         * Gets the value of the resultVerification property.
         * 
         * @return
         *     possible object is
         *     {@link ResultVerification }
         *     
         */
        public ResultVerification getResultVerification() {
            return resultVerification;
        }

        /**
         * Sets the value of the resultVerification property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResultVerification }
         *     
         */
        public void setResultVerification(ResultVerification value) {
            this.resultVerification = value;
        }

        /**
         * Gets the value of the resultScoring property.
         * 
         * @return
         *     possible object is
         *     {@link GetScoringAndVerification3SdPartyCallBackRequest.Result.ResultScoring }
         *     
         */
        public GetScoringAndVerification3SdPartyCallBackRequest.Result.ResultScoring getResultScoring() {
            return resultScoring;
        }

        /**
         * Sets the value of the resultScoring property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetScoringAndVerification3SdPartyCallBackRequest.Result.ResultScoring }
         *     
         */
        public void setResultScoring(GetScoringAndVerification3SdPartyCallBackRequest.Result.ResultScoring value) {
            this.resultScoring = value;
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
         *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "score"
        })
        public static class ResultScoring {

            @XmlElement(required = true)
            protected String score;

            /**
             * Gets the value of the score property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getScore() {
                return score;
            }

            /**
             * Sets the value of the score property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setScore(String value) {
                this.score = value;
            }

        }

    }

}
