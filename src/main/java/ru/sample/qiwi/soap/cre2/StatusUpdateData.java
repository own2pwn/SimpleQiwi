
package ru.sample.qiwi.soap.cre2;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * ��������� ��������� ������ ��� ���������� �������� ������
 * 
 * <p>Java class for StatusUpdateData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusUpdateData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authData" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}AuthData" minOccurs="0"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uidApplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTimeApplication" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="applicationStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="defaultStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="connectorCodes" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}ConnectorCode" maxOccurs="unbounded"/>
 *         &lt;element name="personParam" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}PersonRequestData" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusUpdateData", propOrder = {
    "authData",
    "uid",
    "uidApplication",
    "dateTimeApplication",
    "applicationStatus",
    "defaultStatus",
    "connectorCodes",
    "personParam"
})
public class StatusUpdateData {

    protected AuthData authData;
    protected String uid;
    protected String uidApplication;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeApplication;
    protected Integer applicationStatus;
    protected Integer defaultStatus;
    @XmlElement(required = true)
    protected List<ConnectorCode> connectorCodes;
    @XmlElement(required = true)
    protected List<PersonRequestData> personParam;

    /**
     * Gets the value of the authData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthData }
     *     
     */
    public AuthData getAuthData() {
        return authData;
    }

    /**
     * Sets the value of the authData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthData }
     *     
     */
    public void setAuthData(AuthData value) {
        this.authData = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the uidApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidApplication() {
        return uidApplication;
    }

    /**
     * Sets the value of the uidApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidApplication(String value) {
        this.uidApplication = value;
    }

    /**
     * Gets the value of the dateTimeApplication property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeApplication() {
        return dateTimeApplication;
    }

    /**
     * Sets the value of the dateTimeApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeApplication(XMLGregorianCalendar value) {
        this.dateTimeApplication = value;
    }

    /**
     * Gets the value of the applicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplicationStatus() {
        return applicationStatus;
    }

    /**
     * Sets the value of the applicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplicationStatus(Integer value) {
        this.applicationStatus = value;
    }

    /**
     * Gets the value of the defaultStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    /**
     * Sets the value of the defaultStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultStatus(Integer value) {
        this.defaultStatus = value;
    }

    /**
     * Gets the value of the connectorCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectorCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectorCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectorCode }
     * 
     * 
     */
    public List<ConnectorCode> getConnectorCodes() {
        if (connectorCodes == null) {
            connectorCodes = new ArrayList<ConnectorCode>();
        }
        return this.connectorCodes;
    }

    /**
     * Gets the value of the personParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonRequestData }
     * 
     * 
     */
    public List<PersonRequestData> getPersonParam() {
        if (personParam == null) {
            personParam = new ArrayList<PersonRequestData>();
        }
        return this.personParam;
    }

}
