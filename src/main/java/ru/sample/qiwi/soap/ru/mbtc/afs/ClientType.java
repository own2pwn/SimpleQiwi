
package ru.sample.qiwi.soap.ru.mbtc.afs;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о заявителе
 * 
 * <p>Java class for ClientType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="fraud" type="{http://mbtc.ru/afs/application}Td3" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middlename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthdate" type="{http://mbtc.ru/afs/application}TDate" minOccurs="0"/>
 *         &lt;element name="newApplicant" type="{http://mbtc.ru/afs/application}Td5" minOccurs="0"/>
 *         &lt;element name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantType" type="{http://mbtc.ru/afs/application}Td6" minOccurs="0"/>
 *         &lt;element name="isPledger" type="{http://mbtc.ru/afs/application}Td5" minOccurs="0"/>
 *         &lt;element name="birthPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://mbtc.ru/afs/application}Td7" minOccurs="0"/>
 *         &lt;element name="citizenship" type="{http://mbtc.ru/afs/application}Td18" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://mbtc.ru/afs/application}Td8" minOccurs="0"/>
 *         &lt;element name="childrenNumber" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *         &lt;element name="education" type="{http://mbtc.ru/afs/application}Td9" minOccurs="0"/>
 *         &lt;element name="prevSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prevFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prevMiddlename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incomeType" type="{http://mbtc.ru/afs/application}Td10" minOccurs="0"/>
 *         &lt;element name="confirmedIncome" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="unconfirmedIncome" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="spouseId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="fileSinceDt" type="{http://mbtc.ru/afs/application}TDate" minOccurs="0"/>
 *         &lt;element name="doc" type="{http://mbtc.ru/afs/application}DocType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="address" type="{http://mbtc.ru/afs/application}AddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://mbtc.ru/afs/application}PhoneType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="email" type="{http://mbtc.ru/afs/application}EmailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vehicle" type="{http://mbtc.ru/afs/application}VehicleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="employer" type="{http://mbtc.ru/afs/application}EmployerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientType", namespace = "http://mbtc.ru/afs/application", propOrder = {
    "id",
    "fraud",
    "surname",
    "firstname",
    "middlename",
    "birthdate",
    "newApplicant",
    "internalId",
    "applicantType",
    "isPledger",
    "birthPlace",
    "gender",
    "citizenship",
    "maritalStatus",
    "childrenNumber",
    "education",
    "prevSurname",
    "prevFirstname",
    "prevMiddlename",
    "incomeType",
    "confirmedIncome",
    "unconfirmedIncome",
    "spouseId",
    "fileSinceDt",
    "doc",
    "address",
    "phone",
    "email",
    "vehicle",
    "employer"
})
public class ClientType {

    protected BigInteger id;
    protected Byte fraud;
    protected String surname;
    protected String firstname;
    protected String middlename;
    protected String birthdate;
    protected Byte newApplicant;
    protected String internalId;
    protected Byte applicantType;
    protected Byte isPledger;
    protected String birthPlace;
    protected Byte gender;
    @XmlSchemaType(name = "string")
    protected Td18 citizenship;
    protected Byte maritalStatus;
    protected Byte childrenNumber;
    protected Byte education;
    protected String prevSurname;
    protected String prevFirstname;
    protected String prevMiddlename;
    protected Byte incomeType;
    protected BigDecimal confirmedIncome;
    protected BigDecimal unconfirmedIncome;
    protected BigInteger spouseId;
    protected String fileSinceDt;
    protected List<DocType> doc;
    protected List<AddressType> address;
    protected List<PhoneType> phone;
    protected List<EmailType> email;
    protected List<VehicleType> vehicle;
    protected List<EmployerType> employer;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
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
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the middlename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddlename() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddlename(String value) {
        this.middlename = value;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthdate(String value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the newApplicant property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getNewApplicant() {
        return newApplicant;
    }

    /**
     * Sets the value of the newApplicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setNewApplicant(Byte value) {
        this.newApplicant = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the applicantType property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getApplicantType() {
        return applicantType;
    }

    /**
     * Sets the value of the applicantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setApplicantType(Byte value) {
        this.applicantType = value;
    }

    /**
     * Gets the value of the isPledger property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getIsPledger() {
        return isPledger;
    }

    /**
     * Sets the value of the isPledger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setIsPledger(Byte value) {
        this.isPledger = value;
    }

    /**
     * Gets the value of the birthPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Sets the value of the birthPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlace(String value) {
        this.birthPlace = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setGender(Byte value) {
        this.gender = value;
    }

    /**
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link Td18 }
     *     
     */
    public Td18 getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link Td18 }
     *     
     */
    public void setCitizenship(Td18 value) {
        this.citizenship = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setMaritalStatus(Byte value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the childrenNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getChildrenNumber() {
        return childrenNumber;
    }

    /**
     * Sets the value of the childrenNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setChildrenNumber(Byte value) {
        this.childrenNumber = value;
    }

    /**
     * Gets the value of the education property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getEducation() {
        return education;
    }

    /**
     * Sets the value of the education property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setEducation(Byte value) {
        this.education = value;
    }

    /**
     * Gets the value of the prevSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevSurname() {
        return prevSurname;
    }

    /**
     * Sets the value of the prevSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevSurname(String value) {
        this.prevSurname = value;
    }

    /**
     * Gets the value of the prevFirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevFirstname() {
        return prevFirstname;
    }

    /**
     * Sets the value of the prevFirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevFirstname(String value) {
        this.prevFirstname = value;
    }

    /**
     * Gets the value of the prevMiddlename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevMiddlename() {
        return prevMiddlename;
    }

    /**
     * Sets the value of the prevMiddlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevMiddlename(String value) {
        this.prevMiddlename = value;
    }

    /**
     * Gets the value of the incomeType property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getIncomeType() {
        return incomeType;
    }

    /**
     * Sets the value of the incomeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setIncomeType(Byte value) {
        this.incomeType = value;
    }

    /**
     * Gets the value of the confirmedIncome property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConfirmedIncome() {
        return confirmedIncome;
    }

    /**
     * Sets the value of the confirmedIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConfirmedIncome(BigDecimal value) {
        this.confirmedIncome = value;
    }

    /**
     * Gets the value of the unconfirmedIncome property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnconfirmedIncome() {
        return unconfirmedIncome;
    }

    /**
     * Sets the value of the unconfirmedIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnconfirmedIncome(BigDecimal value) {
        this.unconfirmedIncome = value;
    }

    /**
     * Gets the value of the spouseId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpouseId() {
        return spouseId;
    }

    /**
     * Sets the value of the spouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpouseId(BigInteger value) {
        this.spouseId = value;
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

    /**
     * Gets the value of the doc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocType }
     * 
     * 
     */
    public List<DocType> getDoc() {
        if (doc == null) {
            doc = new ArrayList<DocType>();
        }
        return this.doc;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressType>();
        }
        return this.address;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneType }
     * 
     * 
     */
    public List<PhoneType> getPhone() {
        if (phone == null) {
            phone = new ArrayList<PhoneType>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailType }
     * 
     * 
     */
    public List<EmailType> getEmail() {
        if (email == null) {
            email = new ArrayList<EmailType>();
        }
        return this.email;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleType }
     * 
     * 
     */
    public List<VehicleType> getVehicle() {
        if (vehicle == null) {
            vehicle = new ArrayList<VehicleType>();
        }
        return this.vehicle;
    }

    /**
     * Gets the value of the employer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployerType }
     * 
     * 
     */
    public List<EmployerType> getEmployer() {
        if (employer == null) {
            employer = new ArrayList<EmployerType>();
        }
        return this.employer;
    }

}
