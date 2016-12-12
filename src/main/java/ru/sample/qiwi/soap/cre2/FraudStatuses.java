
package ru.sample.qiwi.soap.cre2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ������ ����-�������� (��� ������ ��������)
 * 
 * <p>Java class for FraudStatuses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FraudStatuses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="innStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pfNumStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="driverNoStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scndIdStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pastIdStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="spouseStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="regAddrStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="regAddrPhoneStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="actAddrStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="homePhoneStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mobilePhoneStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mobilePhone2Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="workPhoneStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="workPhone2Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="empStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="empAddrStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="empPhoneStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="emailStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="carStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FraudStatuses", propOrder = {
    "idStatus",
    "innStatus",
    "pfNumStatus",
    "driverNoStatus",
    "scndIdStatus",
    "pastIdStatus",
    "spouseStatus",
    "regAddrStatus",
    "regAddrPhoneStatus",
    "actAddrStatus",
    "homePhoneStatus",
    "mobilePhoneStatus",
    "mobilePhone2Status",
    "workPhoneStatus",
    "workPhone2Status",
    "empStatus",
    "empAddrStatus",
    "empPhoneStatus",
    "emailStatus",
    "carStatus"
})
public class FraudStatuses {

    protected Integer idStatus;
    protected Integer innStatus;
    protected Integer pfNumStatus;
    protected Integer driverNoStatus;
    protected Integer scndIdStatus;
    protected Integer pastIdStatus;
    protected Integer spouseStatus;
    protected Integer regAddrStatus;
    protected Integer regAddrPhoneStatus;
    protected Integer actAddrStatus;
    protected Integer homePhoneStatus;
    protected Integer mobilePhoneStatus;
    protected Integer mobilePhone2Status;
    protected Integer workPhoneStatus;
    protected Integer workPhone2Status;
    protected Integer empStatus;
    protected Integer empAddrStatus;
    protected Integer empPhoneStatus;
    protected Integer emailStatus;
    protected Integer carStatus;

    /**
     * Gets the value of the idStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdStatus() {
        return idStatus;
    }

    /**
     * Sets the value of the idStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdStatus(Integer value) {
        this.idStatus = value;
    }

    /**
     * Gets the value of the innStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInnStatus() {
        return innStatus;
    }

    /**
     * Sets the value of the innStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInnStatus(Integer value) {
        this.innStatus = value;
    }

    /**
     * Gets the value of the pfNumStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPfNumStatus() {
        return pfNumStatus;
    }

    /**
     * Sets the value of the pfNumStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPfNumStatus(Integer value) {
        this.pfNumStatus = value;
    }

    /**
     * Gets the value of the driverNoStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDriverNoStatus() {
        return driverNoStatus;
    }

    /**
     * Sets the value of the driverNoStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDriverNoStatus(Integer value) {
        this.driverNoStatus = value;
    }

    /**
     * Gets the value of the scndIdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScndIdStatus() {
        return scndIdStatus;
    }

    /**
     * Sets the value of the scndIdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScndIdStatus(Integer value) {
        this.scndIdStatus = value;
    }

    /**
     * Gets the value of the pastIdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPastIdStatus() {
        return pastIdStatus;
    }

    /**
     * Sets the value of the pastIdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPastIdStatus(Integer value) {
        this.pastIdStatus = value;
    }

    /**
     * Gets the value of the spouseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpouseStatus() {
        return spouseStatus;
    }

    /**
     * Sets the value of the spouseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpouseStatus(Integer value) {
        this.spouseStatus = value;
    }

    /**
     * Gets the value of the regAddrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRegAddrStatus() {
        return regAddrStatus;
    }

    /**
     * Sets the value of the regAddrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRegAddrStatus(Integer value) {
        this.regAddrStatus = value;
    }

    /**
     * Gets the value of the regAddrPhoneStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRegAddrPhoneStatus() {
        return regAddrPhoneStatus;
    }

    /**
     * Sets the value of the regAddrPhoneStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRegAddrPhoneStatus(Integer value) {
        this.regAddrPhoneStatus = value;
    }

    /**
     * Gets the value of the actAddrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActAddrStatus() {
        return actAddrStatus;
    }

    /**
     * Sets the value of the actAddrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActAddrStatus(Integer value) {
        this.actAddrStatus = value;
    }

    /**
     * Gets the value of the homePhoneStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHomePhoneStatus() {
        return homePhoneStatus;
    }

    /**
     * Sets the value of the homePhoneStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHomePhoneStatus(Integer value) {
        this.homePhoneStatus = value;
    }

    /**
     * Gets the value of the mobilePhoneStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMobilePhoneStatus() {
        return mobilePhoneStatus;
    }

    /**
     * Sets the value of the mobilePhoneStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMobilePhoneStatus(Integer value) {
        this.mobilePhoneStatus = value;
    }

    /**
     * Gets the value of the mobilePhone2Status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMobilePhone2Status() {
        return mobilePhone2Status;
    }

    /**
     * Sets the value of the mobilePhone2Status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMobilePhone2Status(Integer value) {
        this.mobilePhone2Status = value;
    }

    /**
     * Gets the value of the workPhoneStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkPhoneStatus() {
        return workPhoneStatus;
    }

    /**
     * Sets the value of the workPhoneStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkPhoneStatus(Integer value) {
        this.workPhoneStatus = value;
    }

    /**
     * Gets the value of the workPhone2Status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkPhone2Status() {
        return workPhone2Status;
    }

    /**
     * Sets the value of the workPhone2Status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkPhone2Status(Integer value) {
        this.workPhone2Status = value;
    }

    /**
     * Gets the value of the empStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmpStatus() {
        return empStatus;
    }

    /**
     * Sets the value of the empStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmpStatus(Integer value) {
        this.empStatus = value;
    }

    /**
     * Gets the value of the empAddrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmpAddrStatus() {
        return empAddrStatus;
    }

    /**
     * Sets the value of the empAddrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmpAddrStatus(Integer value) {
        this.empAddrStatus = value;
    }

    /**
     * Gets the value of the empPhoneStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmpPhoneStatus() {
        return empPhoneStatus;
    }

    /**
     * Sets the value of the empPhoneStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmpPhoneStatus(Integer value) {
        this.empPhoneStatus = value;
    }

    /**
     * Gets the value of the emailStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmailStatus() {
        return emailStatus;
    }

    /**
     * Sets the value of the emailStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmailStatus(Integer value) {
        this.emailStatus = value;
    }

    /**
     * Gets the value of the carStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarStatus() {
        return carStatus;
    }

    /**
     * Sets the value of the carStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarStatus(Integer value) {
        this.carStatus = value;
    }

}
