
package com.intershop.iom.typesv1_0;

import com.intershop.iom.typesv1_2.StoreOrder;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


/**
 * Systemnutzer eines Shops
 * 
 * <p>Java class for ShopPartner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShopPartner"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://types.theberlinbakery.com/v1_0}Partner"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Shop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShopPartner", propOrder = {
    "shop"
})
@XmlSeeAlso({
    StoreOrder.class
})
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForShopPartner", toBuilder = true)
@ToString(callSuper = true)
public class ShopPartner
    extends Partner
{

    @XmlElement(name = "Shop", required = true)
    protected String shop;

    /**
     * Gets the value of the shop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShop() {
        return shop;
    }

    /**
     * Sets the value of the shop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShop(String value) {
        this.shop = value;
    }

}
