
package com.intershop.iom.typesv1_2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.intershop.iom.typesv1_0.Company;
import com.intershop.iom.typesv1_0.Contact;
import com.intershop.iom.typesv1_0.Person;
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
 * An order consists of one or more order positions. Every position contains a different article (line-item) and the quantity of items of this position
 * 
 * <p>Java class for Order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Order"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Customer"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice&gt;
 *                     &lt;sequence&gt;
 *                       &lt;element name="Company" type="{http://types.theberlinbakery.com/v1_0}Company"/&gt;
 *                       &lt;element name="ContactPerson" type="{http://types.theberlinbakery.com/v1_0}Person" minOccurs="0"/&gt;
 *                     &lt;/sequence&gt;
 *                     &lt;element name="Person" type="{http://types.theberlinbakery.com/v1_0}Person"/&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="Contact" type="{http://types.theberlinbakery.com/v1_0}Contact" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Shop"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="orderCreationDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="companyId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="invoiceId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InvoiceAddressID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Address" type="{http://types.theberlinbakery.com/v1_2}Address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Sales"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://types.theberlinbakery.com/v1_2}Sales"&gt;
 *                 &lt;attribute name="method" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Optimization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SplitShipmentAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Position" type="{http://types.theberlinbakery.com/v1_2}OrderPos" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Payment" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="paymentProviderOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="paymentProviderRefNo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="paymentProviderMerchantAccount" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Properties" type="{http://types.theberlinbakery.com/v1_0}PropertyGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="reservationId" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
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
@XmlType(name = "Order", propOrder = {
    "customer",
    "shop",
    "invoiceAddressID",
    "address",
    "sales",
    "optimization",
    "splitShipmentAllowed",
    "position",
    "payment",
    "properties"
})
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForOrder", toBuilder = true)
@ToString(callSuper = true)
public class Order {

    @XmlElement(name = "Customer", required = true)
    protected Order.Customer customer;
    @XmlElement(name = "Shop", required = true)
    protected Order.Shop shop;
    @XmlElement(name = "InvoiceAddressID", required = true)
    protected String invoiceAddressID;
    @XmlElement(name = "Address")
    protected List<Address> address;
    @XmlElement(name = "Sales", required = true)
    protected Order.Sales sales;
    @XmlElement(name = "Optimization")
    protected String optimization;
    @XmlElement(name = "SplitShipmentAllowed")
    protected Boolean splitShipmentAllowed;
    @XmlElement(name = "Position", required = true)
    protected List<OrderPos> position;
    @XmlElement(name = "Payment")
    protected Order.Payment payment;
    @XmlElement(name = "Properties")
    protected List<PropertyGroup> properties;
    @XmlAttribute(name = "reservationId")
    protected Long reservationId;
    @XmlAttribute(name = "costCenter")
    protected String costCenter;
    @XmlAttribute(name = "project")
    protected String project;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Order.Customer }
     *     
     */
    public Order.Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order.Customer }
     *     
     */
    public void setCustomer(Order.Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the shop property.
     * 
     * @return
     *     possible object is
     *     {@link Order.Shop }
     *     
     */
    public Order.Shop getShop() {
        return shop;
    }

    /**
     * Sets the value of the shop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order.Shop }
     *     
     */
    public void setShop(Order.Shop value) {
        this.shop = value;
    }

    /**
     * Gets the value of the invoiceAddressID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceAddressID() {
        return invoiceAddressID;
    }

    /**
     * Sets the value of the invoiceAddressID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceAddressID(String value) {
        this.invoiceAddressID = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the sales property.
     * 
     * @return
     *     possible object is
     *     {@link Order.Sales }
     *     
     */
    public Order.Sales getSales() {
        return sales;
    }

    /**
     * Sets the value of the sales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order.Sales }
     *     
     */
    public void setSales(Order.Sales value) {
        this.sales = value;
    }

    /**
     * Gets the value of the optimization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptimization() {
        return optimization;
    }

    /**
     * Sets the value of the optimization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptimization(String value) {
        this.optimization = value;
    }

    /**
     * Gets the value of the splitShipmentAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSplitShipmentAllowed() {
        return splitShipmentAllowed;
    }

    /**
     * Sets the value of the splitShipmentAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSplitShipmentAllowed(Boolean value) {
        this.splitShipmentAllowed = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the position property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderPos }
     * 
     * 
     */
    public List<OrderPos> getPosition() {
        if (position == null) {
            position = new ArrayList<OrderPos>();
        }
        return this.position;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Order.Payment }
     *     
     */
    public Order.Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order.Payment }
     *     
     */
    public void setPayment(Order.Payment value) {
        this.payment = value;
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
     * Gets the value of the reservationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReservationId() {
        return reservationId;
    }

    /**
     * Sets the value of the reservationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReservationId(Long value) {
        this.reservationId = value;
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
     *       &lt;sequence&gt;
     *         &lt;choice&gt;
     *           &lt;sequence&gt;
     *             &lt;element name="Company" type="{http://types.theberlinbakery.com/v1_0}Company"/&gt;
     *             &lt;element name="ContactPerson" type="{http://types.theberlinbakery.com/v1_0}Person" minOccurs="0"/&gt;
     *           &lt;/sequence&gt;
     *           &lt;element name="Person" type="{http://types.theberlinbakery.com/v1_0}Person"/&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="Contact" type="{http://types.theberlinbakery.com/v1_0}Contact" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "company",
        "contactPerson",
        "person",
        "contact"
    })
    @NoArgsConstructor
    @AllArgsConstructor
    @SuperBuilder(builderMethodName = "builderForCustomer", toBuilder = true)
    @ToString(callSuper = true)
    public static class Customer {

        @XmlElement(name = "Company")
        protected Company company;
        @XmlElement(name = "ContactPerson")
        protected Person contactPerson;
        @XmlElement(name = "Person")
        protected Person person;
        @XmlElement(name = "Contact")
        protected Contact contact;
        @XmlAttribute(name = "orderId")
        protected String orderId;

        /**
         * Gets the value of the company property.
         * 
         * @return
         *     possible object is
         *     {@link Company }
         *     
         */
        public Company getCompany() {
            return company;
        }

        /**
         * Sets the value of the company property.
         * 
         * @param value
         *     allowed object is
         *     {@link Company }
         *     
         */
        public void setCompany(Company value) {
            this.company = value;
        }

        /**
         * Gets the value of the contactPerson property.
         * 
         * @return
         *     possible object is
         *     {@link Person }
         *     
         */
        public Person getContactPerson() {
            return contactPerson;
        }

        /**
         * Sets the value of the contactPerson property.
         * 
         * @param value
         *     allowed object is
         *     {@link Person }
         *     
         */
        public void setContactPerson(Person value) {
            this.contactPerson = value;
        }

        /**
         * Gets the value of the person property.
         * 
         * @return
         *     possible object is
         *     {@link Person }
         *     
         */
        public Person getPerson() {
            return person;
        }

        /**
         * Sets the value of the person property.
         * 
         * @param value
         *     allowed object is
         *     {@link Person }
         *     
         */
        public void setPerson(Person value) {
            this.person = value;
        }

        /**
         * Gets the value of the contact property.
         * 
         * @return
         *     possible object is
         *     {@link Contact }
         *     
         */
        public Contact getContact() {
            return contact;
        }

        /**
         * Sets the value of the contact property.
         * 
         * @param value
         *     allowed object is
         *     {@link Contact }
         *     
         */
        public void setContact(Contact value) {
            this.contact = value;
        }

        /**
         * Gets the value of the orderId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderId() {
            return orderId;
        }

        /**
         * Sets the value of the orderId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderId(String value) {
            this.orderId = value;
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
     *       &lt;attribute name="paymentProviderOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="paymentProviderRefNo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="paymentProviderMerchantAccount" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    @SuperBuilder(builderMethodName = "builderForPayment", toBuilder = true)
    @ToString(callSuper = true)
    public static class Payment {

        @XmlAttribute(name = "paymentProviderOrderNo")
        protected String paymentProviderOrderNo;
        @XmlAttribute(name = "paymentProviderRefNo")
        protected String paymentProviderRefNo;
        @XmlAttribute(name = "paymentProviderMerchantAccount")
        protected String paymentProviderMerchantAccount;

        /**
         * Gets the value of the paymentProviderOrderNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentProviderOrderNo() {
            return paymentProviderOrderNo;
        }

        /**
         * Sets the value of the paymentProviderOrderNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentProviderOrderNo(String value) {
            this.paymentProviderOrderNo = value;
        }

        /**
         * Gets the value of the paymentProviderRefNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentProviderRefNo() {
            return paymentProviderRefNo;
        }

        /**
         * Sets the value of the paymentProviderRefNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentProviderRefNo(String value) {
            this.paymentProviderRefNo = value;
        }

        /**
         * Gets the value of the paymentProviderMerchantAccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentProviderMerchantAccount() {
            return paymentProviderMerchantAccount;
        }

        /**
         * Sets the value of the paymentProviderMerchantAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentProviderMerchantAccount(String value) {
            this.paymentProviderMerchantAccount = value;
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
     *     &lt;extension base="{http://types.theberlinbakery.com/v1_2}Sales"&gt;
     *       &lt;attribute name="method" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    @SuperBuilder(builderMethodName = "builderForSales", toBuilder = true)
    @ToString(callSuper = true)
    public static class Sales
        extends com.intershop.iom.typesv1_2.Sales
    {

        @XmlAttribute(name = "method")
        protected String method;
        @XmlAttribute(name = "currency")
        protected String currency;

        /**
         * Gets the value of the method property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMethod() {
            return method;
        }

        /**
         * Sets the value of the method property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMethod(String value) {
            this.method = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
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
     *       &lt;attribute name="orderCreationDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="companyId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="invoiceId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    @SuperBuilder(builderMethodName = "builderForShop", toBuilder = true)
    @ToString(callSuper = true)
    public static class Shop {

        @XmlAttribute(name = "orderCreationDate", required = true)
        @XmlJavaTypeAdapter(LocalDateTimeXmlAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected LocalDateTime orderCreationDate;
        @XmlAttribute(name = "customerId")
        protected String customerId;
        @XmlAttribute(name = "companyId")
        protected String companyId;
        @XmlAttribute(name = "orderId")
        protected String orderId;
        @XmlAttribute(name = "invoiceId")
        protected String invoiceId;

        /**
         * Gets the value of the orderCreationDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public LocalDateTime getOrderCreationDate() {
            return orderCreationDate;
        }

        /**
         * Sets the value of the orderCreationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderCreationDate(LocalDateTime value) {
            this.orderCreationDate = value;
        }

        /**
         * Gets the value of the customerId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerId() {
            return customerId;
        }

        /**
         * Sets the value of the customerId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerId(String value) {
            this.customerId = value;
        }

        /**
         * Gets the value of the companyId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompanyId() {
            return companyId;
        }

        /**
         * Sets the value of the companyId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompanyId(String value) {
            this.companyId = value;
        }

        /**
         * Gets the value of the orderId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderId() {
            return orderId;
        }

        /**
         * Sets the value of the orderId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderId(String value) {
            this.orderId = value;
        }

        /**
         * Gets the value of the invoiceId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvoiceId() {
            return invoiceId;
        }

        /**
         * Sets the value of the invoiceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvoiceId(String value) {
            this.invoiceId = value;
        }

    }

}
