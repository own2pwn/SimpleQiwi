
package ru.sample.qiwi.soap.cre;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ConnectorCollAutoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectorCollAutoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="response" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectorCollAutoResponse", namespace = "http://collAuto.connector.xws.mbtc.ru", propOrder = {
    "created",
    "reportCode",
    "response",
    "uid"
})
public class ConnectorCollAutoResponse {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElementRef(name = "reportCode", namespace = "http://collAuto.connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportCode;
    @XmlElementRef(name = "response", namespace = "http://collAuto.connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> response;
    @XmlElementRef(name = "uid", namespace = "http://collAuto.connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uid;

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the reportCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportCode() {
        return reportCode;
    }

    /**
     * Sets the value of the reportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportCode(JAXBElement<String> value) {
        this.reportCode = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponse(JAXBElement<String> value) {
        this.response = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUid(JAXBElement<String> value) {
        this.uid = value;
    }

}
