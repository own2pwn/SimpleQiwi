<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml" indent="yes"/>

    <xsl:template match="/">
        <xsl:element name="FinKarta">
            <xsl:element name="response_FK">
                <xsl:call-template name="fillAttributesByElements"/>
            </xsl:element>
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
                <xsl:when test="name()='rule'">
                    <xsl:element name="rule_FK">
                        <xsl:call-template name="fillOldAttributes"/>
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>
                <xsl:when test="name()='response' and name(..)='file'">
                    <xsl:element name="response_file_FK">
                        <xsl:call-template name="fillOldAttributes"/>
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>
                <xsl:when test="*">
                    <xsl:element name="{local-name()}_FK">
                        <xsl:call-template name="fillOldAttributes"/>
                        <xsl:call-template name="fillAttributesByElements"/>

                        <xsl:if test="name()='file'">
                            <xsl:element name="xsd_file_FK">
                                <xsl:attribute name="answer">
                                    <xsl:value-of select="/results/file/xsd/@answer"/>
                                </xsl:attribute>
                            </xsl:element>
                        </xsl:if>
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