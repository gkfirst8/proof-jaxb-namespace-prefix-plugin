
package com.intershop.iom.typesv1_2;

import com.intershop.iom.typesv1_0.Contact;
import com.intershop.iom.typesv1_0.LegalPerson;
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
 * Address
 * 
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Receiver" type="{http://types.theberlinbakery.com/v1_0}LegalPerson"/&gt;
 *           &lt;element name="Contact" type="{http://types.theberlinbakery.com/v1_0}Contact" minOccurs="0"/&gt;
 *           &lt;element name="Location" type="{http://types.theberlinbakery.com/v1_2}Location"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="Immaterial" type="{http://types.theberlinbakery.com/v1_2}Immaterial"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "receiver",
    "contact",
    "location",
    "immaterial"
})
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForAddress", toBuilder = true)
@ToString(callSuper = true)
public class Address {

    @XmlElement(name = "Receiver")
    protected LegalPerson receiver;
    @XmlElement(name = "Contact")
    protected Contact contact;
    @XmlElement(name = "Location")
    protected Location location;
    @XmlElement(name = "Immaterial")
    protected Immaterial immaterial;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link LegalPerson }
     *     
     */
    public LegalPerson getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalPerson }
     *     
     */
    public void setReceiver(LegalPerson value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the immaterial property.
     * 
     * @return
     *     possible object is
     *     {@link Immaterial }
     *     
     */
    public Immaterial getImmaterial() {
        return immaterial;
    }

    /**
     * Sets the value of the immaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Immaterial }
     *     
     */
    public void setImmaterial(Immaterial value) {
        this.immaterial = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
