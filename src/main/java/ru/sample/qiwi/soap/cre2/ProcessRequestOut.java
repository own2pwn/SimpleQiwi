
package ru.sample.qiwi.soap.cre2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * ��� ������, ����������� ����� �� CRE
 * 
 * <p>Java class for ProcessRequestOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessRequestOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cacheUse" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="response" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uidApplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessRequestOut", propOrder = {
    "cacheUse",
    "created",
    "reportCode",
    "response",
    "uid",
    "uidApplication"
})
public class ProcessRequestOut {

    @XmlElementRef(name = "cacheUse", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cacheUse;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElementRef(name = "reportCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportCode;
    @XmlElement(nillable = true)
    protected List<String> response;
    @XmlElementRef(name = "uid", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uid;
    @XmlElementRef(name = "uidApplication", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uidApplication;

    /**
     * Gets the value of the cacheUse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCacheUse() {
        return cacheUse;
    }

    /**
     * Sets the value of the cacheUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCacheUse(JAXBElement<Integer> value) {
        this.cacheUse = value;
    }

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the response property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResponse() {
        if (response == null) {
            response = new ArrayList<String>();
        }
        return this.response;
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

    /**
     * Gets the value of the uidApplication property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUidApplication() {
        return uidApplication;
    }

    /**
     * Sets the value of the uidApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUidApplication(JAXBElement<String> value) {
        this.uidApplication = value;
    }

}
