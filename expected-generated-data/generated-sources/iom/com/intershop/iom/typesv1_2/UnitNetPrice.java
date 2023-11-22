
package com.intershop.iom.typesv1_2;

import java.math.BigDecimal;
import com.intershop.adapters.BigDecimalAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


/**
 * Single net price
 * 
 * <p>Java class for UnitNetPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitNetPrice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://types.theberlinbakery.com/v1_2}GrossPrice"&gt;
 *       &lt;attribute name="list" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitNetPrice")
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForUnitNetPrice", toBuilder = true)
@ToString(callSuper = true)
public class UnitNetPrice
    extends GrossPrice
{

    @XmlAttribute(name = "list")
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal list;

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setList(BigDecimal value) {
        this.list = value;
    }

}
