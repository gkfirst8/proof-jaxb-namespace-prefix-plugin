
package com.intershop.iom.typesv1_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


/**
 * Price of order position and single item
 * 
 * <p>Java class for OrderPosPrices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderPosPrices"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sum" type="{http://types.theberlinbakery.com/v1_2}PosPrice"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderPosPrices", propOrder = {
    "sum"
})
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForOrderPosPrices", toBuilder = true)
@ToString(callSuper = true)
public class OrderPosPrices {

    @XmlElement(name = "Sum", required = true)
    protected PosPrice sum;

    /**
     * Gets the value of the sum property.
     * 
     * @return
     *     possible object is
     *     {@link PosPrice }
     *     
     */
    public PosPrice getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosPrice }
     *     
     */
    public void setSum(PosPrice value) {
        this.sum = value;
    }

}
