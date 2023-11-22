
package com.intershop.iom.typesv1_2;

import java.math.BigDecimal;
import com.intershop.adapters.BigDecimalAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


/**
 * Promotion
 * 
 * <p>Java class for Promotion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Promotion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="descriptorId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="netValue" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="grossValue" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="percentageValue" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="fixedValue" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="budgetSourceID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Promotion")
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForPromotion", toBuilder = true)
@ToString(callSuper = true)
public class Promotion {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "descriptorId", required = true)
    protected String descriptorId;
    @XmlAttribute(name = "netValue", required = true)
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal netValue;
    @XmlAttribute(name = "grossValue", required = true)
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal grossValue;
    @XmlAttribute(name = "percentageValue")
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal percentageValue;
    @XmlAttribute(name = "fixedValue")
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal fixedValue;
    @XmlAttribute(name = "code")
    protected String code;
    @XmlAttribute(name = "budgetSourceID")
    protected String budgetSourceID;

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
     * Gets the value of the descriptorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptorId() {
        return descriptorId;
    }

    /**
     * Sets the value of the descriptorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptorId(String value) {
        this.descriptorId = value;
    }

    /**
     * Gets the value of the netValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getNetValue() {
        return netValue;
    }

    /**
     * Sets the value of the netValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetValue(BigDecimal value) {
        this.netValue = value;
    }

    /**
     * Gets the value of the grossValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getGrossValue() {
        return grossValue;
    }

    /**
     * Sets the value of the grossValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossValue(BigDecimal value) {
        this.grossValue = value;
    }

    /**
     * Gets the value of the percentageValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getPercentageValue() {
        return percentageValue;
    }

    /**
     * Sets the value of the percentageValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentageValue(BigDecimal value) {
        this.percentageValue = value;
    }

    /**
     * Gets the value of the fixedValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getFixedValue() {
        return fixedValue;
    }

    /**
     * Sets the value of the fixedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedValue(BigDecimal value) {
        this.fixedValue = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the budgetSourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetSourceID() {
        return budgetSourceID;
    }

    /**
     * Sets the value of the budgetSourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetSourceID(String value) {
        this.budgetSourceID = value;
    }

}
