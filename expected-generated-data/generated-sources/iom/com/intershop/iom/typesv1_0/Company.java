
package com.intershop.iom.typesv1_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


/**
 * Unternehmen
 * 
 * <p>Java class for Company complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Company"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="department" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="costNo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="commercialRegisterId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="commercialRegisterLocation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="vatNo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Company")
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForCompany", toBuilder = true)
@ToString(callSuper = true)
public class Company {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "department")
    protected String department;
    @XmlAttribute(name = "lineOfBusiness")
    @XmlSchemaType(name = "anySimpleType")
    protected String lineOfBusiness;
    @XmlAttribute(name = "costNo")
    protected String costNo;
    @XmlAttribute(name = "commercialRegisterId")
    protected String commercialRegisterId;
    @XmlAttribute(name = "commercialRegisterLocation")
    protected String commercialRegisterLocation;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "vatNo")
    protected String vatNo;

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
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the lineOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineOfBusiness() {
        return lineOfBusiness;
    }

    /**
     * Sets the value of the lineOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineOfBusiness(String value) {
        this.lineOfBusiness = value;
    }

    /**
     * Gets the value of the costNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostNo() {
        return costNo;
    }

    /**
     * Sets the value of the costNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostNo(String value) {
        this.costNo = value;
    }

    /**
     * Gets the value of the commercialRegisterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialRegisterId() {
        return commercialRegisterId;
    }

    /**
     * Sets the value of the commercialRegisterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialRegisterId(String value) {
        this.commercialRegisterId = value;
    }

    /**
     * Gets the value of the commercialRegisterLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialRegisterLocation() {
        return commercialRegisterLocation;
    }

    /**
     * Sets the value of the commercialRegisterLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialRegisterLocation(String value) {
        this.commercialRegisterLocation = value;
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

    /**
     * Gets the value of the vatNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatNo() {
        return vatNo;
    }

    /**
     * Sets the value of the vatNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatNo(String value) {
        this.vatNo = value;
    }

}
