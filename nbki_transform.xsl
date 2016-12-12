<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xs="http://www.w3.org/2001/XMLSchema">
    <xsl:output method="xml" indent="yes" encoding="UTF-8"/>

    <xsl:template match="*">
        <xsl:apply-templates select="*"/>
    </xsl:template>

    <xsl:template match="/NBKI">
        <xsl:call-template name="transfromNBKI"/>
    </xsl:template>

    <xsl:template name="transfromNBKI">
        <!-- Проходим по всем тегам и атрибутам -->
        <xsl:for-each select="*|@*">
            <xsl:choose>
                <!-- Элемент является тегом -->
                <xsl:when test="contains(name(), '_NBKI')">
                    <xsl:variable name="nameElement" select="substring-before(name(), '_NBKI')"/>
                    <!-- Имя тега -->

                    <xsl:choose>
                        <!-- Проверка, принадлежит ли тег перечню -->
                        <xsl:when
                                test="$nameElement='Ref' or
                                $nameElement='Person' or
                                $nameElement='Inquiry' or
                                $nameElement='Id' or
                                $nameElement='Address' or
                                $nameElement='Requestor' or
                                $nameElement='Subject' or
                                $nameElement='Account' or
                                $nameElement='Employment' or
                                $nameElement='Phone' or
                                $nameElement='LegalItems' or
                                $nameElement='OfficialInfo'">
                            <xsl:variable name="nameParentTag" select="substring-before(name(../..), '_NBKI')"/>
                            <!-- Имя прародителя -->

                            <!-- Прародителем был тег preply -->
                            <xsl:if test="$nameParentTag='preply'">
                                <xsl:element name="{concat($nameElement,'Reply')}">
                                    <xsl:call-template name="transfromNBKI"/>
                                </xsl:element>
                            </xsl:if>

                            <!-- Прародителем был тег prequest -->
                            <xsl:if test="$nameParentTag='prequest'">
                                <xsl:element name="{concat($nameElement,'Req')}">
                                    <xsl:call-template name="transfromNBKI"/>
                                </xsl:element>
                            </xsl:if>
                        </xsl:when>

                        <!-- Проверка, на тег Calculations -->
                        <xsl:when test="$nameElement='Calculations'">
                            <xsl:element name="calc">
                                <xsl:call-template name="transfromNBKI"/>
                            </xsl:element>
                        </xsl:when>

                        <!-- Проверка, на тег OwnInquiries или OwnAccounts -->
                        <xsl:when test="$nameElement='OwnInquiries' or $nameElement='OwnAccounts'">
                            <xsl:element name="{$nameElement}">
                                <xsl:call-template name="procassingInternalTags">
                                    <xsl:with-param name="para">
                                        <xsl:if test="$nameElement='OwnInquiries'">Inquery</xsl:if>
                                        <xsl:if test="$nameElement='OwnAccounts'">Account</xsl:if>
                                    </xsl:with-param>
                                </xsl:call-template>
                            </xsl:element>
                        </xsl:when>

                        <!-- Обработка оставшихся тегов -->
                        <xsl:otherwise>
                            <xsl:element name="{$nameElement}">
                                <xsl:call-template name="transfromNBKI"/>
                            </xsl:element>
                        </xsl:otherwise>
                    </xsl:choose>
                </xsl:when>

                <!-- Проверка, начинается ли тег с 'calc_' -->
                <xsl:when test="starts-with(name(), 'calc_')">
                    <xsl:element name="{replace(local-name(),'calc_','')}">
                        <xsl:call-template name="transfromNBKI"/>
                    </xsl:element>
                </xsl:when>

                <!-- Элемент является аттрибутом -->
                <xsl:otherwise>
                    <xsl:element name="{name()}">
                        <xsl:value-of select="."/>
                    </xsl:element>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:for-each>
    </xsl:template>

    <xsl:template name="procassingInternalTags">
        <xsl:param name="para"/>

        <xsl:for-each select="*|@*">
            <xsl:element name="{$para}">
                <xsl:call-template name="transfromNBKI"/>
            </xsl:element>
        </xsl:for-each>
    </xsl:template>

</xsl:stylesheet>