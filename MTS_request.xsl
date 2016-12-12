<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema">
    <xsl:output method="text" omit-xml-declaration="yes" indent="no"/>

    <xsl:template match="*">
        <xsl:apply-templates select="*"/>
    </xsl:template>

    <xsl:template match="/Application/AXI/application_e">
        <xsl:choose>
            <xsl:when test="@client_name != '' and  @client_surname != ''">
                firstName=<xsl:value-of select="@client_name"/>;secondName=<xsl:value-of select="@client_surname"/>;middleName=<xsl:value-of select="if (@client_middlename) then @client_middlename else '-'"/>;
            </xsl:when>
            <xsl:when test="@birthdate != ''">
                birthdate=<xsl:value-of select="format-date(xs:date(@client_birthdate), '[Y0001][M01][D01]')"/>;
            </xsl:when>
            <xsl:when test="@pass_seria != '' and @pass_number != ''">
                passport=<xsl:value-of select="@pass_seria"/><xsl:value-of select="@pass_number"/>;
            </xsl:when>
        </xsl:choose>agreemen=yes;phone=7<xsl:value-of select="@mob_phone_code"/><xsl:value-of select="@mob_phone_num"/>;model=Model
    </xsl:template>

</xsl:stylesheet>