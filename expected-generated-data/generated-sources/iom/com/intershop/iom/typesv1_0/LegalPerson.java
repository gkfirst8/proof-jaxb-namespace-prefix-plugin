
package com.intershop.iom.typesv1_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


/**
 * Eine jursitische Person
 * 
 * <p>Java class for LegalPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalPerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="ContactPerson" type="{http://types.theberlinbakery.com/v1_0}Person" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="Person" type="{http://types.theberlinbakery.com/v1_0}Person"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalPerson", propOrder = {
    "companyName",
    "contactPerson",
    "person"
})
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForLegalPerson", toBuilder = true)
@ToString(callSuper = true)
public class LegalPerson {

    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "ContactPerson")
    protected Person contactPerson;
    @XmlElement(name = "Person")
    protected Person person;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getContactPerson() {
        return contactPerson;
    }

    /**
     * Sets the value of the contactPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setContactPerson(Person value) {
        this.contactPerson = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

}
