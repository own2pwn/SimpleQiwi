
package ru.sample.qiwi.soap.ru.mbtc.afs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for afsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="afsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="actionSNA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="correlationId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sourceId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ruleSetId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ruleSetIdSNA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="appId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="appVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Application" type="{http://mbtc.ru/afs/application}ApplicationType" minOccurs="0"/>
 *         &lt;element name="appsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rulesCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="matchCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="matchResult" type="{http://mbtc.ru/afs}matchResultType" minOccurs="0"/>
 *         &lt;element name="network" type="{http://mbtc.ru/afs}SNAType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "afsResponseType", propOrder = {
    "action",
    "actionSNA",
    "correlationId",
    "sourceId",
    "ruleSetId",
    "ruleSetIdSNA",
    "duration",
    "appId",
    "appVersion",
    "application",
    "appsCount",
    "rulesCount",
    "matchCount",
    "matchResult",
    "network"
})
public class AfsResponseType {

    @XmlElement(required = true)
    protected String action;
    protected Integer actionSNA;
    protected String correlationId;
    protected String sourceId;
    protected String ruleSetId;
    protected String ruleSetIdSNA;
    protected long duration;
    @XmlElement(required = true)
    protected String appId;
    protected int appVersion;
    @XmlElement(name = "Application")
    protected ApplicationType application;
    protected Integer appsCount;
    protected Integer rulesCount;
    protected Integer matchCount;
    protected MatchResultType matchResult;
    protected SNAType network;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the actionSNA property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActionSNA() {
        return actionSNA;
    }

    /**
     * Sets the value of the actionSNA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActionSNA(Integer value) {
        this.actionSNA = value;
    }

    /**
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationId(String value) {
        this.correlationId = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the ruleSetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleSetId() {
        return ruleSetId;
    }

    /**
     * Sets the value of the ruleSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleSetId(String value) {
        this.ruleSetId = value;
    }

    /**
     * Gets the value of the ruleSetIdSNA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleSetIdSNA() {
        return ruleSetIdSNA;
    }

    /**
     * Sets the value of the ruleSetIdSNA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleSetIdSNA(String value) {
        this.ruleSetIdSNA = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     */
    public long getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     */
    public void setDuration(long value) {
        this.duration = value;
    }

    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    /**
     * Gets the value of the appVersion property.
     * 
     */
    public int getAppVersion() {
        return appVersion;
    }

    /**
     * Sets the value of the appVersion property.
     * 
     */
    public void setAppVersion(int value) {
        this.appVersion = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationType }
     *     
     */
    public ApplicationType getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationType }
     *     
     */
    public void setApplication(ApplicationType value) {
        this.application = value;
    }

    /**
     * Gets the value of the appsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAppsCount() {
        return appsCount;
    }

    /**
     * Sets the value of the appsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAppsCount(Integer value) {
        this.appsCount = value;
    }

    /**
     * Gets the value of the rulesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRulesCount() {
        return rulesCount;
    }

    /**
     * Sets the value of the rulesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRulesCount(Integer value) {
        this.rulesCount = value;
    }

    /**
     * Gets the value of the matchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMatchCount() {
        return matchCount;
    }

    /**
     * Sets the value of the matchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMatchCount(Integer value) {
        this.matchCount = value;
    }

    /**
     * Gets the value of the matchResult property.
     * 
     * @return
     *     possible object is
     *     {@link MatchResultType }
     *     
     */
    public MatchResultType getMatchResult() {
        return matchResult;
    }

    /**
     * Sets the value of the matchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchResultType }
     *     
     */
    public void setMatchResult(MatchResultType value) {
        this.matchResult = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link SNAType }
     *     
     */
    public SNAType getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNAType }
     *     
     */
    public void setNetwork(SNAType value) {
        this.network = value;
    }

}
