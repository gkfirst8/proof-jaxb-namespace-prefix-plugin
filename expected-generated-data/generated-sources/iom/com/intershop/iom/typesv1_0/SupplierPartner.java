
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
 * Systemnutzer eines Distriibutors
 * 
 * <p>Java class for SupplierPartner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierPartner"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://types.theberlinbakery.com/v1_0}Partner"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Supplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShopSupplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierPartner", propOrder = {
    "supplier",
    "shopSupplier"
})
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForSupplierPartner", toBuilder = true)
@ToString(callSuper = true)
public class SupplierPartner
    extends Partner
{

    @XmlElement(name = "Supplier")
    protected String supplier;
    @XmlElement(name = "ShopSupplier")
    protected String shopSupplier;

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplier(String value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the shopSupplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopSupplier() {
        return shopSupplier;
    }

    /**
     * Sets the value of the shopSupplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopSupplier(String value) {
        this.shopSupplier = value;
    }

}
