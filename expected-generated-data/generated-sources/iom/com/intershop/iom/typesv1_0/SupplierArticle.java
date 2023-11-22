
package com.intershop.iom.typesv1_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


/**
 * Referenzen des Artikels (inkl. Supplierspezfische Referenzen)
 * 
 * <p>Java class for SupplierArticle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierArticle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="articleId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ean" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="isbn" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="supplierArticleId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierArticle")
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForSupplierArticle", toBuilder = true)
@ToString(callSuper = true)
public class SupplierArticle {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "articleId", required = true)
    protected String articleId;
    @XmlAttribute(name = "ean")
    protected String ean;
    @XmlAttribute(name = "isbn")
    protected String isbn;
    @XmlAttribute(name = "supplierArticleId")
    protected String supplierArticleId;

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

    /**
     * Gets the value of the articleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleId() {
        return articleId;
    }

    /**
     * Sets the value of the articleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleId(String value) {
        this.articleId = value;
    }

    /**
     * Gets the value of the ean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEan() {
        return ean;
    }

    /**
     * Sets the value of the ean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEan(String value) {
        this.ean = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn(String value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the supplierArticleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierArticleId() {
        return supplierArticleId;
    }

    /**
     * Sets the value of the supplierArticleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierArticleId(String value) {
        this.supplierArticleId = value;
    }

}
