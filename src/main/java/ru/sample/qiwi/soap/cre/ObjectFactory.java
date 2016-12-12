
package ru.sample.qiwi.soap.cre;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.sample.qiwi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResponseId_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "responseId");
    private final static QName _GetStatReportout_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "getStatReportout");
    private final static QName _ConnectorException_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "ConnectorException");
    private final static QName _GetExpansionScoreout_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "getExpansionScoreout");
    private final static QName _SubRequestCodes_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "subRequestCodes");
    private final static QName _Password_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "password");
    private final static QName _BusinessRequest_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "businessRequest");
    private final static QName _Uid_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "uid");
    private final static QName _SubRequestCode_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "subRequestCode");
    private final static QName _Login_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "login");
    private final static QName _CacheUse_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "cacheUse");
    private final static QName _UidApplication_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "uidApplication");
    private final static QName _GetSubjectDataout_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "getSubjectDataout");
    private final static QName _GetPersonout_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "getPersonout");
    private final static QName _GetCollateralAutoout_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "getCollateralAutoout");
    private final static QName _PersonRequest_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "personRequest");
    private final static QName _GetBusinessout_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "getBusinessout");
    private final static QName _ExpansionScoreRequest_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "expansionScoreRequest");
    private final static QName _CollateralAutoRequest_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "collateralAutoRequest");
    private final static QName _ConnectorCode_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "connectorCode");
    private final static QName _StatReportRequest_QNAME = new QName("http://creditregistry.ru/2007/webservice/ConnectorService", "statReportRequest");
    private final static QName _ConnectorPersonRequestEducation_QNAME = new QName("http://connector.xws.mbtc.ru", "education");
    private final static QName _ConnectorPersonRequestActAddrBuilding_QNAME = new QName("http://connector.xws.mbtc.ru", "actAddrBuilding");
    private final static QName _ConnectorPersonRequestReason_QNAME = new QName("http://connector.xws.mbtc.ru", "reason");
    private final static QName _ConnectorPersonRequestEmpRestrFirmName_QNAME = new QName("http://connector.xws.mbtc.ru", "empRestrFirmName");
    private final static QName _ConnectorPersonRequestRegAddrRegion_QNAME = new QName("http://connector.xws.mbtc.ru", "regAddrRegion");
    private final static QName _ConnectorPersonRequestEmpBusinessIndustry_QNAME = new QName("http://connector.xws.mbtc.ru", "empBusinessIndustry");
    private final static QName _ConnectorPersonRequestActAddrCityType_QNAME = new QName("http://connector.xws.mbtc.ru", "actAddrCityType");
    private final static QName _ConnectorPersonRequestActAddrSettlement_QNAME = new QName("http://connector.xws.mbtc.ru", "actAddrSettlement");
    private final static QName _ConnectorPersonRequestEmpPhone_QNAME = new QName("http://connector.xws.mbtc.ru", "empPhone");
    private final static QName _ConnectorPersonRequestOccupationType_QNAME = new QName("http://connector.xws.mbtc.ru", "occupationType");
    private final static QName _ConnectorPersonRequestEmpShortName_QNAME = new QName("http://connector.xws.mbtc.ru", "empShortName");
    private final static QName _ConnectorPersonRequestEmpRestrShortName_QNAME = new QName("http://connector.xws.mbtc.ru", "empRestrShortName");
    private final static QName _ConnectorPersonRequestVin_QNAME = new QName("http://connector.xws.mbtc.ru", "vin");
    private final static QName _ConnectorPersonRequestModel_QNAME = new QName("http://connector.xws.mbtc.ru", "model");
    private final static QName _ConnectorPersonRequestNumChildren_QNAME = new QName("http://connector.xws.mbtc.ru", "numChildren");
    private final static QName _ConnectorPersonRequestEmpHouse_QNAME = new QName("http://connector.xws.mbtc.ru", "empHouse");
    private final static QName _ConnectorPersonRequestExp_QNAME = new QName("http://connector.xws.mbtc.ru", "exp");
    private final static QName _ConnectorPersonRequestIdType_QNAME = new QName("http://connector.xws.mbtc.ru", "idType");
    private final static QName _ConnectorPersonRequestEmpSettlementType_QNAME = new QName("http://connector.xws.mbtc.ru", "empSettlementType");
    private final static QName _ConnectorPersonRequestProfession_QNAME = new QName("http://connector.xws.mbtc.ru", "profession");
    private final static QName _ConnectorPersonRequestFinalPaymentAmount_QNAME = new QName("http://connector.xws.mbtc.ru", "finalPaymentAmount");
    private final static QName _ConnectorPersonRequestEmpStructure_QNAME = new QName("http://connector.xws.mbtc.ru", "empStructure");
    private final static QName _ConnectorPersonRequestRegAddrCountry_QNAME = new QName("http://connector.xws.mbtc.ru", "regAddrCountry");
    private final static QName _ConnectorPersonRequestRegAddrCity_QNAME = new QName("http://connector.xws.mbtc.ru", "regAddrCity");
    private final static QName _ConnectorPersonRequestActAddrCountry_QNAME = new QName("http://connector.xws.mbtc.ru", "actAddrCountry");
    private final static QName _ConnectorPersonRequestMobilePhone_QNAME = new QName("http://connector.xws.mbtc.ru", "mobilePhone");
    private final static QName _ConnectorPersonRequestNationality_QNAME = new QName("http://connector.xws.mbtc.ru", "nationality");
    private final static QName _ConnectorPersonRequestCreditReportDetalization_QNAME = new QName("http://connector.xws.mbtc.ru", "creditReportDetalization");
    private final static QName _ConnectorPersonRequestApplicationWay_QNAME = new QName("http://connector.xws.mbtc.ru", "applicationWay");
    private final static QName _ConnectorPersonRequestEmpFullName_QNAME = new QName("http://connector.xws.mbtc.ru", "empFullName");
    private final static QName _ConnectorPersonRequestEmpStreet_QNAME = new QName("http://connector.xws.mbtc.ru", "empStreet");
    private final static QName _ConnectorPersonRequestRegAddrFlat_QNAME = new QName("http://connector.xws.mbtc.ru", "regAddrFlat");
    private final static QName _ConnectorPersonRequestEmpRestrEngName_QNAME = new QName("http://connector.xws.mbtc.ru", "empRestrEngName");
    private final static QName _ConnectorPersonRequestActAddrHouse_QNAME = new QName("http://connector.xws.mbtc.ru", "actAddrHouse");
    private final static QName _ConnectorPersonRequestSubjectCode_QNAME = new QName("http://connector.xws.mbtc.ru", "subjectCode");
    private final static QName _ConnectorPersonRequestRegAddrSettlementType_QNAME = new QName("http://connector.xws.mbtc.ru", "regAddrSettlementType");
    private final static QName _ConnectorPersonRequestPaymentHistory_QNAME = new QName("http://connector.xws.mbtc.ru", "paymentHistory");
    private final static QName _ConnectorPersonRequestEmpCity_QNAME = new QName("http://connector.xws.mbtc.ru", "empCity");
    private final static QName _ConnectorPersonRequestCurrent_QNAME = new QName("http://connector.xws.mbtc.ru", "current");
    private final static QName _ConnectorPersonRequestUid_QNAME = new QName("http://connector.xws.mbtc.ru", "uid");
    private final static QName _ConnectorPersonRequestSurname_QNAME = new QName("http://connector.xws.mbtc.ru", "surname");
    private final static QName _ConnectorPersonRequestCurrency_QNAME = new QName("http://connector.xws.mbtc.ru", "currency");
    private final static QName _ConnectorPersonRequestOriginalChannel_QNAME = new QName("http://connector.xws.mbtc.ru", "originalChannel");
    private final static QName _ConnectorPersonRequestActAddrStreetType_QNAME = new QName("http://connector.xws.mbtc.ru", "actAddrStreetType");
    private final static QName _ConnectorPersonRequestEmpCountry_QNAME = new QName("http://connector.xws.mbtc.ru", "empCountry");
    private final static QName _ConnectorPersonRequestEmail_QNAME = new QName("http://connector.xws.mbtc.ru", "email");
    private final static QName _ConnectorPersonRequestPlaceOfBirth_QNAME = new QName("http://connector.xws.mbtc.ru", "placeOfBirth");
    private final static QName _ConnectorPersonRequestRegAddrStreetType_QNAME = new QName("http://connector.xws.mbtc.ru", "regAddrStreetType");
    private final static QName _ConnectorPersonRequestSex_QNAME = new QName("http://connector.xws.mbtc.ru", "sex");
    private final static QName _ConnectorPersonRequestRegAddrBuilding_QNAME = new QName("http://connector.xws.mbtc.ru", "regAddrBuilding");
    private final static QName _ConnectorPersonRequestActAddrStructure_QNAME = new QName("http://connector.xws.mbtc.ru", "actAddrStructure");
    private final static QName _ConnectorPersonRequestRegAddrStreet_QNAME = new QName("http://connector.xws.mbtc.ru", "regAddrStreet");
    private final static QName _ConnectorPersonRequestRegAddrDistrictType_QNAME = new QName("http://connector.xws.mbtc.ru", "regAddrDistrictType");
    private final static QName _ConnectorPersonRequestConsentPurpose_QNAME = new QName("http://connector.xws.mbtc.ru", "consentPurpose");
    private final static QName _ConnectorPersonRequestActAddrFlat_QNAME = new QName("http://connector.xws.mbtc.ru", "actAddrFlat");
    private final static QName _ConnectorPersonRequestDateOfReport_QNAME = new QName("http://connector.xws.mbtc.ru", "dateOfReport");
    private final static QName _ConnectorPersonRequestDateTimeApplication_QNAME = new QName("http://connector.xws.mbtc.ru", "dateTimeApplication");
    private final static QName _ConnectorPersonRequestEmpSettlement_QNAME = new QName("http://connector.xws.mbtc.ru", "empSettlement");
    private final static QName _ConnectorPersonRequestRequestFor_QNAME = new QName("http://connector.xws.mbtc.ru", "requestFor");
    private final static QName _ConnectorPersonRequestCarRegNo_QNAME = new QName("http://connector.xws.mbtc.ru", "carRegNo");
    private final static QName _ConnectorPersonRequestEmpInn_QNAME = new QName("http://connector.xws.mbtc.ru", "empInn");
    private final static QName _ConnectorPersonRequestEmpEngName_QNAME = new QName("http://connector.xws.mbtc.ru", "empEngName");
    private final static QName _ConnectorPersonRequestActAddrStreet_QNAME = new QName("http://connector.xws.mbtc.ru", "actAddrStreet");
    private final static QName _ConnectorPersonRequestPurposeOfFinance_QNAME = new QName("http://connector.xws.mbtc.ru", "purposeOfFinance");
    private final static QName _ConnectorPersonRequestEmpRegion_QNAME = new QName("http://connector.xws.mbtc.ru", "empRegion");
    private final static QName _ConnectorPersonRequestMonthlyDocIncome_QNAME = new QName("http://connector.xws.mbtc.ru", "monthlyDocIncome");
    private final static QName _ConnectorPersonRequestActAddrCity_QNAME = new QName("http://connector.xws.mbtc.ru", "actAddrCity");
    private final static QName _ConnectorPersonRequestCreditLimit_QNAME = new QName("http://connector.xws.mbtc.ru", "creditLimit");
    private final static QName _ConnectorPersonRequestEmpBuilding_QNAME = new QName("http://connector.xws.mbtc.ru", "empBuilding");
    private final static QName _ConnectorPersonRequestConsentPurposeText_QNAME = new QName("http://connector.xws.mbtc.ru", "consentPurposeText");
    private final static QName _ConnectorPersonRequestIdNum_QNAME = new QName("http://connector.xws.mbtc.ru", "idNum");
    private final static QName _ConnectorPersonRequestEmpApartment_QNAME = new QName("http://connector.xws.mbtc.ru", "empApartment");
    private final static QName _ConnectorPersonRequestRegAddrCityType_QNAME = new QName("http://connector.xws.mbtc.ru", "regAddrCityType");
    private final static QName _ConnectorPersonRequestRegAddrHouse_QNAME = new QName("http://connector.xws.mbtc.ru", "regAddrHouse");
    private final static QName _ConnectorPersonRequestHomePhone_QNAME = new QName("http://connector.xws.mbtc.ru", "homePhone");
    private final static QName _ConnectorPersonRequestActAddrDistrict_QNAME = new QName("http://connector.xws.mbtc.ru", "actAddrDistrict");
    private final static QName _ConnectorPersonRequestEmpRestrFullName_QNAME = new QName("http://connector.xws.mbtc.ru", "empRestrFullName");
    private final static QName _ConnectorPersonRequestFormat_QNAME = new QName("http://connector.xws.mbtc.ru", "format");
    private final static QName _ConnectorPersonRequestIssueLocation_QNAME = new QName("http://connector.xws.mbtc.ru", "issueLocation");
    private final static QName _ConnectorPersonRequestEmpDistrictType_QNAME = new QName("http://connector.xws.mbtc.ru", "empDistrictType");
    private final static QName _ConnectorPersonRequestConsent_QNAME = new QName("http://connector.xws.mbtc.ru", "consent");
    private final static QName _ConnectorPersonRequestMaritalStatus_QNAME = new QName("http://connector.xws.mbtc.ru", "maritalStatus");
    private final static QName _ConnectorPersonRequestEmpCityType_QNAME = new QName("http://connector.xws.mbtc.ru", "empCityType");
    private final static QName _ConnectorPersonRequestIdSeries_QNAME = new QName("http://connector.xws.mbtc.ru", "idSeries");
    private final static QName _ConnectorPersonRequestFirstname_QNAME = new QName("http://connector.xws.mbtc.ru", "firstname");
    private final static QName _ConnectorPersonRequestRegAddrSettlement_QNAME = new QName("http://connector.xws.mbtc.ru", "regAddrSettlement");
    private final static QName _ConnectorPersonRequestDownPaymentAmount_QNAME = new QName("http://connector.xws.mbtc.ru", "downPaymentAmount");
    private final static QName _ConnectorPersonRequestRegAddrStructure_QNAME = new QName("http://connector.xws.mbtc.ru", "regAddrStructure");
    private final static QName _ConnectorPersonRequestRegDate_QNAME = new QName("http://connector.xws.mbtc.ru", "regDate");
    private final static QName _ConnectorPersonRequestRegAddrDistrict_QNAME = new QName("http://connector.xws.mbtc.ru", "regAddrDistrict");
    private final static QName _ConnectorPersonRequestEmpFirmName_QNAME = new QName("http://connector.xws.mbtc.ru", "empFirmName");
    private final static QName _ConnectorPersonRequestCarYear_QNAME = new QName("http://connector.xws.mbtc.ru", "carYear");
    private final static QName _ConnectorPersonRequestDuration_QNAME = new QName("http://connector.xws.mbtc.ru", "duration");
    private final static QName _ConnectorPersonRequestNewApplicant_QNAME = new QName("http://connector.xws.mbtc.ru", "newApplicant");
    private final static QName _ConnectorPersonRequestMarriage_QNAME = new QName("http://connector.xws.mbtc.ru", "marriage");
    private final static QName _ConnectorPersonRequestEmpOgrn_QNAME = new QName("http://connector.xws.mbtc.ru", "empOgrn");
    private final static QName _ConnectorPersonRequestEmpPostal_QNAME = new QName("http://connector.xws.mbtc.ru", "empPostal");
    private final static QName _ConnectorPersonRequestActAddrPostal_QNAME = new QName("http://connector.xws.mbtc.ru", "actAddrPostal");
    private final static QName _ConnectorPersonRequestAmount_QNAME = new QName("http://connector.xws.mbtc.ru", "amount");
    private final static QName _ConnectorPersonRequestTradeDate_QNAME = new QName("http://connector.xws.mbtc.ru", "tradeDate");
    private final static QName _ConnectorPersonRequestMiddlename_QNAME = new QName("http://connector.xws.mbtc.ru", "middlename");
    private final static QName _ConnectorPersonRequestEmpRestrInn_QNAME = new QName("http://connector.xws.mbtc.ru", "empRestrInn");
    private final static QName _ConnectorPersonRequestPfNum_QNAME = new QName("http://connector.xws.mbtc.ru", "pfNum");
    private final static QName _ConnectorPersonRequestConsentUser_QNAME = new QName("http://connector.xws.mbtc.ru", "consentUser");
    private final static QName _ConnectorPersonRequestInn_QNAME = new QName("http://connector.xws.mbtc.ru", "inn");
    private final static QName _ConnectorPersonRequestWorkDuration_QNAME = new QName("http://connector.xws.mbtc.ru", "workDuration");
    private final static QName _ConnectorPersonRequestIssueAuthority_QNAME = new QName("http://connector.xws.mbtc.ru", "issueAuthority");
    private final static QName _ConnectorPersonRequestActAddrDistrictType_QNAME = new QName("http://connector.xws.mbtc.ru", "actAddrDistrictType");
    private final static QName _ConnectorPersonRequestEmpStreetType_QNAME = new QName("http://connector.xws.mbtc.ru", "empStreetType");
    private final static QName _ConnectorPersonRequestEmpDistrict_QNAME = new QName("http://connector.xws.mbtc.ru", "empDistrict");
    private final static QName _ConnectorPersonRequestRegAddrPostal_QNAME = new QName("http://connector.xws.mbtc.ru", "regAddrPostal");
    private final static QName _ConnectorPersonRequestActAddrRegion_QNAME = new QName("http://connector.xws.mbtc.ru", "actAddrRegion");
    private final static QName _ConnectorPersonRequestWorkPhone_QNAME = new QName("http://connector.xws.mbtc.ru", "workPhone");
    private final static QName _ConnectorPersonRequestActAddrSettlementType_QNAME = new QName("http://connector.xws.mbtc.ru", "actAddrSettlementType");
    private final static QName _ConnectorPersonRequestActAddrMonths_QNAME = new QName("http://connector.xws.mbtc.ru", "actAddrMonths");
    private final static QName _ConnectorPersonRequestCategory_QNAME = new QName("http://connector.xws.mbtc.ru", "category");
    private final static QName _ConnectorCollAutoRequestDocNum_QNAME = new QName("http://collAuto.connector.xws.mbtc.ru", "docNum");
    private final static QName _ConnectorCollAutoRequestEngine_QNAME = new QName("http://collAuto.connector.xws.mbtc.ru", "engine");
    private final static QName _ConnectorCollAutoRequestVin_QNAME = new QName("http://collAuto.connector.xws.mbtc.ru", "vin");
    private final static QName _ConnectorCollAutoRequestChassis_QNAME = new QName("http://collAuto.connector.xws.mbtc.ru", "chassis");
    private final static QName _ConnectorCollAutoRequestBody_QNAME = new QName("http://collAuto.connector.xws.mbtc.ru", "body");
    private final static QName _ConnectorResponseReportCode_QNAME = new QName("http://connector.xws.mbtc.ru", "reportCode");
    private final static QName _ConnectorResponseResponse_QNAME = new QName("http://connector.xws.mbtc.ru", "response");
    private final static QName _ConnectorResponseCacheUse_QNAME = new QName("http://connector.xws.mbtc.ru", "cacheUse");
    private final static QName _ConnectorBusinessRequestCompanyName_QNAME = new QName("http://connector.xws.mbtc.ru", "companyName");
    private final static QName _ConnectorBusinessRequestCaseNumber_QNAME = new QName("http://connector.xws.mbtc.ru", "caseNumber");
    private final static QName _ConnectorBusinessRequestPhone_QNAME = new QName("http://connector.xws.mbtc.ru", "phone");
    private final static QName _ConnectorBusinessRequestLiquidated_QNAME = new QName("http://connector.xws.mbtc.ru", "liquidated");
    private final static QName _ConnectorBusinessRequestEgrn_QNAME = new QName("http://connector.xws.mbtc.ru", "egrn");
    private final static QName _StatReportRequestAccounts_QNAME = new QName("http://statreport.connectors.nbki.ru", "accounts");
    private final static QName _ExpansionScoreRequestNumDependants_QNAME = new QName("http://connector.xws.mbtc.ru", "numDependants");
    private final static QName _ExpansionScoreRequestOccupationStatus_QNAME = new QName("http://connector.xws.mbtc.ru", "occupationStatus");
    private final static QName _ExpansionScoreRequestGender_QNAME = new QName("http://connector.xws.mbtc.ru", "gender");
    private final static QName _ExpansionScoreRequestVerifyPhoneNum_QNAME = new QName("http://connector.xws.mbtc.ru", "verifyPhoneNum");
    private final static QName _ExpansionScoreRequestTotalMonthlyBalance_QNAME = new QName("http://connector.xws.mbtc.ru", "totalMonthlyBalance");
    private final static QName _ExpansionScoreRequestRequestId_QNAME = new QName("http://connector.xws.mbtc.ru", "requestId");
    private final static QName _ExpansionScoreRequestEducationLevel_QNAME = new QName("http://connector.xws.mbtc.ru", "educationLevel");
    private final static QName _ExpansionScoreRequestDurationOfResidence_QNAME = new QName("http://connector.xws.mbtc.ru", "durationOfResidence");
    private final static QName _ExpansionScoreRequestMonthsInProfession_QNAME = new QName("http://connector.xws.mbtc.ru", "monthsInProfession");
    private final static QName _ExpansionScoreRequestTotalMonthlyPayments_QNAME = new QName("http://connector.xws.mbtc.ru", "totalMonthlyPayments");
    private final static QName _ExpansionScoreRequestResidenceStatus_QNAME = new QName("http://connector.xws.mbtc.ru", "residenceStatus");
    private final static QName _ExpansionScoreRequestBankClient_QNAME = new QName("http://connector.xws.mbtc.ru", "bankClient");
    private final static QName _ExpansionScoreRequestMonthsInCurWork_QNAME = new QName("http://connector.xws.mbtc.ru", "monthsInCurWork");
    private final static QName _ConnectorCollAutoResponseUid_QNAME = new QName("http://collAuto.connector.xws.mbtc.ru", "uid");
    private final static QName _ConnectorCollAutoResponseResponse_QNAME = new QName("http://collAuto.connector.xws.mbtc.ru", "response");
    private final static QName _ConnectorCollAutoResponseReportCode_QNAME = new QName("http://collAuto.connector.xws.mbtc.ru", "reportCode");
    private final static QName _StatReportAccountValue_QNAME = new QName("http://statreport.connectors.nbki.ru", "value");
    private final static QName _StatReportAccountMemberCode_QNAME = new QName("http://statreport.connectors.nbki.ru", "memberCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.sample.qiwi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExpansionScoreRequest }
     * 
     */
    public ExpansionScoreRequest createExpansionScoreRequest() {
        return new ExpansionScoreRequest();
    }

    /**
     * Create an instance of {@link SubRequestCodesType }
     * 
     */
    public SubRequestCodesType createSubRequestCodesType() {
        return new SubRequestCodesType();
    }

    /**
     * Create an instance of {@link ConnectorExceptionDetail }
     * 
     */
    public ConnectorExceptionDetail createConnectorExceptionDetail() {
        return new ConnectorExceptionDetail();
    }

    /**
     * Create an instance of {@link ConnectorBusinessRequest }
     * 
     */
    public ConnectorBusinessRequest createConnectorBusinessRequest() {
        return new ConnectorBusinessRequest();
    }

    /**
     * Create an instance of {@link ConnectorPersonRequest }
     * 
     */
    public ConnectorPersonRequest createConnectorPersonRequest() {
        return new ConnectorPersonRequest();
    }

    /**
     * Create an instance of {@link ConnectorResponse }
     * 
     */
    public ConnectorResponse createConnectorResponse() {
        return new ConnectorResponse();
    }

    /**
     * Create an instance of {@link ConnectorCollAutoResponse }
     * 
     */
    public ConnectorCollAutoResponse createConnectorCollAutoResponse() {
        return new ConnectorCollAutoResponse();
    }

    /**
     * Create an instance of {@link ConnectorCollAutoRequest }
     * 
     */
    public ConnectorCollAutoRequest createConnectorCollAutoRequest() {
        return new ConnectorCollAutoRequest();
    }

    /**
     * Create an instance of {@link ArrayOfStatReportAccount }
     * 
     */
    public ArrayOfStatReportAccount createArrayOfStatReportAccount() {
        return new ArrayOfStatReportAccount();
    }

    /**
     * Create an instance of {@link StatReportAccount }
     * 
     */
    public StatReportAccount createStatReportAccount() {
        return new StatReportAccount();
    }

    /**
     * Create an instance of {@link StatReportRequest }
     * 
     */
    public StatReportRequest createStatReportRequest() {
        return new StatReportRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "responseId")
    public JAXBElement<String> createResponseId(String value) {
        return new JAXBElement<String>(_ResponseId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "getStatReportout")
    public JAXBElement<ConnectorResponse> createGetStatReportout(ConnectorResponse value) {
        return new JAXBElement<ConnectorResponse>(_GetStatReportout_QNAME, ConnectorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectorExceptionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "ConnectorException")
    public JAXBElement<ConnectorExceptionDetail> createConnectorException(ConnectorExceptionDetail value) {
        return new JAXBElement<ConnectorExceptionDetail>(_ConnectorException_QNAME, ConnectorExceptionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "getExpansionScoreout")
    public JAXBElement<ConnectorResponse> createGetExpansionScoreout(ConnectorResponse value) {
        return new JAXBElement<ConnectorResponse>(_GetExpansionScoreout_QNAME, ConnectorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubRequestCodesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "subRequestCodes")
    public JAXBElement<SubRequestCodesType> createSubRequestCodes(SubRequestCodesType value) {
        return new JAXBElement<SubRequestCodesType>(_SubRequestCodes_QNAME, SubRequestCodesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectorBusinessRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "businessRequest")
    public JAXBElement<ConnectorBusinessRequest> createBusinessRequest(ConnectorBusinessRequest value) {
        return new JAXBElement<ConnectorBusinessRequest>(_BusinessRequest_QNAME, ConnectorBusinessRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "uid")
    public JAXBElement<String> createUid(String value) {
        return new JAXBElement<String>(_Uid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "subRequestCode")
    public JAXBElement<String> createSubRequestCode(String value) {
        return new JAXBElement<String>(_SubRequestCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "login")
    public JAXBElement<String> createLogin(String value) {
        return new JAXBElement<String>(_Login_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "cacheUse")
    public JAXBElement<Integer> createCacheUse(Integer value) {
        return new JAXBElement<Integer>(_CacheUse_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "uidApplication")
    public JAXBElement<String> createUidApplication(String value) {
        return new JAXBElement<String>(_UidApplication_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "getSubjectDataout")
    public JAXBElement<ConnectorResponse> createGetSubjectDataout(ConnectorResponse value) {
        return new JAXBElement<ConnectorResponse>(_GetSubjectDataout_QNAME, ConnectorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "getPersonout")
    public JAXBElement<ConnectorResponse> createGetPersonout(ConnectorResponse value) {
        return new JAXBElement<ConnectorResponse>(_GetPersonout_QNAME, ConnectorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectorCollAutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "getCollateralAutoout")
    public JAXBElement<ConnectorCollAutoResponse> createGetCollateralAutoout(ConnectorCollAutoResponse value) {
        return new JAXBElement<ConnectorCollAutoResponse>(_GetCollateralAutoout_QNAME, ConnectorCollAutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectorPersonRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "personRequest")
    public JAXBElement<ConnectorPersonRequest> createPersonRequest(ConnectorPersonRequest value) {
        return new JAXBElement<ConnectorPersonRequest>(_PersonRequest_QNAME, ConnectorPersonRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "getBusinessout")
    public JAXBElement<ConnectorResponse> createGetBusinessout(ConnectorResponse value) {
        return new JAXBElement<ConnectorResponse>(_GetBusinessout_QNAME, ConnectorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpansionScoreRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "expansionScoreRequest")
    public JAXBElement<ExpansionScoreRequest> createExpansionScoreRequest(ExpansionScoreRequest value) {
        return new JAXBElement<ExpansionScoreRequest>(_ExpansionScoreRequest_QNAME, ExpansionScoreRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectorCollAutoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "collateralAutoRequest")
    public JAXBElement<ConnectorCollAutoRequest> createCollateralAutoRequest(ConnectorCollAutoRequest value) {
        return new JAXBElement<ConnectorCollAutoRequest>(_CollateralAutoRequest_QNAME, ConnectorCollAutoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "connectorCode")
    public JAXBElement<Integer> createConnectorCode(Integer value) {
        return new JAXBElement<Integer>(_ConnectorCode_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2007/webservice/ConnectorService", name = "statReportRequest")
    public JAXBElement<StatReportRequest> createStatReportRequest(StatReportRequest value) {
        return new JAXBElement<StatReportRequest>(_StatReportRequest_QNAME, StatReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "education", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEducation(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEducation_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrBuilding", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestActAddrBuilding(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrBuilding_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "reason", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestReason(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestReason_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empRestrFirmName", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpRestrFirmName(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpRestrFirmName_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrRegion", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestRegAddrRegion(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrRegion_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empBusinessIndustry", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpBusinessIndustry(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpBusinessIndustry_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrCityType", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestActAddrCityType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrCityType_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrSettlement", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestActAddrSettlement(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrSettlement_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empPhone", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpPhone(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpPhone_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "occupationType", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestOccupationType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestOccupationType_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empShortName", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpShortName(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpShortName_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empRestrShortName", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpRestrShortName(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpRestrShortName_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "vin", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestVin(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestVin_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "model", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestModel(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestModel_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "numChildren", scope = ConnectorPersonRequest.class)
    public JAXBElement<Integer> createConnectorPersonRequestNumChildren(Integer value) {
        return new JAXBElement<Integer>(_ConnectorPersonRequestNumChildren_QNAME, Integer.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empHouse", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpHouse(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpHouse_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "exp", scope = ConnectorPersonRequest.class)
    public JAXBElement<Integer> createConnectorPersonRequestExp(Integer value) {
        return new JAXBElement<Integer>(_ConnectorPersonRequestExp_QNAME, Integer.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "idType", scope = ConnectorPersonRequest.class)
    public JAXBElement<Integer> createConnectorPersonRequestIdType(Integer value) {
        return new JAXBElement<Integer>(_ConnectorPersonRequestIdType_QNAME, Integer.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empSettlementType", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpSettlementType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpSettlementType_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "profession", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestProfession(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestProfession_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "finalPaymentAmount", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestFinalPaymentAmount(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestFinalPaymentAmount_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empStructure", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpStructure(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpStructure_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrCountry", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestRegAddrCountry(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrCountry_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrCity", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestRegAddrCity(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrCity_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrCountry", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestActAddrCountry(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrCountry_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "mobilePhone", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestMobilePhone(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestMobilePhone_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "nationality", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestNationality(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestNationality_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "creditReportDetalization", scope = ConnectorPersonRequest.class)
    public JAXBElement<Integer> createConnectorPersonRequestCreditReportDetalization(Integer value) {
        return new JAXBElement<Integer>(_ConnectorPersonRequestCreditReportDetalization_QNAME, Integer.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "applicationWay", scope = ConnectorPersonRequest.class)
    public JAXBElement<Integer> createConnectorPersonRequestApplicationWay(Integer value) {
        return new JAXBElement<Integer>(_ConnectorPersonRequestApplicationWay_QNAME, Integer.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empFullName", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpFullName(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpFullName_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empStreet", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpStreet(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpStreet_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrFlat", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestRegAddrFlat(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrFlat_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empRestrEngName", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpRestrEngName(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpRestrEngName_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrHouse", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestActAddrHouse(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrHouse_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "subjectCode", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestSubjectCode(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestSubjectCode_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrSettlementType", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestRegAddrSettlementType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrSettlementType_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "paymentHistory", scope = ConnectorPersonRequest.class)
    public JAXBElement<Integer> createConnectorPersonRequestPaymentHistory(Integer value) {
        return new JAXBElement<Integer>(_ConnectorPersonRequestPaymentHistory_QNAME, Integer.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empCity", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpCity(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpCity_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "current", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestCurrent(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestCurrent_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "uid", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestUid(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestUid_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "surname", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestSurname(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestSurname_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "currency", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestCurrency(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestCurrency_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "originalChannel", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestOriginalChannel(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestOriginalChannel_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrStreetType", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestActAddrStreetType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrStreetType_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empCountry", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpCountry(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpCountry_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "email", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmail(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmail_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "placeOfBirth", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestPlaceOfBirth(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestPlaceOfBirth_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrStreetType", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestRegAddrStreetType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrStreetType_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "sex", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestSex(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestSex_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrBuilding", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestRegAddrBuilding(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrBuilding_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrStructure", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestActAddrStructure(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrStructure_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrStreet", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestRegAddrStreet(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrStreet_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrDistrictType", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestRegAddrDistrictType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrDistrictType_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "consentPurpose", scope = ConnectorPersonRequest.class)
    public JAXBElement<Integer> createConnectorPersonRequestConsentPurpose(Integer value) {
        return new JAXBElement<Integer>(_ConnectorPersonRequestConsentPurpose_QNAME, Integer.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrFlat", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestActAddrFlat(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrFlat_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "dateOfReport", scope = ConnectorPersonRequest.class)
    public JAXBElement<XMLGregorianCalendar> createConnectorPersonRequestDateOfReport(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ConnectorPersonRequestDateOfReport_QNAME, XMLGregorianCalendar.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "dateTimeApplication", scope = ConnectorPersonRequest.class)
    public JAXBElement<XMLGregorianCalendar> createConnectorPersonRequestDateTimeApplication(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ConnectorPersonRequestDateTimeApplication_QNAME, XMLGregorianCalendar.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empSettlement", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpSettlement(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpSettlement_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "requestFor", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestRequestFor(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRequestFor_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "carRegNo", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestCarRegNo(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestCarRegNo_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empInn", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpInn(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpInn_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empEngName", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpEngName(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpEngName_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrStreet", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestActAddrStreet(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrStreet_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "purposeOfFinance", scope = ConnectorPersonRequest.class)
    public JAXBElement<Integer> createConnectorPersonRequestPurposeOfFinance(Integer value) {
        return new JAXBElement<Integer>(_ConnectorPersonRequestPurposeOfFinance_QNAME, Integer.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empRegion", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpRegion(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpRegion_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "monthlyDocIncome", scope = ConnectorPersonRequest.class)
    public JAXBElement<Integer> createConnectorPersonRequestMonthlyDocIncome(Integer value) {
        return new JAXBElement<Integer>(_ConnectorPersonRequestMonthlyDocIncome_QNAME, Integer.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrCity", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestActAddrCity(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrCity_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "creditLimit", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestCreditLimit(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestCreditLimit_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empBuilding", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpBuilding(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpBuilding_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "consentPurposeText", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestConsentPurposeText(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestConsentPurposeText_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "idNum", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestIdNum(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestIdNum_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empApartment", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpApartment(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpApartment_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrCityType", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestRegAddrCityType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrCityType_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrHouse", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestRegAddrHouse(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrHouse_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "homePhone", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestHomePhone(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestHomePhone_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrDistrict", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestActAddrDistrict(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrDistrict_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empRestrFullName", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpRestrFullName(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpRestrFullName_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "format", scope = ConnectorPersonRequest.class)
    public JAXBElement<Integer> createConnectorPersonRequestFormat(Integer value) {
        return new JAXBElement<Integer>(_ConnectorPersonRequestFormat_QNAME, Integer.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "issueLocation", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestIssueLocation(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestIssueLocation_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empDistrictType", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpDistrictType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpDistrictType_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "consent", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestConsent(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestConsent_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "maritalStatus", scope = ConnectorPersonRequest.class)
    public JAXBElement<Integer> createConnectorPersonRequestMaritalStatus(Integer value) {
        return new JAXBElement<Integer>(_ConnectorPersonRequestMaritalStatus_QNAME, Integer.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empCityType", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpCityType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpCityType_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "idSeries", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestIdSeries(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestIdSeries_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "firstname", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestFirstname(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestFirstname_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrSettlement", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestRegAddrSettlement(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrSettlement_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "downPaymentAmount", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestDownPaymentAmount(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestDownPaymentAmount_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrStructure", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestRegAddrStructure(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrStructure_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regDate", scope = ConnectorPersonRequest.class)
    public JAXBElement<XMLGregorianCalendar> createConnectorPersonRequestRegDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ConnectorPersonRequestRegDate_QNAME, XMLGregorianCalendar.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrDistrict", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestRegAddrDistrict(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrDistrict_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empFirmName", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpFirmName(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpFirmName_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "carYear", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestCarYear(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestCarYear_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "duration", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestDuration(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestDuration_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "newApplicant", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestNewApplicant(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestNewApplicant_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "marriage", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestMarriage(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestMarriage_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empOgrn", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpOgrn(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpOgrn_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empPostal", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpPostal(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpPostal_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrPostal", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestActAddrPostal(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrPostal_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "amount", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestAmount(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestAmount_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "tradeDate", scope = ConnectorPersonRequest.class)
    public JAXBElement<XMLGregorianCalendar> createConnectorPersonRequestTradeDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ConnectorPersonRequestTradeDate_QNAME, XMLGregorianCalendar.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "middlename", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestMiddlename(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestMiddlename_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empRestrInn", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpRestrInn(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpRestrInn_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "pfNum", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestPfNum(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestPfNum_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "consentUser", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestConsentUser(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestConsentUser_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "inn", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestInn(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestInn_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "workDuration", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestWorkDuration(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestWorkDuration_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "issueAuthority", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestIssueAuthority(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestIssueAuthority_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrDistrictType", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestActAddrDistrictType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrDistrictType_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empStreetType", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpStreetType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpStreetType_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "empDistrict", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestEmpDistrict(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestEmpDistrict_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrPostal", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestRegAddrPostal(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrPostal_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrRegion", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestActAddrRegion(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrRegion_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "workPhone", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestWorkPhone(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestWorkPhone_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrSettlementType", scope = ConnectorPersonRequest.class)
    public JAXBElement<String> createConnectorPersonRequestActAddrSettlementType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrSettlementType_QNAME, String.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrMonths", scope = ConnectorPersonRequest.class)
    public JAXBElement<Integer> createConnectorPersonRequestActAddrMonths(Integer value) {
        return new JAXBElement<Integer>(_ConnectorPersonRequestActAddrMonths_QNAME, Integer.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "category", scope = ConnectorPersonRequest.class)
    public JAXBElement<Integer> createConnectorPersonRequestCategory(Integer value) {
        return new JAXBElement<Integer>(_ConnectorPersonRequestCategory_QNAME, Integer.class, ConnectorPersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://collAuto.connector.xws.mbtc.ru", name = "docNum", scope = ConnectorCollAutoRequest.class)
    public JAXBElement<String> createConnectorCollAutoRequestDocNum(String value) {
        return new JAXBElement<String>(_ConnectorCollAutoRequestDocNum_QNAME, String.class, ConnectorCollAutoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://collAuto.connector.xws.mbtc.ru", name = "engine", scope = ConnectorCollAutoRequest.class)
    public JAXBElement<String> createConnectorCollAutoRequestEngine(String value) {
        return new JAXBElement<String>(_ConnectorCollAutoRequestEngine_QNAME, String.class, ConnectorCollAutoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://collAuto.connector.xws.mbtc.ru", name = "vin", scope = ConnectorCollAutoRequest.class)
    public JAXBElement<String> createConnectorCollAutoRequestVin(String value) {
        return new JAXBElement<String>(_ConnectorCollAutoRequestVin_QNAME, String.class, ConnectorCollAutoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://collAuto.connector.xws.mbtc.ru", name = "chassis", scope = ConnectorCollAutoRequest.class)
    public JAXBElement<String> createConnectorCollAutoRequestChassis(String value) {
        return new JAXBElement<String>(_ConnectorCollAutoRequestChassis_QNAME, String.class, ConnectorCollAutoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://collAuto.connector.xws.mbtc.ru", name = "body", scope = ConnectorCollAutoRequest.class)
    public JAXBElement<String> createConnectorCollAutoRequestBody(String value) {
        return new JAXBElement<String>(_ConnectorCollAutoRequestBody_QNAME, String.class, ConnectorCollAutoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "uid", scope = ConnectorResponse.class)
    public JAXBElement<String> createConnectorResponseUid(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestUid_QNAME, String.class, ConnectorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "reportCode", scope = ConnectorResponse.class)
    public JAXBElement<String> createConnectorResponseReportCode(String value) {
        return new JAXBElement<String>(_ConnectorResponseReportCode_QNAME, String.class, ConnectorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "response", scope = ConnectorResponse.class)
    public JAXBElement<String> createConnectorResponseResponse(String value) {
        return new JAXBElement<String>(_ConnectorResponseResponse_QNAME, String.class, ConnectorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "cacheUse", scope = ConnectorResponse.class)
    public JAXBElement<Integer> createConnectorResponseCacheUse(Integer value) {
        return new JAXBElement<Integer>(_ConnectorResponseCacheUse_QNAME, Integer.class, ConnectorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrStreet", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestRegAddrStreet(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrStreet_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrBuilding", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestActAddrBuilding(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrBuilding_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "reason", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestReason(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestReason_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrDistrictType", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestRegAddrDistrictType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrDistrictType_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "consentPurpose", scope = ConnectorBusinessRequest.class)
    public JAXBElement<Integer> createConnectorBusinessRequestConsentPurpose(Integer value) {
        return new JAXBElement<Integer>(_ConnectorPersonRequestConsentPurpose_QNAME, Integer.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "companyName", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestCompanyName(String value) {
        return new JAXBElement<String>(_ConnectorBusinessRequestCompanyName_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrFlat", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestActAddrFlat(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrFlat_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "dateOfReport", scope = ConnectorBusinessRequest.class)
    public JAXBElement<XMLGregorianCalendar> createConnectorBusinessRequestDateOfReport(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ConnectorPersonRequestDateOfReport_QNAME, XMLGregorianCalendar.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrRegion", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestRegAddrRegion(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrRegion_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "dateTimeApplication", scope = ConnectorBusinessRequest.class)
    public JAXBElement<XMLGregorianCalendar> createConnectorBusinessRequestDateTimeApplication(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ConnectorPersonRequestDateTimeApplication_QNAME, XMLGregorianCalendar.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrCityType", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestActAddrCityType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrCityType_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrSettlement", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestActAddrSettlement(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrSettlement_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "carRegNo", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestCarRegNo(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestCarRegNo_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrStreet", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestActAddrStreet(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrStreet_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "caseNumber", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestCaseNumber(String value) {
        return new JAXBElement<String>(_ConnectorBusinessRequestCaseNumber_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "vin", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestVin(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestVin_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrCity", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestActAddrCity(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrCity_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "consentPurposeText", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestConsentPurposeText(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestConsentPurposeText_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrCityType", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestRegAddrCityType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrCityType_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrHouse", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestRegAddrHouse(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrHouse_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrDistrict", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestActAddrDistrict(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrDistrict_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "format", scope = ConnectorBusinessRequest.class)
    public JAXBElement<Integer> createConnectorBusinessRequestFormat(Integer value) {
        return new JAXBElement<Integer>(_ConnectorPersonRequestFormat_QNAME, Integer.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "consent", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestConsent(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestConsent_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrCountry", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestRegAddrCountry(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrCountry_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrCity", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestRegAddrCity(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrCity_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrCountry", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestActAddrCountry(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrCountry_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "phone", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestPhone(String value) {
        return new JAXBElement<String>(_ConnectorBusinessRequestPhone_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "nationality", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestNationality(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestNationality_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "creditReportDetalization", scope = ConnectorBusinessRequest.class)
    public JAXBElement<Integer> createConnectorBusinessRequestCreditReportDetalization(Integer value) {
        return new JAXBElement<Integer>(_ConnectorPersonRequestCreditReportDetalization_QNAME, Integer.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrFlat", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestRegAddrFlat(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrFlat_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrHouse", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestActAddrHouse(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrHouse_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "subjectCode", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestSubjectCode(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestSubjectCode_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrSettlement", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestRegAddrSettlement(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrSettlement_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrSettlementType", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestRegAddrSettlementType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrSettlementType_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrStructure", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestRegAddrStructure(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrStructure_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "liquidated", scope = ConnectorBusinessRequest.class)
    public JAXBElement<Integer> createConnectorBusinessRequestLiquidated(Integer value) {
        return new JAXBElement<Integer>(_ConnectorBusinessRequestLiquidated_QNAME, Integer.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrDistrict", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestRegAddrDistrict(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrDistrict_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "carYear", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestCarYear(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestCarYear_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "uid", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestUid(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestUid_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "duration", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestDuration(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestDuration_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "currency", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestCurrency(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestCurrency_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrStreetType", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestActAddrStreetType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrStreetType_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrPostal", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestActAddrPostal(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrPostal_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "amount", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestAmount(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestAmount_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrStreetType", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestRegAddrStreetType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrStreetType_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrBuilding", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestRegAddrBuilding(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrBuilding_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "consentUser", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestConsentUser(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestConsentUser_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "inn", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestInn(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestInn_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrDistrictType", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestActAddrDistrictType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrDistrictType_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrStructure", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestActAddrStructure(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrStructure_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "egrn", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestEgrn(String value) {
        return new JAXBElement<String>(_ConnectorBusinessRequestEgrn_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "regAddrPostal", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestRegAddrPostal(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestRegAddrPostal_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrRegion", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestActAddrRegion(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrRegion_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "actAddrSettlementType", scope = ConnectorBusinessRequest.class)
    public JAXBElement<String> createConnectorBusinessRequestActAddrSettlementType(String value) {
        return new JAXBElement<String>(_ConnectorPersonRequestActAddrSettlementType_QNAME, String.class, ConnectorBusinessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatReportAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statreport.connectors.nbki.ru", name = "accounts", scope = StatReportRequest.class)
    public JAXBElement<ArrayOfStatReportAccount> createStatReportRequestAccounts(ArrayOfStatReportAccount value) {
        return new JAXBElement<ArrayOfStatReportAccount>(_StatReportRequestAccounts_QNAME, ArrayOfStatReportAccount.class, StatReportRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "numDependants", scope = ExpansionScoreRequest.class)
    public JAXBElement<Integer> createExpansionScoreRequestNumDependants(Integer value) {
        return new JAXBElement<Integer>(_ExpansionScoreRequestNumDependants_QNAME, Integer.class, ExpansionScoreRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "occupationStatus", scope = ExpansionScoreRequest.class)
    public JAXBElement<Integer> createExpansionScoreRequestOccupationStatus(Integer value) {
        return new JAXBElement<Integer>(_ExpansionScoreRequestOccupationStatus_QNAME, Integer.class, ExpansionScoreRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "gender", scope = ExpansionScoreRequest.class)
    public JAXBElement<Integer> createExpansionScoreRequestGender(Integer value) {
        return new JAXBElement<Integer>(_ExpansionScoreRequestGender_QNAME, Integer.class, ExpansionScoreRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "verifyPhoneNum", scope = ExpansionScoreRequest.class)
    public JAXBElement<Integer> createExpansionScoreRequestVerifyPhoneNum(Integer value) {
        return new JAXBElement<Integer>(_ExpansionScoreRequestVerifyPhoneNum_QNAME, Integer.class, ExpansionScoreRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "occupationType", scope = ExpansionScoreRequest.class)
    public JAXBElement<Integer> createExpansionScoreRequestOccupationType(Integer value) {
        return new JAXBElement<Integer>(_ConnectorPersonRequestOccupationType_QNAME, Integer.class, ExpansionScoreRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "totalMonthlyBalance", scope = ExpansionScoreRequest.class)
    public JAXBElement<Integer> createExpansionScoreRequestTotalMonthlyBalance(Integer value) {
        return new JAXBElement<Integer>(_ExpansionScoreRequestTotalMonthlyBalance_QNAME, Integer.class, ExpansionScoreRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "requestId", scope = ExpansionScoreRequest.class)
    public JAXBElement<String> createExpansionScoreRequestRequestId(String value) {
        return new JAXBElement<String>(_ExpansionScoreRequestRequestId_QNAME, String.class, ExpansionScoreRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "educationLevel", scope = ExpansionScoreRequest.class)
    public JAXBElement<Integer> createExpansionScoreRequestEducationLevel(Integer value) {
        return new JAXBElement<Integer>(_ExpansionScoreRequestEducationLevel_QNAME, Integer.class, ExpansionScoreRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "durationOfResidence", scope = ExpansionScoreRequest.class)
    public JAXBElement<Integer> createExpansionScoreRequestDurationOfResidence(Integer value) {
        return new JAXBElement<Integer>(_ExpansionScoreRequestDurationOfResidence_QNAME, Integer.class, ExpansionScoreRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "monthsInProfession", scope = ExpansionScoreRequest.class)
    public JAXBElement<Integer> createExpansionScoreRequestMonthsInProfession(Integer value) {
        return new JAXBElement<Integer>(_ExpansionScoreRequestMonthsInProfession_QNAME, Integer.class, ExpansionScoreRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "totalMonthlyPayments", scope = ExpansionScoreRequest.class)
    public JAXBElement<Integer> createExpansionScoreRequestTotalMonthlyPayments(Integer value) {
        return new JAXBElement<Integer>(_ExpansionScoreRequestTotalMonthlyPayments_QNAME, Integer.class, ExpansionScoreRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "residenceStatus", scope = ExpansionScoreRequest.class)
    public JAXBElement<Integer> createExpansionScoreRequestResidenceStatus(Integer value) {
        return new JAXBElement<Integer>(_ExpansionScoreRequestResidenceStatus_QNAME, Integer.class, ExpansionScoreRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "bankClient", scope = ExpansionScoreRequest.class)
    public JAXBElement<Integer> createExpansionScoreRequestBankClient(Integer value) {
        return new JAXBElement<Integer>(_ExpansionScoreRequestBankClient_QNAME, Integer.class, ExpansionScoreRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "maritalStatus", scope = ExpansionScoreRequest.class)
    public JAXBElement<Integer> createExpansionScoreRequestMaritalStatus(Integer value) {
        return new JAXBElement<Integer>(_ConnectorPersonRequestMaritalStatus_QNAME, Integer.class, ExpansionScoreRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://connector.xws.mbtc.ru", name = "monthsInCurWork", scope = ExpansionScoreRequest.class)
    public JAXBElement<Integer> createExpansionScoreRequestMonthsInCurWork(Integer value) {
        return new JAXBElement<Integer>(_ExpansionScoreRequestMonthsInCurWork_QNAME, Integer.class, ExpansionScoreRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://collAuto.connector.xws.mbtc.ru", name = "uid", scope = ConnectorCollAutoResponse.class)
    public JAXBElement<String> createConnectorCollAutoResponseUid(String value) {
        return new JAXBElement<String>(_ConnectorCollAutoResponseUid_QNAME, String.class, ConnectorCollAutoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://collAuto.connector.xws.mbtc.ru", name = "response", scope = ConnectorCollAutoResponse.class)
    public JAXBElement<String> createConnectorCollAutoResponseResponse(String value) {
        return new JAXBElement<String>(_ConnectorCollAutoResponseResponse_QNAME, String.class, ConnectorCollAutoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://collAuto.connector.xws.mbtc.ru", name = "reportCode", scope = ConnectorCollAutoResponse.class)
    public JAXBElement<String> createConnectorCollAutoResponseReportCode(String value) {
        return new JAXBElement<String>(_ConnectorCollAutoResponseReportCode_QNAME, String.class, ConnectorCollAutoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statreport.connectors.nbki.ru", name = "value", scope = StatReportAccount.class)
    public JAXBElement<String> createStatReportAccountValue(String value) {
        return new JAXBElement<String>(_StatReportAccountValue_QNAME, String.class, StatReportAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statreport.connectors.nbki.ru", name = "memberCode", scope = StatReportAccount.class)
    public JAXBElement<String> createStatReportAccountMemberCode(String value) {
        return new JAXBElement<String>(_StatReportAccountMemberCode_QNAME, String.class, StatReportAccount.class, value);
    }

}
