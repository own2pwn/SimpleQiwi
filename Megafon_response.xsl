<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml" indent="yes"/>

    <xsl:template match="/response/data">
        <xsl:element name="MEGAFON">
            <xsl:call-template name="fillAttributesByElements"/>
        </xsl:element>
    </xsl:template>


    <!-- ********************* FUNCTIONS ********************* -->

    <xsl:template name="fillAttributesByElements">
        <xsl:for-each select="*">
            <xsl:choose>
                <xsl:when test="local-name() = 'msisdn' and name(..) = 'data'">
                    <xsl:element name="{local-name()}_ME">
                        <xsl:attribute name="value">
                            <xsl:value-of select="."/>
                        </xsl:attribute>
                    </xsl:element>
                </xsl:when>
                <xsl:when test="not(*) and not(*[*])">
                    <xsl:attribute name="{local-name()}">
                        <xsl:value-of select="."/>
                    </xsl:attribute>
                </xsl:when>
            </xsl:choose>
        </xsl:for-each>

        <xsl:for-each select="*">
            <xsl:choose>
                <xsl:when test="*">
                    <xsl:element name="{local-name()}_ME">
                        <xsl:call-template name="fillOldAttributes"/>
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>
            </xsl:choose>
        </xsl:for-each>
    </xsl:template>

    <xsl:template name="fillOldAttributes">
        <xsl:for-each select="@*">
            <xsl:attribute name="{local-name()}">
                <xsl:value-of select="."/>
            </xsl:attribute>
        </xsl:for-each>
    </xsl:template>

</xsl:stylesheet>
