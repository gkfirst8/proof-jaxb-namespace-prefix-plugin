
package com.intershop.iom.typesv1_2;

import java.util.ArrayList;
import java.util.List;
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
 * Prices with mixed types of VAT (total)
 * 
 * <p>Java class for SumPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SumPrice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://types.theberlinbakery.com/v1_2}Price"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tax" type="{http://types.theberlinbakery.com/v1_0}Tax" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Promotion" type="{http://types.theberlinbakery.com/v1_2}Promotion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SumPrice", propOrder = {
    "tax",
    "promotion"
})
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForSumPrice", toBuilder = true)
@ToString(callSuper = true)
public class SumPrice
    extends Price
{

    @XmlElement(name = "Tax", required = true)
    protected List<Tax> tax;
    @XmlElement(name = "Promotion")
    protected List<Promotion> promotion;

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
     * Gets the value of the promotion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the promotion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Promotion }
     * 
     * 
     */
    public List<Promotion> getPromotion() {
        if (promotion == null) {
            promotion = new ArrayList<Promotion>();
        }
        return this.promotion;
    }

}
