
package com.intershop.iom.typesv1_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


/**
 * Information ueber eine fehlgeschlagene Validierung
 * 
 * <p>Java class for ValidationMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidationMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errorType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationMessage", propOrder = {
    "errorPath",
    "errorType",
    "message"
})
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForValidationMessage", toBuilder = true)
@ToString(callSuper = true)
public class ValidationMessage {

    protected String errorPath;
    @XmlElement(required = true)
    protected String errorType;
    protected String message;

    /**
     * Gets the value of the errorPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorPath() {
        return errorPath;
    }

    /**
     * Sets the value of the errorPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorPath(String value) {
        this.errorPath = value;
    }

    /**
     * Gets the value of the errorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorType() {
        return errorType;
    }

    /**
     * Sets the value of the errorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorType(String value) {
        this.errorType = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
