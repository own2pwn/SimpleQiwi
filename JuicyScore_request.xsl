<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema">
    <xsl:output method="xml" indent="yes" encoding="UTF-8"/>

    <xsl:template match="*">
        <xsl:apply-templates select="*"/>
    </xsl:template>

    <xsl:template match="/Application/AXI/application_e">
        <xsl:element name="request">
            <!--<xsl:element name="account_id"><xsl:value-of select="@login"/></xsl:element>-->
            <!--<xsl:element name="client_id"><xsl:value-of select="@email"/></xsl:element>-->
            <xsl:element name="channel">SITE</xsl:element>
            <xsl:element name="is_js"><xsl:value-of select="@is_js"/></xsl:element>
            <xsl:element name="ip"><xsl:value-of select="@ip"/></xsl:element>
            <xsl:element name="useragent"><xsl:value-of select="@useragent"/></xsl:element>
            <xsl:element name="time_zone"><xsl:value-of select="@time_zone"/></xsl:element>
            <xsl:element name="time_local"><xsl:value-of select="@time_local"/></xsl:element>
            <xsl:element name="time_utc3"><xsl:value-of select="@time_utc3"/></xsl:element>

            <xsl:element name="ph_country">7</xsl:element>
            <xsl:element name="phone"><xsl:value-of select="substring(@mob_phone_num, 1, 6)"/></xsl:element>
            <xsl:element name="mail"><xsl:value-of select="substring-before(@email, '@')"/></xsl:element>
            <xsl:element name="referrer"><xsl:value-of select="@referrer"/></xsl:element>
            <xsl:element name="tenor"><xsl:value-of select="@initial_maturity"/></xsl:element>
            <xsl:element name="amount"><xsl:value-of select="format-number(@initial_limit, '#')"/></xsl:element>

            <xsl:element name="response_content_type">xml</xsl:element>
        </xsl:element>
    </xsl:template>
</xsl:stylesheet>