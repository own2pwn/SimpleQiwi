
package ru.sample.qiwi.soap.cre;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ExpansionScoreRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpansionScoreRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankClient" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="durationOfResidence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="residenceStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="educationLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="occupationType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="occupationStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="monthsInProfession" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="monthsInCurWork" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="birthDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numDependants" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="verifyPhoneNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalMonthlyBalance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalMonthlyPayments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpansionScoreRequest", propOrder = {
    "requestId",
    "bankClient",
    "durationOfResidence",
    "residenceStatus",
    "educationLevel",
    "occupationType",
    "occupationStatus",
    "monthsInProfession",
    "monthsInCurWork",
    "gender",
    "birthDt",
    "maritalStatus",
    "numDependants",
    "verifyPhoneNum",
    "totalMonthlyBalance",
    "totalMonthlyPayments"
})
public class ExpansionScoreRequest {

    @XmlElementRef(name = "requestId", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestId;
    @XmlElementRef(name = "bankClient", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bankClient;
    @XmlElementRef(name = "durationOfResidence", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> durationOfResidence;
    @XmlElementRef(name = "residenceStatus", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> residenceStatus;
    @XmlElementRef(name = "educationLevel", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> educationLevel;
    @XmlElementRef(name = "occupationType", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> occupationType;
    @XmlElementRef(name = "occupationStatus", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> occupationStatus;
    @XmlElementRef(name = "monthsInProfession", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> monthsInProfession;
    @XmlElementRef(name = "monthsInCurWork", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> monthsInCurWork;
    @XmlElementRef(name = "gender", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> gender;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDt;
    @XmlElementRef(name = "maritalStatus", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maritalStatus;
    @XmlElementRef(name = "numDependants", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numDependants;
    @XmlElementRef(name = "verifyPhoneNum", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> verifyPhoneNum;
    @XmlElementRef(name = "totalMonthlyBalance", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totalMonthlyBalance;
    @XmlElementRef(name = "totalMonthlyPayments", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totalMonthlyPayments;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestId(JAXBElement<String> value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the bankClient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBankClient() {
        return bankClient;
    }

    /**
     * Sets the value of the bankClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBankClient(JAXBElement<Integer> value) {
        this.bankClient = value;
    }

    /**
     * Gets the value of the durationOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDurationOfResidence() {
        return durationOfResidence;
    }

    /**
     * Sets the value of the durationOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDurationOfResidence(JAXBElement<Integer> value) {
        this.durationOfResidence = value;
    }

    /**
     * Gets the value of the residenceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getResidenceStatus() {
        return residenceStatus;
    }

    /**
     * Sets the value of the residenceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setResidenceStatus(JAXBElement<Integer> value) {
        this.residenceStatus = value;
    }

    /**
     * Gets the value of the educationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEducationLevel() {
        return educationLevel;
    }

    /**
     * Sets the value of the educationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEducationLevel(JAXBElement<Integer> value) {
        this.educationLevel = value;
    }

    /**
     * Gets the value of the occupationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOccupationType() {
        return occupationType;
    }

    /**
     * Sets the value of the occupationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOccupationType(JAXBElement<Integer> value) {
        this.occupationType = value;
    }

    /**
     * Gets the value of the occupationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOccupationStatus() {
        return occupationStatus;
    }

    /**
     * Sets the value of the occupationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOccupationStatus(JAXBElement<Integer> value) {
        this.occupationStatus = value;
    }

    /**
     * Gets the value of the monthsInProfession property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMonthsInProfession() {
        return monthsInProfession;
    }

    /**
     * Sets the value of the monthsInProfession property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMonthsInProfession(JAXBElement<Integer> value) {
        this.monthsInProfession = value;
    }

    /**
     * Gets the value of the monthsInCurWork property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMonthsInCurWork() {
        return monthsInCurWork;
    }

    /**
     * Sets the value of the monthsInCurWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMonthsInCurWork(JAXBElement<Integer> value) {
        this.monthsInCurWork = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGender(JAXBElement<Integer> value) {
        this.gender = value;
    }

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDt() {
        return birthDt;
    }

    /**
     * Sets the value of the birthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDt(XMLGregorianCalendar value) {
        this.birthDt = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaritalStatus(JAXBElement<Integer> value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the numDependants property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumDependants() {
        return numDependants;
    }

    /**
     * Sets the value of the numDependants property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumDependants(JAXBElement<Integer> value) {
        this.numDependants = value;
    }

    /**
     * Gets the value of the verifyPhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVerifyPhoneNum() {
        return verifyPhoneNum;
    }

    /**
     * Sets the value of the verifyPhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVerifyPhoneNum(JAXBElement<Integer> value) {
        this.verifyPhoneNum = value;
    }

    /**
     * Gets the value of the totalMonthlyBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotalMonthlyBalance() {
        return totalMonthlyBalance;
    }

    /**
     * Sets the value of the totalMonthlyBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotalMonthlyBalance(JAXBElement<Integer> value) {
        this.totalMonthlyBalance = value;
    }

    /**
     * Gets the value of the totalMonthlyPayments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotalMonthlyPayments() {
        return totalMonthlyPayments;
    }

    /**
     * Sets the value of the totalMonthlyPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotalMonthlyPayments(JAXBElement<Integer> value) {
        this.totalMonthlyPayments = value;
    }

}
