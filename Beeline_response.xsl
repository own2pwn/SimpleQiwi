<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml" indent="yes"/>

    <xsl:template match="/">
        <xsl:element name="BEELINE">
            <xsl:call-template name="fillAttributesByElements"/>
        </xsl:element>
    </xsl:template>


    <!-- ********************* FUNCTIONS ********************* -->

    <xsl:template name="fillAttributesByElements">
        <xsl:for-each select="*">
            <xsl:choose>
                <xsl:when test="not(*) and not(*[*])">
                    <xsl:attribute name="{local-name()}"><xsl:value-of select="."/></xsl:attribute>
                </xsl:when>
            </xsl:choose>
        </xsl:for-each>

        <xsl:for-each select="*">
            <xsl:choose>
                <!--<xsl:when test="name()='ValidPers'">-->
                <!--<xsl:element name="ValidPers_MTS">-->
                <!--<xsl:call-template name="fillAttributesByElements"/>-->
                <!--</xsl:element>-->
                <!--</xsl:when>-->
                <!--<xsl:when test="name()='ScorByConfidSch'">-->
                <!--<xsl:element name="ScorByConfidSch_MTS">-->
                <!--<xsl:call-template name="fillAttributesByElements"/>-->
                <!--</xsl:element>-->
                <!--</xsl:when>-->
                <!--<xsl:when test="name()='ScorWithSMS'">-->
                <!--<xsl:element name="ScorWithSMS_MTS">-->
                <!--<xsl:call-template name="fillAttributesByElements"/>-->
                <!--</xsl:element>-->
                <!--</xsl:when>-->
                <xsl:when test="*">
                    <xsl:element name="{local-name()}_BE">
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>
            </xsl:choose>
        </xsl:for-each>
    </xsl:template>

</xsl:stylesheet>