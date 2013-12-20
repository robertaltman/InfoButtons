//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.19 at 11:27:06 AM MST 
//


package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The Atom cagegory construct is defined in section 4.2.2 of the format spec.
 * 
 * <p>Java class for categoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="categoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="term" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="scheme" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="patientPerson.administrativeGenderCode.c"/>
 *             &lt;enumeration value="patientPerson.administrativeGenderCode.dn"/>
 *             &lt;enumeration value="ageGroup.v.c"/>
 *             &lt;enumeration value="ageGroup.v.cs"/>
 *             &lt;enumeration value="ageGroup.v.dn"/>
 *             &lt;enumeration value="taskContext.c.c"/>
 *             &lt;enumeration value="taskContext.c.dn"/>
 *             &lt;enumeration value="subTopic.v.c"/>
 *             &lt;enumeration value="subTopic.v.cs"/>
 *             &lt;enumeration value="subTopic.v.dn"/>
 *             &lt;enumeration value="subTopic.v.ot"/>
 *             &lt;enumeration value="mainSearchCriteria.v.c"/>
 *             &lt;enumeration value="mainSearchCriteria.v.cs"/>
 *             &lt;enumeration value="mainSearchCriteria.v.dn"/>
 *             &lt;enumeration value="mainSearchCriteria.v.ot"/>
 *             &lt;enumeration value="severityObservation.interpretationCode.c"/>
 *             &lt;enumeration value="severityObservation.interpretationCode.cs"/>
 *             &lt;enumeration value="severityObservation.interpretationCode.dn"/>
 *             &lt;enumeration value="informationRecipient"/>
 *             &lt;enumeration value="performer"/>
 *             &lt;enumeration value="performer.healthCareProvider.c.c"/>
 *             &lt;enumeration value="performer.healthCareProvider.c.cs"/>
 *             &lt;enumeration value="performer.healthCareProvider.c.dn"/>
 *             &lt;enumeration value="informationRecipient.healthCareProvider.c.c"/>
 *             &lt;enumeration value="informationRecipient.healthCareProvider.c.cs"/>
 *             &lt;enumeration value="informationRecipient.healthCareProvider.c.dn"/>
 *             &lt;enumeration value="performer.languageCode"/>
 *             &lt;enumeration value="informationRecipient.languageCode.c"/>
 *             &lt;enumeration value="encounter.c.c"/>
 *             &lt;enumeration value="encounter.c.cs"/>
 *             &lt;enumeration value="encounter.c.dn"/>
 *             &lt;enumeration value="observation.c.c"/>
 *             &lt;enumeration value="observation.c.cs"/>
 *             &lt;enumeration value="observation.c.dn"/>
 *             &lt;enumeration value="observation.v.c"/>
 *             &lt;enumeration value="observation.v.cs"/>
 *             &lt;enumeration value="observation.v.dn"/>
 *             &lt;enumeration value="observation.v.v"/>
 *             &lt;enumeration value="Observation.v.u"/>
 *             &lt;enumeration value="locationOfInterest.addr.ZIP"/>
 *             &lt;enumeration value="locationOfInterest.addr.CTY"/>
 *             &lt;enumeration value="locationOfInterest.addr.STA"/>
 *             &lt;enumeration value="locationOfInterest.addr.CNT"/>
 *             &lt;enumeration value="relevanceScore"/>
 *             &lt;enumeration value="strengthOfRecommedation"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "categoryType")
public class CategoryType {

    @XmlAttribute(required = true)
    protected String term;
    @XmlAttribute(required = true)
    protected String scheme;

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm(String value) {
        this.term = value;
    }

    /**
     * Gets the value of the scheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * Sets the value of the scheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheme(String value) {
        this.scheme = value;
    }

}