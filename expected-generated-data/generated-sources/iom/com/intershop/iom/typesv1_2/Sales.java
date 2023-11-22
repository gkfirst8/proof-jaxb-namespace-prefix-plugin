
package com.intershop.iom.typesv1_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


/**
 * Sales prices
 * 
 * <p>Java class for Sales complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sum" type="{http://types.theberlinbakery.com/v1_2}SumPrice"/&gt;
 *         &lt;element name="Charge" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://types.theberlinbakery.com/v1_2}PosPrice"&gt;
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Total" type="{http://types.theberlinbakery.com/v1_2}TotalPrice"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sales", propOrder = {
    "sum",
    "charge",
    "total"
})
@XmlSeeAlso({
    com.intershop.iom.typesv1_2.Order.Sales.class
})
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForSales", toBuilder = true)
@ToString(callSuper = true)
public class Sales {

    @XmlElement(name = "Sum", required = true)
    protected SumPrice sum;
    @XmlElement(name = "Charge")
    protected List<Sales.Charge> charge;
    @XmlElement(name = "Total", required = true)
    protected TotalPrice total;

    /**
     * Gets the value of the sum property.
     * 
     * @return
     *     possible object is
     *     {@link SumPrice }
     *     
     */
    public SumPrice getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link SumPrice }
     *     
     */
    public void setSum(SumPrice value) {
        this.sum = value;
    }

    /**
     * Gets the value of the charge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the charge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sales.Charge }
     * 
     * 
     */
    public List<Sales.Charge> getCharge() {
        if (charge == null) {
            charge = new ArrayList<Sales.Charge>();
        }
        return this.charge;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link TotalPrice }
     *     
     */
    public TotalPrice getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPrice }
     *     
     */
    public void setTotal(TotalPrice value) {
        this.total = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://types.theberlinbakery.com/v1_2}PosPrice"&gt;
     *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
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
    @SuperBuilder(builderMethodName = "builderForCharge", toBuilder = true)
    @ToString(callSuper = true)
    public static class Charge
        extends PosPrice
    {

        @XmlAttribute(name = "type", required = true)
        protected String type;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
