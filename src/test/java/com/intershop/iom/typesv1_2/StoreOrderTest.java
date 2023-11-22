package com.intershop.iom.typesv1_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.InputStream;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import org.junit.jupiter.api.Test;

import com.intershop.iom.typesv1_0.Article;
import com.intershop.iom.typesv1_0.Company;
import com.intershop.iom.typesv1_0.Contact;
import com.intershop.iom.typesv1_0.LegalPerson;
import com.intershop.iom.typesv1_0.Person;
import com.intershop.iom.typesv1_0.Property;
import com.intershop.iom.typesv1_0.PropertyGroup;
import com.intershop.iom.typesv1_0.Tax;
import com.intershop.iom.typesv1_2.Order.Customer;
import com.intershop.iom.typesv1_2.Order.Shop;
import com.intershop.iom.typesv1_2.OrderPos.DeliveryOption;
import com.intershop.iom.typesv1_2.OrderPos.Ordered;
import com.intershop.iom.typesv1_2.Sales.Charge;
import com.intershop.iom.typesv1_2.TotalPrice.Gross;
import com.intershop.iom.typesv1_2.TotalPrice.Net;

class StoreOrderTest {
    private static final StoreOrder STORE_ORDER = StoreOrder.builderForStoreOrder() //
            .messageId("207772-843507-0") //
            .user("") //
            .password("") //
            .shop("My Shop.example.com") //
            .order(Order.builderForOrder() //
                    .customer(Customer.builderForCustomer() //
                            .orderId("ACC1-00081174") //
                            .company(Company.builderForCompany() //
                                    .name("Company Name A Here") //
                                    .build()) //
                            .contactPerson(Person.builderForPerson() //
                                    .salutation("Ms") //
                                    .firstName("Jane") //
                                    .lastName("Doey") //
                                    .build()) //
                            .contact(Contact.builderForContact() //
                                    .email("jane@example.com") //
                                    .telephone("0123456789") //
                                    .build()) //
                            .build()) //
                    .shop(Shop.builderForShop() //
                            // TODO: Timezone...
                            .orderCreationDate(LocalDateTime.of(2018, 8, 24, 14, 56, 41, 668_000_000)) //
                            .customerId("ACC1-00208381") //
                            .orderId("ACC1-00081174") //
                            .build()) //
                    .address(Arrays.asList( //
                            createAddress("1", "SHIPPING"), //
                            createAddress("2", "INVOICE")))
                    .sales(Order.Sales.builderForSales() //
                            .method("IDEAL") //
                            .currency("EUR") //
                            .sum(SumPrice.builderForSumPrice() //
                                    .net(netPrice("471.38000", null)) //
                                    .gross(grossPrice("570.37000", null)) //
                                    .tax(Arrays.asList( //
                                            tax("FullTax", "98.99000") //
                                    )) //
                                    .build())
                            .charge(Arrays.asList( //
                                    Charge.builderForCharge() //
                                            .type("DELIVERYCHARGE") //
                                            .net(netPrice("0.00000", null)) //
                                            .gross(grossPrice("0.00000", null)) //
                                            .tax(tax("NoTax", "0.00000")) //
                                            .build(), //
                                    Charge.builderForCharge() //
                                            .type("PAYMENTCHARGE") //
                                            .net(netPrice("0.00000", null)) //
                                            .gross(grossPrice("0.00000", null)) //
                                            .tax(tax("NoTax", "0.00000")) //
                                            .build() //
                            )) //
                            .total(TotalPrice.builderForTotalPrice() //
                                    .net(Net.builderForNet().amount(a("471.38000")).build()) //
                                    .gross(Gross.builderForGross().amount(a("570.37000")).build()) //
                                    .tax(Arrays.asList( //
                                            tax("FullTax", "98.99000") //
                                    )) //
                                    .build()) //
                            .build()) //
                    .splitShipmentAllowed(Boolean.TRUE) //
                    .position(Arrays.asList( //
                            OrderPos.builderForOrderPos() //
                                    .number("1") //
                                    .article(Article.builderForArticle() //
                                            .name("Werkjas groen/marineblauw maat 48 / S") //
                                            .articleId("C104008248") //
                                            .ean("87161061349391") //
                                            .build()) //
                                    .ordered(Ordered.builderForOrdered() //
                                            .quantity(BigInteger.valueOf(1L)) //
                                            .deliveryDays(BigInteger.valueOf(0L)) //
                                            .build())
                                    .deliveryOption(Arrays.asList( //
                                            DeliveryOption.builderForDeliveryOption() //
                                                    .name("nightshipping") //
                                                    .build() //
                                    )) //
                                    .standard("") //
                                    .salesSum(PosPrice.builderForPosPrice() //
                                            .net(netPrice("148.50000")) //
                                            .gross(grossPrice("179.69000")) //
                                            .tax(tax("NORMAL_TAX", "31.19000")) //
                                            .build()) //
                                    .purchaseItem(PurchaseItemPrice.builderForPurchaseItemPrice() //
                                            .net(netPrice("123.75000", null)) //
                                            .build())
                                    .unit(UnitPrice.builderForUnitPrice() //
                                            .net(UnitNetPrice.builderForUnitNetPrice() //
                                                    .amount(a("148.50000000")) //
                                                    .amountDiscounted(a("148.50000000")) //
                                                    .build()) //
                                            .gross(UnitGrossPrice.builderForUnitGrossPrice() //
                                                    .list(a("165.00000000")) //
                                                    .amount(a("179.69000000")) //
                                                    .amountDiscounted(a("179.69000000")) //
                                                    .build()) //
                                            .build()) //
                                    .properties(Arrays.asList( //
                                            PropertyGroup.builderForPropertyGroup() //
                                                    .id("references") //
                                                    .property(Arrays.asList( //
                                                            Property.builderForProperty() //
                                                                    .key("shopArticleNo") //
                                                                    .value("C104008248") //
                                                                    .build(), //
                                                            Property.builderForProperty() //
                                                                    .key("positionNumber") //
                                                                    .value("1") //
                                                                    .build() //
                                                    )) //
                                                    .build(), //
                                            PropertyGroup.builderForPropertyGroup() //
                                                    .id("product") //
                                                    .property(Arrays.asList( //
                                                            Property.builderForProperty() //
                                                                    .key("OriginalUnitName") //
                                                                    .value("PCE") //
                                                                    .build(), //
                                                            Property.builderForProperty() //
                                                                    .key("productClass4") //
                                                                    .value("5571") //
                                                                    .build() //
                                                    )) //
                                                    .build() //
                                    )) //
                                    .build() //
                    )) //
                    .properties(Arrays.asList(//
                            PropertyGroup.builderForPropertyGroup() //
                                    .id("Customer") //
                                    .property(Arrays.asList( //
                                            Property.builderForProperty() //
                                                    .key("customerGroup") //
                                                    .value("IG_SMBCustomers,IG_RegisteredUsers,Everyone") //
                                                    .build() //
                                    )) //
                                    .build(), //
                            PropertyGroup.builderForPropertyGroup() //
                                    .id("AttributeValues") //
                                    .property(Arrays.asList( //
                                            Property.builderForProperty() //
                                                    .key("ishShippingMethodID") //
                                                    .value("shipping-NT") //
                                                    .build() //
                                    )) //
                                    .build() //
                    )) //
                    .build()) //
            .build();

    @Test
    void testStoreOrder_CanSerialize() throws Exception {
        var of = new com.intershop.iom.typesv1_2.ObjectFactory();
        var jaxbStoreOrder = of.createStoreOrder(STORE_ORDER);
        var xmlString = marshalToString(jaxbStoreOrder, StoreOrder.class);

        assertEquals(getString(StoreOrderTest.class, "store-order-serialized.xml"), xmlString);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static <T> String marshalToString(Object input, Class<T> classToBeBound) throws JAXBException {
        List<Class<T>> classesToBeBound = new ArrayList<>();
        classesToBeBound.add(classToBeBound);
        if (input instanceof JAXBElement jaxbElement) {
            classesToBeBound.add(jaxbElement.getDeclaredType());
        }
        JAXBContext jaxbContext = JAXBContext.newInstance(classesToBeBound.toArray(new Class[0]),
                Collections.emptyMap());
        Marshaller marshaler = jaxbContext.createMarshaller();
        marshaler.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaler.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        StringWriter stringWriter = new StringWriter();
        marshaler.marshal(input, stringWriter);
        return stringWriter.toString();
    }

    public static String getString(Class<?> clazz, String name) {
        return getString(clazz.getResourceAsStream(name));
    }

    public static String getString(InputStream inputStream) {
        try (Scanner scanner = new Scanner(inputStream); //
                Scanner s = scanner.useDelimiter("\\A")) {
            return s.hasNext() ? s.next() : "";
        }
    }

    private static NetPrice netPrice(String value) {
        return netPrice(value, a(value));
    }

    private static NetPrice netPrice(String value, BigDecimal amountDiscounted) {
        return NetPrice.builderForNetPrice() //
                .amount(a(value)) //
                .amountDiscounted(amountDiscounted) //
                .build();
    }

    private static GrossPrice grossPrice(String value) {
        return grossPrice(value, a(value));
    }

    private static GrossPrice grossPrice(String value, BigDecimal amountDiscounted) {
        BigDecimal bdValue = a(value);
        return GrossPrice.builderForGrossPrice() //
                .amount(bdValue) //
                .amountDiscounted(amountDiscounted) //
                .build();
    }

    private static Tax tax(String type, String value) {
        return Tax.builderForTax() //
                .type(type) //
                .amount(a(value)) //
                .build();
    }

    private static BigDecimal a(String value) {
        return new BigDecimal(value);
    }

    private static Address createAddress(String id, String type) {
        return Address.builderForAddress() //
                .id(id) //
                .type(type) //
                .receiver(LegalPerson.builderForLegalPerson() //
                        .companyName("Company Name B Here") //
                        .contactPerson(Person.builderForPerson() //
                                .salutation("Dhr.") //
                                .firstName("John") //
                                .lastName("Doe") //
                                .build()) //
                        .build())
                .contact(Contact.builderForContact() //
                        .email("user@example.com") //
                        .telephone("0612345678") //
                        .build())
                .location(Location.builderForLocation() //
                        .city("GRONINGEN") //
                        .postCode("1234AA") //
                        .street("Some Nice Road 38-9b") //
                        .country("NLD") //
                        .build()) //
                .build();
    }
}
