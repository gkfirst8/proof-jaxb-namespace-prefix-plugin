
package com.intershop.iom.typesv1_2;

import java.math.BigDecimal;
import com.intershop.adapters.BigDecimalAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


/**
 * Net price
 * 
 * <p>Java class for NetPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetPrice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="amount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="amountDiscounted" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetPrice")
@XmlSeeAlso({
    UnitGrossPrice.class
})
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForNetPrice", toBuilder = true)
@ToString(callSuper = true)
public class NetPrice {

    @XmlAttribute(name = "amount", required = true)
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal amount;
    @XmlAttribute(name = "amountDiscounted")
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal amountDiscounted;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the amountDiscounted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getAmountDiscounted() {
        return amountDiscounted;
    }

    /**
     * Sets the value of the amountDiscounted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountDiscounted(BigDecimal value) {
        this.amountDiscounted = value;
    }

}
