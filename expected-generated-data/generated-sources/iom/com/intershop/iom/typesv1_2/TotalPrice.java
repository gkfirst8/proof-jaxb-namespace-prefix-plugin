
package com.intershop.iom.typesv1_2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.intershop.adapters.BigDecimalAdapter;
import com.intershop.iom.typesv1_0.Tax;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


/**
 * Total price
 * 
 * <p>Java class for TotalPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalPrice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Net"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="amount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Gross"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="amount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tax" type="{http://types.theberlinbakery.com/v1_0}Tax" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalPrice", propOrder = {
    "net",
    "gross",
    "tax"
})
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForTotalPrice", toBuilder = true)
@ToString(callSuper = true)
public class TotalPrice {

    @XmlElement(name = "Net", required = true)
    protected TotalPrice.Net net;
    @XmlElement(name = "Gross", required = true)
    protected TotalPrice.Gross gross;
    @XmlElement(name = "Tax", required = true)
    protected List<Tax> tax;

    /**
     * Gets the value of the net property.
     * 
     * @return
     *     possible object is
     *     {@link TotalPrice.Net }
     *     
     */
    public TotalPrice.Net getNet() {
        return net;
    }

    /**
     * Sets the value of the net property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPrice.Net }
     *     
     */
    public void setNet(TotalPrice.Net value) {
        this.net = value;
    }

    /**
     * Gets the value of the gross property.
     * 
     * @return
     *     possible object is
     *     {@link TotalPrice.Gross }
     *     
     */
    public TotalPrice.Gross getGross() {
        return gross;
    }

    /**
     * Sets the value of the gross property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPrice.Gross }
     *     
     */
    public void setGross(TotalPrice.Gross value) {
        this.gross = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax }
     * 
     * 
     */
    public List<Tax> getTax() {
        if (tax == null) {
            tax = new ArrayList<Tax>();
        }
        return this.tax;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="amount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @NoArgsConstructor
    @AllArgsConstructor
    @SuperBuilder(builderMethodName = "builderForGross", toBuilder = true)
    @ToString(callSuper = true)
    public static class Gross {

        @XmlAttribute(name = "amount", required = true)
        @XmlJavaTypeAdapter(BigDecimalAdapter.class)
        @XmlSchemaType(name = "decimal")
        protected BigDecimal amount;

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="amount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @NoArgsConstructor
    @AllArgsConstructor
    @SuperBuilder(builderMethodName = "builderForNet", toBuilder = true)
    @ToString(callSuper = true)
    public static class Net {

        @XmlAttribute(name = "amount", required = true)
        @XmlJavaTypeAdapter(BigDecimalAdapter.class)
        @XmlSchemaType(name = "decimal")
        protected BigDecimal amount;

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

    }

}
