
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
 * Single prices on articles
 * 
 * <p>Java class for UnitPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitPrice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Net" type="{http://types.theberlinbakery.com/v1_2}UnitNetPrice" minOccurs="0"/&gt;
 *         &lt;element name="Gross" type="{http://types.theberlinbakery.com/v1_2}UnitGrossPrice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitPrice", propOrder = {
    "net",
    "gross"
})
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForUnitPrice", toBuilder = true)
@ToString(callSuper = true)
public class UnitPrice {

    @XmlElement(name = "Net")
    protected UnitNetPrice net;
    @XmlElement(name = "Gross")
    protected UnitGrossPrice gross;

    /**
     * Gets the value of the net property.
     * 
     * @return
     *     possible object is
     *     {@link UnitNetPrice }
     *     
     */
    public UnitNetPrice getNet() {
        return net;
    }

    /**
     * Sets the value of the net property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitNetPrice }
     *     
     */
    public void setNet(UnitNetPrice value) {
        this.net = value;
    }

    /**
     * Gets the value of the gross property.
     * 
     * @return
     *     possible object is
     *     {@link UnitGrossPrice }
     *     
     */
    public UnitGrossPrice getGross() {
        return gross;
    }

    /**
     * Sets the value of the gross property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitGrossPrice }
     *     
     */
    public void setGross(UnitGrossPrice value) {
        this.gross = value;
    }

}
