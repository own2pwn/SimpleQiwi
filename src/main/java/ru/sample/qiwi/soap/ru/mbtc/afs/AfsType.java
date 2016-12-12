
package ru.sample.qiwi.soap.ru.mbtc.afs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for afsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="afsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="afsRequest" type="{http://mbtc.ru/afs}afsRequestType"/>
 *         &lt;element name="afsResponse" type="{http://mbtc.ru/afs}afsResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "afsType", propOrder = {
    "afsRequest",
    "afsResponse"
})
public class AfsType {

    @XmlElement(required = true)
    protected AfsRequestType afsRequest;
    @XmlElement(required = true)
    protected AfsResponseType afsResponse;

    /**
     * Gets the value of the afsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AfsRequestType }
     *     
     */
    public AfsRequestType getAfsRequest() {
        return afsRequest;
    }

    /**
     * Sets the value of the afsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfsRequestType }
     *     
     */
    public void setAfsRequest(AfsRequestType value) {
        this.afsRequest = value;
    }

    /**
     * Gets the value of the afsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AfsResponseType }
     *     
     */
    public AfsResponseType getAfsResponse() {
        return afsResponse;
    }

    /**
     * Sets the value of the afsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfsResponseType }
     *     
     */
    public void setAfsResponse(AfsResponseType value) {
        this.afsResponse = value;
    }

}
