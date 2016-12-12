
package ru.sample.qiwi.soap.ru.mbtc.afs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="fraud" type="{http://mbtc.ru/afs/application}Td3" minOccurs="0"/>
 *         &lt;element name="date" type="{http://mbtc.ru/afs/application}TDate"/>
 *         &lt;element name="memberCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appState" type="{http://mbtc.ru/afs/application}Td1" minOccurs="0"/>
 *         &lt;element name="client" type="{http://mbtc.ru/afs/application}ClientType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="details" type="{http://mbtc.ru/afs/application}DetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationType", namespace = "http://mbtc.ru/afs/application", propOrder = {
    "id",
    "version",
    "fraud",
    "date",
    "memberCode",
    "appState",
    "client",
    "details"
})
public class ApplicationType {

    @XmlElement(required = true)
    protected String id;
    protected BigInteger version;
    protected Byte fraud;
    @XmlElement(required = true)
    protected String date;
    protected String memberCode;
    protected Byte appState;
    protected List<ClientType> client;
    protected DetailsType details;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the memberCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberCode() {
        return memberCode;
    }

    /**
     * Sets the value of the memberCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberCode(String value) {
        this.memberCode = value;
    }

    /**
     * Gets the value of the appState property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getAppState() {
        return appState;
    }

    /**
     * Sets the value of the appState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setAppState(Byte value) {
        this.appState = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the client property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientType }
     * 
     * 
     */
    public List<ClientType> getClient() {
        if (client == null) {
            client = new ArrayList<ClientType>();
        }
        return this.client;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link DetailsType }
     *     
     */
    public DetailsType getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailsType }
     *     
     */
    public void setDetails(DetailsType value) {
        this.details = value;
    }

}
