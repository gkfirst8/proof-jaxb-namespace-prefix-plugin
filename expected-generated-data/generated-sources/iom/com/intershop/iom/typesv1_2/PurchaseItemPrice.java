
package com.intershop.iom.typesv1_2;

import com.intershop.iom.typesv1_0.Tax;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


/**
 * Purchase prices having no mixed VAT based on articles
 * 
 * <p>Java class for PurchaseItemPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseItemPrice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://types.theberlinbakery.com/v1_2}Price"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tax" type="{http://types.theberlinbakery.com/v1_0}Tax" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseItemPrice", propOrder = {
    "tax"
})
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForPurchaseItemPrice", toBuilder = true)
@ToString(callSuper = true)
public class PurchaseItemPrice
    extends Price
{

    @XmlElement(name = "Tax")
    protected Tax tax;

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link Tax }
     *     
     */
    public Tax getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tax }
     *     
     */
    public void setTax(Tax value) {
        this.tax = value;
    }

}
