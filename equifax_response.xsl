<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:ns5="http://v2_4_3.incomingRequests.webservices.kernel.sx.fms.ru" xmlns:hash="ru.axilink.helpers.hash">
    <!--<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema">-->
    <xsl:output method="xml" indent="yes"/>

    <xsl:template match="/">
        <xsl:element name="Equifax">
            <xsl:apply-templates/>
        </xsl:element>
    </xsl:template>

    <xsl:template match="/bki_response">
        <xsl:call-template name="fillAttributesByElements"/>
    </xsl:template>

    <!-- ********************* FUNCTIONS ********************* -->

    <xsl:template name="fillAttributesByElements">
        <xsl:for-each select="*">
            <xsl:choose>
                <xsl:when test="name()='phone_number' or name()='address' or ((name()='addr_reg' or name()='addr_fact') and name(..)='history_addr')">
                    <xsl:element name="{name()}_Eq">
                        <xsl:call-template name="fillOldAttributes"/>

                        <xsl:attribute name="{name()}"><xsl:value-of select="."/></xsl:attribute>
                    </xsl:element>
                </xsl:when>

                <xsl:when test="name()='attr'">
                    <xsl:element name="{name()}_Eq">
                        <xsl:call-template name="fillOldAttributes"/>
                    </xsl:element>
                </xsl:when>

                <xsl:when test="name()='birthday' or name()='docdate' or name()='date' or name()='cred_date' or name()='cred_enddate' or name()='cred_date_payout' or name()='cred_update' or name()='cred_active_date' or name()='cred_first_load'">
                    <xsl:attribute name="{local-name()}">
                        <xsl:call-template name="convertToDate">
                            <xsl:with-param name="source"><xsl:value-of select="."/></xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="not(*) and not(*[*])">
                    <xsl:attribute name="{local-name()}"><xsl:value-of select="."/></xsl:attribute>

                    <xsl:if test="((name(../..)='title_part' and name(..)='private') or (name(../..)='private' and name(..)='history_title'))
                                    and (local-name()='lastname' or local-name()='firstname' or local-name()='middlename')">
                        <xsl:attribute name="{local-name()}_hash"><xsl:value-of select="hash:checksum(.)"/></xsl:attribute>
                    </xsl:if>
                </xsl:when>


                <!--<xsl:otherwise>-->
                <!--<xsl:element name="{local-name()}_Eq">-->
                <!--<xsl:call-template name="fillOldAttributes"/>-->

                <!--<xsl:call-template name="fillAttributesByElements"/>-->
                <!--</xsl:element>-->
                <!--</xsl:otherwise>-->
            </xsl:choose>
        </xsl:for-each>

        <xsl:for-each select="*">
            <xsl:choose>
                <xsl:when test="*">
                    <xsl:element name="{local-name()}_Eq">
                        <xsl:call-template name="fillOldAttributes"/>

                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>
            </xsl:choose>
        </xsl:for-each>

    </xsl:template>

    <xsl:template name="fillOldAttributes">
        <xsl:for-each select="@*">
            <xsl:choose>
                <xsl:when test="name()='date' or name()='dateofreport'">
                    <xsl:attribute name="{local-name()}">
                        <xsl:call-template name="convertToDate">
                            <xsl:with-param name="source"><xsl:value-of select="."/></xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:otherwise>
                    <xsl:attribute name="{local-name()}"><xsl:value-of select="."/></xsl:attribute>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:for-each>
    </xsl:template>


    <xsl:template name="convertToDate">
        <xsl:param name="source"/>

        <xsl:value-of select="concat(substring($source,7,4),'-',substring($source,4,2),'-',substring($source,1,2))"/>
    </xsl:template>

    <xsl:function name="hash:checksum" as="xs:integer">
        <xsl:param name="str" as="xs:string"/>
        <xsl:variable name="codepoints" select="string-to-codepoints($str)"/>
        <xsl:value-of select="hash:fletcher16($codepoints, count($codepoints), 1, 0, 0)"/>
    </xsl:function>

    <xsl:function name="hash:fletcher16">
        <xsl:param name="str" as="xs:integer*"/>
        <xsl:param name="len" as="xs:integer"/>
        <xsl:param name="index" as="xs:integer"/>
        <xsl:param name="sum1" as="xs:integer"/>
        <xsl:param name="sum2" as="xs:integer"/>
        <xsl:choose>
            <xsl:when test="$index gt $len">
                <xsl:sequence select="$sum2 * 256 + $sum1"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:variable name="newSum1" as="xs:integer" select="($sum1 + $str[$index]) mod 255"/>
                <xsl:sequence select="hash:fletcher16($str, $len, $index + 1, $newSum1, ($sum2 + $newSum1) mod 255)"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>
</xsl:stylesheet>