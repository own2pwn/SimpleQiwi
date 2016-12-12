
package ru.sample.qiwi.soap.cre2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * ��� ��������� ������ �������� ��� ��������
 * 
 * <p>Java class for JoinUidResponsesData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JoinUidResponsesData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authData" type="{http://creditregistry.ru/2010/webservice/SingleFormatService}AuthData" minOccurs="0"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
@XmlType(name = "JoinUidResponsesData", propOrder = {
    "authData",
    "uid",
    "returnReportCode",
    "saveToSFTables"
})
public class JoinUidResponsesData {

    protected AuthData authData;
    @XmlElement(required = true)
    protected List<String> uid;
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
     * Gets the value of the uid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUid() {
        if (uid == null) {
            uid = new ArrayList<String>();
        }
        return this.uid;
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
