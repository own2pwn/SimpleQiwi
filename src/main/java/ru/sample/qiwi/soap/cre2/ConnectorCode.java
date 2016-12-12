
package ru.sample.qiwi.soap.cre2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * ��� ������ ���������� �������� ������� � ���
 * 
 * <p>Java class for ConnectorCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectorCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subRequestCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectorCode", propOrder = {
    "connectorCode",
    "subRequestCode"
})
public class ConnectorCode {

    @XmlElement(required = true)
    protected String connectorCode;
    protected List<String> subRequestCode;

    /**
     * Gets the value of the connectorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectorCode() {
        return connectorCode;
    }

    /**
     * Sets the value of the connectorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectorCode(String value) {
        this.connectorCode = value;
    }

    /**
     * Gets the value of the subRequestCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subRequestCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubRequestCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubRequestCode() {
        if (subRequestCode == null) {
            subRequestCode = new ArrayList<String>();
        }
        return this.subRequestCode;
    }

}
