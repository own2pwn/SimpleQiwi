
package ru.sample.qiwi.soap.ru.mbtc.afs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for linkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="linkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="node1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="node2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkType", propOrder = {
    "node1",
    "node2",
    "name",
    "date"
})
public class LinkType {

    @XmlElement(required = true)
    protected String node1;
    @XmlElement(required = true)
    protected String node2;
    protected String name;
    protected String date;

    /**
     * Gets the value of the node1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode1() {
        return node1;
    }

    /**
     * Sets the value of the node1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode1(String value) {
        this.node1 = value;
    }

    /**
     * Gets the value of the node2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode2() {
        return node2;
    }

    /**
     * Sets the value of the node2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode2(String value) {
        this.node2 = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

}
