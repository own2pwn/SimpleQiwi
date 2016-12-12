
package ru.sample.qiwi.soap.cre2;

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

    private final static QName _ProcessRequestData_QNAME = new QName("http://creditregistry.ru/2010/webservice/SingleFormatService", "ProcessRequestData");
    private final static QName _GroupRequestData_QNAME = new QName("http://creditregistry.ru/2010/webservice/SingleFormatService", "GroupRequestData");
    private final static QName _StatusUpdateData_QNAME = new QName("http://creditregistry.ru/2010/webservice/SingleFormatService", "StatusUpdateData");
    private final static QName _JoinUidResponsesData_QNAME = new QName("http://creditregistry.ru/2010/webservice/SingleFormatService", "JoinUidResponsesData");
    private final static QName _AuthData_QNAME = new QName("http://creditregistry.ru/2010/webservice/SingleFormatService", "AuthData");
    private final static QName _JoinApplicationResponsesData_QNAME = new QName("http://creditregistry.ru/2010/webservice/SingleFormatService", "JoinApplicationResponsesData");
    private final static QName _ProcessRequestOut_QNAME = new QName("http://creditregistry.ru/2010/webservice/SingleFormatService", "ProcessRequestOut");
    private final static QName _PersonRequestDataActAddrBuilding_QNAME = new QName("", "actAddrBuilding");
    private final static QName _PersonRequestDataReason_QNAME = new QName("", "reason");
    private final static QName _PersonRequestDataEducation_QNAME = new QName("", "education");
    private final static QName _PersonRequestDataRegAddrRegion_QNAME = new QName("", "regAddrRegion");
    private final static QName _PersonRequestDataEmpBusinessIndustry_QNAME = new QName("", "empBusinessIndustry");
    private final static QName _PersonRequestDataEmpRestrFirmName_QNAME = new QName("", "empRestrFirmName");
    private final static QName _PersonRequestDataCompanyName_QNAME = new QName("", "companyName");
    private final static QName _PersonRequestDataActAddrSettlement_QNAME = new QName("", "actAddrSettlement");
    private final static QName _PersonRequestDataScndIssueLocation_QNAME = new QName("", "scndIssueLocation");
    private final static QName _PersonRequestDataConsentDate_QNAME = new QName("", "consentDate");
    private final static QName _PersonRequestDataProductName_QNAME = new QName("", "productName");
    private final static QName _PersonRequestDataPosBuilding_QNAME = new QName("", "posBuilding");
    private final static QName _PersonRequestDataOccupationType_QNAME = new QName("", "occupationType");
    private final static QName _PersonRequestDataPmtFreq_QNAME = new QName("", "pmtFreq");
    private final static QName _PersonRequestDataEmpPhone_QNAME = new QName("", "empPhone");
    private final static QName _PersonRequestDataNumChildren_QNAME = new QName("", "numChildren");
    private final static QName _PersonRequestDataEmpShortName_QNAME = new QName("", "empShortName");
    private final static QName _PersonRequestDataEmpRestrShortName_QNAME = new QName("", "empRestrShortName");
    private final static QName _PersonRequestDataVin_QNAME = new QName("", "vin");
    private final static QName _PersonRequestDataExp_QNAME = new QName("", "exp");
    private final static QName _PersonRequestDataEmpHouse_QNAME = new QName("", "empHouse");
    private final static QName _PersonRequestDataProfession_QNAME = new QName("", "profession");
    private final static QName _PersonRequestDataPosApartment_QNAME = new QName("", "posApartment");
    private final static QName _PersonRequestDataPastIssueDate_QNAME = new QName("", "pastIssueDate");
    private final static QName _PersonRequestDataIdType_QNAME = new QName("", "idType");
    private final static QName _PersonRequestDataFinalPaymentAmount_QNAME = new QName("", "finalPaymentAmount");
    private final static QName _PersonRequestDataSpouseDateOfBirth_QNAME = new QName("", "spouseDateOfBirth");
    private final static QName _PersonRequestDataEmpStructure_QNAME = new QName("", "empStructure");
    private final static QName _PersonRequestDataScndIssueDate_QNAME = new QName("", "scndIssueDate");
    private final static QName _PersonRequestDataRegAddrCountry_QNAME = new QName("", "regAddrCountry");
    private final static QName _PersonRequestDataRegAddrCity_QNAME = new QName("", "regAddrCity");
    private final static QName _PersonRequestDataPhotoComment_QNAME = new QName("", "photoComment");
    private final static QName _PersonRequestDataNextPmt_QNAME = new QName("", "nextPmt");
    private final static QName _PersonRequestDataNationality_QNAME = new QName("", "nationality");
    private final static QName _PersonRequestDataMobilePhone_QNAME = new QName("", "mobilePhone");
    private final static QName _PersonRequestDataWorkPhone2_QNAME = new QName("", "workPhone2");
    private final static QName _PersonRequestDataActAddrCountry_QNAME = new QName("", "actAddrCountry");
    private final static QName _PersonRequestDataApplicationWay_QNAME = new QName("", "applicationWay");
    private final static QName _PersonRequestDataActAddrHouse_QNAME = new QName("", "actAddrHouse");
    private final static QName _PersonRequestDataEmpRestrEngName_QNAME = new QName("", "empRestrEngName");
    private final static QName _PersonRequestDataRegAddrFlat_QNAME = new QName("", "regAddrFlat");
    private final static QName _PersonRequestDataEmpFullName_QNAME = new QName("", "empFullName");
    private final static QName _PersonRequestDataEmpStreet_QNAME = new QName("", "empStreet");
    private final static QName _PersonRequestDataLastName_QNAME = new QName("", "lastName");
    private final static QName _PersonRequestDataPosCity_QNAME = new QName("", "posCity");
    private final static QName _PersonRequestDataPastIdSeries_QNAME = new QName("", "pastIdSeries");
    private final static QName _PersonRequestDataPastLastName_QNAME = new QName("", "pastLastName");
    private final static QName _PersonRequestDataEmpCity_QNAME = new QName("", "empCity");
    private final static QName _PersonRequestDataPosStreet_QNAME = new QName("", "posStreet");
    private final static QName _PersonRequestDataCurrent_QNAME = new QName("", "current");
    private final static QName _PersonRequestDataPosPhone_QNAME = new QName("", "posPhone");
    private final static QName _PersonRequestDataOriginalChannel_QNAME = new QName("", "originalChannel");
    private final static QName _PersonRequestDataPastMiddleName_QNAME = new QName("", "pastMiddleName");
    private final static QName _PersonRequestDataCurrency_QNAME = new QName("", "currency");
    private final static QName _PersonRequestDataCredDuration_QNAME = new QName("", "credDuration");
    private final static QName _PersonRequestDataRelationship_QNAME = new QName("", "relationship");
    private final static QName _PersonRequestDataDriverNo_QNAME = new QName("", "driverNo");
    private final static QName _PersonRequestDataEmail_QNAME = new QName("", "email");
    private final static QName _PersonRequestDataEmpCountry_QNAME = new QName("", "empCountry");
    private final static QName _PersonRequestDataPurchaseValue_QNAME = new QName("", "purchaseValue");
    private final static QName _PersonRequestDataPlaceOfBirth_QNAME = new QName("", "placeOfBirth");
    private final static QName _PersonRequestDataPastIdType_QNAME = new QName("", "pastIdType");
    private final static QName _PersonRequestDataCollateralExistence_QNAME = new QName("", "collateralExistence");
    private final static QName _PersonRequestDataRegAddrBuilding_QNAME = new QName("", "regAddrBuilding");
    private final static QName _PersonRequestDataSex_QNAME = new QName("", "sex");
    private final static QName _PersonRequestDataPastIssueCode_QNAME = new QName("", "pastIssueCode");
    private final static QName _PersonRequestDataIncomeProof_QNAME = new QName("", "incomeProof");
    private final static QName _PersonRequestDataPhoto_QNAME = new QName("", "photo");
    private final static QName _PersonRequestDataPastFirstName_QNAME = new QName("", "pastFirstName");
    private final static QName _PersonRequestDataDateOfBirth_QNAME = new QName("", "dateOfBirth");
    private final static QName _PersonRequestDataPhotoDate_QNAME = new QName("", "photoDate");
    private final static QName _PersonRequestDataActAddrStructure_QNAME = new QName("", "actAddrStructure");
    private final static QName _PersonRequestDataScndIssueAuthority_QNAME = new QName("", "scndIssueAuthority");
    private final static QName _PersonRequestDataConsentPurpose_QNAME = new QName("", "consentPurpose");
    private final static QName _PersonRequestDataRegAddrPhone_QNAME = new QName("", "regAddrPhone");
    private final static QName _PersonRequestDataRegAddrStreet_QNAME = new QName("", "regAddrStreet");
    private final static QName _PersonRequestDataActAddrFlat_QNAME = new QName("", "actAddrFlat");
    private final static QName _PersonRequestDataMobilePhone2_QNAME = new QName("", "mobilePhone2");
    private final static QName _PersonRequestDataEmpSettlement_QNAME = new QName("", "empSettlement");
    private final static QName _PersonRequestDataScndIdSeries_QNAME = new QName("", "scndIdSeries");
    private final static QName _PersonRequestDataEmpInn_QNAME = new QName("", "empInn");
    private final static QName _PersonRequestDataCarRegNo_QNAME = new QName("", "carRegNo");
    private final static QName _PersonRequestDataDefaultStatus_QNAME = new QName("", "defaultStatus");
    private final static QName _PersonRequestDataPosStructure_QNAME = new QName("", "posStructure");
    private final static QName _PersonRequestDataScndIdNum_QNAME = new QName("", "scndIdNum");
    private final static QName _PersonRequestDataEmpEngName_QNAME = new QName("", "empEngName");
    private final static QName _PersonRequestDataSpouseMiddleName_QNAME = new QName("", "spouseMiddleName");
    private final static QName _PersonRequestDataApplicationStatus_QNAME = new QName("", "applicationStatus");
    private final static QName _PersonRequestDataPosHouse_QNAME = new QName("", "posHouse");
    private final static QName _PersonRequestDataActAddrStreet_QNAME = new QName("", "actAddrStreet");
    private final static QName _PersonRequestDataEmpBuilding_QNAME = new QName("", "empBuilding");
    private final static QName _PersonRequestDataConsentPurposeText_QNAME = new QName("", "consentPurposeText");
    private final static QName _PersonRequestDataActAddrCity_QNAME = new QName("", "actAddrCity");
    private final static QName _PersonRequestDataCreditLimit_QNAME = new QName("", "creditLimit");
    private final static QName _PersonRequestDataCollateralValue_QNAME = new QName("", "collateralValue");
    private final static QName _PersonRequestDataEmpRegion_QNAME = new QName("", "empRegion");
    private final static QName _PersonRequestDataMonthlyDocIncome_QNAME = new QName("", "monthlyDocIncome");
    private final static QName _PersonRequestDataPurposeOfFinance_QNAME = new QName("", "purposeOfFinance");
    private final static QName _PersonRequestDataEmpApartment_QNAME = new QName("", "empApartment");
    private final static QName _PersonRequestDataIdNum_QNAME = new QName("", "idNum");
    private final static QName _PersonRequestDataIssueCode_QNAME = new QName("", "issueCode");
    private final static QName _PersonRequestDataRegAddrHouse_QNAME = new QName("", "regAddrHouse");
    private final static QName _PersonRequestDataActAddrDistrict_QNAME = new QName("", "actAddrDistrict");
    private final static QName _PersonRequestDataHomePhone_QNAME = new QName("", "homePhone");
    private final static QName _PersonRequestDataFormat_QNAME = new QName("", "format");
    private final static QName _PersonRequestDataEmpRestrFullName_QNAME = new QName("", "empRestrFullName");
    private final static QName _PersonRequestDataConsent_QNAME = new QName("", "consent");
    private final static QName _PersonRequestDataPastIdNum_QNAME = new QName("", "pastIdNum");
    private final static QName _PersonRequestDataSpouseLastName_QNAME = new QName("", "spouseLastName");
    private final static QName _PersonRequestDataIssueLocation_QNAME = new QName("", "issueLocation");
    private final static QName _PersonRequestDataFirstName_QNAME = new QName("", "firstName");
    private final static QName _PersonRequestDataPurchaseExistence_QNAME = new QName("", "purchaseExistence");
    private final static QName _PersonRequestDataPosDistrict_QNAME = new QName("", "posDistrict");
    private final static QName _PersonRequestDataPosition_QNAME = new QName("", "position");
    private final static QName _PersonRequestDataMaritalStatus_QNAME = new QName("", "maritalStatus");
    private final static QName _PersonRequestDataPurchaseModel_QNAME = new QName("", "purchaseModel");
    private final static QName _PersonRequestDataRegAddrSettlement_QNAME = new QName("", "regAddrSettlement");
    private final static QName _PersonRequestDataIdSeries_QNAME = new QName("", "idSeries");
    private final static QName _PersonRequestDataPosRegion_QNAME = new QName("", "posRegion");
    private final static QName _PersonRequestDataRegAddrDistrict_QNAME = new QName("", "regAddrDistrict");
    private final static QName _PersonRequestDataRegDate_QNAME = new QName("", "regDate");
    private final static QName _PersonRequestDataRegAddrStructure_QNAME = new QName("", "regAddrStructure");
    private final static QName _PersonRequestDataDownPaymentAmount_QNAME = new QName("", "downPaymentAmount");
    private final static QName _PersonRequestDataEmpSize_QNAME = new QName("", "empSize");
    private final static QName _PersonRequestDataEmpFirmName_QNAME = new QName("", "empFirmName");
    private final static QName _PersonRequestDataNewApplicant_QNAME = new QName("", "newApplicant");
    private final static QName _PersonRequestDataMonthlyUndocIncome_QNAME = new QName("", "monthlyUndocIncome");
    private final static QName _PersonRequestDataPosSettlement_QNAME = new QName("", "posSettlement");
    private final static QName _PersonRequestDataEmpOgrn_QNAME = new QName("", "empOgrn");
    private final static QName _PersonRequestDataConsentEndDate_QNAME = new QName("", "consentEndDate");
    private final static QName _PersonRequestDataIssueDate_QNAME = new QName("", "issueDate");
    private final static QName _PersonRequestDataEmpPostal_QNAME = new QName("", "empPostal");
    private final static QName _PersonRequestDataActAddrPostal_QNAME = new QName("", "actAddrPostal");
    private final static QName _PersonRequestDataAmount_QNAME = new QName("", "amount");
    private final static QName _PersonRequestDataPosCountry_QNAME = new QName("", "posCountry");
    private final static QName _PersonRequestDataInn_QNAME = new QName("", "inn");
    private final static QName _PersonRequestDataConsentUser_QNAME = new QName("", "consentUser");
    private final static QName _PersonRequestDataPfNum_QNAME = new QName("", "pfNum");
    private final static QName _PersonRequestDataEmpRestrInn_QNAME = new QName("", "empRestrInn");
    private final static QName _PersonRequestDataSpouseFirstName_QNAME = new QName("", "spouseFirstName");
    private final static QName _PersonRequestDataPosPostal_QNAME = new QName("", "posPostal");
    private final static QName _PersonRequestDataTradeDate_QNAME = new QName("", "tradeDate");
    private final static QName _PersonRequestDataIssueAuthority_QNAME = new QName("", "issueAuthority");
    private final static QName _PersonRequestDataPastIssueAuthority_QNAME = new QName("", "pastIssueAuthority");
    private final static QName _PersonRequestDataWorkDuration_QNAME = new QName("", "workDuration");
    private final static QName _PersonRequestDataActAddrRegion_QNAME = new QName("", "actAddrRegion");
    private final static QName _PersonRequestDataRegAddrPostal_QNAME = new QName("", "regAddrPostal");
    private final static QName _PersonRequestDataEmpDistrict_QNAME = new QName("", "empDistrict");
    private final static QName _PersonRequestDataPosCode_QNAME = new QName("", "posCode");
    private final static QName _PersonRequestDataMiddleName_QNAME = new QName("", "middleName");
    private final static QName _PersonRequestDataWorkPhone_QNAME = new QName("", "workPhone");
    private final static QName _PersonRequestDataScndIdType_QNAME = new QName("", "scndIdType");
    private final static QName _PersonRequestDataPastIssueLocation_QNAME = new QName("", "pastIssueLocation");
    private final static QName _PersonRequestDataCategory_QNAME = new QName("", "category");
    private final static QName _PersonRequestDataActAddrMonths_QNAME = new QName("", "actAddrMonths");
    private final static QName _ProcessRequestOutUid_QNAME = new QName("", "uid");
    private final static QName _ProcessRequestOutReportCode_QNAME = new QName("", "reportCode");
    private final static QName _ProcessRequestOutCacheUse_QNAME = new QName("", "cacheUse");
    private final static QName _ProcessRequestOutUidApplication_QNAME = new QName("", "uidApplication");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.sample.qiwi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExtraFields }
     * 
     */
    public ExtraFields createExtraFields() {
        return new ExtraFields();
    }

    /**
     * Create an instance of {@link JoinApplicationResponsesData }
     * 
     */
    public JoinApplicationResponsesData createJoinApplicationResponsesData() {
        return new JoinApplicationResponsesData();
    }

    /**
     * Create an instance of {@link AuthData }
     * 
     */
    public AuthData createAuthData() {
        return new AuthData();
    }

    /**
     * Create an instance of {@link StatusUpdateData }
     * 
     */
    public StatusUpdateData createStatusUpdateData() {
        return new StatusUpdateData();
    }

    /**
     * Create an instance of {@link JoinUidResponsesData }
     * 
     */
    public JoinUidResponsesData createJoinUidResponsesData() {
        return new JoinUidResponsesData();
    }

    /**
     * Create an instance of {@link ProcessRequestData }
     * 
     */
    public ProcessRequestData createProcessRequestData() {
        return new ProcessRequestData();
    }

    /**
     * Create an instance of {@link GroupRequestData }
     * 
     */
    public GroupRequestData createGroupRequestData() {
        return new GroupRequestData();
    }

    /**
     * Create an instance of {@link ProcessRequestOut }
     * 
     */
    public ProcessRequestOut createProcessRequestOut() {
        return new ProcessRequestOut();
    }

    /**
     * Create an instance of {@link ConnectorCode }
     * 
     */
    public ConnectorCode createConnectorCode() {
        return new ConnectorCode();
    }

    /**
     * Create an instance of {@link PersonRequestData }
     * 
     */
    public PersonRequestData createPersonRequestData() {
        return new PersonRequestData();
    }

    /**
     * Create an instance of {@link MatchScheme }
     * 
     */
    public MatchScheme createMatchScheme() {
        return new MatchScheme();
    }

    /**
     * Create an instance of {@link FraudStatuses }
     * 
     */
    public FraudStatuses createFraudStatuses() {
        return new FraudStatuses();
    }

    /**
     * Create an instance of {@link ExtraFields.Field }
     * 
     */
    public ExtraFields.Field createExtraFieldsField() {
        return new ExtraFields.Field();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessRequestData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2010/webservice/SingleFormatService", name = "ProcessRequestData")
    public JAXBElement<ProcessRequestData> createProcessRequestData(ProcessRequestData value) {
        return new JAXBElement<ProcessRequestData>(_ProcessRequestData_QNAME, ProcessRequestData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupRequestData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2010/webservice/SingleFormatService", name = "GroupRequestData")
    public JAXBElement<GroupRequestData> createGroupRequestData(GroupRequestData value) {
        return new JAXBElement<GroupRequestData>(_GroupRequestData_QNAME, GroupRequestData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusUpdateData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2010/webservice/SingleFormatService", name = "StatusUpdateData")
    public JAXBElement<StatusUpdateData> createStatusUpdateData(StatusUpdateData value) {
        return new JAXBElement<StatusUpdateData>(_StatusUpdateData_QNAME, StatusUpdateData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JoinUidResponsesData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2010/webservice/SingleFormatService", name = "JoinUidResponsesData")
    public JAXBElement<JoinUidResponsesData> createJoinUidResponsesData(JoinUidResponsesData value) {
        return new JAXBElement<JoinUidResponsesData>(_JoinUidResponsesData_QNAME, JoinUidResponsesData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2010/webservice/SingleFormatService", name = "AuthData")
    public JAXBElement<AuthData> createAuthData(AuthData value) {
        return new JAXBElement<AuthData>(_AuthData_QNAME, AuthData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JoinApplicationResponsesData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2010/webservice/SingleFormatService", name = "JoinApplicationResponsesData")
    public JAXBElement<JoinApplicationResponsesData> createJoinApplicationResponsesData(JoinApplicationResponsesData value) {
        return new JAXBElement<JoinApplicationResponsesData>(_JoinApplicationResponsesData_QNAME, JoinApplicationResponsesData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessRequestOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://creditregistry.ru/2010/webservice/SingleFormatService", name = "ProcessRequestOut")
    public JAXBElement<ProcessRequestOut> createProcessRequestOut(ProcessRequestOut value) {
        return new JAXBElement<ProcessRequestOut>(_ProcessRequestOut_QNAME, ProcessRequestOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "actAddrBuilding", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataActAddrBuilding(String value) {
        return new JAXBElement<String>(_PersonRequestDataActAddrBuilding_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "reason", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataReason(String value) {
        return new JAXBElement<String>(_PersonRequestDataReason_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "education", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEducation(String value) {
        return new JAXBElement<String>(_PersonRequestDataEducation_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "regAddrRegion", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataRegAddrRegion(String value) {
        return new JAXBElement<String>(_PersonRequestDataRegAddrRegion_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empBusinessIndustry", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpBusinessIndustry(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpBusinessIndustry_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empRestrFirmName", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpRestrFirmName(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpRestrFirmName_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "companyName", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataCompanyName(String value) {
        return new JAXBElement<String>(_PersonRequestDataCompanyName_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "actAddrSettlement", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataActAddrSettlement(String value) {
        return new JAXBElement<String>(_PersonRequestDataActAddrSettlement_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "scndIssueLocation", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataScndIssueLocation(String value) {
        return new JAXBElement<String>(_PersonRequestDataScndIssueLocation_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "consentDate", scope = PersonRequestData.class)
    public JAXBElement<XMLGregorianCalendar> createPersonRequestDataConsentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonRequestDataConsentDate_QNAME, XMLGregorianCalendar.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "productName", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataProductName(String value) {
        return new JAXBElement<String>(_PersonRequestDataProductName_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "posBuilding", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPosBuilding(String value) {
        return new JAXBElement<String>(_PersonRequestDataPosBuilding_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "occupationType", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataOccupationType(String value) {
        return new JAXBElement<String>(_PersonRequestDataOccupationType_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pmtFreq", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPmtFreq(String value) {
        return new JAXBElement<String>(_PersonRequestDataPmtFreq_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empPhone", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpPhone(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpPhone_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "numChildren", scope = PersonRequestData.class)
    public JAXBElement<Integer> createPersonRequestDataNumChildren(Integer value) {
        return new JAXBElement<Integer>(_PersonRequestDataNumChildren_QNAME, Integer.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empShortName", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpShortName(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpShortName_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empRestrShortName", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpRestrShortName(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpRestrShortName_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vin", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataVin(String value) {
        return new JAXBElement<String>(_PersonRequestDataVin_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "exp", scope = PersonRequestData.class)
    public JAXBElement<Integer> createPersonRequestDataExp(Integer value) {
        return new JAXBElement<Integer>(_PersonRequestDataExp_QNAME, Integer.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empHouse", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpHouse(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpHouse_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "profession", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataProfession(String value) {
        return new JAXBElement<String>(_PersonRequestDataProfession_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "posApartment", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPosApartment(String value) {
        return new JAXBElement<String>(_PersonRequestDataPosApartment_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pastIssueDate", scope = PersonRequestData.class)
    public JAXBElement<XMLGregorianCalendar> createPersonRequestDataPastIssueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonRequestDataPastIssueDate_QNAME, XMLGregorianCalendar.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "idType", scope = PersonRequestData.class)
    public JAXBElement<Integer> createPersonRequestDataIdType(Integer value) {
        return new JAXBElement<Integer>(_PersonRequestDataIdType_QNAME, Integer.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "finalPaymentAmount", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataFinalPaymentAmount(String value) {
        return new JAXBElement<String>(_PersonRequestDataFinalPaymentAmount_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "spouseDateOfBirth", scope = PersonRequestData.class)
    public JAXBElement<XMLGregorianCalendar> createPersonRequestDataSpouseDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonRequestDataSpouseDateOfBirth_QNAME, XMLGregorianCalendar.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empStructure", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpStructure(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpStructure_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "scndIssueDate", scope = PersonRequestData.class)
    public JAXBElement<XMLGregorianCalendar> createPersonRequestDataScndIssueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonRequestDataScndIssueDate_QNAME, XMLGregorianCalendar.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "regAddrCountry", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataRegAddrCountry(String value) {
        return new JAXBElement<String>(_PersonRequestDataRegAddrCountry_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "regAddrCity", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataRegAddrCity(String value) {
        return new JAXBElement<String>(_PersonRequestDataRegAddrCity_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "photoComment", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPhotoComment(String value) {
        return new JAXBElement<String>(_PersonRequestDataPhotoComment_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nextPmt", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataNextPmt(String value) {
        return new JAXBElement<String>(_PersonRequestDataNextPmt_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nationality", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataNationality(String value) {
        return new JAXBElement<String>(_PersonRequestDataNationality_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mobilePhone", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataMobilePhone(String value) {
        return new JAXBElement<String>(_PersonRequestDataMobilePhone_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "workPhone2", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataWorkPhone2(String value) {
        return new JAXBElement<String>(_PersonRequestDataWorkPhone2_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "actAddrCountry", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataActAddrCountry(String value) {
        return new JAXBElement<String>(_PersonRequestDataActAddrCountry_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "applicationWay", scope = PersonRequestData.class)
    public JAXBElement<Integer> createPersonRequestDataApplicationWay(Integer value) {
        return new JAXBElement<Integer>(_PersonRequestDataApplicationWay_QNAME, Integer.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "actAddrHouse", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataActAddrHouse(String value) {
        return new JAXBElement<String>(_PersonRequestDataActAddrHouse_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empRestrEngName", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpRestrEngName(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpRestrEngName_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "regAddrFlat", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataRegAddrFlat(String value) {
        return new JAXBElement<String>(_PersonRequestDataRegAddrFlat_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empFullName", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpFullName(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpFullName_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empStreet", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpStreet(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpStreet_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lastName", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataLastName(String value) {
        return new JAXBElement<String>(_PersonRequestDataLastName_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "posCity", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPosCity(String value) {
        return new JAXBElement<String>(_PersonRequestDataPosCity_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pastIdSeries", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPastIdSeries(String value) {
        return new JAXBElement<String>(_PersonRequestDataPastIdSeries_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pastLastName", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPastLastName(String value) {
        return new JAXBElement<String>(_PersonRequestDataPastLastName_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empCity", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpCity(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpCity_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "posStreet", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPosStreet(String value) {
        return new JAXBElement<String>(_PersonRequestDataPosStreet_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "current", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataCurrent(String value) {
        return new JAXBElement<String>(_PersonRequestDataCurrent_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "posPhone", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPosPhone(String value) {
        return new JAXBElement<String>(_PersonRequestDataPosPhone_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "originalChannel", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataOriginalChannel(String value) {
        return new JAXBElement<String>(_PersonRequestDataOriginalChannel_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pastMiddleName", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPastMiddleName(String value) {
        return new JAXBElement<String>(_PersonRequestDataPastMiddleName_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "currency", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataCurrency(String value) {
        return new JAXBElement<String>(_PersonRequestDataCurrency_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "credDuration", scope = PersonRequestData.class)
    public JAXBElement<Integer> createPersonRequestDataCredDuration(Integer value) {
        return new JAXBElement<Integer>(_PersonRequestDataCredDuration_QNAME, Integer.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "relationship", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataRelationship(String value) {
        return new JAXBElement<String>(_PersonRequestDataRelationship_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "driverNo", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataDriverNo(String value) {
        return new JAXBElement<String>(_PersonRequestDataDriverNo_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "email", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmail(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmail_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empCountry", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpCountry(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpCountry_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "purchaseValue", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPurchaseValue(String value) {
        return new JAXBElement<String>(_PersonRequestDataPurchaseValue_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "placeOfBirth", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPlaceOfBirth(String value) {
        return new JAXBElement<String>(_PersonRequestDataPlaceOfBirth_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pastIdType", scope = PersonRequestData.class)
    public JAXBElement<Integer> createPersonRequestDataPastIdType(Integer value) {
        return new JAXBElement<Integer>(_PersonRequestDataPastIdType_QNAME, Integer.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "collateralExistence", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataCollateralExistence(String value) {
        return new JAXBElement<String>(_PersonRequestDataCollateralExistence_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "regAddrBuilding", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataRegAddrBuilding(String value) {
        return new JAXBElement<String>(_PersonRequestDataRegAddrBuilding_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sex", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataSex(String value) {
        return new JAXBElement<String>(_PersonRequestDataSex_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pastIssueCode", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPastIssueCode(String value) {
        return new JAXBElement<String>(_PersonRequestDataPastIssueCode_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "incomeProof", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataIncomeProof(String value) {
        return new JAXBElement<String>(_PersonRequestDataIncomeProof_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "photo", scope = PersonRequestData.class)
    public JAXBElement<byte[]> createPersonRequestDataPhoto(byte[] value) {
        return new JAXBElement<byte[]>(_PersonRequestDataPhoto_QNAME, byte[].class, PersonRequestData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pastFirstName", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPastFirstName(String value) {
        return new JAXBElement<String>(_PersonRequestDataPastFirstName_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dateOfBirth", scope = PersonRequestData.class)
    public JAXBElement<XMLGregorianCalendar> createPersonRequestDataDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonRequestDataDateOfBirth_QNAME, XMLGregorianCalendar.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "photoDate", scope = PersonRequestData.class)
    public JAXBElement<XMLGregorianCalendar> createPersonRequestDataPhotoDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonRequestDataPhotoDate_QNAME, XMLGregorianCalendar.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "actAddrStructure", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataActAddrStructure(String value) {
        return new JAXBElement<String>(_PersonRequestDataActAddrStructure_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "scndIssueAuthority", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataScndIssueAuthority(String value) {
        return new JAXBElement<String>(_PersonRequestDataScndIssueAuthority_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "consentPurpose", scope = PersonRequestData.class)
    public JAXBElement<Integer> createPersonRequestDataConsentPurpose(Integer value) {
        return new JAXBElement<Integer>(_PersonRequestDataConsentPurpose_QNAME, Integer.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "regAddrPhone", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataRegAddrPhone(String value) {
        return new JAXBElement<String>(_PersonRequestDataRegAddrPhone_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "regAddrStreet", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataRegAddrStreet(String value) {
        return new JAXBElement<String>(_PersonRequestDataRegAddrStreet_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "actAddrFlat", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataActAddrFlat(String value) {
        return new JAXBElement<String>(_PersonRequestDataActAddrFlat_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mobilePhone2", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataMobilePhone2(String value) {
        return new JAXBElement<String>(_PersonRequestDataMobilePhone2_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empSettlement", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpSettlement(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpSettlement_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "scndIdSeries", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataScndIdSeries(String value) {
        return new JAXBElement<String>(_PersonRequestDataScndIdSeries_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empInn", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpInn(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpInn_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "carRegNo", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataCarRegNo(String value) {
        return new JAXBElement<String>(_PersonRequestDataCarRegNo_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "defaultStatus", scope = PersonRequestData.class)
    public JAXBElement<Integer> createPersonRequestDataDefaultStatus(Integer value) {
        return new JAXBElement<Integer>(_PersonRequestDataDefaultStatus_QNAME, Integer.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "posStructure", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPosStructure(String value) {
        return new JAXBElement<String>(_PersonRequestDataPosStructure_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "scndIdNum", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataScndIdNum(String value) {
        return new JAXBElement<String>(_PersonRequestDataScndIdNum_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empEngName", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpEngName(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpEngName_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "spouseMiddleName", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataSpouseMiddleName(String value) {
        return new JAXBElement<String>(_PersonRequestDataSpouseMiddleName_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "applicationStatus", scope = PersonRequestData.class)
    public JAXBElement<Integer> createPersonRequestDataApplicationStatus(Integer value) {
        return new JAXBElement<Integer>(_PersonRequestDataApplicationStatus_QNAME, Integer.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "posHouse", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPosHouse(String value) {
        return new JAXBElement<String>(_PersonRequestDataPosHouse_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "actAddrStreet", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataActAddrStreet(String value) {
        return new JAXBElement<String>(_PersonRequestDataActAddrStreet_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empBuilding", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpBuilding(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpBuilding_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "consentPurposeText", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataConsentPurposeText(String value) {
        return new JAXBElement<String>(_PersonRequestDataConsentPurposeText_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "actAddrCity", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataActAddrCity(String value) {
        return new JAXBElement<String>(_PersonRequestDataActAddrCity_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "creditLimit", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataCreditLimit(String value) {
        return new JAXBElement<String>(_PersonRequestDataCreditLimit_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "collateralValue", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataCollateralValue(String value) {
        return new JAXBElement<String>(_PersonRequestDataCollateralValue_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empRegion", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpRegion(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpRegion_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "monthlyDocIncome", scope = PersonRequestData.class)
    public JAXBElement<Integer> createPersonRequestDataMonthlyDocIncome(Integer value) {
        return new JAXBElement<Integer>(_PersonRequestDataMonthlyDocIncome_QNAME, Integer.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "purposeOfFinance", scope = PersonRequestData.class)
    public JAXBElement<Integer> createPersonRequestDataPurposeOfFinance(Integer value) {
        return new JAXBElement<Integer>(_PersonRequestDataPurposeOfFinance_QNAME, Integer.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empApartment", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpApartment(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpApartment_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "idNum", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataIdNum(String value) {
        return new JAXBElement<String>(_PersonRequestDataIdNum_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "issueCode", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataIssueCode(String value) {
        return new JAXBElement<String>(_PersonRequestDataIssueCode_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "regAddrHouse", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataRegAddrHouse(String value) {
        return new JAXBElement<String>(_PersonRequestDataRegAddrHouse_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "actAddrDistrict", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataActAddrDistrict(String value) {
        return new JAXBElement<String>(_PersonRequestDataActAddrDistrict_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "homePhone", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataHomePhone(String value) {
        return new JAXBElement<String>(_PersonRequestDataHomePhone_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "format", scope = PersonRequestData.class)
    public JAXBElement<Integer> createPersonRequestDataFormat(Integer value) {
        return new JAXBElement<Integer>(_PersonRequestDataFormat_QNAME, Integer.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empRestrFullName", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpRestrFullName(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpRestrFullName_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "consent", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataConsent(String value) {
        return new JAXBElement<String>(_PersonRequestDataConsent_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pastIdNum", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPastIdNum(String value) {
        return new JAXBElement<String>(_PersonRequestDataPastIdNum_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "spouseLastName", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataSpouseLastName(String value) {
        return new JAXBElement<String>(_PersonRequestDataSpouseLastName_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "issueLocation", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataIssueLocation(String value) {
        return new JAXBElement<String>(_PersonRequestDataIssueLocation_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "firstName", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataFirstName(String value) {
        return new JAXBElement<String>(_PersonRequestDataFirstName_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "purchaseExistence", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPurchaseExistence(String value) {
        return new JAXBElement<String>(_PersonRequestDataPurchaseExistence_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "posDistrict", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPosDistrict(String value) {
        return new JAXBElement<String>(_PersonRequestDataPosDistrict_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "position", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPosition(String value) {
        return new JAXBElement<String>(_PersonRequestDataPosition_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "maritalStatus", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataMaritalStatus(String value) {
        return new JAXBElement<String>(_PersonRequestDataMaritalStatus_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "purchaseModel", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPurchaseModel(String value) {
        return new JAXBElement<String>(_PersonRequestDataPurchaseModel_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "regAddrSettlement", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataRegAddrSettlement(String value) {
        return new JAXBElement<String>(_PersonRequestDataRegAddrSettlement_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "idSeries", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataIdSeries(String value) {
        return new JAXBElement<String>(_PersonRequestDataIdSeries_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "posRegion", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPosRegion(String value) {
        return new JAXBElement<String>(_PersonRequestDataPosRegion_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "regAddrDistrict", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataRegAddrDistrict(String value) {
        return new JAXBElement<String>(_PersonRequestDataRegAddrDistrict_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "regDate", scope = PersonRequestData.class)
    public JAXBElement<XMLGregorianCalendar> createPersonRequestDataRegDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonRequestDataRegDate_QNAME, XMLGregorianCalendar.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "regAddrStructure", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataRegAddrStructure(String value) {
        return new JAXBElement<String>(_PersonRequestDataRegAddrStructure_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "downPaymentAmount", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataDownPaymentAmount(String value) {
        return new JAXBElement<String>(_PersonRequestDataDownPaymentAmount_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empSize", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpSize(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpSize_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empFirmName", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpFirmName(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpFirmName_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "newApplicant", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataNewApplicant(String value) {
        return new JAXBElement<String>(_PersonRequestDataNewApplicant_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "monthlyUndocIncome", scope = PersonRequestData.class)
    public JAXBElement<Integer> createPersonRequestDataMonthlyUndocIncome(Integer value) {
        return new JAXBElement<Integer>(_PersonRequestDataMonthlyUndocIncome_QNAME, Integer.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "posSettlement", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPosSettlement(String value) {
        return new JAXBElement<String>(_PersonRequestDataPosSettlement_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empOgrn", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpOgrn(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpOgrn_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "consentEndDate", scope = PersonRequestData.class)
    public JAXBElement<XMLGregorianCalendar> createPersonRequestDataConsentEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonRequestDataConsentEndDate_QNAME, XMLGregorianCalendar.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "issueDate", scope = PersonRequestData.class)
    public JAXBElement<XMLGregorianCalendar> createPersonRequestDataIssueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonRequestDataIssueDate_QNAME, XMLGregorianCalendar.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empPostal", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpPostal(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpPostal_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "actAddrPostal", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataActAddrPostal(String value) {
        return new JAXBElement<String>(_PersonRequestDataActAddrPostal_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "amount", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataAmount(String value) {
        return new JAXBElement<String>(_PersonRequestDataAmount_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "posCountry", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPosCountry(String value) {
        return new JAXBElement<String>(_PersonRequestDataPosCountry_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "inn", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataInn(String value) {
        return new JAXBElement<String>(_PersonRequestDataInn_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "consentUser", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataConsentUser(String value) {
        return new JAXBElement<String>(_PersonRequestDataConsentUser_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pfNum", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPfNum(String value) {
        return new JAXBElement<String>(_PersonRequestDataPfNum_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empRestrInn", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpRestrInn(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpRestrInn_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "spouseFirstName", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataSpouseFirstName(String value) {
        return new JAXBElement<String>(_PersonRequestDataSpouseFirstName_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "posPostal", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPosPostal(String value) {
        return new JAXBElement<String>(_PersonRequestDataPosPostal_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tradeDate", scope = PersonRequestData.class)
    public JAXBElement<XMLGregorianCalendar> createPersonRequestDataTradeDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonRequestDataTradeDate_QNAME, XMLGregorianCalendar.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "issueAuthority", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataIssueAuthority(String value) {
        return new JAXBElement<String>(_PersonRequestDataIssueAuthority_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pastIssueAuthority", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPastIssueAuthority(String value) {
        return new JAXBElement<String>(_PersonRequestDataPastIssueAuthority_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "workDuration", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataWorkDuration(String value) {
        return new JAXBElement<String>(_PersonRequestDataWorkDuration_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "actAddrRegion", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataActAddrRegion(String value) {
        return new JAXBElement<String>(_PersonRequestDataActAddrRegion_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "regAddrPostal", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataRegAddrPostal(String value) {
        return new JAXBElement<String>(_PersonRequestDataRegAddrPostal_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "empDistrict", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataEmpDistrict(String value) {
        return new JAXBElement<String>(_PersonRequestDataEmpDistrict_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "posCode", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPosCode(String value) {
        return new JAXBElement<String>(_PersonRequestDataPosCode_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "middleName", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataMiddleName(String value) {
        return new JAXBElement<String>(_PersonRequestDataMiddleName_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "workPhone", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataWorkPhone(String value) {
        return new JAXBElement<String>(_PersonRequestDataWorkPhone_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "scndIdType", scope = PersonRequestData.class)
    public JAXBElement<Integer> createPersonRequestDataScndIdType(Integer value) {
        return new JAXBElement<Integer>(_PersonRequestDataScndIdType_QNAME, Integer.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pastIssueLocation", scope = PersonRequestData.class)
    public JAXBElement<String> createPersonRequestDataPastIssueLocation(String value) {
        return new JAXBElement<String>(_PersonRequestDataPastIssueLocation_QNAME, String.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "category", scope = PersonRequestData.class)
    public JAXBElement<Integer> createPersonRequestDataCategory(Integer value) {
        return new JAXBElement<Integer>(_PersonRequestDataCategory_QNAME, Integer.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "actAddrMonths", scope = PersonRequestData.class)
    public JAXBElement<Integer> createPersonRequestDataActAddrMonths(Integer value) {
        return new JAXBElement<Integer>(_PersonRequestDataActAddrMonths_QNAME, Integer.class, PersonRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uid", scope = ProcessRequestOut.class)
    public JAXBElement<String> createProcessRequestOutUid(String value) {
        return new JAXBElement<String>(_ProcessRequestOutUid_QNAME, String.class, ProcessRequestOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "reportCode", scope = ProcessRequestOut.class)
    public JAXBElement<String> createProcessRequestOutReportCode(String value) {
        return new JAXBElement<String>(_ProcessRequestOutReportCode_QNAME, String.class, ProcessRequestOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cacheUse", scope = ProcessRequestOut.class)
    public JAXBElement<Integer> createProcessRequestOutCacheUse(Integer value) {
        return new JAXBElement<Integer>(_ProcessRequestOutCacheUse_QNAME, Integer.class, ProcessRequestOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uidApplication", scope = ProcessRequestOut.class)
    public JAXBElement<String> createProcessRequestOutUidApplication(String value) {
        return new JAXBElement<String>(_ProcessRequestOutUidApplication_QNAME, String.class, ProcessRequestOut.class, value);
    }

}
