
package ru.sample.qiwi.soap.ru.mbtc.afs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о номере телефона
 * 
 * <p>Java class for PhoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fraud" type="{http://mbtc.ru/afs/application}Td3" minOccurs="0"/>
 *         &lt;element name="phoneType" type="{http://mbtc.ru/afs/application}Td13" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileSinceDt" type="{http://mbtc.ru/afs/application}TDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneType", namespace = "http://mbtc.ru/afs/application", propOrder = {
    "fraud",
    "phoneType",
    "number",
    "fileSinceDt"
})
public class PhoneType {

    protected Byte fraud;
    protected Byte phoneType;
    protected String number;
    protected String fileSinceDt;

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
     * Gets the value of the phoneType property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getPhoneType() {
        return phoneType;
    }

    /**
     * Sets the value of the phoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setPhoneType(Byte value) {
        this.phoneType = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the fileSinceDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileSinceDt() {
        return fileSinceDt;
    }

    /**
     * Sets the value of the fileSinceDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSinceDt(String value) {
        this.fileSinceDt = value;
    }

}
