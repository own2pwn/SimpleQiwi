
package ru.sample.qiwi.soap.cre2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ��������� ��������� ��������� �������� ������� �� ��������� ������
 * 
 * <p>Java class for JoinApplicationResponsesData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JoinApplicationResponsesData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authData" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}AuthData" minOccurs="0"/>
 *         &lt;element name="uidApplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnReportCode" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *         &lt;element name="saveToSFTables" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JoinApplicationResponsesData", propOrder = {
    "authData",
    "uidApplication",
    "returnReportCode",
    "saveToSFTables"
})
public class JoinApplicationResponsesData {

    protected AuthData authData;
    protected String uidApplication;
    protected Byte returnReportCode;
    protected Byte saveToSFTables;

    /**
     * Gets the value of the authData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthData }
     *     
     */
    public AuthData getAuthData() {
        return authData;
    }

    /**
     * Sets the value of the authData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthData }
     *     
     */
    public void setAuthData(AuthData value) {
        this.authData = value;
    }

    /**
     * Gets the value of the uidApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidApplication() {
        return uidApplication;
    }

    /**
     * Sets the value of the uidApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidApplication(String value) {
        this.uidApplication = value;
    }

    /**
     * Gets the value of the returnReportCode property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getReturnReportCode() {
        return returnReportCode;
    }

    /**
     * Sets the value of the returnReportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setReturnReportCode(Byte value) {
        this.returnReportCode = value;
    }

    /**
     * Gets the value of the saveToSFTables property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getSaveToSFTables() {
        return saveToSFTables;
    }

    /**
     * Sets the value of the saveToSFTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setSaveToSFTables(Byte value) {
        this.saveToSFTables = value;
    }

}
