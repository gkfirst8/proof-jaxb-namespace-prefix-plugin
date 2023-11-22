
package com.intershop.iom.typesv1_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


/**
 * Shipping informations for this line item
 * 
 * <p>Java class for OrderPosShipping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderPosShipping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="shipToAddress" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="shippingMethod" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="freightClass" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderPosShipping")
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForOrderPosShipping", toBuilder = true)
@ToString(callSuper = true)
public class OrderPosShipping {

    @XmlAttribute(name = "shipToAddress", required = true)
    protected String shipToAddress;
    @XmlAttribute(name = "shippingMethod")
    protected String shippingMethod;
    @XmlAttribute(name = "freightClass")
    protected String freightClass;

    /**
     * Gets the value of the shipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddress() {
        return shipToAddress;
    }

    /**
     * Sets the value of the shipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddress(String value) {
        this.shipToAddress = value;
    }

    /**
     * Gets the value of the shippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Sets the value of the shippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethod(String value) {
        this.shippingMethod = value;
    }

    /**
     * Gets the value of the freightClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightClass() {
        return freightClass;
    }

    /**
     * Sets the value of the freightClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightClass(String value) {
        this.freightClass = value;
    }

}
