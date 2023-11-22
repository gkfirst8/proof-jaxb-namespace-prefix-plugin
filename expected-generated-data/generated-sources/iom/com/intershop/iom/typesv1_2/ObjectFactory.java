
package com.intershop.iom.typesv1_2;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.intershop.iom.typesv1_2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SumPrice_QNAME = new QName("http://types.theberlinbakery.com/v1_2", "SumPrice");
    private final static QName _PosPrice_QNAME = new QName("http://types.theberlinbakery.com/v1_2", "PosPrice");
    private final static QName _OrderPos_QNAME = new QName("http://types.theberlinbakery.com/v1_2", "OrderPos");
    private final static QName _OrderPosPrices_QNAME = new QName("http://types.theberlinbakery.com/v1_2", "OrderPosPrices");
    private final static QName _Order_QNAME = new QName("http://types.theberlinbakery.com/v1_2", "Order");
    private final static QName _Sales_QNAME = new QName("http://types.theberlinbakery.com/v1_2", "Sales");
    private final static QName _StoreOrder_QNAME = new QName("http://types.theberlinbakery.com/v1_2", "storeOrder");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.intershop.iom.typesv1_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TotalPrice }
     * 
     */
    public TotalPrice createTotalPrice() {
        return new TotalPrice();
    }

    /**
     * Create an instance of {@link Immaterial }
     * 
     */
    public Immaterial createImmaterial() {
        return new Immaterial();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link com.intershop.iom.typesv1_2.Sales }
     * 
     */
    public com.intershop.iom.typesv1_2.Sales createSales() {
        return new com.intershop.iom.typesv1_2.Sales();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link OrderPos }
     * 
     */
    public OrderPos createOrderPos() {
        return new OrderPos();
    }

    /**
     * Create an instance of {@link SumPrice }
     * 
     */
    public SumPrice createSumPrice() {
        return new SumPrice();
    }

    /**
     * Create an instance of {@link PosPrice }
     * 
     */
    public PosPrice createPosPrice() {
        return new PosPrice();
    }

    /**
     * Create an instance of {@link OrderPosPrices }
     * 
     */
    public OrderPosPrices createOrderPosPrices() {
        return new OrderPosPrices();
    }

    /**
     * Create an instance of {@link StoreOrder }
     * 
     */
    public StoreOrder createStoreOrder() {
        return new StoreOrder();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Promotion }
     * 
     */
    public Promotion createPromotion() {
        return new Promotion();
    }

    /**
     * Create an instance of {@link GrossPrice }
     * 
     */
    public GrossPrice createGrossPrice() {
        return new GrossPrice();
    }

    /**
     * Create an instance of {@link NetPrice }
     * 
     */
    public NetPrice createNetPrice() {
        return new NetPrice();
    }

    /**
     * Create an instance of {@link UnitPrice }
     * 
     */
    public UnitPrice createUnitPrice() {
        return new UnitPrice();
    }

    /**
     * Create an instance of {@link UnitNetPrice }
     * 
     */
    public UnitNetPrice createUnitNetPrice() {
        return new UnitNetPrice();
    }

    /**
     * Create an instance of {@link UnitGrossPrice }
     * 
     */
    public UnitGrossPrice createUnitGrossPrice() {
        return new UnitGrossPrice();
    }

    /**
     * Create an instance of {@link PurchaseItemPrice }
     * 
     */
    public PurchaseItemPrice createPurchaseItemPrice() {
        return new PurchaseItemPrice();
    }

    /**
     * Create an instance of {@link OrderPosShipping }
     * 
     */
    public OrderPosShipping createOrderPosShipping() {
        return new OrderPosShipping();
    }

    /**
     * Create an instance of {@link TotalPrice.Net }
     * 
     */
    public TotalPrice.Net createTotalPriceNet() {
        return new TotalPrice.Net();
    }

    /**
     * Create an instance of {@link TotalPrice.Gross }
     * 
     */
    public TotalPrice.Gross createTotalPriceGross() {
        return new TotalPrice.Gross();
    }

    /**
     * Create an instance of {@link Immaterial.Other }
     * 
     */
    public Immaterial.Other createImmaterialOther() {
        return new Immaterial.Other();
    }

    /**
     * Create an instance of {@link Location.DetailedStreet }
     * 
     */
    public Location.DetailedStreet createLocationDetailedStreet() {
        return new Location.DetailedStreet();
    }

    /**
     * Create an instance of {@link Location.Packstation }
     * 
     */
    public Location.Packstation createLocationPackstation() {
        return new Location.Packstation();
    }

    /**
     * Create an instance of {@link com.intershop.iom.typesv1_2.Sales.Charge }
     * 
     */
    public com.intershop.iom.typesv1_2.Sales.Charge createSalesCharge() {
        return new com.intershop.iom.typesv1_2.Sales.Charge();
    }

    /**
     * Create an instance of {@link Order.Customer }
     * 
     */
    public Order.Customer createOrderCustomer() {
        return new Order.Customer();
    }

    /**
     * Create an instance of {@link Order.Shop }
     * 
     */
    public Order.Shop createOrderShop() {
        return new Order.Shop();
    }

    /**
     * Create an instance of {@link Order.Sales }
     * 
     */
    public Order.Sales createOrderSales() {
        return new Order.Sales();
    }

    /**
     * Create an instance of {@link Order.Payment }
     * 
     */
    public Order.Payment createOrderPayment() {
        return new Order.Payment();
    }

    /**
     * Create an instance of {@link OrderPos.Ordered }
     * 
     */
    public OrderPos.Ordered createOrderPosOrdered() {
        return new OrderPos.Ordered();
    }

    /**
     * Create an instance of {@link OrderPos.DeliveryOption }
     * 
     */
    public OrderPos.DeliveryOption createOrderPosDeliveryOption() {
        return new OrderPos.DeliveryOption();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumPrice }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SumPrice }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_2", name = "SumPrice")
    public JAXBElement<SumPrice> createSumPrice(SumPrice value) {
        return new JAXBElement<SumPrice>(_SumPrice_QNAME, SumPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PosPrice }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PosPrice }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_2", name = "PosPrice")
    public JAXBElement<PosPrice> createPosPrice(PosPrice value) {
        return new JAXBElement<PosPrice>(_PosPrice_QNAME, PosPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderPos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderPos }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_2", name = "OrderPos")
    public JAXBElement<OrderPos> createOrderPos(OrderPos value) {
        return new JAXBElement<OrderPos>(_OrderPos_QNAME, OrderPos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderPosPrices }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderPosPrices }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_2", name = "OrderPosPrices")
    public JAXBElement<OrderPosPrices> createOrderPosPrices(OrderPosPrices value) {
        return new JAXBElement<OrderPosPrices>(_OrderPosPrices_QNAME, OrderPosPrices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Order }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_2", name = "Order")
    public JAXBElement<Order> createOrder(Order value) {
        return new JAXBElement<Order>(_Order_QNAME, Order.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.intershop.iom.typesv1_2.Sales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link com.intershop.iom.typesv1_2.Sales }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_2", name = "Sales")
    public JAXBElement<com.intershop.iom.typesv1_2.Sales> createSales(com.intershop.iom.typesv1_2.Sales value) {
        return new JAXBElement<com.intershop.iom.typesv1_2.Sales>(_Sales_QNAME, com.intershop.iom.typesv1_2.Sales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StoreOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_2", name = "storeOrder")
    public JAXBElement<StoreOrder> createStoreOrder(StoreOrder value) {
        return new JAXBElement<StoreOrder>(_StoreOrder_QNAME, StoreOrder.class, null, value);
    }

}
