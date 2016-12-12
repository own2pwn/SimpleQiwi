
package ru.sample.qiwi.soap.cre;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StatReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatReportRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accounts" type="{http://statreport.connectors.nbki.ru}ArrayOfStatReportAccount" minOccurs="0"/>
 *         &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatReportRequest", namespace = "http://statreport.connectors.nbki.ru", propOrder = {
    "accounts",
    "dateFrom"
})
public class StatReportRequest {

    @XmlElementRef(name = "accounts", namespace = "http://statreport.connectors.nbki.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStatReportAccount> accounts;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFrom;

    /**
     * Gets the value of the accounts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatReportAccount }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStatReportAccount> getAccounts() {
        return accounts;
    }

    /**
     * Sets the value of the accounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatReportAccount }{@code >}
     *     
     */
    public void setAccounts(JAXBElement<ArrayOfStatReportAccount> value) {
        this.accounts = value;
    }

    /**
     * Gets the value of the dateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFrom(XMLGregorianCalendar value) {
        this.dateFrom = value;
    }

}
