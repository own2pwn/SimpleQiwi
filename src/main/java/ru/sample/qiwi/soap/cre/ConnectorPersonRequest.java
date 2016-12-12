
package ru.sample.qiwi.soap.cre;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ConnectorPersonRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectorPersonRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middlename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="empFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empFirmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empEngName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empInn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empOgrn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empDistrictType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empCityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empSettlementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empSettlement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empStreetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empStructure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empApartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empRestrFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empRestrShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empRestrFirmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empRestrEngName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empRestrInn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="consentEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="consentPurpose" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consentPurposeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consentUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateOfReport" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="education" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="inn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marriage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occupationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pfNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purposeOfFinance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestFor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditReportDetalization" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="paymentHistory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dateTimeApplication" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="newApplicant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empBusinessIndustry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tradeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="originalChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monthlyDocIncome" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="actAddrMonths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numChildren" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="downPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="finalPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carRegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationWay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectorPersonRequest", propOrder = {

})
public class ConnectorPersonRequest {

    @XmlElementRef(name = "uid", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uid;
    @XmlElementRef(name = "surname", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surname;
    @XmlElementRef(name = "firstname", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstname;
    @XmlElementRef(name = "middlename", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> middlename;
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
    @XmlElementRef(name = "empFullName", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empFullName;
    @XmlElementRef(name = "empShortName", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empShortName;
    @XmlElementRef(name = "empFirmName", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empFirmName;
    @XmlElementRef(name = "empEngName", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empEngName;
    @XmlElementRef(name = "empInn", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empInn;
    @XmlElementRef(name = "empOgrn", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empOgrn;
    @XmlElementRef(name = "empCountry", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empCountry;
    @XmlElementRef(name = "empPostal", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empPostal;
    @XmlElementRef(name = "empRegion", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empRegion;
    @XmlElementRef(name = "empDistrictType", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empDistrictType;
    @XmlElementRef(name = "empDistrict", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empDistrict;
    @XmlElementRef(name = "empCityType", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empCityType;
    @XmlElementRef(name = "empCity", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empCity;
    @XmlElementRef(name = "empSettlementType", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empSettlementType;
    @XmlElementRef(name = "empSettlement", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empSettlement;
    @XmlElementRef(name = "empStreetType", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empStreetType;
    @XmlElementRef(name = "empStreet", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empStreet;
    @XmlElementRef(name = "empHouse", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empHouse;
    @XmlElementRef(name = "empBuilding", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empBuilding;
    @XmlElementRef(name = "empStructure", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empStructure;
    @XmlElementRef(name = "empApartment", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empApartment;
    @XmlElementRef(name = "empPhone", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empPhone;
    @XmlElementRef(name = "empRestrFullName", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empRestrFullName;
    @XmlElementRef(name = "empRestrShortName", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empRestrShortName;
    @XmlElementRef(name = "empRestrFirmName", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empRestrFirmName;
    @XmlElementRef(name = "empRestrEngName", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empRestrEngName;
    @XmlElementRef(name = "empRestrInn", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empRestrInn;
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
    @XmlElementRef(name = "current", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> current;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElementRef(name = "dateOfReport", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateOfReport;
    @XmlElementRef(name = "duration", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> duration;
    @XmlElementRef(name = "education", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> education;
    @XmlElementRef(name = "homePhone", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> homePhone;
    @XmlElementRef(name = "idType", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idType;
    @XmlElementRef(name = "idSeries", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idSeries;
    @XmlElementRef(name = "idNum", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idNum;
    @XmlElementRef(name = "issueAuthority", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> issueAuthority;
    @XmlElementRef(name = "issueLocation", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> issueLocation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;
    @XmlElementRef(name = "inn", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inn;
    @XmlElementRef(name = "marriage", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marriage;
    @XmlElementRef(name = "maritalStatus", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maritalStatus;
    @XmlElementRef(name = "mobilePhone", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobilePhone;
    @XmlElementRef(name = "nationality", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nationality;
    @XmlElementRef(name = "occupationType", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> occupationType;
    @XmlElementRef(name = "pfNum", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pfNum;
    @XmlElementRef(name = "placeOfBirth", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> placeOfBirth;
    @XmlElementRef(name = "profession", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profession;
    @XmlElementRef(name = "reason", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reason;
    @XmlElementRef(name = "purposeOfFinance", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> purposeOfFinance;
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
    @XmlElementRef(name = "sex", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sex;
    @XmlElementRef(name = "subjectCode", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subjectCode;
    @XmlElementRef(name = "workDuration", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workDuration;
    @XmlElementRef(name = "workPhone", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workPhone;
    @XmlElementRef(name = "requestFor", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestFor;
    @XmlElementRef(name = "creditReportDetalization", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> creditReportDetalization;
    @XmlElementRef(name = "paymentHistory", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> paymentHistory;
    @XmlElementRef(name = "dateTimeApplication", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateTimeApplication;
    @XmlElementRef(name = "newApplicant", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newApplicant;
    @XmlElementRef(name = "empBusinessIndustry", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empBusinessIndustry;
    @XmlElementRef(name = "tradeDate", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> tradeDate;
    @XmlElementRef(name = "originalChannel", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalChannel;
    @XmlElementRef(name = "monthlyDocIncome", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> monthlyDocIncome;
    @XmlElementRef(name = "actAddrMonths", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> actAddrMonths;
    @XmlElementRef(name = "numChildren", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numChildren;
    @XmlElementRef(name = "creditLimit", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditLimit;
    @XmlElementRef(name = "downPaymentAmount", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> downPaymentAmount;
    @XmlElementRef(name = "exp", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> exp;
    @XmlElementRef(name = "finalPaymentAmount", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> finalPaymentAmount;
    @XmlElementRef(name = "vin", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vin;
    @XmlElementRef(name = "carRegNo", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> carRegNo;
    @XmlElementRef(name = "carYear", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> carYear;
    @XmlElementRef(name = "applicationWay", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> applicationWay;
    @XmlElementRef(name = "category", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> category;
    @XmlElementRef(name = "regDate", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> regDate;
    @XmlElementRef(name = "format", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> format;
    @XmlElementRef(name = "email", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "model", namespace = "http://connector.xws.mbtc.ru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> model;

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
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSurname(JAXBElement<String> value) {
        this.surname = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstname(JAXBElement<String> value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the middlename property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiddlename() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiddlename(JAXBElement<String> value) {
        this.middlename = value;
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
     * Gets the value of the empFullName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpFullName() {
        return empFullName;
    }

    /**
     * Sets the value of the empFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpFullName(JAXBElement<String> value) {
        this.empFullName = value;
    }

    /**
     * Gets the value of the empShortName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpShortName() {
        return empShortName;
    }

    /**
     * Sets the value of the empShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpShortName(JAXBElement<String> value) {
        this.empShortName = value;
    }

    /**
     * Gets the value of the empFirmName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpFirmName() {
        return empFirmName;
    }

    /**
     * Sets the value of the empFirmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpFirmName(JAXBElement<String> value) {
        this.empFirmName = value;
    }

    /**
     * Gets the value of the empEngName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpEngName() {
        return empEngName;
    }

    /**
     * Sets the value of the empEngName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpEngName(JAXBElement<String> value) {
        this.empEngName = value;
    }

    /**
     * Gets the value of the empInn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpInn() {
        return empInn;
    }

    /**
     * Sets the value of the empInn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpInn(JAXBElement<String> value) {
        this.empInn = value;
    }

    /**
     * Gets the value of the empOgrn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpOgrn() {
        return empOgrn;
    }

    /**
     * Sets the value of the empOgrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpOgrn(JAXBElement<String> value) {
        this.empOgrn = value;
    }

    /**
     * Gets the value of the empCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpCountry() {
        return empCountry;
    }

    /**
     * Sets the value of the empCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpCountry(JAXBElement<String> value) {
        this.empCountry = value;
    }

    /**
     * Gets the value of the empPostal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpPostal() {
        return empPostal;
    }

    /**
     * Sets the value of the empPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpPostal(JAXBElement<String> value) {
        this.empPostal = value;
    }

    /**
     * Gets the value of the empRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpRegion() {
        return empRegion;
    }

    /**
     * Sets the value of the empRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpRegion(JAXBElement<String> value) {
        this.empRegion = value;
    }

    /**
     * Gets the value of the empDistrictType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpDistrictType() {
        return empDistrictType;
    }

    /**
     * Sets the value of the empDistrictType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpDistrictType(JAXBElement<String> value) {
        this.empDistrictType = value;
    }

    /**
     * Gets the value of the empDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpDistrict() {
        return empDistrict;
    }

    /**
     * Sets the value of the empDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpDistrict(JAXBElement<String> value) {
        this.empDistrict = value;
    }

    /**
     * Gets the value of the empCityType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpCityType() {
        return empCityType;
    }

    /**
     * Sets the value of the empCityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpCityType(JAXBElement<String> value) {
        this.empCityType = value;
    }

    /**
     * Gets the value of the empCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpCity() {
        return empCity;
    }

    /**
     * Sets the value of the empCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpCity(JAXBElement<String> value) {
        this.empCity = value;
    }

    /**
     * Gets the value of the empSettlementType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpSettlementType() {
        return empSettlementType;
    }

    /**
     * Sets the value of the empSettlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpSettlementType(JAXBElement<String> value) {
        this.empSettlementType = value;
    }

    /**
     * Gets the value of the empSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpSettlement() {
        return empSettlement;
    }

    /**
     * Sets the value of the empSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpSettlement(JAXBElement<String> value) {
        this.empSettlement = value;
    }

    /**
     * Gets the value of the empStreetType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpStreetType() {
        return empStreetType;
    }

    /**
     * Sets the value of the empStreetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpStreetType(JAXBElement<String> value) {
        this.empStreetType = value;
    }

    /**
     * Gets the value of the empStreet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpStreet() {
        return empStreet;
    }

    /**
     * Sets the value of the empStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpStreet(JAXBElement<String> value) {
        this.empStreet = value;
    }

    /**
     * Gets the value of the empHouse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpHouse() {
        return empHouse;
    }

    /**
     * Sets the value of the empHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpHouse(JAXBElement<String> value) {
        this.empHouse = value;
    }

    /**
     * Gets the value of the empBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpBuilding() {
        return empBuilding;
    }

    /**
     * Sets the value of the empBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpBuilding(JAXBElement<String> value) {
        this.empBuilding = value;
    }

    /**
     * Gets the value of the empStructure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpStructure() {
        return empStructure;
    }

    /**
     * Sets the value of the empStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpStructure(JAXBElement<String> value) {
        this.empStructure = value;
    }

    /**
     * Gets the value of the empApartment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpApartment() {
        return empApartment;
    }

    /**
     * Sets the value of the empApartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpApartment(JAXBElement<String> value) {
        this.empApartment = value;
    }

    /**
     * Gets the value of the empPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpPhone() {
        return empPhone;
    }

    /**
     * Sets the value of the empPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpPhone(JAXBElement<String> value) {
        this.empPhone = value;
    }

    /**
     * Gets the value of the empRestrFullName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpRestrFullName() {
        return empRestrFullName;
    }

    /**
     * Sets the value of the empRestrFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpRestrFullName(JAXBElement<String> value) {
        this.empRestrFullName = value;
    }

    /**
     * Gets the value of the empRestrShortName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpRestrShortName() {
        return empRestrShortName;
    }

    /**
     * Sets the value of the empRestrShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpRestrShortName(JAXBElement<String> value) {
        this.empRestrShortName = value;
    }

    /**
     * Gets the value of the empRestrFirmName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpRestrFirmName() {
        return empRestrFirmName;
    }

    /**
     * Sets the value of the empRestrFirmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpRestrFirmName(JAXBElement<String> value) {
        this.empRestrFirmName = value;
    }

    /**
     * Gets the value of the empRestrEngName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpRestrEngName() {
        return empRestrEngName;
    }

    /**
     * Sets the value of the empRestrEngName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpRestrEngName(JAXBElement<String> value) {
        this.empRestrEngName = value;
    }

    /**
     * Gets the value of the empRestrInn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpRestrInn() {
        return empRestrInn;
    }

    /**
     * Sets the value of the empRestrInn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpRestrInn(JAXBElement<String> value) {
        this.empRestrInn = value;
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
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrent(JAXBElement<String> value) {
        this.current = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
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
     * Gets the value of the education property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEducation() {
        return education;
    }

    /**
     * Sets the value of the education property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEducation(JAXBElement<String> value) {
        this.education = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHomePhone(JAXBElement<String> value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdType(JAXBElement<Integer> value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idSeries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdSeries() {
        return idSeries;
    }

    /**
     * Sets the value of the idSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdSeries(JAXBElement<String> value) {
        this.idSeries = value;
    }

    /**
     * Gets the value of the idNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdNum() {
        return idNum;
    }

    /**
     * Sets the value of the idNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdNum(JAXBElement<String> value) {
        this.idNum = value;
    }

    /**
     * Gets the value of the issueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIssueAuthority() {
        return issueAuthority;
    }

    /**
     * Sets the value of the issueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIssueAuthority(JAXBElement<String> value) {
        this.issueAuthority = value;
    }

    /**
     * Gets the value of the issueLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIssueLocation() {
        return issueLocation;
    }

    /**
     * Sets the value of the issueLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIssueLocation(JAXBElement<String> value) {
        this.issueLocation = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
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
     * Gets the value of the marriage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarriage() {
        return marriage;
    }

    /**
     * Sets the value of the marriage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarriage(JAXBElement<String> value) {
        this.marriage = value;
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
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobilePhone(JAXBElement<String> value) {
        this.mobilePhone = value;
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
     * Gets the value of the occupationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOccupationType() {
        return occupationType;
    }

    /**
     * Sets the value of the occupationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOccupationType(JAXBElement<String> value) {
        this.occupationType = value;
    }

    /**
     * Gets the value of the pfNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPfNum() {
        return pfNum;
    }

    /**
     * Sets the value of the pfNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPfNum(JAXBElement<String> value) {
        this.pfNum = value;
    }

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlaceOfBirth(JAXBElement<String> value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the profession property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfession() {
        return profession;
    }

    /**
     * Sets the value of the profession property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfession(JAXBElement<String> value) {
        this.profession = value;
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
     * Gets the value of the purposeOfFinance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPurposeOfFinance() {
        return purposeOfFinance;
    }

    /**
     * Sets the value of the purposeOfFinance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPurposeOfFinance(JAXBElement<Integer> value) {
        this.purposeOfFinance = value;
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
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSex(JAXBElement<String> value) {
        this.sex = value;
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
     * Gets the value of the workDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkDuration() {
        return workDuration;
    }

    /**
     * Sets the value of the workDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkDuration(JAXBElement<String> value) {
        this.workDuration = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkPhone(JAXBElement<String> value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the requestFor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestFor() {
        return requestFor;
    }

    /**
     * Sets the value of the requestFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestFor(JAXBElement<String> value) {
        this.requestFor = value;
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
     * Gets the value of the paymentHistory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPaymentHistory() {
        return paymentHistory;
    }

    /**
     * Sets the value of the paymentHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPaymentHistory(JAXBElement<Integer> value) {
        this.paymentHistory = value;
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

    /**
     * Gets the value of the newApplicant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewApplicant() {
        return newApplicant;
    }

    /**
     * Sets the value of the newApplicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewApplicant(JAXBElement<String> value) {
        this.newApplicant = value;
    }

    /**
     * Gets the value of the empBusinessIndustry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpBusinessIndustry() {
        return empBusinessIndustry;
    }

    /**
     * Sets the value of the empBusinessIndustry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpBusinessIndustry(JAXBElement<String> value) {
        this.empBusinessIndustry = value;
    }

    /**
     * Gets the value of the tradeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTradeDate() {
        return tradeDate;
    }

    /**
     * Sets the value of the tradeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTradeDate(JAXBElement<XMLGregorianCalendar> value) {
        this.tradeDate = value;
    }

    /**
     * Gets the value of the originalChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalChannel() {
        return originalChannel;
    }

    /**
     * Sets the value of the originalChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalChannel(JAXBElement<String> value) {
        this.originalChannel = value;
    }

    /**
     * Gets the value of the monthlyDocIncome property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMonthlyDocIncome() {
        return monthlyDocIncome;
    }

    /**
     * Sets the value of the monthlyDocIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMonthlyDocIncome(JAXBElement<Integer> value) {
        this.monthlyDocIncome = value;
    }

    /**
     * Gets the value of the actAddrMonths property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getActAddrMonths() {
        return actAddrMonths;
    }

    /**
     * Sets the value of the actAddrMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setActAddrMonths(JAXBElement<Integer> value) {
        this.actAddrMonths = value;
    }

    /**
     * Gets the value of the numChildren property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumChildren() {
        return numChildren;
    }

    /**
     * Sets the value of the numChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumChildren(JAXBElement<Integer> value) {
        this.numChildren = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditLimit(JAXBElement<String> value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the downPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDownPaymentAmount() {
        return downPaymentAmount;
    }

    /**
     * Sets the value of the downPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDownPaymentAmount(JAXBElement<String> value) {
        this.downPaymentAmount = value;
    }

    /**
     * Gets the value of the exp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExp() {
        return exp;
    }

    /**
     * Sets the value of the exp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExp(JAXBElement<Integer> value) {
        this.exp = value;
    }

    /**
     * Gets the value of the finalPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFinalPaymentAmount() {
        return finalPaymentAmount;
    }

    /**
     * Sets the value of the finalPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFinalPaymentAmount(JAXBElement<String> value) {
        this.finalPaymentAmount = value;
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
     * Gets the value of the applicationWay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getApplicationWay() {
        return applicationWay;
    }

    /**
     * Sets the value of the applicationWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setApplicationWay(JAXBElement<Integer> value) {
        this.applicationWay = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCategory(JAXBElement<Integer> value) {
        this.category = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRegDate(JAXBElement<XMLGregorianCalendar> value) {
        this.regDate = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModel(JAXBElement<String> value) {
        this.model = value;
    }

}
