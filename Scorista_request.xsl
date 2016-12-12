<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml" indent="yes"/>

    <xsl:template match="/">
        <xsl:element name="SCORISTA">
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
                <xsl:when test="name()='response'">
                    <xsl:element name="Response_SCR">
                        <xsl:call-template name="fillOldAttributes"/>
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>
                <xsl:when test="name()='result' and name(..)='segment'">
                    <xsl:element name="result_segment_SCR">
                        <xsl:call-template name="fillOldAttributes"/>
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>
                <xsl:when test="name()='trustRating' and name(..)='trustRating'">
                    <xsl:element name="trustRating_TR_SCR">
                        <xsl:call-template name="fillOldAttributes"/>
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>
                <xsl:when test="(name(..)='phones' and name(../..)='creditHistory') or (name(..)='result' and name(../..)='phones' and name(../../..)='creditHistory')">
                    <xsl:element name="{local-name()}_PH_ADD_SCR">
                        <xsl:call-template name="fillOldAttributes"/>
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>
                <xsl:when test="name(..)='creditHistory90' and name(../..)='additional'">
                    <xsl:element name="{local-name()}_CH_90_ADD_SCR">
                        <xsl:call-template name="fillOldAttributes"/>
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>
                <xsl:when test="name(..)='trustRating45' and name(../..)='additional'">
                    <xsl:element name="{local-name()}_TR45_ADD_SCR">
                        <xsl:call-template name="fillOldAttributes"/>
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>
                <xsl:when test="name(..)='trustRating90' and name(../..)='additional'">
                    <xsl:element name="{local-name()}_TR90_ADD_SCR">
                        <xsl:call-template name="fillOldAttributes"/>
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>
                <xsl:when test="name(..)='fssp' and name(../..)='additional'">
                    <xsl:element name="{local-name()}_FSSP_ADD_SCR">
                        <xsl:call-template name="fillOldAttributes"/>
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>
                <xsl:when test="name(..)='truthQuestions' and name(../..)='additional'">
                    <xsl:element name="{local-name()}_TQ_ADD_SCR">
                        <xsl:call-template name="fillOldAttributes"/>
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>
                <xsl:when test="name()='b2c_sms' and name(..)='additional'">
                    <xsl:call-template name="fillAttributesByElements"/>
                </xsl:when>
                <xsl:when test="name()='element' and name(..)='b2c_sms' and name(../..)='additional'">
                    <xsl:element name="b2c_sms_ADD_SCR">
                        <xsl:call-template name="fillOldAttributes"/>
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>
                <xsl:when test="name(..)='additional' or name(../..)='additional'">
                    <xsl:element name="{local-name()}_ADD_SCR">
                        <xsl:call-template name="fillOldAttributes"/>
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>
                <xsl:when test="*">
                    <xsl:element name="{local-name()}_SCR">
                        <xsl:call-template name="fillOldAttributes"/>
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>
            </xsl:choose>
        </xsl:for-each>
    </xsl:template>

    <xsl:template name="fillOldAttributes">
        <xsl:for-each select="@*">
            <xsl:attribute name="{local-name()}"><xsl:value-of select="."/></xsl:attribute>
        </xsl:for-each>
    </xsl:template>

</xsl:stylesheet>