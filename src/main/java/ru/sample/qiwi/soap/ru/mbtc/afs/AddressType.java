
package ru.sample.qiwi.soap.ru.mbtc.afs;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация об адресе
 * 
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fraud" type="{http://mbtc.ru/afs/application}Td3" minOccurs="0"/>
 *         &lt;element name="addrType" type="{http://mbtc.ru/afs/application}Td12" minOccurs="0"/>
 *         &lt;element name="kladrBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://mbtc.ru/afs/application}Td18" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="region" type="{http://mbtc.ru/afs/application}Td19" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="house" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="block" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://mbtc.ru/afs/application}TDate" minOccurs="0"/>
 *         &lt;element name="fileSinceDt" type="{http://mbtc.ru/afs/application}TDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", namespace = "http://mbtc.ru/afs/application", propOrder = {
    "fraud",
    "addrType",
    "kladrBank",
    "country",
    "postalCode",
    "region",
    "district",
    "city",
    "place",
    "street",
    "house",
    "block",
    "building",
    "apartment",
    "startDate",
    "fileSinceDt"
})
public class AddressType {

    protected Byte fraud;
    protected Byte addrType;
    protected String kladrBank;
    @XmlSchemaType(name = "string")
    protected Td18 country;
    protected BigInteger postalCode;
    protected Byte region;
    protected String district;
    protected String city;
    protected String place;
    protected String street;
    protected String house;
    protected String block;
    protected String building;
    protected String apartment;
    protected String startDate;
    protected String fileSinceDt;

    /**
     * Gets the value of the fraud property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getFraud() {
        return fraud;
    }

    /**
     * Sets the value of the fraud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setFraud(Byte value) {
        this.fraud = value;
    }

    /**
     * Gets the value of the addrType property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getAddrType() {
        return addrType;
    }

    /**
     * Sets the value of the addrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setAddrType(Byte value) {
        this.addrType = value;
    }

    /**
     * Gets the value of the kladrBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKladrBank() {
        return kladrBank;
    }

    /**
     * Sets the value of the kladrBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKladrBank(String value) {
        this.kladrBank = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Td18 }
     *     
     */
    public Td18 getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Td18 }
     *     
     */
    public void setCountry(Td18 value) {
        this.country = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPostalCode(BigInteger value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setRegion(Byte value) {
        this.region = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the house property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouse(String value) {
        this.house = value;
    }

    /**
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlock(String value) {
        this.block = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the apartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartment() {
        return apartment;
    }

    /**
     * Sets the value of the apartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartment(String value) {
        this.apartment = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the fileSinceDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileSinceDt() {
        return fileSinceDt;
    }

    /**
     * Sets the value of the fileSinceDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSinceDt(String value) {
        this.fileSinceDt = value;
    }

}
