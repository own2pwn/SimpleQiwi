
package ru.sample.qiwi.soap.ru.mbtc.afs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Документ
 * 
 * <p>Java class for DocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fraud" type="{http://mbtc.ru/afs/application}Td3" minOccurs="0"/>
 *         &lt;element name="docType" type="{http://mbtc.ru/afs/application}Td11" minOccurs="0"/>
 *         &lt;element name="seriesNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueDate" type="{http://mbtc.ru/afs/application}TDate" minOccurs="0"/>
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
@XmlType(name = "DocType", namespace = "http://mbtc.ru/afs/application", propOrder = {
    "fraud",
    "docType",
    "seriesNumber",
    "issueDate",
    "fileSinceDt"
})
public class DocType {

    protected Byte fraud;
    protected Byte docType;
    protected String seriesNumber;
    protected String issueDate;
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
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setDocType(Byte value) {
        this.docType = value;
    }

    /**
     * Gets the value of the seriesNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesNumber() {
        return seriesNumber;
    }

    /**
     * Sets the value of the seriesNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesNumber(String value) {
        this.seriesNumber = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(String value) {
        this.issueDate = value;
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
