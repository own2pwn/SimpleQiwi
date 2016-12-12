<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema">
    <xsl:output method="xml" indent="yes" encoding="UTF-8"/>

    <xsl:template match="*">
        <xsl:apply-templates select="*"/>
    </xsl:template>

    <xsl:template match="/Application/AXI/application_e">
        <xsl:element name="request">
            <xsl:element name="id"></xsl:element>
            <xsl:element name="data">
                <xsl:element name="msisdn">7<xsl:value-of select="@mob_phone_num"/></xsl:element>
                <xsl:element name="variables">
                    <xsl:element name="name">LIFETIME_BIN</xsl:element>
                </xsl:element>
                <xsl:element name="variables">
                    <xsl:element name="name">BLOCK_CNT</xsl:element>
                </xsl:element>
                <xsl:element name="variables">
                    <xsl:element name="name">INTEGRAL_SCORE</xsl:element>
                </xsl:element>
            </xsl:element>
            <xsl:element name="attributes">
                <xsl:element name="name">FULLNAME</xsl:element>
                <xsl:element name="value">
                    <xsl:element name="patronymic"><xsl:value-of select="@client_middlename"/></xsl:element>
                    <xsl:element name="surname"><xsl:value-of select="@client_surname"/></xsl:element>
                    <xsl:element name="name"><xsl:value-of select="@client_name"/></xsl:element>
                </xsl:element>
            </xsl:element>
            <xsl:element name="attributes">
                <xsl:element name="name">BIRTHDATE</xsl:element>
                <xsl:element name="value"><xsl:value-of select="format-date(xs:date(@client_birthdate), '[D01].[M01].[Y0001]')"/></xsl:element>
            </xsl:element>
            <xsl:element name="attributes">
                <xsl:element name="name">ADDRESSES</xsl:element>
                <xsl:element name="value">
                    <xsl:element name="type">home</xsl:element>
                    <xsl:element name="city"><xsl:value-of select="@liv_address_city"/></xsl:element>
                    <xsl:element name="street"><xsl:value-of select="@liv_address_street"/></xsl:element>
                    <xsl:element name="region"><xsl:value-of select="@liv_address_region"/></xsl:element>
                    <xsl:element name="building"><xsl:value-of select="@liv_address_house_bld"/></xsl:element>
                </xsl:element>
                <xsl:element name="value">
                    <xsl:element name="type">registration</xsl:element>
                    <xsl:element name="city"><xsl:value-of select="@reg_address_city"/></xsl:element>
                    <xsl:element name="street"><xsl:value-of select="@reg_address_street"/></xsl:element>
                    <xsl:element name="region"><xsl:value-of select="@reg_address_region"/></xsl:element>
                    <xsl:element name="building"><xsl:value-of select="@reg_address_house_bld"/></xsl:element>
                </xsl:element>
            </xsl:element>
            <xsl:element name="attributes">
                <xsl:element name="name">DOCUMENTS</xsl:element>
                <xsl:element name="value">
                    <xsl:element name="type">passport_ru</xsl:element>
                    <xsl:element name="number"><xsl:value-of select="@pass_number"/></xsl:element>
                    <xsl:element name="series"><xsl:value-of select="@pass_seria"/></xsl:element>
                    <xsl:element name="issueDate"><xsl:value-of select="format-date(xs:date(@pass_date_issue), '[D01].[M01].[Y0001]')"/></xsl:element>
                </xsl:element>
            </xsl:element>
        </xsl:element>
    </xsl:template>
</xsl:stylesheet>