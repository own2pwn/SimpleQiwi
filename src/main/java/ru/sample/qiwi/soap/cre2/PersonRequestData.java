
package ru.sample.qiwi.soap.cre2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * ��� ��������� ������ �������� ��� �������
 * 
 * <p>Java class for PersonRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonRequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="applicantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pastLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pastFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pastMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="applicationStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="defaultStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="placeOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="scndIdType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scndIdSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scndIdNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scndIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scndIssueLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scndIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pastIdType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pastIdSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pastIdNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pastIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pastIssueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pastIssueLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pastIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numChildren" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="education" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="inn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pfNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driverNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobilePhone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrDistrictType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="actAddrDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrCityType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="actAddrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrSettlementType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="actAddrSettlement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrStreetType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="actAddrStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrStructure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrFlat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actAddrMonths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="regAddrCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrDistrictType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="regAddrDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrCityType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="regAddrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrSettlementType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="regAddrSettlement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrStreetType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="regAddrStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrStructure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrFlat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddrPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workPhone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empFirmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empEngName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empOgrn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empInn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empBusinessIndustry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empDistrictType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="empDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empCityType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="empCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empSettlementType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="empSettlement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empStreetType" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}addrPrefixType" minOccurs="0"/>
 *         &lt;element name="empStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empStructure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empApartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empRestrFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empRestrShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empRestrFirmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empRestrEngName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empRestrInn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occupationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monthlyDocIncome" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="incomeProof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monthlyUndocIncome" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="profession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purposeOfFinance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tradeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="originalChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="downPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finalPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextPmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pmtFreq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collateralExistence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collateralValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaseExistence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaseValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaseModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posSettlement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posStructure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posApartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carRegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newApplicant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="relationship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="consentEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="consentPurpose" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consentPurposeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consentUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationWay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fraudStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fraudStatuses" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}FraudStatuses" minOccurs="0"/>
 *         &lt;element name="photo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="photoDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="photoComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fraudStatusText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonRequestData", propOrder = {

})
public class PersonRequestData {

    protected String applicantId;
    @XmlElementRef(name = "lastName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastName;
    @XmlElementRef(name = "firstName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "middleName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> middleName;
    @XmlElementRef(name = "pastLastName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pastLastName;
    @XmlElementRef(name = "pastFirstName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pastFirstName;
    @XmlElementRef(name = "pastMiddleName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pastMiddleName;
    @XmlElementRef(name = "spouseLastName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spouseLastName;
    @XmlElementRef(name = "spouseFirstName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spouseFirstName;
    @XmlElementRef(name = "spouseMiddleName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spouseMiddleName;
    @XmlElementRef(name = "spouseDateOfBirth", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> spouseDateOfBirth;
    @XmlElementRef(name = "applicationStatus", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> applicationStatus;
    @XmlElementRef(name = "defaultStatus", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> defaultStatus;
    @XmlElementRef(name = "sex", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sex;
    @XmlElementRef(name = "dateOfBirth", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateOfBirth;
    @XmlElementRef(name = "placeOfBirth", type = JAXBElement.class, required = false)
    protected JAXBElement<String> placeOfBirth;
    @XmlElementRef(name = "idType", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idType;
    @XmlElementRef(name = "idSeries", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idSeries;
    @XmlElementRef(name = "idNum", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idNum;
    @XmlElementRef(name = "issueAuthority", type = JAXBElement.class, required = false)
    protected JAXBElement<String> issueAuthority;
    @XmlElementRef(name = "issueCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> issueCode;
    @XmlElementRef(name = "issueLocation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> issueLocation;
    @XmlElementRef(name = "issueDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> issueDate;
    @XmlElementRef(name = "scndIdType", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scndIdType;
    @XmlElementRef(name = "scndIdSeries", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scndIdSeries;
    @XmlElementRef(name = "scndIdNum", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scndIdNum;
    @XmlElementRef(name = "scndIssueAuthority", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scndIssueAuthority;
    @XmlElementRef(name = "scndIssueLocation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scndIssueLocation;
    @XmlElementRef(name = "scndIssueDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> scndIssueDate;
    @XmlElementRef(name = "pastIdType", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pastIdType;
    @XmlElementRef(name = "pastIdSeries", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pastIdSeries;
    @XmlElementRef(name = "pastIdNum", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pastIdNum;
    @XmlElementRef(name = "pastIssueAuthority", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pastIssueAuthority;
    @XmlElementRef(name = "pastIssueCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pastIssueCode;
    @XmlElementRef(name = "pastIssueLocation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pastIssueLocation;
    @XmlElementRef(name = "pastIssueDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> pastIssueDate;
    @XmlElementRef(name = "numChildren", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numChildren;
    @XmlElementRef(name = "education", type = JAXBElement.class, required = false)
    protected JAXBElement<String> education;
    @XmlElementRef(name = "companyName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyName;
    @XmlElementRef(name = "regDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> regDate;
    @XmlElementRef(name = "inn", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inn;
    @XmlElementRef(name = "pfNum", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pfNum;
    @XmlElementRef(name = "nationality", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nationality;
    @XmlElementRef(name = "maritalStatus", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maritalStatus;
    @XmlElementRef(name = "driverNo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> driverNo;
    @XmlElementRef(name = "email", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "homePhone", type = JAXBElement.class, required = false)
    protected JAXBElement<String> homePhone;
    @XmlElementRef(name = "mobilePhone", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobilePhone;
    @XmlElementRef(name = "mobilePhone2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobilePhone2;
    @XmlElementRef(name = "actAddrCountry", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrCountry;
    @XmlElementRef(name = "actAddrPostal", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrPostal;
    @XmlElementRef(name = "actAddrRegion", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrRegion;
    protected String actAddrDistrictType;
    @XmlElementRef(name = "actAddrDistrict", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrDistrict;
    protected String actAddrCityType;
    @XmlElementRef(name = "actAddrCity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrCity;
    protected String actAddrSettlementType;
    @XmlElementRef(name = "actAddrSettlement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrSettlement;
    protected String actAddrStreetType;
    @XmlElementRef(name = "actAddrStreet", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrStreet;
    @XmlElementRef(name = "actAddrHouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrHouse;
    @XmlElementRef(name = "actAddrBuilding", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrBuilding;
    @XmlElementRef(name = "actAddrStructure", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrStructure;
    @XmlElementRef(name = "actAddrFlat", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actAddrFlat;
    @XmlElementRef(name = "actAddrMonths", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> actAddrMonths;
    @XmlElementRef(name = "regAddrCountry", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrCountry;
    @XmlElementRef(name = "regAddrPostal", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrPostal;
    @XmlElementRef(name = "regAddrRegion", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrRegion;
    protected String regAddrDistrictType;
    @XmlElementRef(name = "regAddrDistrict", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrDistrict;
    protected String regAddrCityType;
    @XmlElementRef(name = "regAddrCity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrCity;
    protected String regAddrSettlementType;
    @XmlElementRef(name = "regAddrSettlement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrSettlement;
    protected String regAddrStreetType;
    @XmlElementRef(name = "regAddrStreet", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrStreet;
    @XmlElementRef(name = "regAddrHouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrHouse;
    @XmlElementRef(name = "regAddrBuilding", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrBuilding;
    @XmlElementRef(name = "regAddrStructure", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrStructure;
    @XmlElementRef(name = "regAddrFlat", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrFlat;
    @XmlElementRef(name = "regAddrPhone", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regAddrPhone;
    @XmlElementRef(name = "workPhone", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workPhone;
    @XmlElementRef(name = "workPhone2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workPhone2;
    @XmlElementRef(name = "empFullName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empFullName;
    @XmlElementRef(name = "empShortName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empShortName;
    @XmlElementRef(name = "empFirmName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empFirmName;
    @XmlElementRef(name = "empEngName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empEngName;
    @XmlElementRef(name = "empOgrn", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empOgrn;
    @XmlElementRef(name = "empInn", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empInn;
    @XmlElementRef(name = "empPhone", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empPhone;
    @XmlElementRef(name = "empSize", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empSize;
    @XmlElementRef(name = "empBusinessIndustry", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empBusinessIndustry;
    @XmlElementRef(name = "empCountry", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empCountry;
    @XmlElementRef(name = "empPostal", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empPostal;
    @XmlElementRef(name = "empRegion", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empRegion;
    protected String empDistrictType;
    @XmlElementRef(name = "empDistrict", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empDistrict;
    protected String empCityType;
    @XmlElementRef(name = "empCity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empCity;
    protected String empSettlementType;
    @XmlElementRef(name = "empSettlement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empSettlement;
    protected String empStreetType;
    @XmlElementRef(name = "empStreet", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empStreet;
    @XmlElementRef(name = "empHouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empHouse;
    @XmlElementRef(name = "empBuilding", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empBuilding;
    @XmlElementRef(name = "empStructure", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empStructure;
    @XmlElementRef(name = "empApartment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empApartment;
    @XmlElementRef(name = "empRestrFullName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empRestrFullName;
    @XmlElementRef(name = "empRestrShortName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empRestrShortName;
    @XmlElementRef(name = "empRestrFirmName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empRestrFirmName;
    @XmlElementRef(name = "empRestrEngName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empRestrEngName;
    @XmlElementRef(name = "empRestrInn", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empRestrInn;
    @XmlElementRef(name = "current", type = JAXBElement.class, required = false)
    protected JAXBElement<String> current;
    @XmlElementRef(name = "position", type = JAXBElement.class, required = false)
    protected JAXBElement<String> position;
    @XmlElementRef(name = "occupationType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> occupationType;
    @XmlElementRef(name = "monthlyDocIncome", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> monthlyDocIncome;
    @XmlElementRef(name = "incomeProof", type = JAXBElement.class, required = false)
    protected JAXBElement<String> incomeProof;
    @XmlElementRef(name = "monthlyUndocIncome", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> monthlyUndocIncome;
    @XmlElementRef(name = "profession", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profession;
    @XmlElementRef(name = "workDuration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workDuration;
    @XmlElementRef(name = "reason", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reason;
    @XmlElementRef(name = "purposeOfFinance", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> purposeOfFinance;
    @XmlElementRef(name = "productName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productName;
    @XmlElementRef(name = "tradeDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> tradeDate;
    @XmlElementRef(name = "amount", type = JAXBElement.class, required = false)
    protected JAXBElement<String> amount;
    @XmlElementRef(name = "creditLimit", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditLimit;
    @XmlElementRef(name = "currency", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency;
    @XmlElementRef(name = "credDuration", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> credDuration;
    @XmlElementRef(name = "originalChannel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalChannel;
    @XmlElementRef(name = "downPaymentAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<String> downPaymentAmount;
    @XmlElementRef(name = "finalPaymentAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<String> finalPaymentAmount;
    @XmlElementRef(name = "nextPmt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nextPmt;
    @XmlElementRef(name = "pmtFreq", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pmtFreq;
    @XmlElementRef(name = "collateralExistence", type = JAXBElement.class, required = false)
    protected JAXBElement<String> collateralExistence;
    @XmlElementRef(name = "collateralValue", type = JAXBElement.class, required = false)
    protected JAXBElement<String> collateralValue;
    @XmlElementRef(name = "purchaseExistence", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purchaseExistence;
    @XmlElementRef(name = "purchaseValue", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purchaseValue;
    @XmlElementRef(name = "purchaseModel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purchaseModel;
    @XmlElementRef(name = "posCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posCode;
    @XmlElementRef(name = "posPhone", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posPhone;
    @XmlElementRef(name = "posCountry", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posCountry;
    @XmlElementRef(name = "posPostal", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posPostal;
    @XmlElementRef(name = "posDistrict", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posDistrict;
    @XmlElementRef(name = "posRegion", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posRegion;
    @XmlElementRef(name = "posCity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posCity;
    @XmlElementRef(name = "posSettlement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posSettlement;
    @XmlElementRef(name = "posStreet", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posStreet;
    @XmlElementRef(name = "posHouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posHouse;
    @XmlElementRef(name = "posBuilding", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posBuilding;
    @XmlElementRef(name = "posStructure", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posStructure;
    @XmlElementRef(name = "posApartment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posApartment;
    @XmlElementRef(name = "carRegNo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> carRegNo;
    @XmlElementRef(name = "vin", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vin;
    @XmlElementRef(name = "newApplicant", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newApplicant;
    @XmlElementRef(name = "exp", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> exp;
    @XmlElementRef(name = "relationship", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relationship;
    @XmlElementRef(name = "consent", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consent;
    @XmlElementRef(name = "consentDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> consentDate;
    @XmlElementRef(name = "consentEndDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> consentEndDate;
    @XmlElementRef(name = "consentPurpose", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> consentPurpose;
    @XmlElementRef(name = "consentPurposeText", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consentPurposeText;
    @XmlElementRef(name = "consentUser", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consentUser;
    @XmlElementRef(name = "applicationWay", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> applicationWay;
    @XmlElementRef(name = "category", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> category;
    @XmlElementRef(name = "format", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> format;
    protected Integer fraudStatus;
    protected FraudStatuses fraudStatuses;
    @XmlElementRef(name = "photo", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> photo;
    @XmlElementRef(name = "photoDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> photoDate;
    @XmlElementRef(name = "photoComment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> photoComment;
    protected String fraudStatusText;

    /**
     * Gets the value of the applicantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantId() {
        return applicantId;
    }

    /**
     * Sets the value of the applicantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantId(String value) {
        this.applicantId = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiddleName(JAXBElement<String> value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the pastLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPastLastName() {
        return pastLastName;
    }

    /**
     * Sets the value of the pastLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPastLastName(JAXBElement<String> value) {
        this.pastLastName = value;
    }

    /**
     * Gets the value of the pastFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPastFirstName() {
        return pastFirstName;
    }

    /**
     * Sets the value of the pastFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPastFirstName(JAXBElement<String> value) {
        this.pastFirstName = value;
    }

    /**
     * Gets the value of the pastMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPastMiddleName() {
        return pastMiddleName;
    }

    /**
     * Sets the value of the pastMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPastMiddleName(JAXBElement<String> value) {
        this.pastMiddleName = value;
    }

    /**
     * Gets the value of the spouseLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpouseLastName() {
        return spouseLastName;
    }

    /**
     * Sets the value of the spouseLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpouseLastName(JAXBElement<String> value) {
        this.spouseLastName = value;
    }

    /**
     * Gets the value of the spouseFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpouseFirstName() {
        return spouseFirstName;
    }

    /**
     * Sets the value of the spouseFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpouseFirstName(JAXBElement<String> value) {
        this.spouseFirstName = value;
    }

    /**
     * Gets the value of the spouseMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpouseMiddleName() {
        return spouseMiddleName;
    }

    /**
     * Sets the value of the spouseMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpouseMiddleName(JAXBElement<String> value) {
        this.spouseMiddleName = value;
    }

    /**
     * Gets the value of the spouseDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSpouseDateOfBirth() {
        return spouseDateOfBirth;
    }

    /**
     * Sets the value of the spouseDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSpouseDateOfBirth(JAXBElement<XMLGregorianCalendar> value) {
        this.spouseDateOfBirth = value;
    }

    /**
     * Gets the value of the applicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getApplicationStatus() {
        return applicationStatus;
    }

    /**
     * Sets the value of the applicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setApplicationStatus(JAXBElement<Integer> value) {
        this.applicationStatus = value;
    }

    /**
     * Gets the value of the defaultStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDefaultStatus() {
        return defaultStatus;
    }

    /**
     * Sets the value of the defaultStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDefaultStatus(JAXBElement<Integer> value) {
        this.defaultStatus = value;
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
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateOfBirth(JAXBElement<XMLGregorianCalendar> value) {
        this.dateOfBirth = value;
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
     * Gets the value of the issueCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIssueCode() {
        return issueCode;
    }

    /**
     * Sets the value of the issueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIssueCode(JAXBElement<String> value) {
        this.issueCode = value;
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
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setIssueDate(JAXBElement<XMLGregorianCalendar> value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the scndIdType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScndIdType() {
        return scndIdType;
    }

    /**
     * Sets the value of the scndIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScndIdType(JAXBElement<Integer> value) {
        this.scndIdType = value;
    }

    /**
     * Gets the value of the scndIdSeries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScndIdSeries() {
        return scndIdSeries;
    }

    /**
     * Sets the value of the scndIdSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScndIdSeries(JAXBElement<String> value) {
        this.scndIdSeries = value;
    }

    /**
     * Gets the value of the scndIdNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScndIdNum() {
        return scndIdNum;
    }

    /**
     * Sets the value of the scndIdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScndIdNum(JAXBElement<String> value) {
        this.scndIdNum = value;
    }

    /**
     * Gets the value of the scndIssueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScndIssueAuthority() {
        return scndIssueAuthority;
    }

    /**
     * Sets the value of the scndIssueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScndIssueAuthority(JAXBElement<String> value) {
        this.scndIssueAuthority = value;
    }

    /**
     * Gets the value of the scndIssueLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScndIssueLocation() {
        return scndIssueLocation;
    }

    /**
     * Sets the value of the scndIssueLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScndIssueLocation(JAXBElement<String> value) {
        this.scndIssueLocation = value;
    }

    /**
     * Gets the value of the scndIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getScndIssueDate() {
        return scndIssueDate;
    }

    /**
     * Sets the value of the scndIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setScndIssueDate(JAXBElement<XMLGregorianCalendar> value) {
        this.scndIssueDate = value;
    }

    /**
     * Gets the value of the pastIdType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPastIdType() {
        return pastIdType;
    }

    /**
     * Sets the value of the pastIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPastIdType(JAXBElement<Integer> value) {
        this.pastIdType = value;
    }

    /**
     * Gets the value of the pastIdSeries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPastIdSeries() {
        return pastIdSeries;
    }

    /**
     * Sets the value of the pastIdSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPastIdSeries(JAXBElement<String> value) {
        this.pastIdSeries = value;
    }

    /**
     * Gets the value of the pastIdNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPastIdNum() {
        return pastIdNum;
    }

    /**
     * Sets the value of the pastIdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPastIdNum(JAXBElement<String> value) {
        this.pastIdNum = value;
    }

    /**
     * Gets the value of the pastIssueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPastIssueAuthority() {
        return pastIssueAuthority;
    }

    /**
     * Sets the value of the pastIssueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPastIssueAuthority(JAXBElement<String> value) {
        this.pastIssueAuthority = value;
    }

    /**
     * Gets the value of the pastIssueCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPastIssueCode() {
        return pastIssueCode;
    }

    /**
     * Sets the value of the pastIssueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPastIssueCode(JAXBElement<String> value) {
        this.pastIssueCode = value;
    }

    /**
     * Gets the value of the pastIssueLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPastIssueLocation() {
        return pastIssueLocation;
    }

    /**
     * Sets the value of the pastIssueLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPastIssueLocation(JAXBElement<String> value) {
        this.pastIssueLocation = value;
    }

    /**
     * Gets the value of the pastIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPastIssueDate() {
        return pastIssueDate;
    }

    /**
     * Sets the value of the pastIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPastIssueDate(JAXBElement<XMLGregorianCalendar> value) {
        this.pastIssueDate = value;
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
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaritalStatus(JAXBElement<String> value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the driverNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDriverNo() {
        return driverNo;
    }

    /**
     * Sets the value of the driverNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDriverNo(JAXBElement<String> value) {
        this.driverNo = value;
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
     * Gets the value of the mobilePhone2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobilePhone2() {
        return mobilePhone2;
    }

    /**
     * Sets the value of the mobilePhone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobilePhone2(JAXBElement<String> value) {
        this.mobilePhone2 = value;
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
     *     {@link String }
     *     
     */
    public String getActAddrDistrictType() {
        return actAddrDistrictType;
    }

    /**
     * Sets the value of the actAddrDistrictType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActAddrDistrictType(String value) {
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
     *     {@link String }
     *     
     */
    public String getActAddrCityType() {
        return actAddrCityType;
    }

    /**
     * Sets the value of the actAddrCityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActAddrCityType(String value) {
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
     *     {@link String }
     *     
     */
    public String getActAddrSettlementType() {
        return actAddrSettlementType;
    }

    /**
     * Sets the value of the actAddrSettlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActAddrSettlementType(String value) {
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
     *     {@link String }
     *     
     */
    public String getActAddrStreetType() {
        return actAddrStreetType;
    }

    /**
     * Sets the value of the actAddrStreetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActAddrStreetType(String value) {
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
     *     {@link String }
     *     
     */
    public String getRegAddrDistrictType() {
        return regAddrDistrictType;
    }

    /**
     * Sets the value of the regAddrDistrictType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddrDistrictType(String value) {
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
     *     {@link String }
     *     
     */
    public String getRegAddrCityType() {
        return regAddrCityType;
    }

    /**
     * Sets the value of the regAddrCityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddrCityType(String value) {
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
     *     {@link String }
     *     
     */
    public String getRegAddrSettlementType() {
        return regAddrSettlementType;
    }

    /**
     * Sets the value of the regAddrSettlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddrSettlementType(String value) {
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
     *     {@link String }
     *     
     */
    public String getRegAddrStreetType() {
        return regAddrStreetType;
    }

    /**
     * Sets the value of the regAddrStreetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddrStreetType(String value) {
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
     * Gets the value of the regAddrPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAddrPhone() {
        return regAddrPhone;
    }

    /**
     * Sets the value of the regAddrPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAddrPhone(JAXBElement<String> value) {
        this.regAddrPhone = value;
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
     * Gets the value of the workPhone2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkPhone2() {
        return workPhone2;
    }

    /**
     * Sets the value of the workPhone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkPhone2(JAXBElement<String> value) {
        this.workPhone2 = value;
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
     * Gets the value of the empSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpSize() {
        return empSize;
    }

    /**
     * Sets the value of the empSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpSize(JAXBElement<String> value) {
        this.empSize = value;
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
     *     {@link String }
     *     
     */
    public String getEmpDistrictType() {
        return empDistrictType;
    }

    /**
     * Sets the value of the empDistrictType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpDistrictType(String value) {
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
     *     {@link String }
     *     
     */
    public String getEmpCityType() {
        return empCityType;
    }

    /**
     * Sets the value of the empCityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpCityType(String value) {
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
     *     {@link String }
     *     
     */
    public String getEmpSettlementType() {
        return empSettlementType;
    }

    /**
     * Sets the value of the empSettlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpSettlementType(String value) {
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
     *     {@link String }
     *     
     */
    public String getEmpStreetType() {
        return empStreetType;
    }

    /**
     * Sets the value of the empStreetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpStreetType(String value) {
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
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosition(JAXBElement<String> value) {
        this.position = value;
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
     * Gets the value of the incomeProof property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIncomeProof() {
        return incomeProof;
    }

    /**
     * Sets the value of the incomeProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIncomeProof(JAXBElement<String> value) {
        this.incomeProof = value;
    }

    /**
     * Gets the value of the monthlyUndocIncome property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMonthlyUndocIncome() {
        return monthlyUndocIncome;
    }

    /**
     * Sets the value of the monthlyUndocIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMonthlyUndocIncome(JAXBElement<Integer> value) {
        this.monthlyUndocIncome = value;
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
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductName(JAXBElement<String> value) {
        this.productName = value;
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
     * Gets the value of the credDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCredDuration() {
        return credDuration;
    }

    /**
     * Sets the value of the credDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCredDuration(JAXBElement<Integer> value) {
        this.credDuration = value;
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
     * Gets the value of the nextPmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNextPmt() {
        return nextPmt;
    }

    /**
     * Sets the value of the nextPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNextPmt(JAXBElement<String> value) {
        this.nextPmt = value;
    }

    /**
     * Gets the value of the pmtFreq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPmtFreq() {
        return pmtFreq;
    }

    /**
     * Sets the value of the pmtFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPmtFreq(JAXBElement<String> value) {
        this.pmtFreq = value;
    }

    /**
     * Gets the value of the collateralExistence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCollateralExistence() {
        return collateralExistence;
    }

    /**
     * Sets the value of the collateralExistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCollateralExistence(JAXBElement<String> value) {
        this.collateralExistence = value;
    }

    /**
     * Gets the value of the collateralValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCollateralValue() {
        return collateralValue;
    }

    /**
     * Sets the value of the collateralValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCollateralValue(JAXBElement<String> value) {
        this.collateralValue = value;
    }

    /**
     * Gets the value of the purchaseExistence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPurchaseExistence() {
        return purchaseExistence;
    }

    /**
     * Sets the value of the purchaseExistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPurchaseExistence(JAXBElement<String> value) {
        this.purchaseExistence = value;
    }

    /**
     * Gets the value of the purchaseValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPurchaseValue() {
        return purchaseValue;
    }

    /**
     * Sets the value of the purchaseValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPurchaseValue(JAXBElement<String> value) {
        this.purchaseValue = value;
    }

    /**
     * Gets the value of the purchaseModel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPurchaseModel() {
        return purchaseModel;
    }

    /**
     * Sets the value of the purchaseModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPurchaseModel(JAXBElement<String> value) {
        this.purchaseModel = value;
    }

    /**
     * Gets the value of the posCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosCode() {
        return posCode;
    }

    /**
     * Sets the value of the posCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosCode(JAXBElement<String> value) {
        this.posCode = value;
    }

    /**
     * Gets the value of the posPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosPhone() {
        return posPhone;
    }

    /**
     * Sets the value of the posPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosPhone(JAXBElement<String> value) {
        this.posPhone = value;
    }

    /**
     * Gets the value of the posCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosCountry() {
        return posCountry;
    }

    /**
     * Sets the value of the posCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosCountry(JAXBElement<String> value) {
        this.posCountry = value;
    }

    /**
     * Gets the value of the posPostal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosPostal() {
        return posPostal;
    }

    /**
     * Sets the value of the posPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosPostal(JAXBElement<String> value) {
        this.posPostal = value;
    }

    /**
     * Gets the value of the posDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosDistrict() {
        return posDistrict;
    }

    /**
     * Sets the value of the posDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosDistrict(JAXBElement<String> value) {
        this.posDistrict = value;
    }

    /**
     * Gets the value of the posRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosRegion() {
        return posRegion;
    }

    /**
     * Sets the value of the posRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosRegion(JAXBElement<String> value) {
        this.posRegion = value;
    }

    /**
     * Gets the value of the posCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosCity() {
        return posCity;
    }

    /**
     * Sets the value of the posCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosCity(JAXBElement<String> value) {
        this.posCity = value;
    }

    /**
     * Gets the value of the posSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosSettlement() {
        return posSettlement;
    }

    /**
     * Sets the value of the posSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosSettlement(JAXBElement<String> value) {
        this.posSettlement = value;
    }

    /**
     * Gets the value of the posStreet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosStreet() {
        return posStreet;
    }

    /**
     * Sets the value of the posStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosStreet(JAXBElement<String> value) {
        this.posStreet = value;
    }

    /**
     * Gets the value of the posHouse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosHouse() {
        return posHouse;
    }

    /**
     * Sets the value of the posHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosHouse(JAXBElement<String> value) {
        this.posHouse = value;
    }

    /**
     * Gets the value of the posBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosBuilding() {
        return posBuilding;
    }

    /**
     * Sets the value of the posBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosBuilding(JAXBElement<String> value) {
        this.posBuilding = value;
    }

    /**
     * Gets the value of the posStructure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosStructure() {
        return posStructure;
    }

    /**
     * Sets the value of the posStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosStructure(JAXBElement<String> value) {
        this.posStructure = value;
    }

    /**
     * Gets the value of the posApartment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosApartment() {
        return posApartment;
    }

    /**
     * Sets the value of the posApartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosApartment(JAXBElement<String> value) {
        this.posApartment = value;
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
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelationship(JAXBElement<String> value) {
        this.relationship = value;
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
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getConsentDate() {
        return consentDate;
    }

    /**
     * Sets the value of the consentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setConsentDate(JAXBElement<XMLGregorianCalendar> value) {
        this.consentDate = value;
    }

    /**
     * Gets the value of the consentEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getConsentEndDate() {
        return consentEndDate;
    }

    /**
     * Sets the value of the consentEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setConsentEndDate(JAXBElement<XMLGregorianCalendar> value) {
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
     * Gets the value of the fraudStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFraudStatus() {
        return fraudStatus;
    }

    /**
     * Sets the value of the fraudStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFraudStatus(Integer value) {
        this.fraudStatus = value;
    }

    /**
     * Gets the value of the fraudStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link FraudStatuses }
     *     
     */
    public FraudStatuses getFraudStatuses() {
        return fraudStatuses;
    }

    /**
     * Sets the value of the fraudStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudStatuses }
     *     
     */
    public void setFraudStatuses(FraudStatuses value) {
        this.fraudStatuses = value;
    }

    /**
     * Gets the value of the photo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getPhoto() {
        return photo;
    }

    /**
     * Sets the value of the photo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setPhoto(JAXBElement<byte[]> value) {
        this.photo = value;
    }

    /**
     * Gets the value of the photoDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPhotoDate() {
        return photoDate;
    }

    /**
     * Sets the value of the photoDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPhotoDate(JAXBElement<XMLGregorianCalendar> value) {
        this.photoDate = value;
    }

    /**
     * Gets the value of the photoComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhotoComment() {
        return photoComment;
    }

    /**
     * Sets the value of the photoComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhotoComment(JAXBElement<String> value) {
        this.photoComment = value;
    }

    /**
     * Gets the value of the fraudStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudStatusText() {
        return fraudStatusText;
    }

    /**
     * Sets the value of the fraudStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudStatusText(String value) {
        this.fraudStatusText = value;
    }

}
