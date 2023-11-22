
package com.intershop.iom.typesv1_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


/**
 * Fachlich nicht verarbeitbare Nachricht. Muss vom Sender korrigiert und erneut versandt werden
 * 
 * <p>Java class for InvalidMessageException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvalidMessageException"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValidationMessages" type="{http://types.theberlinbakery.com/v1_0}ValidationMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidMessageException", propOrder = {
    "message",
    "validationMessages"
})
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForInvalidMessageException", toBuilder = true)
@ToString(callSuper = true)
public class InvalidMessageException {

    protected String message;
    @XmlElement(name = "ValidationMessages")
    protected List<ValidationMessage> validationMessages;

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

    /**
     * Gets the value of the validationMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the validationMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidationMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationMessage }
     * 
     * 
     */
    public List<ValidationMessage> getValidationMessages() {
        if (validationMessages == null) {
            validationMessages = new ArrayList<ValidationMessage>();
        }
        return this.validationMessages;
    }

}
