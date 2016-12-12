
package ru.sample.qiwi.soap.ru.mbtc.afs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о транспортном средстве
 * 
 * <p>Java class for VehicleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fraud" type="{http://mbtc.ru/afs/application}Td3" minOccurs="0"/>
 *         &lt;element name="regNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleType", namespace = "http://mbtc.ru/afs/application", propOrder = {
    "fraud",
    "regNum",
    "vin"
})
public class VehicleType {

    protected Byte fraud;
    protected String regNum;
    @XmlElement(name = "VIN")
    protected String vin;

    /**
     * Gets the value of the fraud property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getFraud() {
        return fraud;
    }

    /**
     * Sets the value of the fraud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setFraud(Byte value) {
        this.fraud = value;
    }

    /**
     * Gets the value of the regNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNum() {
        return regNum;
    }

    /**
     * Sets the value of the regNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNum(String value) {
        this.regNum = value;
    }

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIN() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIN(String value) {
        this.vin = value;
    }

}
