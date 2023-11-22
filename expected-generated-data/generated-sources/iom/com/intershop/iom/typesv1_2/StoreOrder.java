
package com.intershop.iom.typesv1_2;

import com.intershop.iom.typesv1_0.ShopPartner;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


/**
 * Service to store an order
 * 
 * <p>Java class for storeOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storeOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://types.theberlinbakery.com/v1_0}ShopPartner"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Order" type="{http://types.theberlinbakery.com/v1_2}Order"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeOrder", propOrder = {
    "order"
})
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForStoreOrder", toBuilder = true)
@ToString(callSuper = true)
public class StoreOrder
    extends ShopPartner
{

    @XmlElement(name = "Order", required = true)
    protected Order order;

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setOrder(Order value) {
        this.order = value;
    }

}
