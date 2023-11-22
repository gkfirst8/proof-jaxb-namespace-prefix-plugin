
package com.intershop.iom.typesv1_2;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.intershop.iom.typesv1_0.Article;
import com.intershop.iom.typesv1_0.PropertyGroup;
import io.github.threetenjaxb.core.LocalDateTimeXmlAdapter;
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
 * An order position always related to one article (line-item) including a quantity of items
 * 
 * <p>Java class for OrderPos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderPos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Article" type="{http://types.theberlinbakery.com/v1_0}Article"/&gt;
 *         &lt;element name="SelectedSupplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Shipping" type="{http://types.theberlinbakery.com/v1_2}OrderPosShipping"/&gt;
 *         &lt;element name="Ordered"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="deliveryDays" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Standard" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="FixedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *           &lt;element name="EarliestDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *           &lt;element name="ExpressDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="DeliveryOption" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="SalesSum" type="{http://types.theberlinbakery.com/v1_2}PosPrice"/&gt;
 *             &lt;element name="PurchaseItem" type="{http://types.theberlinbakery.com/v1_2}PurchaseItemPrice" minOccurs="0"/&gt;
 *             &lt;element name="Unit" type="{http://types.theberlinbakery.com/v1_2}UnitPrice"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="NoPayment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Properties" type="{http://types.theberlinbakery.com/v1_0}PropertyGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="costCenter" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="project" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderPos", propOrder = {
    "article",
    "selectedSupplier",
    "shipping",
    "ordered",
    "standard",
    "fixedDeliveryDate",
    "earliestDeliveryDate",
    "expressDeliveryTime",
    "deliveryOption",
    "salesSum",
    "purchaseItem",
    "unit",
    "noPayment",
    "properties"
})
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForOrderPos", toBuilder = true)
@ToString(callSuper = true)
public class OrderPos {

    @XmlElement(name = "Article", required = true)
    protected Article article;
    @XmlElement(name = "SelectedSupplier")
    protected String selectedSupplier;
    @XmlElement(name = "Shipping", required = true)
    protected OrderPosShipping shipping;
    @XmlElement(name = "Ordered", required = true)
    protected OrderPos.Ordered ordered;
    @XmlElement(name = "Standard")
    protected String standard;
    @XmlElement(name = "FixedDeliveryDate", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime fixedDeliveryDate;
    @XmlElement(name = "EarliestDeliveryDate", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime earliestDeliveryDate;
    @XmlElement(name = "ExpressDeliveryTime")
    protected String expressDeliveryTime;
    @XmlElement(name = "DeliveryOption")
    protected List<OrderPos.DeliveryOption> deliveryOption;
    @XmlElement(name = "SalesSum")
    protected PosPrice salesSum;
    @XmlElement(name = "PurchaseItem")
    protected PurchaseItemPrice purchaseItem;
    @XmlElement(name = "Unit")
    protected UnitPrice unit;
    @XmlElement(name = "NoPayment")
    protected String noPayment;
    @XmlElement(name = "Properties")
    protected List<PropertyGroup> properties;
    @XmlAttribute(name = "number", required = true)
    protected String number;
    @XmlAttribute(name = "costCenter")
    protected String costCenter;
    @XmlAttribute(name = "project")
    protected String project;

    /**
     * Gets the value of the article property.
     * 
     * @return
     *     possible object is
     *     {@link Article }
     *     
     */
    public Article getArticle() {
        return article;
    }

    /**
     * Sets the value of the article property.
     * 
     * @param value
     *     allowed object is
     *     {@link Article }
     *     
     */
    public void setArticle(Article value) {
        this.article = value;
    }

    /**
     * Gets the value of the selectedSupplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedSupplier() {
        return selectedSupplier;
    }

    /**
     * Sets the value of the selectedSupplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedSupplier(String value) {
        this.selectedSupplier = value;
    }

    /**
     * Gets the value of the shipping property.
     * 
     * @return
     *     possible object is
     *     {@link OrderPosShipping }
     *     
     */
    public OrderPosShipping getShipping() {
        return shipping;
    }

    /**
     * Sets the value of the shipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPosShipping }
     *     
     */
    public void setShipping(OrderPosShipping value) {
        this.shipping = value;
    }

    /**
     * Gets the value of the ordered property.
     * 
     * @return
     *     possible object is
     *     {@link OrderPos.Ordered }
     *     
     */
    public OrderPos.Ordered getOrdered() {
        return ordered;
    }

    /**
     * Sets the value of the ordered property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPos.Ordered }
     *     
     */
    public void setOrdered(OrderPos.Ordered value) {
        this.ordered = value;
    }

    /**
     * Gets the value of the standard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandard() {
        return standard;
    }

    /**
     * Sets the value of the standard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandard(String value) {
        this.standard = value;
    }

    /**
     * Gets the value of the fixedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getFixedDeliveryDate() {
        return fixedDeliveryDate;
    }

    /**
     * Sets the value of the fixedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedDeliveryDate(LocalDateTime value) {
        this.fixedDeliveryDate = value;
    }

    /**
     * Gets the value of the earliestDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getEarliestDeliveryDate() {
        return earliestDeliveryDate;
    }

    /**
     * Sets the value of the earliestDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestDeliveryDate(LocalDateTime value) {
        this.earliestDeliveryDate = value;
    }

    /**
     * Gets the value of the expressDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressDeliveryTime() {
        return expressDeliveryTime;
    }

    /**
     * Sets the value of the expressDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressDeliveryTime(String value) {
        this.expressDeliveryTime = value;
    }

    /**
     * Gets the value of the deliveryOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderPos.DeliveryOption }
     * 
     * 
     */
    public List<OrderPos.DeliveryOption> getDeliveryOption() {
        if (deliveryOption == null) {
            deliveryOption = new ArrayList<OrderPos.DeliveryOption>();
        }
        return this.deliveryOption;
    }

    /**
     * Gets the value of the salesSum property.
     * 
     * @return
     *     possible object is
     *     {@link PosPrice }
     *     
     */
    public PosPrice getSalesSum() {
        return salesSum;
    }

    /**
     * Sets the value of the salesSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosPrice }
     *     
     */
    public void setSalesSum(PosPrice value) {
        this.salesSum = value;
    }

    /**
     * Gets the value of the purchaseItem property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseItemPrice }
     *     
     */
    public PurchaseItemPrice getPurchaseItem() {
        return purchaseItem;
    }

    /**
     * Sets the value of the purchaseItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseItemPrice }
     *     
     */
    public void setPurchaseItem(PurchaseItemPrice value) {
        this.purchaseItem = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrice }
     *     
     */
    public UnitPrice getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrice }
     *     
     */
    public void setUnit(UnitPrice value) {
        this.unit = value;
    }

    /**
     * Gets the value of the noPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoPayment() {
        return noPayment;
    }

    /**
     * Sets the value of the noPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoPayment(String value) {
        this.noPayment = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the properties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyGroup }
     * 
     * 
     */
    public List<PropertyGroup> getProperties() {
        if (properties == null) {
            properties = new ArrayList<PropertyGroup>();
        }
        return this.properties;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the costCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * Sets the value of the costCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenter(String value) {
        this.costCenter = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProject(String value) {
        this.project = value;
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
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    @SuperBuilder(builderMethodName = "builderForDeliveryOption", toBuilder = true)
    @ToString(callSuper = true)
    public static class DeliveryOption {

        @XmlAttribute(name = "name", required = true)
        protected String name;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
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
     *       &lt;attribute name="quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="deliveryDays" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    @SuperBuilder(builderMethodName = "builderForOrdered", toBuilder = true)
    @ToString(callSuper = true)
    public static class Ordered {

        @XmlAttribute(name = "quantity", required = true)
        protected BigInteger quantity;
        @XmlAttribute(name = "deliveryDays", required = true)
        protected BigInteger deliveryDays;
        @XmlAttribute(name = "unit")
        protected String unit;

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the deliveryDays property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDeliveryDays() {
            return deliveryDays;
        }

        /**
         * Sets the value of the deliveryDays property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDeliveryDays(BigInteger value) {
            this.deliveryDays = value;
        }

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnit(String value) {
            this.unit = value;
        }

    }

}
