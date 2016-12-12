<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xs="http://www.w3.org/2001/XMLSchema">
    <xsl:output method="xml" indent="yes" encoding="UTF-8"/>

    <xsl:template match="*">
        <xsl:apply-templates select="*"/>
    </xsl:template>

    <xsl:template match="/Application/AXI/application_e/Equifax">
        <xsl:element name="bki_response">
            <xsl:call-template name="transfromEquifax"/>
        </xsl:element>
    </xsl:template>

    <xsl:template name="transfromEquifax">
        <!-- Проходим по всем тегам и атрибутам -->
        <xsl:for-each select="*|@*">
            <xsl:choose>
                <!-- Элемент является тегом -->
                <xsl:when test="contains(name(), '_Eq')">
                    <xsl:variable name="nameElement" select="substring-before(name(), '_Eq')"/>
                    <!-- Имя тега -->

                    <xsl:choose>
                        <xsl:when test="
                        $nameElement = 'phone_number' or
                        $nameElement = 'address' or
                        $nameElement = 'addr_reg' or
                        $nameElement = 'addr_fact' or
                        $nameElement = 'attr'">
                            <xsl:element name="{$nameElement}">
                                <xsl:for-each select="@*">
                                    <xsl:if test="local-name() != $nameElement">
                                        <xsl:attribute name="{local-name()}">
                                            <xsl:call-template name="ifDate"><xsl:with-param name="par" select="."/></xsl:call-template>
                                        </xsl:attribute>
                                    </xsl:if>
                                </xsl:for-each>
                                <xsl:for-each select="@*">
                                    <xsl:if test="local-name() = $nameElement">
                                        <xsl:value-of select="."/>
                                    </xsl:if>
                                </xsl:for-each>
                            </xsl:element>
                        </xsl:when>

                        <xsl:otherwise>
                            <!-- Обработка оставшихся тегов -->
                            <xsl:element name="{$nameElement}">
                                <xsl:call-template name="transfromEquifax"/>
                            </xsl:element>
                        </xsl:otherwise>
                    </xsl:choose>
                </xsl:when>

                <xsl:when test="name(..)= 'response_Eq'">
                    <xsl:choose>
                        <xsl:when test="
                        name() = 'dateofreport' or
                        name() = 'report_type' or
                        name() = 'num'">
                            <xsl:attribute name="{name()}">
                                <xsl:call-template name="ifDate"><xsl:with-param name="par" select="."/></xsl:call-template>
                            </xsl:attribute>
                        </xsl:when>

                        <xsl:otherwise>
                            <xsl:element name="{name()}">
                                <xsl:value-of select="."/>
                            </xsl:element>
                        </xsl:otherwise>
                    </xsl:choose>
                </xsl:when>

                <xsl:when test="
                        name(..)= 'package_Eq' or
                        name(..)= 'section_Eq'">
                    <xsl:attribute name="{name()}">
                        <xsl:value-of select="."/>
                    </xsl:attribute>
                </xsl:when>

                <!-- Элемент является аттрибутом -->
                <xsl:otherwise>
                    <xsl:element name="{name()}">
                        <xsl:call-template name="ifDate"><xsl:with-param name="par" select="."/></xsl:call-template>
                    </xsl:element>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:for-each>
    </xsl:template>

    <xsl:template name="ifDate">
        <xsl:param name="par"/>

        <xsl:choose>
            <xsl:when test="matches($par, '\d{4}-\d{2}-\d{2}')">
                <xsl:value-of select="format-date($par, '[D01].[M01].[Y0001]')"/>
            </xsl:when>

            <xsl:otherwise>
                <xsl:value-of select="$par"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>

    <xsl:template name="convertToDate">
        <xsl:param name="source"/>

        <!--<xsl:value-of select="concat(substring($source,7,4),'-',substring($source,4,2),'-',substring($source,1,2))"/>-->
        <xsl:value-of select="concat(substring($source,9,2),'.',substring($source,6,2),'.',substring($source,1,4))"/>
    </xsl:template>

</xsl:stylesheet>