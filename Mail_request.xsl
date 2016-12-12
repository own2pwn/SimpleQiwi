<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema">
    <xsl:output method="text" omit-xml-declaration="yes" indent="no"/>

    <xsl:template match="*">
        <xsl:apply-templates select="*"/>
    </xsl:template>

    <xsl:template match="/Application/AXI/application_e">
        Phones=7<xsl:value-of select="@mob_phone_code"/><xsl:value-of select="@mob_phone_num"/>;Emails=<xsl:value-of select="@email"/>;Sex=<xsl:value-of select="if (@gender != '') then @gender else 'None'"/>;BD=<xsl:value-of select="if (@client_birthdate != '') then format-date(xs:date(@client_birthdate), '[Y0001][M01][D01]') else 'None'"/>;FirstName=<xsl:value-of select="@client_name"/>;SecondName=<xsl:value-of select="@client_surname"/><xsl:if test="@client_middlename">;MiddleName=<xsl:value-of select="@client_middlename"/></xsl:if>
    </xsl:template>

</xsl:stylesheet>