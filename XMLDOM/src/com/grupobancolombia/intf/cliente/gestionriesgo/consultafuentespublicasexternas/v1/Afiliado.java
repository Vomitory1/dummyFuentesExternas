//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:28 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:21 AM(foreman)-)
//


package com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Afiliado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Afiliado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resolucion2309" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}Resolucion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resolucion2280" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}Resolucion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resolucion4023" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}Resolucion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Afiliado", propOrder = {
    "resolucion2309",
    "resolucion2280",
    "resolucion4023"
})
public class Afiliado {

    protected List<Resolucion> resolucion2309;
    protected List<Resolucion> resolucion2280;
    protected List<Resolucion> resolucion4023;

    /**
     * Gets the value of the resolucion2309 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resolucion2309 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResolucion2309().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resolucion }
     * 
     * 
     */
    public List<Resolucion> getResolucion2309() {
        if (resolucion2309 == null) {
            resolucion2309 = new ArrayList<Resolucion>();
        }
        return this.resolucion2309;
    }

    /**
     * Gets the value of the resolucion2280 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resolucion2280 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResolucion2280().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resolucion }
     * 
     * 
     */
    public List<Resolucion> getResolucion2280() {
        if (resolucion2280 == null) {
            resolucion2280 = new ArrayList<Resolucion>();
        }
        return this.resolucion2280;
    }

    /**
     * Gets the value of the resolucion4023 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resolucion4023 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResolucion4023().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resolucion }
     * 
     * 
     */
    public List<Resolucion> getResolucion4023() {
        if (resolucion4023 == null) {
            resolucion4023 = new ArrayList<Resolucion>();
        }
        return this.resolucion4023;
    }

}