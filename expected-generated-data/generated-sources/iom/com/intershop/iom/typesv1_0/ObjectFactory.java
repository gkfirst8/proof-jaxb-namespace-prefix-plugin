
package com.intershop.iom.typesv1_0;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.intershop.iom.typesv1_0 package. 
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

    private final static QName _ShopPartner_QNAME = new QName("http://types.theberlinbakery.com/v1_0", "ShopPartner");
    private final static QName _SupplierPartner_QNAME = new QName("http://types.theberlinbakery.com/v1_0", "SupplierPartner");
    private final static QName _Person_QNAME = new QName("http://types.theberlinbakery.com/v1_0", "Person");
    private final static QName _LegalPerson_QNAME = new QName("http://types.theberlinbakery.com/v1_0", "LegalPerson");
    private final static QName _Contact_QNAME = new QName("http://types.theberlinbakery.com/v1_0", "Contact");
    private final static QName _Company_QNAME = new QName("http://types.theberlinbakery.com/v1_0", "Company");
    private final static QName _Property_QNAME = new QName("http://types.theberlinbakery.com/v1_0", "Property");
    private final static QName _PropertyGroup_QNAME = new QName("http://types.theberlinbakery.com/v1_0", "PropertyGroup");
    private final static QName _Article_QNAME = new QName("http://types.theberlinbakery.com/v1_0", "Article");
    private final static QName _SupplierArticle_QNAME = new QName("http://types.theberlinbakery.com/v1_0", "SupplierArticle");
    private final static QName _Tax_QNAME = new QName("http://types.theberlinbakery.com/v1_0", "Tax");
    private final static QName _InvalidMessageException_QNAME = new QName("http://types.theberlinbakery.com/v1_0", "InvalidMessageException");
    private final static QName _TechnicalException_QNAME = new QName("http://types.theberlinbakery.com/v1_0", "TechnicalException");
    private final static QName _DuplicateException_QNAME = new QName("http://types.theberlinbakery.com/v1_0", "DuplicateException");
    private final static QName _Element_QNAME = new QName("http://types.theberlinbakery.com/v1_0", "Element");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.intershop.iom.typesv1_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Element }
     * 
     */
    public Element createElement() {
        return new Element();
    }

    /**
     * Create an instance of {@link ShopPartner }
     * 
     */
    public ShopPartner createShopPartner() {
        return new ShopPartner();
    }

    /**
     * Create an instance of {@link SupplierPartner }
     * 
     */
    public SupplierPartner createSupplierPartner() {
        return new SupplierPartner();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link LegalPerson }
     * 
     */
    public LegalPerson createLegalPerson() {
        return new LegalPerson();
    }

    /**
     * Create an instance of {@link Company }
     * 
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link PropertyGroup }
     * 
     */
    public PropertyGroup createPropertyGroup() {
        return new PropertyGroup();
    }

    /**
     * Create an instance of {@link Article }
     * 
     */
    public Article createArticle() {
        return new Article();
    }

    /**
     * Create an instance of {@link SupplierArticle }
     * 
     */
    public SupplierArticle createSupplierArticle() {
        return new SupplierArticle();
    }

    /**
     * Create an instance of {@link Tax }
     * 
     */
    public Tax createTax() {
        return new Tax();
    }

    /**
     * Create an instance of {@link InvalidMessageException }
     * 
     */
    public InvalidMessageException createInvalidMessageException() {
        return new InvalidMessageException();
    }

    /**
     * Create an instance of {@link TechnicalException }
     * 
     */
    public TechnicalException createTechnicalException() {
        return new TechnicalException();
    }

    /**
     * Create an instance of {@link DuplicateException }
     * 
     */
    public DuplicateException createDuplicateException() {
        return new DuplicateException();
    }

    /**
     * Create an instance of {@link Partner }
     * 
     */
    public Partner createPartner() {
        return new Partner();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link ValidationMessage }
     * 
     */
    public ValidationMessage createValidationMessage() {
        return new ValidationMessage();
    }

    /**
     * Create an instance of {@link Element.Attribute }
     * 
     */
    public Element.Attribute createElementAttribute() {
        return new Element.Attribute();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShopPartner }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShopPartner }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_0", name = "ShopPartner")
    public JAXBElement<ShopPartner> createShopPartner(ShopPartner value) {
        return new JAXBElement<ShopPartner>(_ShopPartner_QNAME, ShopPartner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierPartner }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SupplierPartner }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_0", name = "SupplierPartner")
    public JAXBElement<SupplierPartner> createSupplierPartner(SupplierPartner value) {
        return new JAXBElement<SupplierPartner>(_SupplierPartner_QNAME, SupplierPartner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Person }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_0", name = "Person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalPerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LegalPerson }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_0", name = "LegalPerson")
    public JAXBElement<LegalPerson> createLegalPerson(LegalPerson value) {
        return new JAXBElement<LegalPerson>(_LegalPerson_QNAME, LegalPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_0", name = "Contact")
    public JAXBElement<Object> createContact(Object value) {
        return new JAXBElement<Object>(_Contact_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Company }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Company }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_0", name = "Company")
    public JAXBElement<Company> createCompany(Company value) {
        return new JAXBElement<Company>(_Company_QNAME, Company.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Property }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Property }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_0", name = "Property")
    public JAXBElement<Property> createProperty(Property value) {
        return new JAXBElement<Property>(_Property_QNAME, Property.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PropertyGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_0", name = "PropertyGroup")
    public JAXBElement<PropertyGroup> createPropertyGroup(PropertyGroup value) {
        return new JAXBElement<PropertyGroup>(_PropertyGroup_QNAME, PropertyGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Article }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Article }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_0", name = "Article")
    public JAXBElement<Article> createArticle(Article value) {
        return new JAXBElement<Article>(_Article_QNAME, Article.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierArticle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SupplierArticle }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_0", name = "SupplierArticle")
    public JAXBElement<SupplierArticle> createSupplierArticle(SupplierArticle value) {
        return new JAXBElement<SupplierArticle>(_SupplierArticle_QNAME, SupplierArticle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tax }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tax }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_0", name = "Tax")
    public JAXBElement<Tax> createTax(Tax value) {
        return new JAXBElement<Tax>(_Tax_QNAME, Tax.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidMessageException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvalidMessageException }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_0", name = "InvalidMessageException")
    public JAXBElement<InvalidMessageException> createInvalidMessageException(InvalidMessageException value) {
        return new JAXBElement<InvalidMessageException>(_InvalidMessageException_QNAME, InvalidMessageException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TechnicalException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TechnicalException }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_0", name = "TechnicalException")
    public JAXBElement<TechnicalException> createTechnicalException(TechnicalException value) {
        return new JAXBElement<TechnicalException>(_TechnicalException_QNAME, TechnicalException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DuplicateException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DuplicateException }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_0", name = "DuplicateException")
    public JAXBElement<DuplicateException> createDuplicateException(DuplicateException value) {
        return new JAXBElement<DuplicateException>(_DuplicateException_QNAME, DuplicateException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Element }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Element }{@code >}
     */
    @XmlElementDecl(namespace = "http://types.theberlinbakery.com/v1_0", name = "Element")
    public JAXBElement<Element> createElement(Element value) {
        return new JAXBElement<Element>(_Element_QNAME, Element.class, null, value);
    }

}
