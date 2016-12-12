
package ru.sample.qiwi.soap.ru.mbtc.afs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for afsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="afsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auth" type="{http://mbtc.ru/afs}authType"/>
 *         &lt;element name="action">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="useLogin" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
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
 *         &lt;element name="maxCirclesSNA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LHS" type="{http://mbtc.ru/afs}AppDataRequest" minOccurs="0"/>
 *         &lt;element name="RHS" type="{http://mbtc.ru/afs}AppDataRequest" minOccurs="0"/>
 *         &lt;element name="Application" type="{http://mbtc.ru/afs/application}ApplicationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "afsRequestType", propOrder = {
    "auth",
    "action",
    "useLogin",
    "actionSNA",
    "correlationId",
    "sourceId",
    "ruleSetId",
    "ruleSetIdSNA",
    "maxCirclesSNA",
    "lhs",
    "rhs",
    "application"
})
public class AfsRequestType {

    @XmlElement(required = true)
    protected AuthType auth;
    @XmlElement(required = true)
    protected String action;
    protected String useLogin;
    protected Integer actionSNA;
    protected String correlationId;
    protected String sourceId;
    protected String ruleSetId;
    protected String ruleSetIdSNA;
    protected Integer maxCirclesSNA;
    @XmlElement(name = "LHS")
    protected AppDataRequest lhs;
    @XmlElement(name = "RHS")
    protected AppDataRequest rhs;
    @XmlElement(name = "Application", required = true)
    protected ApplicationType application;

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link AuthType }
     *     
     */
    public AuthType getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthType }
     *     
     */
    public void setAuth(AuthType value) {
        this.auth = value;
    }

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
     * Gets the value of the useLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseLogin() {
        return useLogin;
    }

    /**
     * Sets the value of the useLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseLogin(String value) {
        this.useLogin = value;
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
     * Gets the value of the maxCirclesSNA property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCirclesSNA() {
        return maxCirclesSNA;
    }

    /**
     * Sets the value of the maxCirclesSNA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCirclesSNA(Integer value) {
        this.maxCirclesSNA = value;
    }

    /**
     * Gets the value of the lhs property.
     * 
     * @return
     *     possible object is
     *     {@link AppDataRequest }
     *     
     */
    public AppDataRequest getLHS() {
        return lhs;
    }

    /**
     * Sets the value of the lhs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppDataRequest }
     *     
     */
    public void setLHS(AppDataRequest value) {
        this.lhs = value;
    }

    /**
     * Gets the value of the rhs property.
     * 
     * @return
     *     possible object is
     *     {@link AppDataRequest }
     *     
     */
    public AppDataRequest getRHS() {
        return rhs;
    }

    /**
     * Sets the value of the rhs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppDataRequest }
     *     
     */
    public void setRHS(AppDataRequest value) {
        this.rhs = value;
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

}
