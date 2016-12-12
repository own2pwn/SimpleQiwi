<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml" indent="yes"/>

    <xsl:template match="/">
        <xsl:element name="YANDEX_ID">
            <xsl:call-template name="fillAttributesByElements"/>
        </xsl:element>
    </xsl:template>


    <!-- ********************* FUNCTIONS ********************* -->

    <xsl:template name="fillAttributesByElements">
        <xsl:for-each select="*">
            <xsl:choose>
                <xsl:when test="not(*) and not(*[*])">
                    <xsl:attribute name="{local-name()}">
                        <xsl:value-of select="."/>
                    </xsl:attribute>
                </xsl:when>
            </xsl:choose>
        </xsl:for-each>

        <xsl:for-each select="*">
            <xsl:element name="{replace(local-name(), 'Response','')}_YA_ID">
                <xsl:call-template name="fillOldAttributes"/>
                <xsl:call-template name="fillAttributesByElements"/>
            </xsl:element>
        </xsl:for-each>
    </xsl:template>

    <xsl:template name="fillOldAttributes">
        <xsl:for-each select="@*">
            <xsl:choose>
                <xsl:when test="name()='processedDT'">
                    <xsl:attribute name="{local-name()}">
                        <xsl:value-of select="format-dateTime(., '[Y0001]-[M01]-[D01]')"/>
                    </xsl:attribute>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:attribute name="{local-name()}">
                        <xsl:value-of select="."/>
                    </xsl:attribute>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:for-each>
    </xsl:template>

</xsl:stylesheet>