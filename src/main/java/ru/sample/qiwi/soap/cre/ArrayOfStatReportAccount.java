
package ru.sample.qiwi.soap.cre;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStatReportAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStatReportAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatReportAccount" type="{http://statreport.connectors.nbki.ru}StatReportAccount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStatReportAccount", namespace = "http://statreport.connectors.nbki.ru", propOrder = {
    "statReportAccount"
})
public class ArrayOfStatReportAccount {

    @XmlElement(name = "StatReportAccount", nillable = true)
    protected List<StatReportAccount> statReportAccount;

    /**
     * Gets the value of the statReportAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statReportAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatReportAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatReportAccount }
     * 
     * 
     */
    public List<StatReportAccount> getStatReportAccount() {
        if (statReportAccount == null) {
            statReportAccount = new ArrayList<StatReportAccount>();
        }
        return this.statReportAccount;
    }

}
