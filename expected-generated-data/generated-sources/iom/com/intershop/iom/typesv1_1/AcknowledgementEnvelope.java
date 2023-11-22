
package com.intershop.iom.typesv1_1;

import com.intershop.iom.typesv1_0.DuplicateException;
import com.intershop.iom.typesv1_0.InvalidMessageException;
import com.intershop.iom.typesv1_0.TechnicalException;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


/**
 * Allgemeine Empfangsbestaetigung
 * 
 * <p>Java class for AcknowledgementEnvelope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcknowledgementEnvelope"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://types.theberlinbakery.com/v1_1}Acknowledgement"/&gt;
 *         &lt;element name="DuplicateException" type="{http://types.theberlinbakery.com/v1_0}DuplicateException"/&gt;
 *         &lt;element name="InvalidMessageException" type="{http://types.theberlinbakery.com/v1_0}InvalidMessageException"/&gt;
 *         &lt;element name="TechnicalException" type="{http://types.theberlinbakery.com/v1_0}TechnicalException"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcknowledgementEnvelope", propOrder = {
    "acknowledgement",
    "duplicateException",
    "invalidMessageException",
    "technicalException"
})
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "builderForAcknowledgementEnvelope", toBuilder = true)
@ToString(callSuper = true)
public class AcknowledgementEnvelope {

    @XmlElement(name = "Acknowledgement")
    protected Acknowledgement acknowledgement;
    @XmlElement(name = "DuplicateException")
    protected DuplicateException duplicateException;
    @XmlElement(name = "InvalidMessageException")
    protected InvalidMessageException invalidMessageException;
    @XmlElement(name = "TechnicalException")
    protected TechnicalException technicalException;

    /**
     * Gets the value of the acknowledgement property.
     * 
     * @return
     *     possible object is
     *     {@link Acknowledgement }
     *     
     */
    public Acknowledgement getAcknowledgement() {
        return acknowledgement;
    }

    /**
     * Sets the value of the acknowledgement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acknowledgement }
     *     
     */
    public void setAcknowledgement(Acknowledgement value) {
        this.acknowledgement = value;
    }

    /**
     * Gets the value of the duplicateException property.
     * 
     * @return
     *     possible object is
     *     {@link DuplicateException }
     *     
     */
    public DuplicateException getDuplicateException() {
        return duplicateException;
    }

    /**
     * Sets the value of the duplicateException property.
     * 
     * @param value
     *     allowed object is
     *     {@link DuplicateException }
     *     
     */
    public void setDuplicateException(DuplicateException value) {
        this.duplicateException = value;
    }

    /**
     * Gets the value of the invalidMessageException property.
     * 
     * @return
     *     possible object is
     *     {@link InvalidMessageException }
     *     
     */
    public InvalidMessageException getInvalidMessageException() {
        return invalidMessageException;
    }

    /**
     * Sets the value of the invalidMessageException property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvalidMessageException }
     *     
     */
    public void setInvalidMessageException(InvalidMessageException value) {
        this.invalidMessageException = value;
    }

    /**
     * Gets the value of the technicalException property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalException }
     *     
     */
    public TechnicalException getTechnicalException() {
        return technicalException;
    }

    /**
     * Sets the value of the technicalException property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalException }
     *     
     */
    public void setTechnicalException(TechnicalException value) {
        this.technicalException = value;
    }

}
