
package ru.sample.qiwi.beelinesoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faultCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faultMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fault", propOrder = {
    "faultCode",
    "faultMessage"
})
public class Fault {

    @XmlElement(required = true)
    protected String faultCode;
    @XmlElement(required = true)
    protected String faultMessage;

    /**
     * Gets the value of the faultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultCode() {
        return faultCode;
    }

    /**
     * Sets the value of the faultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultCode(String value) {
        this.faultCode = value;
    }

    /**
     * Gets the value of the faultMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultMessage() {
        return faultMessage;
    }

    /**
     * Sets the value of the faultMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultMessage(String value) {
        this.faultMessage = value;
    }

}
