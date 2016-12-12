
package ru.sample.qiwi.soap.ru.mbtc.afs;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о кредите
 * 
 * <p>Java class for DetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditType" type="{http://mbtc.ru/afs/application}Td4" minOccurs="0"/>
 *         &lt;element name="receiptChannel" type="{http://mbtc.ru/afs/application}Td16" minOccurs="0"/>
 *         &lt;element name="totalCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://mbtc.ru/afs/application}Td17" minOccurs="0"/>
 *         &lt;element name="initialInstalment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pledgeFlag" type="{http://mbtc.ru/afs/application}Td5" minOccurs="0"/>
 *         &lt;element name="pledgeValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="productFlag" type="{http://mbtc.ru/afs/application}Td5" minOccurs="0"/>
 *         &lt;element name="productValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="productModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditDate" type="{http://mbtc.ru/afs/application}TDate" minOccurs="0"/>
 *         &lt;element name="creditDuration" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="salePoint" type="{http://mbtc.ru/afs/application}SalePointType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailsType", namespace = "http://mbtc.ru/afs/application", propOrder = {
    "creditType",
    "receiptChannel",
    "totalCredit",
    "currency",
    "initialInstalment",
    "pledgeFlag",
    "pledgeValue",
    "productFlag",
    "productValue",
    "productModel",
    "creditDate",
    "creditDuration",
    "salePoint"
})
public class DetailsType {

    protected Byte creditType;
    protected Byte receiptChannel;
    protected BigDecimal totalCredit;
    @XmlSchemaType(name = "string")
    protected Td17 currency;
    protected BigDecimal initialInstalment;
    protected Byte pledgeFlag;
    protected BigDecimal pledgeValue;
    protected Byte productFlag;
    protected BigDecimal productValue;
    protected String productModel;
    protected String creditDate;
    protected BigInteger creditDuration;
    protected SalePointType salePoint;

    /**
     * Gets the value of the creditType property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getCreditType() {
        return creditType;
    }

    /**
     * Sets the value of the creditType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setCreditType(Byte value) {
        this.creditType = value;
    }

    /**
     * Gets the value of the receiptChannel property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getReceiptChannel() {
        return receiptChannel;
    }

    /**
     * Sets the value of the receiptChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setReceiptChannel(Byte value) {
        this.receiptChannel = value;
    }

    /**
     * Gets the value of the totalCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCredit() {
        return totalCredit;
    }

    /**
     * Sets the value of the totalCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCredit(BigDecimal value) {
        this.totalCredit = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Td17 }
     *     
     */
    public Td17 getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Td17 }
     *     
     */
    public void setCurrency(Td17 value) {
        this.currency = value;
    }

    /**
     * Gets the value of the initialInstalment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitialInstalment() {
        return initialInstalment;
    }

    /**
     * Sets the value of the initialInstalment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitialInstalment(BigDecimal value) {
        this.initialInstalment = value;
    }

    /**
     * Gets the value of the pledgeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getPledgeFlag() {
        return pledgeFlag;
    }

    /**
     * Sets the value of the pledgeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setPledgeFlag(Byte value) {
        this.pledgeFlag = value;
    }

    /**
     * Gets the value of the pledgeValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPledgeValue() {
        return pledgeValue;
    }

    /**
     * Sets the value of the pledgeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPledgeValue(BigDecimal value) {
        this.pledgeValue = value;
    }

    /**
     * Gets the value of the productFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getProductFlag() {
        return productFlag;
    }

    /**
     * Sets the value of the productFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setProductFlag(Byte value) {
        this.productFlag = value;
    }

    /**
     * Gets the value of the productValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProductValue() {
        return productValue;
    }

    /**
     * Sets the value of the productValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProductValue(BigDecimal value) {
        this.productValue = value;
    }

    /**
     * Gets the value of the productModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductModel() {
        return productModel;
    }

    /**
     * Sets the value of the productModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductModel(String value) {
        this.productModel = value;
    }

    /**
     * Gets the value of the creditDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditDate() {
        return creditDate;
    }

    /**
     * Sets the value of the creditDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditDate(String value) {
        this.creditDate = value;
    }

    /**
     * Gets the value of the creditDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCreditDuration() {
        return creditDuration;
    }

    /**
     * Sets the value of the creditDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCreditDuration(BigInteger value) {
        this.creditDuration = value;
    }

    /**
     * Gets the value of the salePoint property.
     * 
     * @return
     *     possible object is
     *     {@link SalePointType }
     *     
     */
    public SalePointType getSalePoint() {
        return salePoint;
    }

    /**
     * Sets the value of the salePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalePointType }
     *     
     */
    public void setSalePoint(SalePointType value) {
        this.salePoint = value;
    }

}
