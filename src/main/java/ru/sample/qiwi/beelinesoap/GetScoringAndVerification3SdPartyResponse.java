
package ru.sample.qiwi.beelinesoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetScoringAndVerification3sdPartyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetScoringAndVerification3sdPartyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultApproval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultVerification" type="{urn:gf-scoring-verification:types}ResultVerification" minOccurs="0"/>
 *         &lt;element name="resultScoring" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="callBackResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetScoringAndVerification3sdPartyResponse", propOrder = {
    "resultApproval",
    "resultVerification",
    "resultScoring",
    "callBackResponse"
})
public class GetScoringAndVerification3SdPartyResponse {

    protected String resultApproval;
    protected ResultVerification resultVerification;
    protected GetScoringAndVerification3SdPartyResponse.ResultScoring resultScoring;
    protected String callBackResponse;

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
     *     {@link GetScoringAndVerification3SdPartyResponse.ResultScoring }
     *     
     */
    public GetScoringAndVerification3SdPartyResponse.ResultScoring getResultScoring() {
        return resultScoring;
    }

    /**
     * Sets the value of the resultScoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetScoringAndVerification3SdPartyResponse.ResultScoring }
     *     
     */
    public void setResultScoring(GetScoringAndVerification3SdPartyResponse.ResultScoring value) {
        this.resultScoring = value;
    }

    /**
     * Gets the value of the callBackResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallBackResponse() {
        return callBackResponse;
    }

    /**
     * Sets the value of the callBackResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallBackResponse(String value) {
        this.callBackResponse = value;
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
