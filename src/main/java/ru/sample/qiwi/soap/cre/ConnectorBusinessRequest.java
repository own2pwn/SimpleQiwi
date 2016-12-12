
package ru.sample.qiwi.soap.cre;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ConnectorBusinessRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectorBusinessRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrDistrictType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrCityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrSettlementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrSettlement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrStreetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrStructure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrFlat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="consentEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="consentPurpose" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consentPurposeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consentUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfReport" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="egrn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrDistrictType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrCityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrSettlementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrSettlement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrStreetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrStructure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrFlat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="subjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="liquidated" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="creditReportDetalization" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carRegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dateTimeApplication" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectorBusinessRequest", propOrder = {

})
public class ConnectorBusinessRequest {

    @XmlElementRef(name = "uid", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uid;
    @XmlElementRef(name = "actAddrCountry", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrCountry;
    @XmlElementRef(name = "actAddrPostal", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrPostal;
    @XmlElementRef(name = "actAddrRegion", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrRegion;
    @XmlElementRef(name = "actAddrDistrictType", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrDistrictType;
    @XmlElementRef(name = "actAddrDistrict", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrDistrict;
    @XmlElementRef(name = "actAddrCityType", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrCityType;
    @XmlElementRef(name = "actAddrCity", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrCity;
    @XmlElementRef(name = "actAddrSettlementType", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrSettlementType;
    @XmlElementRef(name = "actAddrSettlement", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrSettlement;
    @XmlElementRef(name = "actAddrStreetType", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrStreetType;
    @XmlElementRef(name = "actAddrStreet", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrStreet;
    @XmlElementRef(name = "actAddrHouse", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrHouse;
    @XmlElementRef(name = "actAddrBuilding", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrBuilding;
    @XmlElementRef(name = "actAddrStructure", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrStructure;
    @XmlElementRef(name = "actAddrFlat", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrFlat;
    @XmlElementRef(name = "amount", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> amount;
    @XmlElementRef(name = "companyName", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyName;
    @XmlElementRef(name = "consent", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consent;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar consentDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar consentEndDate;
    @XmlElementRef(name = "consentPurpose", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> consentPurpose;
    @XmlElementRef(name = "consentPurposeText", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consentPurposeText;
    @XmlElementRef(name = "consentUser", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consentUser;
    @XmlElementRef(name = "currency", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency;
    @XmlElementRef(name = "dateOfReport", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateOfReport;
    @XmlElementRef(name = "duration", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> duration;
    @XmlElementRef(name = "egrn", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> egrn;
    @XmlElementRef(name = "inn", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inn;
    @XmlElementRef(name = "nationality", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nationality;
    @XmlElementRef(name = "phone", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phone;
    @XmlElementRef(name = "reason", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reason;
    @XmlElementRef(name = "regAddrCountry", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrCountry;
    @XmlElementRef(name = "regAddrPostal", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrPostal;
    @XmlElementRef(name = "regAddrRegion", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrRegion;
    @XmlElementRef(name = "regAddrDistrictType", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrDistrictType;
    @XmlElementRef(name = "regAddrDistrict", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrDistrict;
    @XmlElementRef(name = "regAddrCityType", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrCityType;
    @XmlElementRef(name = "regAddrCity", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrCity;
    @XmlElementRef(name = "regAddrSettlementType", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrSettlementType;
    @XmlElementRef(name = "regAddrSettlement", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrSettlement;
    @XmlElementRef(name = "regAddrStreetType", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrStreetType;
    @XmlElementRef(name = "regAddrStreet", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrStreet;
    @XmlElementRef(name = "regAddrHouse", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrHouse;
    @XmlElementRef(name = "regAddrBuilding", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrBuilding;
    @XmlElementRef(name = "regAddrStructure", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrStructure;
    @XmlElementRef(name = "regAddrFlat", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrFlat;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regDate;
    @XmlElementRef(name = "subjectCode", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subjectCode;
    @XmlElementRef(name = "liquidated", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> liquidated;
    @XmlElementRef(name = "creditReportDetalization", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> creditReportDetalization;
    @XmlElementRef(name = "vin", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vin;
    @XmlElementRef(name = "carRegNo", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> carRegNo;
    @XmlElementRef(name = "carYear", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> carYear;
    @XmlElementRef(name = "caseNumber", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> caseNumber;
    @XmlElementRef(name = "format", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> format;
    @XmlElementRef(name = "dateTimeApplication", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateTimeApplication;

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
     * Gets the value of the actAddrCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActAddrCountry() {
        return actAddrCountry;
    }

    /**
     * Sets the value of the actAddrCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActAddrCountry(JAXBElement<String> value) {
        this.actAddrCountry = value;
    }

    /**
     * Gets the value of the actAddrPostal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActAddrPostal() {
        return actAddrPostal;
    }

    /**
     * Sets the value of the actAddrPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActAddrPostal(JAXBElement<String> value) {
        this.actAddrPostal = value;
    }

    /**
     * Gets the value of the actAddrRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActAddrRegion() {
        return actAddrRegion;
    }

    /**
     * Sets the value of the actAddrRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActAddrRegion(JAXBElement<String> value) {
        this.actAddrRegion = value;
    }

    /**
     * Gets the value of the actAddrDistrictType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActAddrDistrictType() {
        return actAddrDistrictType;
    }

    /**
     * Sets the value of the actAddrDistrictType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActAddrDistrictType(JAXBElement<String> value) {
        this.actAddrDistrictType = value;
    }

    /**
     * Gets the value of the actAddrDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActAddrDistrict() {
        return actAddrDistrict;
    }

    /**
     * Sets the value of the actAddrDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActAddrDistrict(JAXBElement<String> value) {
        this.actAddrDistrict = value;
    }

    /**
     * Gets the value of the actAddrCityType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActAddrCityType() {
        return actAddrCityType;
    }

    /**
     * Sets the value of the actAddrCityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActAddrCityType(JAXBElement<String> value) {
        this.actAddrCityType = value;
    }

    /**
     * Gets the value of the actAddrCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActAddrCity() {
        return actAddrCity;
    }

    /**
     * Sets the value of the actAddrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActAddrCity(JAXBElement<String> value) {
        this.actAddrCity = value;
    }

    /**
     * Gets the value of the actAddrSettlementType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActAddrSettlementType() {
        return actAddrSettlementType;
    }

    /**
     * Sets the value of the actAddrSettlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActAddrSettlementType(JAXBElement<String> value) {
        this.actAddrSettlementType = value;
    }

    /**
     * Gets the value of the actAddrSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActAddrSettlement() {
        return actAddrSettlement;
    }

    /**
     * Sets the value of the actAddrSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActAddrSettlement(JAXBElement<String> value) {
        this.actAddrSettlement = value;
    }

    /**
     * Gets the value of the actAddrStreetType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActAddrStreetType() {
        return actAddrStreetType;
    }

    /**
     * Sets the value of the actAddrStreetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActAddrStreetType(JAXBElement<String> value) {
        this.actAddrStreetType = value;
    }

    /**
     * Gets the value of the actAddrStreet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActAddrStreet() {
        return actAddrStreet;
    }

    /**
     * Sets the value of the actAddrStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActAddrStreet(JAXBElement<String> value) {
        this.actAddrStreet = value;
    }

    /**
     * Gets the value of the actAddrHouse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActAddrHouse() {
        return actAddrHouse;
    }

    /**
     * Sets the value of the actAddrHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActAddrHouse(JAXBElement<String> value) {
        this.actAddrHouse = value;
    }

    /**
     * Gets the value of the actAddrBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActAddrBuilding() {
        return actAddrBuilding;
    }

    /**
     * Sets the value of the actAddrBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActAddrBuilding(JAXBElement<String> value) {
        this.actAddrBuilding = value;
    }

    /**
     * Gets the value of the actAddrStructure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActAddrStructure() {
        return actAddrStructure;
    }

    /**
     * Sets the value of the actAddrStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActAddrStructure(JAXBElement<String> value) {
        this.actAddrStructure = value;
    }

    /**
     * Gets the value of the actAddrFlat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActAddrFlat() {
        return actAddrFlat;
    }

    /**
     * Sets the value of the actAddrFlat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActAddrFlat(JAXBElement<String> value) {
        this.actAddrFlat = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAmount(JAXBElement<String> value) {
        this.amount = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyName(JAXBElement<String> value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the consent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsent() {
        return consent;
    }

    /**
     * Sets the value of the consent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsent(JAXBElement<String> value) {
        this.consent = value;
    }

    /**
     * Gets the value of the consentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConsentDate() {
        return consentDate;
    }

    /**
     * Sets the value of the consentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConsentDate(XMLGregorianCalendar value) {
        this.consentDate = value;
    }

    /**
     * Gets the value of the consentEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConsentEndDate() {
        return consentEndDate;
    }

    /**
     * Sets the value of the consentEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConsentEndDate(XMLGregorianCalendar value) {
        this.consentEndDate = value;
    }

    /**
     * Gets the value of the consentPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConsentPurpose() {
        return consentPurpose;
    }

    /**
     * Sets the value of the consentPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConsentPurpose(JAXBElement<Integer> value) {
        this.consentPurpose = value;
    }

    /**
     * Gets the value of the consentPurposeText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsentPurposeText() {
        return consentPurposeText;
    }

    /**
     * Sets the value of the consentPurposeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsentPurposeText(JAXBElement<String> value) {
        this.consentPurposeText = value;
    }

    /**
     * Gets the value of the consentUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsentUser() {
        return consentUser;
    }

    /**
     * Sets the value of the consentUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsentUser(JAXBElement<String> value) {
        this.consentUser = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrency(JAXBElement<String> value) {
        this.currency = value;
    }

    /**
     * Gets the value of the dateOfReport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateOfReport() {
        return dateOfReport;
    }

    /**
     * Sets the value of the dateOfReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateOfReport(JAXBElement<XMLGregorianCalendar> value) {
        this.dateOfReport = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDuration(JAXBElement<String> value) {
        this.duration = value;
    }

    /**
     * Gets the value of the egrn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgrn() {
        return egrn;
    }

    /**
     * Sets the value of the egrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgrn(JAXBElement<String> value) {
        this.egrn = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInn(JAXBElement<String> value) {
        this.inn = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNationality(JAXBElement<String> value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhone(JAXBElement<String> value) {
        this.phone = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReason(JAXBElement<String> value) {
        this.reason = value;
    }

    /**
     * Gets the value of the regAddrCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAddrCountry() {
        return regAddrCountry;
    }

    /**
     * Sets the value of the regAddrCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAddrCountry(JAXBElement<String> value) {
        this.regAddrCountry = value;
    }

    /**
     * Gets the value of the regAddrPostal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAddrPostal() {
        return regAddrPostal;
    }

    /**
     * Sets the value of the regAddrPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAddrPostal(JAXBElement<String> value) {
        this.regAddrPostal = value;
    }

    /**
     * Gets the value of the regAddrRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAddrRegion() {
        return regAddrRegion;
    }

    /**
     * Sets the value of the regAddrRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAddrRegion(JAXBElement<String> value) {
        this.regAddrRegion = value;
    }

    /**
     * Gets the value of the regAddrDistrictType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAddrDistrictType() {
        return regAddrDistrictType;
    }

    /**
     * Sets the value of the regAddrDistrictType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAddrDistrictType(JAXBElement<String> value) {
        this.regAddrDistrictType = value;
    }

    /**
     * Gets the value of the regAddrDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAddrDistrict() {
        return regAddrDistrict;
    }

    /**
     * Sets the value of the regAddrDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAddrDistrict(JAXBElement<String> value) {
        this.regAddrDistrict = value;
    }

    /**
     * Gets the value of the regAddrCityType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAddrCityType() {
        return regAddrCityType;
    }

    /**
     * Sets the value of the regAddrCityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAddrCityType(JAXBElement<String> value) {
        this.regAddrCityType = value;
    }

    /**
     * Gets the value of the regAddrCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAddrCity() {
        return regAddrCity;
    }

    /**
     * Sets the value of the regAddrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAddrCity(JAXBElement<String> value) {
        this.regAddrCity = value;
    }

    /**
     * Gets the value of the regAddrSettlementType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAddrSettlementType() {
        return regAddrSettlementType;
    }

    /**
     * Sets the value of the regAddrSettlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAddrSettlementType(JAXBElement<String> value) {
        this.regAddrSettlementType = value;
    }

    /**
     * Gets the value of the regAddrSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAddrSettlement() {
        return regAddrSettlement;
    }

    /**
     * Sets the value of the regAddrSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAddrSettlement(JAXBElement<String> value) {
        this.regAddrSettlement = value;
    }

    /**
     * Gets the value of the regAddrStreetType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAddrStreetType() {
        return regAddrStreetType;
    }

    /**
     * Sets the value of the regAddrStreetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAddrStreetType(JAXBElement<String> value) {
        this.regAddrStreetType = value;
    }

    /**
     * Gets the value of the regAddrStreet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAddrStreet() {
        return regAddrStreet;
    }

    /**
     * Sets the value of the regAddrStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAddrStreet(JAXBElement<String> value) {
        this.regAddrStreet = value;
    }

    /**
     * Gets the value of the regAddrHouse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAddrHouse() {
        return regAddrHouse;
    }

    /**
     * Sets the value of the regAddrHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAddrHouse(JAXBElement<String> value) {
        this.regAddrHouse = value;
    }

    /**
     * Gets the value of the regAddrBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAddrBuilding() {
        return regAddrBuilding;
    }

    /**
     * Sets the value of the regAddrBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAddrBuilding(JAXBElement<String> value) {
        this.regAddrBuilding = value;
    }

    /**
     * Gets the value of the regAddrStructure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAddrStructure() {
        return regAddrStructure;
    }

    /**
     * Sets the value of the regAddrStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAddrStructure(JAXBElement<String> value) {
        this.regAddrStructure = value;
    }

    /**
     * Gets the value of the regAddrFlat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAddrFlat() {
        return regAddrFlat;
    }

    /**
     * Sets the value of the regAddrFlat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAddrFlat(JAXBElement<String> value) {
        this.regAddrFlat = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDate(XMLGregorianCalendar value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the subjectCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubjectCode() {
        return subjectCode;
    }

    /**
     * Sets the value of the subjectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubjectCode(JAXBElement<String> value) {
        this.subjectCode = value;
    }

    /**
     * Gets the value of the liquidated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLiquidated() {
        return liquidated;
    }

    /**
     * Sets the value of the liquidated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLiquidated(JAXBElement<Integer> value) {
        this.liquidated = value;
    }

    /**
     * Gets the value of the creditReportDetalization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCreditReportDetalization() {
        return creditReportDetalization;
    }

    /**
     * Sets the value of the creditReportDetalization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCreditReportDetalization(JAXBElement<Integer> value) {
        this.creditReportDetalization = value;
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

    /**
     * Gets the value of the carRegNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCarRegNo() {
        return carRegNo;
    }

    /**
     * Sets the value of the carRegNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCarRegNo(JAXBElement<String> value) {
        this.carRegNo = value;
    }

    /**
     * Gets the value of the carYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCarYear() {
        return carYear;
    }

    /**
     * Sets the value of the carYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCarYear(JAXBElement<String> value) {
        this.carYear = value;
    }

    /**
     * Gets the value of the caseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaseNumber() {
        return caseNumber;
    }

    /**
     * Sets the value of the caseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaseNumber(JAXBElement<String> value) {
        this.caseNumber = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFormat(JAXBElement<Integer> value) {
        this.format = value;
    }

    /**
     * Gets the value of the dateTimeApplication property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateTimeApplication() {
        return dateTimeApplication;
    }

    /**
     * Sets the value of the dateTimeApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateTimeApplication(JAXBElement<XMLGregorianCalendar> value) {
        this.dateTimeApplication = value;
    }

}
