<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema">
    <xsl:output method="xml" indent="yes" encoding="UTF-8"/>

    <xsl:template match="*">
        <xsl:apply-templates select="*"/>
    </xsl:template>

    <xsl:template match="/Application/AXI/application_e">
        <xsl:element name="Applications">
            <xsl:element name="Application">
                <xsl:element name="id"></xsl:element>
                <xsl:element name="date"><xsl:value-of select="format-date(xs:date(@ApplicationDate), '[D01].[M01].[Y0001]')"/></xsl:element>
                <xsl:element name="appState">1</xsl:element>
                <xsl:element name="memberCode"></xsl:element>
                <xsl:element name="creditHistory">1</xsl:element>
                <xsl:element name="client">
                    <xsl:element name="id"></xsl:element>
                    <xsl:element name="surname"><xsl:value-of select="@client_surname"/></xsl:element>
                    <xsl:element name="surname_1"></xsl:element>
                    <xsl:element name="firstname"><xsl:value-of select="@client_name"/></xsl:element>
                    <xsl:element name="firstname_1"></xsl:element>
                    <xsl:element name="firstname_2"></xsl:element>
                    <xsl:element name="middlename"><xsl:value-of select="@client_middlename"/></xsl:element>
                    <xsl:element name="middlename_1"></xsl:element>
                    <xsl:element name="middlename_2"></xsl:element>
                    <xsl:element name="birthdate"><xsl:value-of select="format-date(xs:date(@client_birthdate), '[D01].[M01].[Y0001]')"/></xsl:element>
                    <xsl:element name="birthPlace"><xsl:value-of select="@pasp_birthplace"/></xsl:element>
                    <xsl:element name="gender"><xsl:value-of select="@gender"/></xsl:element>
                    <!--<xsl:element name="citizenship"></xsl:element>-->
                    <!--<xsl:element name="maritalStatus"></xsl:element>-->
                    <!--<xsl:element name="childrenNumber"></xsl:element>-->
                    <!--<xsl:element name="education"><xsl:value-of select="@education"/></xsl:element>-->
                    <!--<xsl:element name="prevSurname"></xsl:element>-->
                    <!--<xsl:element name="prevSurname_1"></xsl:element>-->
                    <!--<xsl:element name="prevFirstname"></xsl:element>-->
                    <!--<xsl:element name="prevFirstname_1"></xsl:element>-->
                    <!--<xsl:element name="prevFirstname_2"></xsl:element>-->
                    <!--<xsl:element name="prevMiddlename"></xsl:element>-->
                    <!--<xsl:element name="prevMiddlename_1"></xsl:element>-->
                    <!--<xsl:element name="prevMiddlename_2"></xsl:element>-->
                    <xsl:element name="incomeType">0</xsl:element>
                    <!--<xsl:element name="confirmedIncome"><xsl:value-of select="@income_main"/></xsl:element>-->
                    <xsl:element name="unconfirmedIncome"><xsl:value-of select="@income_main"/></xsl:element>
                    <xsl:element name="doc">
                        <xsl:element name="docType">21</xsl:element>
                        <xsl:element name="seriesNumber"><xsl:value-of select="@pass_seria"/><xsl:value-of select="@pass_number"/></xsl:element>
                        <xsl:element name="issueDate"><xsl:value-of select="format-date(xs:date(@pass_date_issue), '[D01].[M01].[Y0001]')"/></xsl:element>
                    </xsl:element>
                    <xsl:element name="address">
                        <xsl:element name="addrType">1</xsl:element>
                        <!--<xsl:element name="country"><xsl:value-of select=""/></xsl:element>-->
                        <xsl:element name="region"><xsl:value-of select="@reg_address_district"/></xsl:element>
                        <xsl:element name="city"><xsl:value-of select="@reg_address_city"/></xsl:element>
                        <xsl:element name="street"><xsl:value-of select="@reg_address_street"/></xsl:element>
                        <xsl:element name="house"><xsl:value-of select="@reg_address_house"/></xsl:element>
                        <xsl:element name="building"><xsl:value-of select="@reg_address_house_bld"/></xsl:element>
                        <xsl:element name="apartment"><xsl:value-of select="@reg_address_flat"/></xsl:element>
                    </xsl:element>
                    <xsl:element name="address">
                        <xsl:element name="addrType">2</xsl:element>
                        <!--<xsl:element name="country"><xsl:value-of select=""/></xsl:element>-->
                        <xsl:element name="region"><xsl:value-of select="@liv_address_district"/></xsl:element>
                        <xsl:element name="city"><xsl:value-of select="@liv_address_city"/></xsl:element>
                        <xsl:element name="street"><xsl:value-of select="@liv_address_street"/></xsl:element>
                        <xsl:element name="house"><xsl:value-of select="@liv_address_house"/></xsl:element>
                        <xsl:element name="building"><xsl:value-of select="@liv_address_house_bld"/></xsl:element>
                        <xsl:element name="apartment"><xsl:value-of select="@liv_address_flat"/></xsl:element>
                    </xsl:element>
                    <xsl:element name="phone">
                        <xsl:element name="phoneType">1</xsl:element>
                        <xsl:element name="number"><xsl:value-of select="@work_phone_num"/></xsl:element>
                    </xsl:element>
                    <xsl:element name="phone">
                        <xsl:element name="phoneType">4</xsl:element>
                        <xsl:element name="number"><xsl:value-of select="@mob_phone_num"/></xsl:element>
                    </xsl:element>
                    <xsl:element name="email">
                        <xsl:element name="email"><xsl:value-of select="@email"/></xsl:element>
                    </xsl:element>
                </xsl:element>
            </xsl:element>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>