package com.intershop.iom.typesv1_2p;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.3
 * 2023-11-22T11:23:04.686+01:00
 * Generated source version: 4.0.3
 *
 */
@WebService(targetNamespace = "http://v1_2.services.theberlinbakery.com/", name = "OrderServicePort")
@XmlSeeAlso({com.intershop.iom.typesv1_2.ObjectFactory.class, com.intershop.iom.typesv1_1.ObjectFactory.class, com.intershop.iom.typesv1_0.ObjectFactory.class})
public interface OrderServicePort {

    @WebMethod
    @RequestWrapper(localName = "storeOrder", targetNamespace = "http://types.theberlinbakery.com/v1_2", className = "com.intershop.iom.typesv1_2.StoreOrder")
    @ResponseWrapper(localName = "Acknowledgement", targetNamespace = "http://types.theberlinbakery.com/v1_1", className = "com.intershop.iom.typesv1_1.Acknowledgement")
    public void storeOrder(

        @WebParam(name = "MessageId", targetNamespace = "http://types.theberlinbakery.com/v1_0")
        java.lang.String messageId,
        @WebParam(name = "User", targetNamespace = "http://types.theberlinbakery.com/v1_0")
        java.lang.String user,
        @WebParam(name = "Password", targetNamespace = "http://types.theberlinbakery.com/v1_0")
        java.lang.String password,
        @WebParam(name = "Shop", targetNamespace = "http://types.theberlinbakery.com/v1_0")
        java.lang.String shop,
        @WebParam(name = "Order", targetNamespace = "http://types.theberlinbakery.com/v1_2")
        com.intershop.iom.typesv1_2.Order order,
        @WebParam(mode = WebParam.Mode.OUT, name = "Result", targetNamespace = "http://types.theberlinbakery.com/v1_1")
        jakarta.xml.ws.Holder<java.lang.String> result,
        @WebParam(mode = WebParam.Mode.OUT, name = "Element", targetNamespace = "http://types.theberlinbakery.com/v1_1")
        jakarta.xml.ws.Holder<java.util.List<com.intershop.iom.typesv1_0.Element>> element,
        @WebParam(mode = WebParam.Mode.OUT, name = "Properties", targetNamespace = "http://types.theberlinbakery.com/v1_1")
        jakarta.xml.ws.Holder<java.util.List<com.intershop.iom.typesv1_0.PropertyGroup>> properties
    ) throws DuplicateException, InvalidMessageException, TechnicalException;
}