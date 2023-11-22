
package com.intershop.iom.typesv1_2;

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
 * Price
 * 
 * <p>Java class for Price complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Price"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Net" type="{http://types.theberlinbakery.com/v1_2}NetPrice" minOccurs="0"/&gt;
 *         &lt;element name="Gross" type="{http://types.theberlinbakery.com/v1_2}GrossPrice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price", propOrder = {
    "net",
    "gross"
})
@XmlSeeAlso({
    SumPrice.class,
    PosPrice.class,
    PurchaseItemPrice.class
})
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForPrice", toBuilder = true)
@ToString(callSuper = true)
public abstract class Price {

    @XmlElement(name = "Net")
    protected NetPrice net;
    @XmlElement(name = "Gross")
    protected GrossPrice gross;

    /**
     * Gets the value of the net property.
     * 
     * @return
     *     possible object is
     *     {@link NetPrice }
     *     
     */
    public NetPrice getNet() {
        return net;
    }

    /**
     * Sets the value of the net property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetPrice }
     *     
     */
    public void setNet(NetPrice value) {
        this.net = value;
    }

    /**
     * Gets the value of the gross property.
     * 
     * @return
     *     possible object is
     *     {@link GrossPrice }
     *     
     */
    public GrossPrice getGross() {
        return gross;
    }

    /**
     * Sets the value of the gross property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossPrice }
     *     
     */
    public void setGross(GrossPrice value) {
        this.gross = value;
    }

}
