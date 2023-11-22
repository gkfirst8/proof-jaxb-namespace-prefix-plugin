
package com.intershop.iom.typesv1_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


/**
 * A physical address location
 * 
 * <p>Java class for Location complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PostCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="District" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;choice&gt;
 *             &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="DetailedStreet"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                     &lt;attribute name="streetName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                     &lt;attribute name="houseNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;/restriction&gt;
 *                 &lt;/complexContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *           &lt;/choice&gt;
 *           &lt;element name="POBox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="Packstation"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attribute name="userId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="stationId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Addition" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
    "city",
    "postCode",
    "district",
    "street",
    "detailedStreet",
    "poBox",
    "packstation",
    "addition",
    "country"
})
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForLocation", toBuilder = true)
@ToString(callSuper = true)
public class Location {

    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "PostCode", required = true)
    protected String postCode;
    @XmlElement(name = "District")
    protected String district;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "DetailedStreet")
    protected Location.DetailedStreet detailedStreet;
    @XmlElement(name = "POBox")
    protected String poBox;
    @XmlElement(name = "Packstation")
    protected Location.Packstation packstation;
    @XmlElement(name = "Addition")
    protected List<String> addition;
    @XmlElement(name = "Country", required = true)
    protected String country;

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
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
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
     * Gets the value of the detailedStreet property.
     * 
     * @return
     *     possible object is
     *     {@link Location.DetailedStreet }
     *     
     */
    public Location.DetailedStreet getDetailedStreet() {
        return detailedStreet;
    }

    /**
     * Sets the value of the detailedStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location.DetailedStreet }
     *     
     */
    public void setDetailedStreet(Location.DetailedStreet value) {
        this.detailedStreet = value;
    }

    /**
     * Gets the value of the poBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBox() {
        return poBox;
    }

    /**
     * Sets the value of the poBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBox(String value) {
        this.poBox = value;
    }

    /**
     * Gets the value of the packstation property.
     * 
     * @return
     *     possible object is
     *     {@link Location.Packstation }
     *     
     */
    public Location.Packstation getPackstation() {
        return packstation;
    }

    /**
     * Sets the value of the packstation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location.Packstation }
     *     
     */
    public void setPackstation(Location.Packstation value) {
        this.packstation = value;
    }

    /**
     * Gets the value of the addition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddition() {
        if (addition == null) {
            addition = new ArrayList<String>();
        }
        return this.addition;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="streetName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="houseNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @NoArgsConstructor
    @AllArgsConstructor
    @SuperBuilder(builderMethodName = "builderForDetailedStreet", toBuilder = true)
    @ToString(callSuper = true)
    public static class DetailedStreet {

        @XmlAttribute(name = "streetName", required = true)
        protected String streetName;
        @XmlAttribute(name = "houseNumber", required = true)
        protected String houseNumber;

        /**
         * Gets the value of the streetName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStreetName() {
            return streetName;
        }

        /**
         * Sets the value of the streetName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStreetName(String value) {
            this.streetName = value;
        }

        /**
         * Gets the value of the houseNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHouseNumber() {
            return houseNumber;
        }

        /**
         * Sets the value of the houseNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHouseNumber(String value) {
            this.houseNumber = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="userId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="stationId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @NoArgsConstructor
    @AllArgsConstructor
    @SuperBuilder(builderMethodName = "builderForPackstation", toBuilder = true)
    @ToString(callSuper = true)
    public static class Packstation {

        @XmlAttribute(name = "userId", required = true)
        protected String userId;
        @XmlAttribute(name = "stationId", required = true)
        protected String stationId;

        /**
         * Gets the value of the userId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserId() {
            return userId;
        }

        /**
         * Sets the value of the userId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserId(String value) {
            this.userId = value;
        }

        /**
         * Gets the value of the stationId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStationId() {
            return stationId;
        }

        /**
         * Sets the value of the stationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStationId(String value) {
            this.stationId = value;
        }

    }

}
