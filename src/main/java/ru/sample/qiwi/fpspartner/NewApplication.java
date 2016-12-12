/**
 * NewApplication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:09:26 BST)
 */
package ru.sample.qiwi.fpspartner;


/**
 *  NewApplication bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class NewApplication implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://example.org/FPSPartner",
            "newApplication", "ns1");

    /**
     * field for Login
     */
    protected ru.sample.qiwi.fpspartner.P50Type localLogin;

    /**
     * field for Password
     */
    protected ru.sample.qiwi.fpspartner.P50Type localPassword;

    /**
     * field for Partnerid
     */
    protected ru.sample.qiwi.fpspartner.PartneridType localPartnerid;

    /**
     * field for Applicationid
     */
    protected ru.sample.qiwi.fpspartner.P100Type localApplicationid;

    /**
     * field for Applicationdate
     */
    protected ru.sample.qiwi.fpspartner.DatetimeType localApplicationdate;

    /**
     * field for Photoid
     */
    protected ru.sample.qiwi.fpspartner.P100Type localPhotoid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPhotoidTracker = false;

    /**
     * field for Lastname
     */
    protected ru.sample.qiwi.fpspartner.P50Type localLastname;

    /**
     * field for Firstname
     */
    protected ru.sample.qiwi.fpspartner.P50Type localFirstname;

    /**
     * field for Middlename
     */
    protected ru.sample.qiwi.fpspartner.P50Type localMiddlename;

    /**
     * field for Pastlastname
     */
    protected ru.sample.qiwi.fpspartner.P50Type localPastlastname;

    /**
     * field for Birthday
     */
    protected ru.sample.qiwi.fpspartner.DateType localBirthday;

    /**
     * field for Birthplace
     */
    protected ru.sample.qiwi.fpspartner.P255Type localBirthplace;

    /**
     * field for Doctype
     */
    protected ru.sample.qiwi.fpspartner.DoctypeType localDoctype;

    /**
     * field for Docno
     */
    protected ru.sample.qiwi.fpspartner.P20Type localDocno;

    /**
     * field for Docplace
     */
    protected ru.sample.qiwi.fpspartner.P255Type localDocplace;

    /**
     * field for Docdate
     */
    protected ru.sample.qiwi.fpspartner.DateType localDocdate;

    /**
     * field for Doccode
     */
    protected ru.sample.qiwi.fpspartner.P6Type localDoccode;

    /**
     * field for Pastdoctype
     */
    protected ru.sample.qiwi.fpspartner.DoctypeType localPastdoctype;

    /**
     * field for Pastdocno
     */
    protected ru.sample.qiwi.fpspartner.P20Type localPastdocno;

    /**
     * field for Pastdocplace
     */
    protected ru.sample.qiwi.fpspartner.P255Type localPastdocplace;

    /**
     * field for Pastdocdate
     */
    protected ru.sample.qiwi.fpspartner.DateType localPastdocdate;

    /**
     * field for Sex
     */
    protected ru.sample.qiwi.fpspartner.SexType localSex;

    /**
     * field for Citizenship
     */
    protected ru.sample.qiwi.fpspartner.CitizenshipType localCitizenship;

    /**
     * field for Inn
     */
    protected ru.sample.qiwi.fpspartner.P12Type localInn;

    /**
     * field for Pfr
     */
    protected ru.sample.qiwi.fpspartner.PfrType localPfr;

    /**
     * field for Driverno
     */
    protected ru.sample.qiwi.fpspartner.DrivernoType localDriverno;

    /**
     * field for Education
     */
    protected ru.sample.qiwi.fpspartner.EducationType localEducation;

    /**
     * field for Marital
     */
    protected ru.sample.qiwi.fpspartner.MaritalType localMarital;

    /**
     * field for Numchildren
     */
    protected ru.sample.qiwi.fpspartner.P5Type localNumchildren;

    /**
     * field for Email
     */
    protected ru.sample.qiwi.fpspartner.P50Type localEmail;

    /**
     * field for Homephone
     */
    protected ru.sample.qiwi.fpspartner.P15Type localHomephone;

    /**
     * field for Mobilephone
     */
    protected ru.sample.qiwi.fpspartner.P15Type localMobilephone;

    /**
     * field for La_country
     */
    protected ru.sample.qiwi.fpspartner.CitizenshipType localLa_country;

    /**
     * field for La_index
     */
    protected ru.sample.qiwi.fpspartner.P6Type localLa_index;

    /**
     * field for La_region
     */
    protected ru.sample.qiwi.fpspartner.P100Type localLa_region;

    /**
     * field for La_district
     */
    protected ru.sample.qiwi.fpspartner.P100Type localLa_district;

    /**
     * field for La_city
     */
    protected ru.sample.qiwi.fpspartner.P100Type localLa_city;

    /**
     * field for La_settlement
     */
    protected ru.sample.qiwi.fpspartner.P100Type localLa_settlement;

    /**
     * field for La_street
     */
    protected ru.sample.qiwi.fpspartner.P100Type localLa_street;

    /**
     * field for La_house
     */
    protected ru.sample.qiwi.fpspartner.P15Type localLa_house;

    /**
     * field for La_building
     */
    protected ru.sample.qiwi.fpspartner.P15Type localLa_building;

    /**
     * field for La_structure
     */
    protected ru.sample.qiwi.fpspartner.P15Type localLa_structure;

    /**
     * field for La_apartment
     */
    protected ru.sample.qiwi.fpspartner.P15Type localLa_apartment;

    /**
     * field for La_years
     */
    protected ru.sample.qiwi.fpspartner.P5Type localLa_years;

    /**
     * field for La_month
     */
    protected ru.sample.qiwi.fpspartner.P5Type localLa_month;

    /**
     * field for La_date
     */
    protected ru.sample.qiwi.fpspartner.DateType localLa_date;

    /**
     * field for Ra_phone
     */
    protected ru.sample.qiwi.fpspartner.P15Type localRa_phone;

    /**
     * field for Ra_country
     */
    protected ru.sample.qiwi.fpspartner.CitizenshipType localRa_country;

    /**
     * field for Ra_index
     */
    protected ru.sample.qiwi.fpspartner.P6Type localRa_index;

    /**
     * field for Ra_region
     */
    protected ru.sample.qiwi.fpspartner.P100Type localRa_region;

    /**
     * field for Ra_district
     */
    protected ru.sample.qiwi.fpspartner.P100Type localRa_district;

    /**
     * field for Ra_city
     */
    protected ru.sample.qiwi.fpspartner.P100Type localRa_city;

    /**
     * field for Ra_settlement
     */
    protected ru.sample.qiwi.fpspartner.P100Type localRa_settlement;

    /**
     * field for Ra_street
     */
    protected ru.sample.qiwi.fpspartner.P100Type localRa_street;

    /**
     * field for Ra_house
     */
    protected ru.sample.qiwi.fpspartner.P15Type localRa_house;

    /**
     * field for Ra_building
     */
    protected ru.sample.qiwi.fpspartner.P15Type localRa_building;

    /**
     * field for Ra_structure
     */
    protected ru.sample.qiwi.fpspartner.P15Type localRa_structure;

    /**
     * field for Ra_apartment
     */
    protected ru.sample.qiwi.fpspartner.P15Type localRa_apartment;

    /**
     * field for Employername
     */
    protected ru.sample.qiwi.fpspartner.P255Type localEmployername;

    /**
     * field for Employersize
     */
    protected ru.sample.qiwi.fpspartner.EmployersizeType localEmployersize;

    /**
     * field for Businessindustry
     */
    protected ru.sample.qiwi.fpspartner.BusinessindustryType localBusinessindustry;

    /**
     * field for Position
     */
    protected ru.sample.qiwi.fpspartner.P100Type localPosition;

    /**
     * field for Employment_year
     */
    protected ru.sample.qiwi.fpspartner.P5Type localEmployment_year;

    /**
     * field for Employment_month
     */
    protected ru.sample.qiwi.fpspartner.P5Type localEmployment_month;

    /**
     * field for Employment_date
     */
    protected ru.sample.qiwi.fpspartner.DateType localEmployment_date;

    /**
     * field for Employment_inn
     */
    protected ru.sample.qiwi.fpspartner.P12Type localEmployment_inn;

    /**
     * field for Incomeproof
     */
    protected ru.sample.qiwi.fpspartner.IncomeproofType localIncomeproof;

    /**
     * field for Monthlyincome
     */
    protected ru.sample.qiwi.fpspartner.P15_2Type localMonthlyincome;

    /**
     * field for Ba_phone
     */
    protected ru.sample.qiwi.fpspartner.P15Type localBa_phone;

    /**
     * field for Ba_country
     */
    protected ru.sample.qiwi.fpspartner.CitizenshipType localBa_country;

    /**
     * field for Ba_index
     */
    protected ru.sample.qiwi.fpspartner.P6Type localBa_index;

    /**
     * field for Ba_region
     */
    protected ru.sample.qiwi.fpspartner.P100Type localBa_region;

    /**
     * field for Ba_district
     */
    protected ru.sample.qiwi.fpspartner.P100Type localBa_district;

    /**
     * field for Ba_city
     */
    protected ru.sample.qiwi.fpspartner.P100Type localBa_city;

    /**
     * field for Ba_settlement
     */
    protected ru.sample.qiwi.fpspartner.P100Type localBa_settlement;

    /**
     * field for Ba_street
     */
    protected ru.sample.qiwi.fpspartner.P100Type localBa_street;

    /**
     * field for Ba_house
     */
    protected ru.sample.qiwi.fpspartner.P15Type localBa_house;

    /**
     * field for Ba_building
     */
    protected ru.sample.qiwi.fpspartner.P15Type localBa_building;

    /**
     * field for Ba_structure
     */
    protected ru.sample.qiwi.fpspartner.P15Type localBa_structure;

    /**
     * field for Ba_apartment
     */
    protected ru.sample.qiwi.fpspartner.P15Type localBa_apartment;

    /**
     * field for Producttype
     */
    protected ru.sample.qiwi.fpspartner.ProducttypeType localProducttype;

    /**
     * field for Productname
     */
    protected ru.sample.qiwi.fpspartner.P255Type localProductname;

    /**
     * field for Originalchannel
     */
    protected ru.sample.qiwi.fpspartner.OriginalchannelType localOriginalchannel;

    /**
     * field for Productsumlimit
     */
    protected ru.sample.qiwi.fpspartner.P15_2Type localProductsumlimit;

    /**
     * field for Productsumcurrency
     */
    protected ru.sample.qiwi.fpspartner.ProductsumcurrencyType localProductsumcurrency;

    /**
     * field for Downpaymentamount
     */
    protected ru.sample.qiwi.fpspartner.P15_2Type localDownpaymentamount;

    /**
     * field for Collateralexistence
     */
    protected ru.sample.qiwi.fpspartner.CollateralexistenceType localCollateralexistence;

    /**
     * field for Collateralvalue
     */
    protected ru.sample.qiwi.fpspartner.P15_2Type localCollateralvalue;

    /**
     * field for Purchaseexistence
     */
    protected ru.sample.qiwi.fpspartner.PurchaseexistenceType localPurchaseexistence;

    /**
     * field for Purchasevalue
     */
    protected ru.sample.qiwi.fpspartner.P15_2Type localPurchasevalue;

    /**
     * field for Purchasemodel
     */
    protected ru.sample.qiwi.fpspartner.P255Type localPurchasemodel;

    /**
     * field for Operator_code
     */
    protected ru.sample.qiwi.fpspartner.P100Type localOperator_code;

    /**
     * field for Operator_name
     */
    protected ru.sample.qiwi.fpspartner.P255Type localOperator_name;

    /**
     * field for Pos_code
     */
    protected ru.sample.qiwi.fpspartner.P100Type localPos_code;

    /**
     * field for Pos_phone
     */
    protected ru.sample.qiwi.fpspartner.P15Type localPos_phone;

    /**
     * field for Pos_country
     */
    protected ru.sample.qiwi.fpspartner.CitizenshipType localPos_country;

    /**
     * field for Pos_index
     */
    protected ru.sample.qiwi.fpspartner.P6Type localPos_index;

    /**
     * field for Pos_region
     */
    protected ru.sample.qiwi.fpspartner.P100Type localPos_region;

    /**
     * field for Pos_district
     */
    protected ru.sample.qiwi.fpspartner.P100Type localPos_district;

    /**
     * field for Pos_city
     */
    protected ru.sample.qiwi.fpspartner.P100Type localPos_city;

    /**
     * field for Pos_settlement
     */
    protected ru.sample.qiwi.fpspartner.P100Type localPos_settlement;

    /**
     * field for Pos_street
     */
    protected ru.sample.qiwi.fpspartner.P100Type localPos_street;

    /**
     * field for Pos_house
     */
    protected ru.sample.qiwi.fpspartner.P15Type localPos_house;

    /**
     * field for Pos_building
     */
    protected ru.sample.qiwi.fpspartner.P15Type localPos_building;

    /**
     * field for Pos_structure
     */
    protected ru.sample.qiwi.fpspartner.P15Type localPos_structure;

    /**
     * field for Pos_apartment
     */
    protected ru.sample.qiwi.fpspartner.P15Type localPos_apartment;

    /**
     * field for Newapplicant
     */
    protected ru.sample.qiwi.fpspartner.NewapplicantType localNewapplicant;

    /**
     * field for Applicanttype
     */
    protected ru.sample.qiwi.fpspartner.ApplicanttypeType localApplicanttype;

    /**
     * field for Applicanttypenum
     */
    protected ru.sample.qiwi.fpspartner.ApplicanttypenumType localApplicanttypenum;

    /**
     * field for Responseisneeded
     */
    protected ru.sample.qiwi.fpspartner.ResponseisneededType localResponseisneeded;

    /**
     * field for Applicationstatus
     */
    protected ru.sample.qiwi.fpspartner.ApplicationstatusType localApplicationstatus;

    /**
     * field for Applicantid
     */
    protected ru.sample.qiwi.fpspartner.ApplicantidType localApplicantid;

    /**
     * field for Tradedate
     */
    protected ru.sample.qiwi.fpspartner.DateType localTradedate;

    /**
     * field for Initialsumlimit
     */
    protected ru.sample.qiwi.fpspartner.P15_2Type localInitialsumlimit;

    /**
     * field for Initialsumcurrency
     */
    protected ru.sample.qiwi.fpspartner.ProductsumcurrencyType localInitialsumcurrency;

    /**
     * field for Applicationfraudstatus
     */
    protected ru.sample.qiwi.fpspartner.ApplicationfraudstatusType localApplicationfraudstatus;

    /**
     * field for Applicationfraudstatusdescr
     */
    protected ru.sample.qiwi.fpspartner.P1024Type localApplicationfraudstatusdescr;

    /**
     * field for Defaultstatus
     */
    protected ru.sample.qiwi.fpspartner.DefaultstatusType localDefaultstatus;

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P50Type
     */
    public ru.sample.qiwi.fpspartner.P50Type getLogin() {
        return localLogin;
    }

    /**
     * Auto generated setter method
     * @param param Login
     */
    public void setLogin(ru.sample.qiwi.fpspartner.P50Type param) {
        this.localLogin = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P50Type
     */
    public ru.sample.qiwi.fpspartner.P50Type getPassword() {
        return localPassword;
    }

    /**
     * Auto generated setter method
     * @param param Password
     */
    public void setPassword(ru.sample.qiwi.fpspartner.P50Type param) {
        this.localPassword = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.PartneridType
     */
    public ru.sample.qiwi.fpspartner.PartneridType getPartnerid() {
        return localPartnerid;
    }

    /**
     * Auto generated setter method
     * @param param Partnerid
     */
    public void setPartnerid(ru.sample.qiwi.fpspartner.PartneridType param) {
        this.localPartnerid = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getApplicationid() {
        return localApplicationid;
    }

    /**
     * Auto generated setter method
     * @param param Applicationid
     */
    public void setApplicationid(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localApplicationid = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.DatetimeType
     */
    public ru.sample.qiwi.fpspartner.DatetimeType getApplicationdate() {
        return localApplicationdate;
    }

    /**
     * Auto generated setter method
     * @param param Applicationdate
     */
    public void setApplicationdate(ru.sample.qiwi.fpspartner.DatetimeType param) {
        this.localApplicationdate = param;
    }

    public boolean isPhotoidSpecified() {
        return localPhotoidTracker;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getPhotoid() {
        return localPhotoid;
    }

    /**
     * Auto generated setter method
     * @param param Photoid
     */
    public void setPhotoid(ru.sample.qiwi.fpspartner.P100Type param) {
        localPhotoidTracker = param != null;

        this.localPhotoid = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P50Type
     */
    public ru.sample.qiwi.fpspartner.P50Type getLastname() {
        return localLastname;
    }

    /**
     * Auto generated setter method
     * @param param Lastname
     */
    public void setLastname(ru.sample.qiwi.fpspartner.P50Type param) {
        this.localLastname = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P50Type
     */
    public ru.sample.qiwi.fpspartner.P50Type getFirstname() {
        return localFirstname;
    }

    /**
     * Auto generated setter method
     * @param param Firstname
     */
    public void setFirstname(ru.sample.qiwi.fpspartner.P50Type param) {
        this.localFirstname = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P50Type
     */
    public ru.sample.qiwi.fpspartner.P50Type getMiddlename() {
        return localMiddlename;
    }

    /**
     * Auto generated setter method
     * @param param Middlename
     */
    public void setMiddlename(ru.sample.qiwi.fpspartner.P50Type param) {
        this.localMiddlename = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P50Type
     */
    public ru.sample.qiwi.fpspartner.P50Type getPastlastname() {
        return localPastlastname;
    }

    /**
     * Auto generated setter method
     * @param param Pastlastname
     */
    public void setPastlastname(ru.sample.qiwi.fpspartner.P50Type param) {
        this.localPastlastname = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.DateType
     */
    public ru.sample.qiwi.fpspartner.DateType getBirthday() {
        return localBirthday;
    }

    /**
     * Auto generated setter method
     * @param param Birthday
     */
    public void setBirthday(ru.sample.qiwi.fpspartner.DateType param) {
        this.localBirthday = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P255Type
     */
    public ru.sample.qiwi.fpspartner.P255Type getBirthplace() {
        return localBirthplace;
    }

    /**
     * Auto generated setter method
     * @param param Birthplace
     */
    public void setBirthplace(ru.sample.qiwi.fpspartner.P255Type param) {
        this.localBirthplace = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.DoctypeType
     */
    public ru.sample.qiwi.fpspartner.DoctypeType getDoctype() {
        return localDoctype;
    }

    /**
     * Auto generated setter method
     * @param param Doctype
     */
    public void setDoctype(ru.sample.qiwi.fpspartner.DoctypeType param) {
        this.localDoctype = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P20Type
     */
    public ru.sample.qiwi.fpspartner.P20Type getDocno() {
        return localDocno;
    }

    /**
     * Auto generated setter method
     * @param param Docno
     */
    public void setDocno(ru.sample.qiwi.fpspartner.P20Type param) {
        this.localDocno = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P255Type
     */
    public ru.sample.qiwi.fpspartner.P255Type getDocplace() {
        return localDocplace;
    }

    /**
     * Auto generated setter method
     * @param param Docplace
     */
    public void setDocplace(ru.sample.qiwi.fpspartner.P255Type param) {
        this.localDocplace = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.DateType
     */
    public ru.sample.qiwi.fpspartner.DateType getDocdate() {
        return localDocdate;
    }

    /**
     * Auto generated setter method
     * @param param Docdate
     */
    public void setDocdate(ru.sample.qiwi.fpspartner.DateType param) {
        this.localDocdate = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P6Type
     */
    public ru.sample.qiwi.fpspartner.P6Type getDoccode() {
        return localDoccode;
    }

    /**
     * Auto generated setter method
     * @param param Doccode
     */
    public void setDoccode(ru.sample.qiwi.fpspartner.P6Type param) {
        this.localDoccode = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.DoctypeType
     */
    public ru.sample.qiwi.fpspartner.DoctypeType getPastdoctype() {
        return localPastdoctype;
    }

    /**
     * Auto generated setter method
     * @param param Pastdoctype
     */
    public void setPastdoctype(ru.sample.qiwi.fpspartner.DoctypeType param) {
        this.localPastdoctype = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P20Type
     */
    public ru.sample.qiwi.fpspartner.P20Type getPastdocno() {
        return localPastdocno;
    }

    /**
     * Auto generated setter method
     * @param param Pastdocno
     */
    public void setPastdocno(ru.sample.qiwi.fpspartner.P20Type param) {
        this.localPastdocno = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P255Type
     */
    public ru.sample.qiwi.fpspartner.P255Type getPastdocplace() {
        return localPastdocplace;
    }

    /**
     * Auto generated setter method
     * @param param Pastdocplace
     */
    public void setPastdocplace(ru.sample.qiwi.fpspartner.P255Type param) {
        this.localPastdocplace = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.DateType
     */
    public ru.sample.qiwi.fpspartner.DateType getPastdocdate() {
        return localPastdocdate;
    }

    /**
     * Auto generated setter method
     * @param param Pastdocdate
     */
    public void setPastdocdate(ru.sample.qiwi.fpspartner.DateType param) {
        this.localPastdocdate = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.SexType
     */
    public ru.sample.qiwi.fpspartner.SexType getSex() {
        return localSex;
    }

    /**
     * Auto generated setter method
     * @param param Sex
     */
    public void setSex(ru.sample.qiwi.fpspartner.SexType param) {
        this.localSex = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.CitizenshipType
     */
    public ru.sample.qiwi.fpspartner.CitizenshipType getCitizenship() {
        return localCitizenship;
    }

    /**
     * Auto generated setter method
     * @param param Citizenship
     */
    public void setCitizenship(ru.sample.qiwi.fpspartner.CitizenshipType param) {
        this.localCitizenship = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P12Type
     */
    public ru.sample.qiwi.fpspartner.P12Type getInn() {
        return localInn;
    }

    /**
     * Auto generated setter method
     * @param param Inn
     */
    public void setInn(ru.sample.qiwi.fpspartner.P12Type param) {
        this.localInn = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.PfrType
     */
    public ru.sample.qiwi.fpspartner.PfrType getPfr() {
        return localPfr;
    }

    /**
     * Auto generated setter method
     * @param param Pfr
     */
    public void setPfr(ru.sample.qiwi.fpspartner.PfrType param) {
        this.localPfr = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.DrivernoType
     */
    public ru.sample.qiwi.fpspartner.DrivernoType getDriverno() {
        return localDriverno;
    }

    /**
     * Auto generated setter method
     * @param param Driverno
     */
    public void setDriverno(ru.sample.qiwi.fpspartner.DrivernoType param) {
        this.localDriverno = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.EducationType
     */
    public ru.sample.qiwi.fpspartner.EducationType getEducation() {
        return localEducation;
    }

    /**
     * Auto generated setter method
     * @param param Education
     */
    public void setEducation(ru.sample.qiwi.fpspartner.EducationType param) {
        this.localEducation = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.MaritalType
     */
    public ru.sample.qiwi.fpspartner.MaritalType getMarital() {
        return localMarital;
    }

    /**
     * Auto generated setter method
     * @param param Marital
     */
    public void setMarital(ru.sample.qiwi.fpspartner.MaritalType param) {
        this.localMarital = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P5Type
     */
    public ru.sample.qiwi.fpspartner.P5Type getNumchildren() {
        return localNumchildren;
    }

    /**
     * Auto generated setter method
     * @param param Numchildren
     */
    public void setNumchildren(ru.sample.qiwi.fpspartner.P5Type param) {
        this.localNumchildren = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P50Type
     */
    public ru.sample.qiwi.fpspartner.P50Type getEmail() {
        return localEmail;
    }

    /**
     * Auto generated setter method
     * @param param Email
     */
    public void setEmail(ru.sample.qiwi.fpspartner.P50Type param) {
        this.localEmail = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getHomephone() {
        return localHomephone;
    }

    /**
     * Auto generated setter method
     * @param param Homephone
     */
    public void setHomephone(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localHomephone = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getMobilephone() {
        return localMobilephone;
    }

    /**
     * Auto generated setter method
     * @param param Mobilephone
     */
    public void setMobilephone(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localMobilephone = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.CitizenshipType
     */
    public ru.sample.qiwi.fpspartner.CitizenshipType getLa_country() {
        return localLa_country;
    }

    /**
     * Auto generated setter method
     * @param param La_country
     */
    public void setLa_country(ru.sample.qiwi.fpspartner.CitizenshipType param) {
        this.localLa_country = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P6Type
     */
    public ru.sample.qiwi.fpspartner.P6Type getLa_index() {
        return localLa_index;
    }

    /**
     * Auto generated setter method
     * @param param La_index
     */
    public void setLa_index(ru.sample.qiwi.fpspartner.P6Type param) {
        this.localLa_index = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getLa_region() {
        return localLa_region;
    }

    /**
     * Auto generated setter method
     * @param param La_region
     */
    public void setLa_region(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localLa_region = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getLa_district() {
        return localLa_district;
    }

    /**
     * Auto generated setter method
     * @param param La_district
     */
    public void setLa_district(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localLa_district = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getLa_city() {
        return localLa_city;
    }

    /**
     * Auto generated setter method
     * @param param La_city
     */
    public void setLa_city(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localLa_city = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getLa_settlement() {
        return localLa_settlement;
    }

    /**
     * Auto generated setter method
     * @param param La_settlement
     */
    public void setLa_settlement(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localLa_settlement = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getLa_street() {
        return localLa_street;
    }

    /**
     * Auto generated setter method
     * @param param La_street
     */
    public void setLa_street(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localLa_street = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getLa_house() {
        return localLa_house;
    }

    /**
     * Auto generated setter method
     * @param param La_house
     */
    public void setLa_house(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localLa_house = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getLa_building() {
        return localLa_building;
    }

    /**
     * Auto generated setter method
     * @param param La_building
     */
    public void setLa_building(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localLa_building = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getLa_structure() {
        return localLa_structure;
    }

    /**
     * Auto generated setter method
     * @param param La_structure
     */
    public void setLa_structure(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localLa_structure = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getLa_apartment() {
        return localLa_apartment;
    }

    /**
     * Auto generated setter method
     * @param param La_apartment
     */
    public void setLa_apartment(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localLa_apartment = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P5Type
     */
    public ru.sample.qiwi.fpspartner.P5Type getLa_years() {
        return localLa_years;
    }

    /**
     * Auto generated setter method
     * @param param La_years
     */
    public void setLa_years(ru.sample.qiwi.fpspartner.P5Type param) {
        this.localLa_years = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P5Type
     */
    public ru.sample.qiwi.fpspartner.P5Type getLa_month() {
        return localLa_month;
    }

    /**
     * Auto generated setter method
     * @param param La_month
     */
    public void setLa_month(ru.sample.qiwi.fpspartner.P5Type param) {
        this.localLa_month = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.DateType
     */
    public ru.sample.qiwi.fpspartner.DateType getLa_date() {
        return localLa_date;
    }

    /**
     * Auto generated setter method
     * @param param La_date
     */
    public void setLa_date(ru.sample.qiwi.fpspartner.DateType param) {
        this.localLa_date = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getRa_phone() {
        return localRa_phone;
    }

    /**
     * Auto generated setter method
     * @param param Ra_phone
     */
    public void setRa_phone(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localRa_phone = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.CitizenshipType
     */
    public ru.sample.qiwi.fpspartner.CitizenshipType getRa_country() {
        return localRa_country;
    }

    /**
     * Auto generated setter method
     * @param param Ra_country
     */
    public void setRa_country(ru.sample.qiwi.fpspartner.CitizenshipType param) {
        this.localRa_country = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P6Type
     */
    public ru.sample.qiwi.fpspartner.P6Type getRa_index() {
        return localRa_index;
    }

    /**
     * Auto generated setter method
     * @param param Ra_index
     */
    public void setRa_index(ru.sample.qiwi.fpspartner.P6Type param) {
        this.localRa_index = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getRa_region() {
        return localRa_region;
    }

    /**
     * Auto generated setter method
     * @param param Ra_region
     */
    public void setRa_region(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localRa_region = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getRa_district() {
        return localRa_district;
    }

    /**
     * Auto generated setter method
     * @param param Ra_district
     */
    public void setRa_district(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localRa_district = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getRa_city() {
        return localRa_city;
    }

    /**
     * Auto generated setter method
     * @param param Ra_city
     */
    public void setRa_city(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localRa_city = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getRa_settlement() {
        return localRa_settlement;
    }

    /**
     * Auto generated setter method
     * @param param Ra_settlement
     */
    public void setRa_settlement(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localRa_settlement = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getRa_street() {
        return localRa_street;
    }

    /**
     * Auto generated setter method
     * @param param Ra_street
     */
    public void setRa_street(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localRa_street = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getRa_house() {
        return localRa_house;
    }

    /**
     * Auto generated setter method
     * @param param Ra_house
     */
    public void setRa_house(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localRa_house = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getRa_building() {
        return localRa_building;
    }

    /**
     * Auto generated setter method
     * @param param Ra_building
     */
    public void setRa_building(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localRa_building = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getRa_structure() {
        return localRa_structure;
    }

    /**
     * Auto generated setter method
     * @param param Ra_structure
     */
    public void setRa_structure(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localRa_structure = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getRa_apartment() {
        return localRa_apartment;
    }

    /**
     * Auto generated setter method
     * @param param Ra_apartment
     */
    public void setRa_apartment(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localRa_apartment = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P255Type
     */
    public ru.sample.qiwi.fpspartner.P255Type getEmployername() {
        return localEmployername;
    }

    /**
     * Auto generated setter method
     * @param param Employername
     */
    public void setEmployername(ru.sample.qiwi.fpspartner.P255Type param) {
        this.localEmployername = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.EmployersizeType
     */
    public ru.sample.qiwi.fpspartner.EmployersizeType getEmployersize() {
        return localEmployersize;
    }

    /**
     * Auto generated setter method
     * @param param Employersize
     */
    public void setEmployersize(ru.sample.qiwi.fpspartner.EmployersizeType param) {
        this.localEmployersize = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.BusinessindustryType
     */
    public ru.sample.qiwi.fpspartner.BusinessindustryType getBusinessindustry() {
        return localBusinessindustry;
    }

    /**
     * Auto generated setter method
     * @param param Businessindustry
     */
    public void setBusinessindustry(
        ru.sample.qiwi.fpspartner.BusinessindustryType param) {
        this.localBusinessindustry = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getPosition() {
        return localPosition;
    }

    /**
     * Auto generated setter method
     * @param param Position
     */
    public void setPosition(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localPosition = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P5Type
     */
    public ru.sample.qiwi.fpspartner.P5Type getEmployment_year() {
        return localEmployment_year;
    }

    /**
     * Auto generated setter method
     * @param param Employment_year
     */
    public void setEmployment_year(ru.sample.qiwi.fpspartner.P5Type param) {
        this.localEmployment_year = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P5Type
     */
    public ru.sample.qiwi.fpspartner.P5Type getEmployment_month() {
        return localEmployment_month;
    }

    /**
     * Auto generated setter method
     * @param param Employment_month
     */
    public void setEmployment_month(ru.sample.qiwi.fpspartner.P5Type param) {
        this.localEmployment_month = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.DateType
     */
    public ru.sample.qiwi.fpspartner.DateType getEmployment_date() {
        return localEmployment_date;
    }

    /**
     * Auto generated setter method
     * @param param Employment_date
     */
    public void setEmployment_date(ru.sample.qiwi.fpspartner.DateType param) {
        this.localEmployment_date = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P12Type
     */
    public ru.sample.qiwi.fpspartner.P12Type getEmployment_inn() {
        return localEmployment_inn;
    }

    /**
     * Auto generated setter method
     * @param param Employment_inn
     */
    public void setEmployment_inn(ru.sample.qiwi.fpspartner.P12Type param) {
        this.localEmployment_inn = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.IncomeproofType
     */
    public ru.sample.qiwi.fpspartner.IncomeproofType getIncomeproof() {
        return localIncomeproof;
    }

    /**
     * Auto generated setter method
     * @param param Incomeproof
     */
    public void setIncomeproof(ru.sample.qiwi.fpspartner.IncomeproofType param) {
        this.localIncomeproof = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15_2Type
     */
    public ru.sample.qiwi.fpspartner.P15_2Type getMonthlyincome() {
        return localMonthlyincome;
    }

    /**
     * Auto generated setter method
     * @param param Monthlyincome
     */
    public void setMonthlyincome(ru.sample.qiwi.fpspartner.P15_2Type param) {
        this.localMonthlyincome = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getBa_phone() {
        return localBa_phone;
    }

    /**
     * Auto generated setter method
     * @param param Ba_phone
     */
    public void setBa_phone(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localBa_phone = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.CitizenshipType
     */
    public ru.sample.qiwi.fpspartner.CitizenshipType getBa_country() {
        return localBa_country;
    }

    /**
     * Auto generated setter method
     * @param param Ba_country
     */
    public void setBa_country(ru.sample.qiwi.fpspartner.CitizenshipType param) {
        this.localBa_country = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P6Type
     */
    public ru.sample.qiwi.fpspartner.P6Type getBa_index() {
        return localBa_index;
    }

    /**
     * Auto generated setter method
     * @param param Ba_index
     */
    public void setBa_index(ru.sample.qiwi.fpspartner.P6Type param) {
        this.localBa_index = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getBa_region() {
        return localBa_region;
    }

    /**
     * Auto generated setter method
     * @param param Ba_region
     */
    public void setBa_region(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localBa_region = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getBa_district() {
        return localBa_district;
    }

    /**
     * Auto generated setter method
     * @param param Ba_district
     */
    public void setBa_district(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localBa_district = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getBa_city() {
        return localBa_city;
    }

    /**
     * Auto generated setter method
     * @param param Ba_city
     */
    public void setBa_city(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localBa_city = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getBa_settlement() {
        return localBa_settlement;
    }

    /**
     * Auto generated setter method
     * @param param Ba_settlement
     */
    public void setBa_settlement(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localBa_settlement = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getBa_street() {
        return localBa_street;
    }

    /**
     * Auto generated setter method
     * @param param Ba_street
     */
    public void setBa_street(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localBa_street = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getBa_house() {
        return localBa_house;
    }

    /**
     * Auto generated setter method
     * @param param Ba_house
     */
    public void setBa_house(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localBa_house = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getBa_building() {
        return localBa_building;
    }

    /**
     * Auto generated setter method
     * @param param Ba_building
     */
    public void setBa_building(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localBa_building = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getBa_structure() {
        return localBa_structure;
    }

    /**
     * Auto generated setter method
     * @param param Ba_structure
     */
    public void setBa_structure(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localBa_structure = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getBa_apartment() {
        return localBa_apartment;
    }

    /**
     * Auto generated setter method
     * @param param Ba_apartment
     */
    public void setBa_apartment(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localBa_apartment = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.ProducttypeType
     */
    public ru.sample.qiwi.fpspartner.ProducttypeType getProducttype() {
        return localProducttype;
    }

    /**
     * Auto generated setter method
     * @param param Producttype
     */
    public void setProducttype(ru.sample.qiwi.fpspartner.ProducttypeType param) {
        this.localProducttype = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P255Type
     */
    public ru.sample.qiwi.fpspartner.P255Type getProductname() {
        return localProductname;
    }

    /**
     * Auto generated setter method
     * @param param Productname
     */
    public void setProductname(ru.sample.qiwi.fpspartner.P255Type param) {
        this.localProductname = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.OriginalchannelType
     */
    public ru.sample.qiwi.fpspartner.OriginalchannelType getOriginalchannel() {
        return localOriginalchannel;
    }

    /**
     * Auto generated setter method
     * @param param Originalchannel
     */
    public void setOriginalchannel(
        ru.sample.qiwi.fpspartner.OriginalchannelType param) {
        this.localOriginalchannel = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15_2Type
     */
    public ru.sample.qiwi.fpspartner.P15_2Type getProductsumlimit() {
        return localProductsumlimit;
    }

    /**
     * Auto generated setter method
     * @param param Productsumlimit
     */
    public void setProductsumlimit(ru.sample.qiwi.fpspartner.P15_2Type param) {
        this.localProductsumlimit = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.ProductsumcurrencyType
     */
    public ru.sample.qiwi.fpspartner.ProductsumcurrencyType getProductsumcurrency() {
        return localProductsumcurrency;
    }

    /**
     * Auto generated setter method
     * @param param Productsumcurrency
     */
    public void setProductsumcurrency(
        ru.sample.qiwi.fpspartner.ProductsumcurrencyType param) {
        this.localProductsumcurrency = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15_2Type
     */
    public ru.sample.qiwi.fpspartner.P15_2Type getDownpaymentamount() {
        return localDownpaymentamount;
    }

    /**
     * Auto generated setter method
     * @param param Downpaymentamount
     */
    public void setDownpaymentamount(ru.sample.qiwi.fpspartner.P15_2Type param) {
        this.localDownpaymentamount = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.CollateralexistenceType
     */
    public ru.sample.qiwi.fpspartner.CollateralexistenceType getCollateralexistence() {
        return localCollateralexistence;
    }

    /**
     * Auto generated setter method
     * @param param Collateralexistence
     */
    public void setCollateralexistence(
        ru.sample.qiwi.fpspartner.CollateralexistenceType param) {
        this.localCollateralexistence = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15_2Type
     */
    public ru.sample.qiwi.fpspartner.P15_2Type getCollateralvalue() {
        return localCollateralvalue;
    }

    /**
     * Auto generated setter method
     * @param param Collateralvalue
     */
    public void setCollateralvalue(ru.sample.qiwi.fpspartner.P15_2Type param) {
        this.localCollateralvalue = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.PurchaseexistenceType
     */
    public ru.sample.qiwi.fpspartner.PurchaseexistenceType getPurchaseexistence() {
        return localPurchaseexistence;
    }

    /**
     * Auto generated setter method
     * @param param Purchaseexistence
     */
    public void setPurchaseexistence(
        ru.sample.qiwi.fpspartner.PurchaseexistenceType param) {
        this.localPurchaseexistence = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15_2Type
     */
    public ru.sample.qiwi.fpspartner.P15_2Type getPurchasevalue() {
        return localPurchasevalue;
    }

    /**
     * Auto generated setter method
     * @param param Purchasevalue
     */
    public void setPurchasevalue(ru.sample.qiwi.fpspartner.P15_2Type param) {
        this.localPurchasevalue = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P255Type
     */
    public ru.sample.qiwi.fpspartner.P255Type getPurchasemodel() {
        return localPurchasemodel;
    }

    /**
     * Auto generated setter method
     * @param param Purchasemodel
     */
    public void setPurchasemodel(ru.sample.qiwi.fpspartner.P255Type param) {
        this.localPurchasemodel = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getOperator_code() {
        return localOperator_code;
    }

    /**
     * Auto generated setter method
     * @param param Operator_code
     */
    public void setOperator_code(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localOperator_code = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P255Type
     */
    public ru.sample.qiwi.fpspartner.P255Type getOperator_name() {
        return localOperator_name;
    }

    /**
     * Auto generated setter method
     * @param param Operator_name
     */
    public void setOperator_name(ru.sample.qiwi.fpspartner.P255Type param) {
        this.localOperator_name = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getPos_code() {
        return localPos_code;
    }

    /**
     * Auto generated setter method
     * @param param Pos_code
     */
    public void setPos_code(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localPos_code = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getPos_phone() {
        return localPos_phone;
    }

    /**
     * Auto generated setter method
     * @param param Pos_phone
     */
    public void setPos_phone(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localPos_phone = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.CitizenshipType
     */
    public ru.sample.qiwi.fpspartner.CitizenshipType getPos_country() {
        return localPos_country;
    }

    /**
     * Auto generated setter method
     * @param param Pos_country
     */
    public void setPos_country(ru.sample.qiwi.fpspartner.CitizenshipType param) {
        this.localPos_country = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P6Type
     */
    public ru.sample.qiwi.fpspartner.P6Type getPos_index() {
        return localPos_index;
    }

    /**
     * Auto generated setter method
     * @param param Pos_index
     */
    public void setPos_index(ru.sample.qiwi.fpspartner.P6Type param) {
        this.localPos_index = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getPos_region() {
        return localPos_region;
    }

    /**
     * Auto generated setter method
     * @param param Pos_region
     */
    public void setPos_region(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localPos_region = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getPos_district() {
        return localPos_district;
    }

    /**
     * Auto generated setter method
     * @param param Pos_district
     */
    public void setPos_district(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localPos_district = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getPos_city() {
        return localPos_city;
    }

    /**
     * Auto generated setter method
     * @param param Pos_city
     */
    public void setPos_city(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localPos_city = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getPos_settlement() {
        return localPos_settlement;
    }

    /**
     * Auto generated setter method
     * @param param Pos_settlement
     */
    public void setPos_settlement(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localPos_settlement = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getPos_street() {
        return localPos_street;
    }

    /**
     * Auto generated setter method
     * @param param Pos_street
     */
    public void setPos_street(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localPos_street = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getPos_house() {
        return localPos_house;
    }

    /**
     * Auto generated setter method
     * @param param Pos_house
     */
    public void setPos_house(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localPos_house = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getPos_building() {
        return localPos_building;
    }

    /**
     * Auto generated setter method
     * @param param Pos_building
     */
    public void setPos_building(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localPos_building = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getPos_structure() {
        return localPos_structure;
    }

    /**
     * Auto generated setter method
     * @param param Pos_structure
     */
    public void setPos_structure(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localPos_structure = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15Type
     */
    public ru.sample.qiwi.fpspartner.P15Type getPos_apartment() {
        return localPos_apartment;
    }

    /**
     * Auto generated setter method
     * @param param Pos_apartment
     */
    public void setPos_apartment(ru.sample.qiwi.fpspartner.P15Type param) {
        this.localPos_apartment = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.NewapplicantType
     */
    public ru.sample.qiwi.fpspartner.NewapplicantType getNewapplicant() {
        return localNewapplicant;
    }

    /**
     * Auto generated setter method
     * @param param Newapplicant
     */
    public void setNewapplicant(ru.sample.qiwi.fpspartner.NewapplicantType param) {
        this.localNewapplicant = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.ApplicanttypeType
     */
    public ru.sample.qiwi.fpspartner.ApplicanttypeType getApplicanttype() {
        return localApplicanttype;
    }

    /**
     * Auto generated setter method
     * @param param Applicanttype
     */
    public void setApplicanttype(ru.sample.qiwi.fpspartner.ApplicanttypeType param) {
        this.localApplicanttype = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.ApplicanttypenumType
     */
    public ru.sample.qiwi.fpspartner.ApplicanttypenumType getApplicanttypenum() {
        return localApplicanttypenum;
    }

    /**
     * Auto generated setter method
     * @param param Applicanttypenum
     */
    public void setApplicanttypenum(
        ru.sample.qiwi.fpspartner.ApplicanttypenumType param) {
        this.localApplicanttypenum = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.ResponseisneededType
     */
    public ru.sample.qiwi.fpspartner.ResponseisneededType getResponseisneeded() {
        return localResponseisneeded;
    }

    /**
     * Auto generated setter method
     * @param param Responseisneeded
     */
    public void setResponseisneeded(
        ru.sample.qiwi.fpspartner.ResponseisneededType param) {
        this.localResponseisneeded = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.ApplicationstatusType
     */
    public ru.sample.qiwi.fpspartner.ApplicationstatusType getApplicationstatus() {
        return localApplicationstatus;
    }

    /**
     * Auto generated setter method
     * @param param Applicationstatus
     */
    public void setApplicationstatus(
        ru.sample.qiwi.fpspartner.ApplicationstatusType param) {
        this.localApplicationstatus = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.ApplicantidType
     */
    public ru.sample.qiwi.fpspartner.ApplicantidType getApplicantid() {
        return localApplicantid;
    }

    /**
     * Auto generated setter method
     * @param param Applicantid
     */
    public void setApplicantid(ru.sample.qiwi.fpspartner.ApplicantidType param) {
        this.localApplicantid = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.DateType
     */
    public ru.sample.qiwi.fpspartner.DateType getTradedate() {
        return localTradedate;
    }

    /**
     * Auto generated setter method
     * @param param Tradedate
     */
    public void setTradedate(ru.sample.qiwi.fpspartner.DateType param) {
        this.localTradedate = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P15_2Type
     */
    public ru.sample.qiwi.fpspartner.P15_2Type getInitialsumlimit() {
        return localInitialsumlimit;
    }

    /**
     * Auto generated setter method
     * @param param Initialsumlimit
     */
    public void setInitialsumlimit(ru.sample.qiwi.fpspartner.P15_2Type param) {
        this.localInitialsumlimit = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.ProductsumcurrencyType
     */
    public ru.sample.qiwi.fpspartner.ProductsumcurrencyType getInitialsumcurrency() {
        return localInitialsumcurrency;
    }

    /**
     * Auto generated setter method
     * @param param Initialsumcurrency
     */
    public void setInitialsumcurrency(
        ru.sample.qiwi.fpspartner.ProductsumcurrencyType param) {
        this.localInitialsumcurrency = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.ApplicationfraudstatusType
     */
    public ru.sample.qiwi.fpspartner.ApplicationfraudstatusType getApplicationfraudstatus() {
        return localApplicationfraudstatus;
    }

    /**
     * Auto generated setter method
     * @param param Applicationfraudstatus
     */
    public void setApplicationfraudstatus(
        ru.sample.qiwi.fpspartner.ApplicationfraudstatusType param) {
        this.localApplicationfraudstatus = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P1024Type
     */
    public ru.sample.qiwi.fpspartner.P1024Type getApplicationfraudstatusdescr() {
        return localApplicationfraudstatusdescr;
    }

    /**
     * Auto generated setter method
     * @param param Applicationfraudstatusdescr
     */
    public void setApplicationfraudstatusdescr(
        ru.sample.qiwi.fpspartner.P1024Type param) {
        this.localApplicationfraudstatusdescr = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.DefaultstatusType
     */
    public ru.sample.qiwi.fpspartner.DefaultstatusType getDefaultstatus() {
        return localDefaultstatus;
    }

    /**
     * Auto generated setter method
     * @param param Defaultstatus
     */
    public void setDefaultstatus(ru.sample.qiwi.fpspartner.DefaultstatusType param) {
        this.localDefaultstatus = param;
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName,
        final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, MY_QNAME));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
            xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://example.org/FPSPartner");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":newApplication", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "newApplication", xmlWriter);
            }
        }

        if (localLogin == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "login cannot be null!!");
        }

        localLogin.serialize(new javax.xml.namespace.QName("", "login"),
            xmlWriter);

        if (localPassword == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "password cannot be null!!");
        }

        localPassword.serialize(new javax.xml.namespace.QName("", "password"),
            xmlWriter);

        if (localPartnerid == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "partnerid cannot be null!!");
        }

        localPartnerid.serialize(new javax.xml.namespace.QName("", "partnerid"),
            xmlWriter);

        if (localApplicationid == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "applicationid cannot be null!!");
        }

        localApplicationid.serialize(new javax.xml.namespace.QName("",
                "applicationid"), xmlWriter);

        if (localApplicationdate == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "applicationdate cannot be null!!");
        }

        localApplicationdate.serialize(new javax.xml.namespace.QName("",
                "applicationdate"), xmlWriter);

        if (localPhotoidTracker) {
            if (localPhotoid == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "photoid cannot be null!!");
            }

            localPhotoid.serialize(new javax.xml.namespace.QName("", "photoid"),
                xmlWriter);
        }

        if (localLastname == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "lastname cannot be null!!");
        }

        localLastname.serialize(new javax.xml.namespace.QName("", "lastname"),
            xmlWriter);

        if (localFirstname == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "firstname cannot be null!!");
        }

        localFirstname.serialize(new javax.xml.namespace.QName("", "firstname"),
            xmlWriter);

        if (localMiddlename == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "middlename cannot be null!!");
        }

        localMiddlename.serialize(new javax.xml.namespace.QName("", "middlename"),
            xmlWriter);

        if (localPastlastname == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "pastlastname cannot be null!!");
        }

        localPastlastname.serialize(new javax.xml.namespace.QName("",
                "pastlastname"), xmlWriter);

        if (localBirthday == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "birthday cannot be null!!");
        }

        localBirthday.serialize(new javax.xml.namespace.QName("", "birthday"),
            xmlWriter);

        if (localBirthplace == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "birthplace cannot be null!!");
        }

        localBirthplace.serialize(new javax.xml.namespace.QName("", "birthplace"),
            xmlWriter);

        if (localDoctype == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "doctype cannot be null!!");
        }

        localDoctype.serialize(new javax.xml.namespace.QName("", "doctype"),
            xmlWriter);

        if (localDocno == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "docno cannot be null!!");
        }

        localDocno.serialize(new javax.xml.namespace.QName("", "docno"),
            xmlWriter);

        if (localDocplace == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "docplace cannot be null!!");
        }

        localDocplace.serialize(new javax.xml.namespace.QName("", "docplace"),
            xmlWriter);

        if (localDocdate == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "docdate cannot be null!!");
        }

        localDocdate.serialize(new javax.xml.namespace.QName("", "docdate"),
            xmlWriter);

        if (localDoccode == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "doccode cannot be null!!");
        }

        localDoccode.serialize(new javax.xml.namespace.QName("", "doccode"),
            xmlWriter);

        if (localPastdoctype == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "pastdoctype cannot be null!!");
        }

        localPastdoctype.serialize(new javax.xml.namespace.QName("",
                "pastdoctype"), xmlWriter);

        if (localPastdocno == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "pastdocno cannot be null!!");
        }

        localPastdocno.serialize(new javax.xml.namespace.QName("", "pastdocno"),
            xmlWriter);

        if (localPastdocplace == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "pastdocplace cannot be null!!");
        }

        localPastdocplace.serialize(new javax.xml.namespace.QName("",
                "pastdocplace"), xmlWriter);

        if (localPastdocdate == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "pastdocdate cannot be null!!");
        }

        localPastdocdate.serialize(new javax.xml.namespace.QName("",
                "pastdocdate"), xmlWriter);

        if (localSex == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "sex cannot be null!!");
        }

        localSex.serialize(new javax.xml.namespace.QName("", "sex"), xmlWriter);

        if (localCitizenship == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "citizenship cannot be null!!");
        }

        localCitizenship.serialize(new javax.xml.namespace.QName("",
                "citizenship"), xmlWriter);

        if (localInn == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "inn cannot be null!!");
        }

        localInn.serialize(new javax.xml.namespace.QName("", "inn"), xmlWriter);

        if (localPfr == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "pfr cannot be null!!");
        }

        localPfr.serialize(new javax.xml.namespace.QName("", "pfr"), xmlWriter);

        if (localDriverno == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "driverno cannot be null!!");
        }

        localDriverno.serialize(new javax.xml.namespace.QName("", "driverno"),
            xmlWriter);

        if (localEducation == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "education cannot be null!!");
        }

        localEducation.serialize(new javax.xml.namespace.QName("", "education"),
            xmlWriter);

        if (localMarital == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "marital cannot be null!!");
        }

        localMarital.serialize(new javax.xml.namespace.QName("", "marital"),
            xmlWriter);

        if (localNumchildren == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "numchildren cannot be null!!");
        }

        localNumchildren.serialize(new javax.xml.namespace.QName("",
                "numchildren"), xmlWriter);

        if (localEmail == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "email cannot be null!!");
        }

        localEmail.serialize(new javax.xml.namespace.QName("", "email"),
            xmlWriter);

        if (localHomephone == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "homephone cannot be null!!");
        }

        localHomephone.serialize(new javax.xml.namespace.QName("", "homephone"),
            xmlWriter);

        if (localMobilephone == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "mobilephone cannot be null!!");
        }

        localMobilephone.serialize(new javax.xml.namespace.QName("",
                "mobilephone"), xmlWriter);

        if (localLa_country == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "la_country cannot be null!!");
        }

        localLa_country.serialize(new javax.xml.namespace.QName("", "la_country"),
            xmlWriter);

        if (localLa_index == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "la_index cannot be null!!");
        }

        localLa_index.serialize(new javax.xml.namespace.QName("", "la_index"),
            xmlWriter);

        if (localLa_region == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "la_region cannot be null!!");
        }

        localLa_region.serialize(new javax.xml.namespace.QName("", "la_region"),
            xmlWriter);

        if (localLa_district == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "la_district cannot be null!!");
        }

        localLa_district.serialize(new javax.xml.namespace.QName("",
                "la_district"), xmlWriter);

        if (localLa_city == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "la_city cannot be null!!");
        }

        localLa_city.serialize(new javax.xml.namespace.QName("", "la_city"),
            xmlWriter);

        if (localLa_settlement == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "la_settlement cannot be null!!");
        }

        localLa_settlement.serialize(new javax.xml.namespace.QName("",
                "la_settlement"), xmlWriter);

        if (localLa_street == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "la_street cannot be null!!");
        }

        localLa_street.serialize(new javax.xml.namespace.QName("", "la_street"),
            xmlWriter);

        if (localLa_house == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "la_house cannot be null!!");
        }

        localLa_house.serialize(new javax.xml.namespace.QName("", "la_house"),
            xmlWriter);

        if (localLa_building == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "la_building cannot be null!!");
        }

        localLa_building.serialize(new javax.xml.namespace.QName("",
                "la_building"), xmlWriter);

        if (localLa_structure == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "la_structure cannot be null!!");
        }

        localLa_structure.serialize(new javax.xml.namespace.QName("",
                "la_structure"), xmlWriter);

        if (localLa_apartment == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "la_apartment cannot be null!!");
        }

        localLa_apartment.serialize(new javax.xml.namespace.QName("",
                "la_apartment"), xmlWriter);

        if (localLa_years == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "la_years cannot be null!!");
        }

        localLa_years.serialize(new javax.xml.namespace.QName("", "la_years"),
            xmlWriter);

        if (localLa_month == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "la_month cannot be null!!");
        }

        localLa_month.serialize(new javax.xml.namespace.QName("", "la_month"),
            xmlWriter);

        if (localLa_date == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "la_date cannot be null!!");
        }

        localLa_date.serialize(new javax.xml.namespace.QName("", "la_date"),
            xmlWriter);

        if (localRa_phone == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ra_phone cannot be null!!");
        }

        localRa_phone.serialize(new javax.xml.namespace.QName("", "ra_phone"),
            xmlWriter);

        if (localRa_country == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ra_country cannot be null!!");
        }

        localRa_country.serialize(new javax.xml.namespace.QName("", "ra_country"),
            xmlWriter);

        if (localRa_index == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ra_index cannot be null!!");
        }

        localRa_index.serialize(new javax.xml.namespace.QName("", "ra_index"),
            xmlWriter);

        if (localRa_region == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ra_region cannot be null!!");
        }

        localRa_region.serialize(new javax.xml.namespace.QName("", "ra_region"),
            xmlWriter);

        if (localRa_district == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ra_district cannot be null!!");
        }

        localRa_district.serialize(new javax.xml.namespace.QName("",
                "ra_district"), xmlWriter);

        if (localRa_city == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ra_city cannot be null!!");
        }

        localRa_city.serialize(new javax.xml.namespace.QName("", "ra_city"),
            xmlWriter);

        if (localRa_settlement == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ra_settlement cannot be null!!");
        }

        localRa_settlement.serialize(new javax.xml.namespace.QName("",
                "ra_settlement"), xmlWriter);

        if (localRa_street == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ra_street cannot be null!!");
        }

        localRa_street.serialize(new javax.xml.namespace.QName("", "ra_street"),
            xmlWriter);

        if (localRa_house == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ra_house cannot be null!!");
        }

        localRa_house.serialize(new javax.xml.namespace.QName("", "ra_house"),
            xmlWriter);

        if (localRa_building == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ra_building cannot be null!!");
        }

        localRa_building.serialize(new javax.xml.namespace.QName("",
                "ra_building"), xmlWriter);

        if (localRa_structure == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ra_structure cannot be null!!");
        }

        localRa_structure.serialize(new javax.xml.namespace.QName("",
                "ra_structure"), xmlWriter);

        if (localRa_apartment == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ra_apartment cannot be null!!");
        }

        localRa_apartment.serialize(new javax.xml.namespace.QName("",
                "ra_apartment"), xmlWriter);

        if (localEmployername == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "employername cannot be null!!");
        }

        localEmployername.serialize(new javax.xml.namespace.QName("",
                "employername"), xmlWriter);

        if (localEmployersize == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "employersize cannot be null!!");
        }

        localEmployersize.serialize(new javax.xml.namespace.QName("",
                "employersize"), xmlWriter);

        if (localBusinessindustry == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "businessindustry cannot be null!!");
        }

        localBusinessindustry.serialize(new javax.xml.namespace.QName("",
                "businessindustry"), xmlWriter);

        if (localPosition == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "position cannot be null!!");
        }

        localPosition.serialize(new javax.xml.namespace.QName("", "position"),
            xmlWriter);

        if (localEmployment_year == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "employment_year cannot be null!!");
        }

        localEmployment_year.serialize(new javax.xml.namespace.QName("",
                "employment_year"), xmlWriter);

        if (localEmployment_month == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "employment_month cannot be null!!");
        }

        localEmployment_month.serialize(new javax.xml.namespace.QName("",
                "employment_month"), xmlWriter);

        if (localEmployment_date == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "employment_date cannot be null!!");
        }

        localEmployment_date.serialize(new javax.xml.namespace.QName("",
                "employment_date"), xmlWriter);

        if (localEmployment_inn == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "employment_inn cannot be null!!");
        }

        localEmployment_inn.serialize(new javax.xml.namespace.QName("",
                "employment_inn"), xmlWriter);

        if (localIncomeproof == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "incomeproof cannot be null!!");
        }

        localIncomeproof.serialize(new javax.xml.namespace.QName("",
                "incomeproof"), xmlWriter);

        if (localMonthlyincome == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "monthlyincome cannot be null!!");
        }

        localMonthlyincome.serialize(new javax.xml.namespace.QName("",
                "monthlyincome"), xmlWriter);

        if (localBa_phone == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ba_phone cannot be null!!");
        }

        localBa_phone.serialize(new javax.xml.namespace.QName("", "ba_phone"),
            xmlWriter);

        if (localBa_country == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ba_country cannot be null!!");
        }

        localBa_country.serialize(new javax.xml.namespace.QName("", "ba_country"),
            xmlWriter);

        if (localBa_index == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ba_index cannot be null!!");
        }

        localBa_index.serialize(new javax.xml.namespace.QName("", "ba_index"),
            xmlWriter);

        if (localBa_region == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ba_region cannot be null!!");
        }

        localBa_region.serialize(new javax.xml.namespace.QName("", "ba_region"),
            xmlWriter);

        if (localBa_district == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ba_district cannot be null!!");
        }

        localBa_district.serialize(new javax.xml.namespace.QName("",
                "ba_district"), xmlWriter);

        if (localBa_city == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ba_city cannot be null!!");
        }

        localBa_city.serialize(new javax.xml.namespace.QName("", "ba_city"),
            xmlWriter);

        if (localBa_settlement == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ba_settlement cannot be null!!");
        }

        localBa_settlement.serialize(new javax.xml.namespace.QName("",
                "ba_settlement"), xmlWriter);

        if (localBa_street == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ba_street cannot be null!!");
        }

        localBa_street.serialize(new javax.xml.namespace.QName("", "ba_street"),
            xmlWriter);

        if (localBa_house == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ba_house cannot be null!!");
        }

        localBa_house.serialize(new javax.xml.namespace.QName("", "ba_house"),
            xmlWriter);

        if (localBa_building == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ba_building cannot be null!!");
        }

        localBa_building.serialize(new javax.xml.namespace.QName("",
                "ba_building"), xmlWriter);

        if (localBa_structure == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ba_structure cannot be null!!");
        }

        localBa_structure.serialize(new javax.xml.namespace.QName("",
                "ba_structure"), xmlWriter);

        if (localBa_apartment == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ba_apartment cannot be null!!");
        }

        localBa_apartment.serialize(new javax.xml.namespace.QName("",
                "ba_apartment"), xmlWriter);

        if (localProducttype == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "producttype cannot be null!!");
        }

        localProducttype.serialize(new javax.xml.namespace.QName("",
                "producttype"), xmlWriter);

        if (localProductname == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "productname cannot be null!!");
        }

        localProductname.serialize(new javax.xml.namespace.QName("",
                "productname"), xmlWriter);

        if (localOriginalchannel == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "originalchannel cannot be null!!");
        }

        localOriginalchannel.serialize(new javax.xml.namespace.QName("",
                "originalchannel"), xmlWriter);

        if (localProductsumlimit == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "productsumlimit cannot be null!!");
        }

        localProductsumlimit.serialize(new javax.xml.namespace.QName("",
                "productsumlimit"), xmlWriter);

        if (localProductsumcurrency == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "productsumcurrency cannot be null!!");
        }

        localProductsumcurrency.serialize(new javax.xml.namespace.QName("",
                "productsumcurrency"), xmlWriter);

        if (localDownpaymentamount == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "downpaymentamount cannot be null!!");
        }

        localDownpaymentamount.serialize(new javax.xml.namespace.QName("",
                "downpaymentamount"), xmlWriter);

        if (localCollateralexistence == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "collateralexistence cannot be null!!");
        }

        localCollateralexistence.serialize(new javax.xml.namespace.QName("",
                "collateralexistence"), xmlWriter);

        if (localCollateralvalue == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "collateralvalue cannot be null!!");
        }

        localCollateralvalue.serialize(new javax.xml.namespace.QName("",
                "collateralvalue"), xmlWriter);

        if (localPurchaseexistence == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "purchaseexistence cannot be null!!");
        }

        localPurchaseexistence.serialize(new javax.xml.namespace.QName("",
                "purchaseexistence"), xmlWriter);

        if (localPurchasevalue == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "purchasevalue cannot be null!!");
        }

        localPurchasevalue.serialize(new javax.xml.namespace.QName("",
                "purchasevalue"), xmlWriter);

        if (localPurchasemodel == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "purchasemodel cannot be null!!");
        }

        localPurchasemodel.serialize(new javax.xml.namespace.QName("",
                "purchasemodel"), xmlWriter);

        if (localOperator_code == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "operator_code cannot be null!!");
        }

        localOperator_code.serialize(new javax.xml.namespace.QName("",
                "operator_code"), xmlWriter);

        if (localOperator_name == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "operator_name cannot be null!!");
        }

        localOperator_name.serialize(new javax.xml.namespace.QName("",
                "operator_name"), xmlWriter);

        if (localPos_code == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "pos_code cannot be null!!");
        }

        localPos_code.serialize(new javax.xml.namespace.QName("", "pos_code"),
            xmlWriter);

        if (localPos_phone == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "pos_phone cannot be null!!");
        }

        localPos_phone.serialize(new javax.xml.namespace.QName("", "pos_phone"),
            xmlWriter);

        if (localPos_country == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "pos_country cannot be null!!");
        }

        localPos_country.serialize(new javax.xml.namespace.QName("",
                "pos_country"), xmlWriter);

        if (localPos_index == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "pos_index cannot be null!!");
        }

        localPos_index.serialize(new javax.xml.namespace.QName("", "pos_index"),
            xmlWriter);

        if (localPos_region == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "pos_region cannot be null!!");
        }

        localPos_region.serialize(new javax.xml.namespace.QName("", "pos_region"),
            xmlWriter);

        if (localPos_district == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "pos_district cannot be null!!");
        }

        localPos_district.serialize(new javax.xml.namespace.QName("",
                "pos_district"), xmlWriter);

        if (localPos_city == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "pos_city cannot be null!!");
        }

        localPos_city.serialize(new javax.xml.namespace.QName("", "pos_city"),
            xmlWriter);

        if (localPos_settlement == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "pos_settlement cannot be null!!");
        }

        localPos_settlement.serialize(new javax.xml.namespace.QName("",
                "pos_settlement"), xmlWriter);

        if (localPos_street == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "pos_street cannot be null!!");
        }

        localPos_street.serialize(new javax.xml.namespace.QName("", "pos_street"),
            xmlWriter);

        if (localPos_house == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "pos_house cannot be null!!");
        }

        localPos_house.serialize(new javax.xml.namespace.QName("", "pos_house"),
            xmlWriter);

        if (localPos_building == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "pos_building cannot be null!!");
        }

        localPos_building.serialize(new javax.xml.namespace.QName("",
                "pos_building"), xmlWriter);

        if (localPos_structure == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "pos_structure cannot be null!!");
        }

        localPos_structure.serialize(new javax.xml.namespace.QName("",
                "pos_structure"), xmlWriter);

        if (localPos_apartment == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "pos_apartment cannot be null!!");
        }

        localPos_apartment.serialize(new javax.xml.namespace.QName("",
                "pos_apartment"), xmlWriter);

        if (localNewapplicant == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "newapplicant cannot be null!!");
        }

        localNewapplicant.serialize(new javax.xml.namespace.QName("",
                "newapplicant"), xmlWriter);

        if (localApplicanttype == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "applicanttype cannot be null!!");
        }

        localApplicanttype.serialize(new javax.xml.namespace.QName("",
                "applicanttype"), xmlWriter);

        if (localApplicanttypenum == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "applicanttypenum cannot be null!!");
        }

        localApplicanttypenum.serialize(new javax.xml.namespace.QName("",
                "applicanttypenum"), xmlWriter);

        if (localResponseisneeded == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "responseisneeded cannot be null!!");
        }

        localResponseisneeded.serialize(new javax.xml.namespace.QName("",
                "responseisneeded"), xmlWriter);

        if (localApplicationstatus == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "applicationstatus cannot be null!!");
        }

        localApplicationstatus.serialize(new javax.xml.namespace.QName("",
                "applicationstatus"), xmlWriter);

        if (localApplicantid == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "applicantid cannot be null!!");
        }

        localApplicantid.serialize(new javax.xml.namespace.QName("",
                "applicantid"), xmlWriter);

        if (localTradedate == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "tradedate cannot be null!!");
        }

        localTradedate.serialize(new javax.xml.namespace.QName("", "tradedate"),
            xmlWriter);

        if (localInitialsumlimit == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "initialsumlimit cannot be null!!");
        }

        localInitialsumlimit.serialize(new javax.xml.namespace.QName("",
                "initialsumlimit"), xmlWriter);

        if (localInitialsumcurrency == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "initialsumcurrency cannot be null!!");
        }

        localInitialsumcurrency.serialize(new javax.xml.namespace.QName("",
                "initialsumcurrency"), xmlWriter);

        if (localApplicationfraudstatus == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "applicationfraudstatus cannot be null!!");
        }

        localApplicationfraudstatus.serialize(new javax.xml.namespace.QName(
                "", "applicationfraudstatus"), xmlWriter);

        if (localApplicationfraudstatusdescr == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "applicationfraudstatusdescr cannot be null!!");
        }

        localApplicationfraudstatusdescr.serialize(new javax.xml.namespace.QName(
                "", "applicationfraudstatusdescr"), xmlWriter);

        if (localDefaultstatus == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "defaultstatus cannot be null!!");
        }

        localDefaultstatus.serialize(new javax.xml.namespace.QName("",
                "defaultstatus"), xmlWriter);

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://example.org/FPSPartner")) {
            return "ns1";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
        java.lang.String namespace, java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
        java.lang.String namespace, java.lang.String attName,
        java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
        java.lang.String attName, java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
        java.lang.String attName, javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static NewApplication parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            NewApplication object = new NewApplication();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                    ":") + 1);

                        if (!"newApplication".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (NewApplication) ru.sample.qiwi.fpspartner.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "login").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "login").equals(
                            reader.getName())) {
                    object.setLogin(ru.sample.qiwi.fpspartner.P50Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "password").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "password").equals(
                            reader.getName())) {
                    object.setPassword(ru.sample.qiwi.fpspartner.P50Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "partnerid").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "partnerid").equals(
                            reader.getName())) {
                    object.setPartnerid(ru.sample.qiwi.fpspartner.PartneridType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "applicationid").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "applicationid").equals(
                            reader.getName())) {
                    object.setApplicationid(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "applicationdate").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "applicationdate").equals(
                            reader.getName())) {
                    object.setApplicationdate(ru.sample.qiwi.fpspartner.DatetimeType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "photoid").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "photoid").equals(
                            reader.getName())) {
                    object.setPhotoid(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "lastname").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "lastname").equals(
                            reader.getName())) {
                    object.setLastname(ru.sample.qiwi.fpspartner.P50Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "firstname").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "firstname").equals(
                            reader.getName())) {
                    object.setFirstname(ru.sample.qiwi.fpspartner.P50Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "middlename").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "middlename").equals(
                            reader.getName())) {
                    object.setMiddlename(ru.sample.qiwi.fpspartner.P50Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "pastlastname").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "pastlastname").equals(
                            reader.getName())) {
                    object.setPastlastname(ru.sample.qiwi.fpspartner.P50Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "birthday").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "birthday").equals(
                            reader.getName())) {
                    object.setBirthday(ru.sample.qiwi.fpspartner.DateType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "birthplace").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "birthplace").equals(
                            reader.getName())) {
                    object.setBirthplace(ru.sample.qiwi.fpspartner.P255Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "doctype").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "doctype").equals(
                            reader.getName())) {
                    object.setDoctype(ru.sample.qiwi.fpspartner.DoctypeType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "docno").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "docno").equals(
                            reader.getName())) {
                    object.setDocno(ru.sample.qiwi.fpspartner.P20Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "docplace").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "docplace").equals(
                            reader.getName())) {
                    object.setDocplace(ru.sample.qiwi.fpspartner.P255Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "docdate").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "docdate").equals(
                            reader.getName())) {
                    object.setDocdate(ru.sample.qiwi.fpspartner.DateType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "doccode").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "doccode").equals(
                            reader.getName())) {
                    object.setDoccode(ru.sample.qiwi.fpspartner.P6Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "pastdoctype").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "pastdoctype").equals(
                            reader.getName())) {
                    object.setPastdoctype(ru.sample.qiwi.fpspartner.DoctypeType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "pastdocno").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "pastdocno").equals(
                            reader.getName())) {
                    object.setPastdocno(ru.sample.qiwi.fpspartner.P20Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "pastdocplace").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "pastdocplace").equals(
                            reader.getName())) {
                    object.setPastdocplace(ru.sample.qiwi.fpspartner.P255Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "pastdocdate").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "pastdocdate").equals(
                            reader.getName())) {
                    object.setPastdocdate(ru.sample.qiwi.fpspartner.DateType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "sex").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "sex").equals(
                            reader.getName())) {
                    object.setSex(ru.sample.qiwi.fpspartner.SexType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "citizenship").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "citizenship").equals(
                            reader.getName())) {
                    object.setCitizenship(ru.sample.qiwi.fpspartner.CitizenshipType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "inn").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "inn").equals(
                            reader.getName())) {
                    object.setInn(ru.sample.qiwi.fpspartner.P12Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "pfr").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "pfr").equals(
                            reader.getName())) {
                    object.setPfr(ru.sample.qiwi.fpspartner.PfrType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "driverno").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "driverno").equals(
                            reader.getName())) {
                    object.setDriverno(ru.sample.qiwi.fpspartner.DrivernoType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "education").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "education").equals(
                            reader.getName())) {
                    object.setEducation(ru.sample.qiwi.fpspartner.EducationType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "marital").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "marital").equals(
                            reader.getName())) {
                    object.setMarital(ru.sample.qiwi.fpspartner.MaritalType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "numchildren").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "numchildren").equals(
                            reader.getName())) {
                    object.setNumchildren(ru.sample.qiwi.fpspartner.P5Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "email").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "email").equals(
                            reader.getName())) {
                    object.setEmail(ru.sample.qiwi.fpspartner.P50Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "homephone").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "homephone").equals(
                            reader.getName())) {
                    object.setHomephone(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "mobilephone").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "mobilephone").equals(
                            reader.getName())) {
                    object.setMobilephone(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "la_country").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "la_country").equals(
                            reader.getName())) {
                    object.setLa_country(ru.sample.qiwi.fpspartner.CitizenshipType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "la_index").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "la_index").equals(
                            reader.getName())) {
                    object.setLa_index(ru.sample.qiwi.fpspartner.P6Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "la_region").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "la_region").equals(
                            reader.getName())) {
                    object.setLa_region(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "la_district").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "la_district").equals(
                            reader.getName())) {
                    object.setLa_district(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "la_city").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "la_city").equals(
                            reader.getName())) {
                    object.setLa_city(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "la_settlement").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "la_settlement").equals(
                            reader.getName())) {
                    object.setLa_settlement(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "la_street").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "la_street").equals(
                            reader.getName())) {
                    object.setLa_street(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "la_house").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "la_house").equals(
                            reader.getName())) {
                    object.setLa_house(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "la_building").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "la_building").equals(
                            reader.getName())) {
                    object.setLa_building(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "la_structure").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "la_structure").equals(
                            reader.getName())) {
                    object.setLa_structure(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "la_apartment").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "la_apartment").equals(
                            reader.getName())) {
                    object.setLa_apartment(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "la_years").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "la_years").equals(
                            reader.getName())) {
                    object.setLa_years(ru.sample.qiwi.fpspartner.P5Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "la_month").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "la_month").equals(
                            reader.getName())) {
                    object.setLa_month(ru.sample.qiwi.fpspartner.P5Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "la_date").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "la_date").equals(
                            reader.getName())) {
                    object.setLa_date(ru.sample.qiwi.fpspartner.DateType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ra_phone").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ra_phone").equals(
                            reader.getName())) {
                    object.setRa_phone(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ra_country").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ra_country").equals(
                            reader.getName())) {
                    object.setRa_country(ru.sample.qiwi.fpspartner.CitizenshipType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ra_index").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ra_index").equals(
                            reader.getName())) {
                    object.setRa_index(ru.sample.qiwi.fpspartner.P6Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ra_region").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ra_region").equals(
                            reader.getName())) {
                    object.setRa_region(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ra_district").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ra_district").equals(
                            reader.getName())) {
                    object.setRa_district(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ra_city").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ra_city").equals(
                            reader.getName())) {
                    object.setRa_city(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ra_settlement").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ra_settlement").equals(
                            reader.getName())) {
                    object.setRa_settlement(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ra_street").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ra_street").equals(
                            reader.getName())) {
                    object.setRa_street(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ra_house").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ra_house").equals(
                            reader.getName())) {
                    object.setRa_house(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ra_building").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ra_building").equals(
                            reader.getName())) {
                    object.setRa_building(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ra_structure").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ra_structure").equals(
                            reader.getName())) {
                    object.setRa_structure(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ra_apartment").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ra_apartment").equals(
                            reader.getName())) {
                    object.setRa_apartment(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "employername").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "employername").equals(
                            reader.getName())) {
                    object.setEmployername(ru.sample.qiwi.fpspartner.P255Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "employersize").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "employersize").equals(
                            reader.getName())) {
                    object.setEmployersize(ru.sample.qiwi.fpspartner.EmployersizeType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "businessindustry").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "businessindustry").equals(
                            reader.getName())) {
                    object.setBusinessindustry(ru.sample.qiwi.fpspartner.BusinessindustryType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "position").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "position").equals(
                            reader.getName())) {
                    object.setPosition(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "employment_year").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "employment_year").equals(
                            reader.getName())) {
                    object.setEmployment_year(ru.sample.qiwi.fpspartner.P5Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "employment_month").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "employment_month").equals(
                            reader.getName())) {
                    object.setEmployment_month(ru.sample.qiwi.fpspartner.P5Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "employment_date").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "employment_date").equals(
                            reader.getName())) {
                    object.setEmployment_date(ru.sample.qiwi.fpspartner.DateType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "employment_inn").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "employment_inn").equals(
                            reader.getName())) {
                    object.setEmployment_inn(ru.sample.qiwi.fpspartner.P12Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "incomeproof").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "incomeproof").equals(
                            reader.getName())) {
                    object.setIncomeproof(ru.sample.qiwi.fpspartner.IncomeproofType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "monthlyincome").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "monthlyincome").equals(
                            reader.getName())) {
                    object.setMonthlyincome(ru.sample.qiwi.fpspartner.P15_2Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ba_phone").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ba_phone").equals(
                            reader.getName())) {
                    object.setBa_phone(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ba_country").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ba_country").equals(
                            reader.getName())) {
                    object.setBa_country(ru.sample.qiwi.fpspartner.CitizenshipType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ba_index").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ba_index").equals(
                            reader.getName())) {
                    object.setBa_index(ru.sample.qiwi.fpspartner.P6Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ba_region").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ba_region").equals(
                            reader.getName())) {
                    object.setBa_region(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ba_district").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ba_district").equals(
                            reader.getName())) {
                    object.setBa_district(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ba_city").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ba_city").equals(
                            reader.getName())) {
                    object.setBa_city(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ba_settlement").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ba_settlement").equals(
                            reader.getName())) {
                    object.setBa_settlement(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ba_street").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ba_street").equals(
                            reader.getName())) {
                    object.setBa_street(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ba_house").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ba_house").equals(
                            reader.getName())) {
                    object.setBa_house(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ba_building").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ba_building").equals(
                            reader.getName())) {
                    object.setBa_building(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ba_structure").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ba_structure").equals(
                            reader.getName())) {
                    object.setBa_structure(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ba_apartment").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "ba_apartment").equals(
                            reader.getName())) {
                    object.setBa_apartment(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "producttype").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "producttype").equals(
                            reader.getName())) {
                    object.setProducttype(ru.sample.qiwi.fpspartner.ProducttypeType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "productname").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "productname").equals(
                            reader.getName())) {
                    object.setProductname(ru.sample.qiwi.fpspartner.P255Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "originalchannel").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "originalchannel").equals(
                            reader.getName())) {
                    object.setOriginalchannel(ru.sample.qiwi.fpspartner.OriginalchannelType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "productsumlimit").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "productsumlimit").equals(
                            reader.getName())) {
                    object.setProductsumlimit(ru.sample.qiwi.fpspartner.P15_2Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "productsumcurrency").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "productsumcurrency").equals(
                            reader.getName())) {
                    object.setProductsumcurrency(ru.sample.qiwi.fpspartner.ProductsumcurrencyType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "downpaymentamount").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "downpaymentamount").equals(
                            reader.getName())) {
                    object.setDownpaymentamount(ru.sample.qiwi.fpspartner.P15_2Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "collateralexistence").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "collateralexistence").equals(
                            reader.getName())) {
                    object.setCollateralexistence(ru.sample.qiwi.fpspartner.CollateralexistenceType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "collateralvalue").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "collateralvalue").equals(
                            reader.getName())) {
                    object.setCollateralvalue(ru.sample.qiwi.fpspartner.P15_2Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "purchaseexistence").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "purchaseexistence").equals(
                            reader.getName())) {
                    object.setPurchaseexistence(ru.sample.qiwi.fpspartner.PurchaseexistenceType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "purchasevalue").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "purchasevalue").equals(
                            reader.getName())) {
                    object.setPurchasevalue(ru.sample.qiwi.fpspartner.P15_2Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "purchasemodel").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "purchasemodel").equals(
                            reader.getName())) {
                    object.setPurchasemodel(ru.sample.qiwi.fpspartner.P255Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "operator_code").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "operator_code").equals(
                            reader.getName())) {
                    object.setOperator_code(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "operator_name").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "operator_name").equals(
                            reader.getName())) {
                    object.setOperator_name(ru.sample.qiwi.fpspartner.P255Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "pos_code").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "pos_code").equals(
                            reader.getName())) {
                    object.setPos_code(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "pos_phone").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "pos_phone").equals(
                            reader.getName())) {
                    object.setPos_phone(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "pos_country").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "pos_country").equals(
                            reader.getName())) {
                    object.setPos_country(ru.sample.qiwi.fpspartner.CitizenshipType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "pos_index").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "pos_index").equals(
                            reader.getName())) {
                    object.setPos_index(ru.sample.qiwi.fpspartner.P6Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "pos_region").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "pos_region").equals(
                            reader.getName())) {
                    object.setPos_region(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "pos_district").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "pos_district").equals(
                            reader.getName())) {
                    object.setPos_district(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "pos_city").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "pos_city").equals(
                            reader.getName())) {
                    object.setPos_city(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "pos_settlement").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "pos_settlement").equals(
                            reader.getName())) {
                    object.setPos_settlement(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "pos_street").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "pos_street").equals(
                            reader.getName())) {
                    object.setPos_street(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "pos_house").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "pos_house").equals(
                            reader.getName())) {
                    object.setPos_house(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "pos_building").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "pos_building").equals(
                            reader.getName())) {
                    object.setPos_building(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "pos_structure").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "pos_structure").equals(
                            reader.getName())) {
                    object.setPos_structure(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "pos_apartment").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "pos_apartment").equals(
                            reader.getName())) {
                    object.setPos_apartment(ru.sample.qiwi.fpspartner.P15Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "newapplicant").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "newapplicant").equals(
                            reader.getName())) {
                    object.setNewapplicant(ru.sample.qiwi.fpspartner.NewapplicantType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "applicanttype").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "applicanttype").equals(
                            reader.getName())) {
                    object.setApplicanttype(ru.sample.qiwi.fpspartner.ApplicanttypeType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "applicanttypenum").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "applicanttypenum").equals(
                            reader.getName())) {
                    object.setApplicanttypenum(ru.sample.qiwi.fpspartner.ApplicanttypenumType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "responseisneeded").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "responseisneeded").equals(
                            reader.getName())) {
                    object.setResponseisneeded(ru.sample.qiwi.fpspartner.ResponseisneededType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "applicationstatus").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "applicationstatus").equals(
                            reader.getName())) {
                    object.setApplicationstatus(ru.sample.qiwi.fpspartner.ApplicationstatusType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "applicantid").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "applicantid").equals(
                            reader.getName())) {
                    object.setApplicantid(ru.sample.qiwi.fpspartner.ApplicantidType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "tradedate").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "tradedate").equals(
                            reader.getName())) {
                    object.setTradedate(ru.sample.qiwi.fpspartner.DateType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "initialsumlimit").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "initialsumlimit").equals(
                            reader.getName())) {
                    object.setInitialsumlimit(ru.sample.qiwi.fpspartner.P15_2Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "initialsumcurrency").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "initialsumcurrency").equals(
                            reader.getName())) {
                    object.setInitialsumcurrency(ru.sample.qiwi.fpspartner.ProductsumcurrencyType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                            "applicationfraudstatus").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "applicationfraudstatus").equals(reader.getName())) {
                    object.setApplicationfraudstatus(ru.sample.qiwi.fpspartner.ApplicationfraudstatusType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                            "applicationfraudstatusdescr").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "applicationfraudstatusdescr").equals(
                            reader.getName())) {
                    object.setApplicationfraudstatusdescr(ru.sample.qiwi.fpspartner.P1024Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "defaultstatus").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "defaultstatus").equals(
                            reader.getName())) {
                    object.setDefaultstatus(ru.sample.qiwi.fpspartner.DefaultstatusType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()) {
                    // 2 - A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
