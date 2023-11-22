
package com.intershop.iom.typesv1_1;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.intershop.iom.typesv1_1 package. 
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

    private final static QName _Acknowledgement_QNAME = new QName("http://types.theberlinbakery.com/v1_1", "Acknowledgement");
    private final static QName _AcknowledgementEnvelope_QNAME = new QName("http://types.theberlinbakery.com/v1_1", "AcknowledgementEnvelope");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.intershop.iom.typesv1_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Acknowledgement }
     * 
     */
    public Acknowledgement createAcknowledgement() {
        return new Acknowledgement();
    }

    /**
     * Create an instance of {@link AcknowledgementEnvelope }
     * 
     */
    public AcknowledgementEnvelope createAcknowledgementEnvelope() {
        return new AcknowledgementEnvelope();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Acknowledgement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Acknowledgement }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_1", name = "Acknowledgement")
    public JAXBElement<Acknowledgement> createAcknowledgement(Acknowledgement value) {
        return new JAXBElement<Acknowledgement>(_Acknowledgement_QNAME, Acknowledgement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcknowledgementEnvelope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcknowledgementEnvelope }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_1", name = "AcknowledgementEnvelope")
    public JAXBElement<AcknowledgementEnvelope> createAcknowledgementEnvelope(AcknowledgementEnvelope value) {
        return new JAXBElement<AcknowledgementEnvelope>(_AcknowledgementEnvelope_QNAME, AcknowledgementEnvelope.class, null, value);
    }

}
