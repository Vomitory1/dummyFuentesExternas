//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:28 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:21 AM(foreman)-)
//


package com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cpip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cpip">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exitoso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datosRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cpip", propOrder = {
    "exitoso",
    "tipoMatricula",
    "numeroMatricula",
    "datosRegistro",
    "estadoPersona"
})
public class Cpip {

    protected String exitoso;
    protected String tipoMatricula;
    protected String numeroMatricula;
    protected String datosRegistro;
    protected String estadoPersona;

    /**
     * Gets the value of the exitoso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExitoso() {
        return exitoso;
    }

    /**
     * Sets the value of the exitoso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExitoso(String value) {
        this.exitoso = value;
    }

    /**
     * Gets the value of the tipoMatricula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMatricula() {
        return tipoMatricula;
    }

    /**
     * Sets the value of the tipoMatricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMatricula(String value) {
        this.tipoMatricula = value;
    }

    /**
     * Gets the value of the numeroMatricula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    /**
     * Sets the value of the numeroMatricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroMatricula(String value) {
        this.numeroMatricula = value;
    }

    /**
     * Gets the value of the datosRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosRegistro() {
        return datosRegistro;
    }

    /**
     * Sets the value of the datosRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosRegistro(String value) {
        this.datosRegistro = value;
    }

    /**
     * Gets the value of the estadoPersona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoPersona() {
        return estadoPersona;
    }

    /**
     * Sets the value of the estadoPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoPersona(String value) {
        this.estadoPersona = value;
    }

}