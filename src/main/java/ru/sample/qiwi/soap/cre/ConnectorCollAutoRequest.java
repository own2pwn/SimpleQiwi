
package ru.sample.qiwi.soap.cre;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectorCollAutoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectorCollAutoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chassis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="engine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectorCollAutoRequest", namespace = "http://collAuto.connector.xws.mbtc.ru", propOrder = {
    "body",
    "chassis",
    "docNum",
    "engine",
    "vin"
})
public class ConnectorCollAutoRequest {

    @XmlElementRef(name = "body", namespace = "http://collAuto.connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> body;
    @XmlElementRef(name = "chassis", namespace = "http://collAuto.connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chassis;
    @XmlElementRef(name = "docNum", namespace = "http://collAuto.connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> docNum;
    @XmlElementRef(name = "engine", namespace = "http://collAuto.connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> engine;
    @XmlElementRef(name = "vin", namespace = "http://collAuto.connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vin;

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBody(JAXBElement<String> value) {
        this.body = value;
    }

    /**
     * Gets the value of the chassis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChassis() {
        return chassis;
    }

    /**
     * Sets the value of the chassis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChassis(JAXBElement<String> value) {
        this.chassis = value;
    }

    /**
     * Gets the value of the docNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocNum() {
        return docNum;
    }

    /**
     * Sets the value of the docNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocNum(JAXBElement<String> value) {
        this.docNum = value;
    }

    /**
     * Gets the value of the engine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEngine() {
        return engine;
    }

    /**
     * Sets the value of the engine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEngine(JAXBElement<String> value) {
        this.engine = value;
    }

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVin() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVin(JAXBElement<String> value) {
        this.vin = value;
    }

}
