//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:28 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:21 AM(foreman)-)
//


package com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.grupobancolombia.ents.common.genericexception.v2.GenericException;


/**
 * <p>Java class for SystemException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genericException" type="{http://grupobancolombia.com/ents/common/GenericException/V2.0}GenericException"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemException", propOrder = {
    "genericException"
})
public class SystemException {

    @XmlElement(required = true)
    protected GenericException genericException;

    /**
     * Gets the value of the genericException property.
     * 
     * @return
     *     possible object is
     *     {@link GenericException }
     *     
     */
    public GenericException getGenericException() {
        return genericException;
    }

    /**
     * Sets the value of the genericException property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericException }
     *     
     */
    public void setGenericException(GenericException value) {
        this.genericException = value;
    }

}
