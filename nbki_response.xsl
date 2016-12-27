<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:hash="ru.axilink.helpers.hash">
    <xsl:output method="xml" indent="yes"/>

    <xsl:template match="/">
        <!--xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="Schema_NBKI.xsd"-->
        <!--xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="Schema_NBKI"-->
        <NBKI>
            <xsl:apply-templates/>
        </NBKI>
    </xsl:template>

    <xsl:template match="/product">
        <product_NBKI>
            <xsl:call-template name="fillAttributesByElements"/>
        </product_NBKI>
    </xsl:template>

    <!-- ********************* FUNCTIONS ********************* -->

    <xsl:template name="fillAttributesByElements">
        <xsl:for-each select="*">
            <xsl:choose>
                <xsl:when test="name()='issueDate'">
                    <xsl:attribute name="{name()}">
                        <xsl:call-template name="cutTimeFromDatetime">
                            <xsl:with-param name="inDate">
                                <xsl:value-of select="."/>
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="name()='birthDt'">
                    <xsl:attribute name="{name()}">
                        <xsl:call-template name="cutTimeFromDatetime">
                            <xsl:with-param name="inDate">
                                <xsl:value-of select="."/>
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="name()='requestDateTime'">
                    <xsl:attribute name="{name()}">
                        <xsl:call-template name="cutTimeFromDatetime">
                            <xsl:with-param name="inDate">
                                <xsl:value-of select="."/>
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="name()='lastUpdatedDt'">
                    <xsl:attribute name="{name()}">
                        <xsl:call-template name="cutTimeFromDatetime">
                            <xsl:with-param name="inDate">
                                <xsl:value-of select="."/>
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="name()='fileSinceDt'">
                    <xsl:attribute name="{name()}">
                        <xsl:call-template name="cutTimeFromDatetime">
                            <xsl:with-param name="inDate">
                                <xsl:value-of select="."/>
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="name()='lastUpdatedDt'">
                    <xsl:attribute name="{name()}">
                        <xsl:call-template name="cutTimeFromDatetime">
                            <xsl:with-param name="inDate">
                                <xsl:value-of select="."/>
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="name()='fileSinceDt'">
                    <xsl:attribute name="{name()}">
                        <xsl:call-template name="cutTimeFromDatetime">
                            <xsl:with-param name="inDate">
                                <xsl:value-of select="."/>
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="name()='dataValidity'">
                    <xsl:attribute name="{name()}">
                        <xsl:call-template name="cutTimeFromDatetime">
                            <xsl:with-param name="inDate">
                                <xsl:value-of select="."/>
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="name()='openedDt'">
                    <xsl:attribute name="{name()}">
                        <xsl:call-template name="cutTimeFromDatetime">
                            <xsl:with-param name="inDate">
                                <xsl:value-of select="."/>
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="name()='lastPaymtDt'">
                    <xsl:attribute name="{name()}">
                        <xsl:call-template name="cutTimeFromDatetime">
                            <xsl:with-param name="inDate">
                                <xsl:value-of select="."/>
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="name()='closedDt'">
                    <xsl:attribute name="{name()}">
                        <xsl:call-template name="cutTimeFromDatetime">
                            <xsl:with-param name="inDate">
                                <xsl:value-of select="."/>
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="name()='reportingDt'">
                    <xsl:attribute name="{name()}">
                        <xsl:call-template name="cutTimeFromDatetime">
                            <xsl:with-param name="inDate">
                                <xsl:value-of select="."/>
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="name()='paymtPatStartDt'">
                    <xsl:attribute name="{name()}">
                        <xsl:call-template name="cutTimeFromDatetime">
                            <xsl:with-param name="inDate">
                                <xsl:value-of select="."/>
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="name()='accountRatingDate'">
                    <xsl:attribute name="{name()}">
                        <xsl:call-template name="cutTimeFromDatetime">
                            <xsl:with-param name="inDate">
                                <xsl:value-of select="."/>
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="name()='paymentDueDate'">
                    <xsl:attribute name="{name()}">
                        <xsl:call-template name="cutTimeFromDatetime">
                            <xsl:with-param name="inDate">
                                <xsl:value-of select="."/>
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="name()='interestPaymentDueDate'">
                    <xsl:attribute name="{name()}">
                        <xsl:call-template name="cutTimeFromDatetime">
                            <xsl:with-param name="inDate">
                                <xsl:value-of select="."/>
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="name()=''">
                    <xsl:attribute name="{name()}">
                        <xsl:call-template name="cutTimeFromDatetime">
                            <xsl:with-param name="inDate">
                                <xsl:value-of select="."/>
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="name()='mostRecentAcc'">
                    <xsl:attribute name="{name()}">
                        <xsl:call-template name="cutTimeFromDatetime">
                            <xsl:with-param name="inDate">
                                <xsl:value-of select="."/>
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="name()='oldest'">
                    <xsl:attribute name="{name()}">
                        <xsl:call-template name="cutTimeFromDatetime">
                            <xsl:with-param name="inDate">
                                <xsl:value-of select="."/>
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="name()='reportIssueDateTime'">
                    <xsl:attribute name="{name()}">
                        <xsl:call-template name="cutTimeFromDatetime">
                            <xsl:with-param name="inDate">
                                <xsl:value-of select="."/>
                            </xsl:with-param>
                        </xsl:call-template>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="name()='amtPastDue'">
                    <xsl:attribute name="{name()}">
                        <xsl:choose>
                            <xsl:when test=".=''">0</xsl:when>
                            <xsl:otherwise><xsl:value-of select="."/></xsl:otherwise>
                        </xsl:choose>
                    </xsl:attribute>
                </xsl:when>

                <xsl:when test="not(*) and not(*[*])">
                    <xsl:attribute name="{name()}">
                        <xsl:value-of select="."/>
                    </xsl:attribute>

                    <xsl:if test="name(..)='PersonReq' and
                            name()='first' or
                            name()='name1' or
                            name()='paternal'">
                        <xsl:attribute name="{name()}_hash">
                            <xsl:value-of select="hash:checksum(.)"/>
                        </xsl:attribute>
                    </xsl:if>
                </xsl:when>
            </xsl:choose>
        </xsl:for-each>

        <xsl:for-each select="*">
            <xsl:choose>
                <!-- !!!ПЕРСОНАЛЬНЫЕ ДАННЫЕ!!! -->
                <!--<xsl:when test="name()='AddressReq' or name()='PersonReq' or name()='IdReq' or name()='AddressReply' or name()='PersonReply' or name()='IdReply'">-->
                <!--<xsl:element name="{name()}_NBKI">-->
                <!--</xsl:element>-->
                <!--</xsl:when>-->

                <xsl:when test="name(..)='req' and contains(name(),'Req')">
                    <xsl:variable name="cutName" select="substring(name(),0,string-length(name())-2)"/>
                    <xsl:element name="{$cutName}_NBKI">
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>

                <xsl:when test="name(../..)='preply' and contains(name(),'Reply')">
                    <xsl:variable name="cutName" select="substring(name(),0,string-length(name())-4)"/>
                    <xsl:element name="{$cutName}_NBKI">
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>

                <xsl:when test="name(..)='OwnAccounts' and name()='Account'">
                    <xsl:element name="OwnAccount_NBKI">
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>

                <xsl:when test="name(..)='report' and name()='calc'">
                    <xsl:element name="Calculations_NBKI">
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>

                <!-- Если подчинен calc и есть дочернии элементы -->
                <xsl:when test="name(..)='calc' and (*)">
                    <xsl:element name="calc_{name()}">
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>

                <xsl:when test="*">
                    <xsl:element name="{name()}_NBKI">
                        <xsl:call-template name="fillAttributesByElements"/>
                    </xsl:element>
                </xsl:when>
            </xsl:choose>
        </xsl:for-each>
    </xsl:template>

    <xsl:template name="cutTimeFromDatetime">
        <xsl:param name="inDate"/>

        <!--<xsl:value-of select="concat(substring($inDate,5,4),'-',substring($inDate,3,2),'-',substring($inDate,1,2))"/>-->
        <xsl:value-of select="substring($inDate,0,11)"/>
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