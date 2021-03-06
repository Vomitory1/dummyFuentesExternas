//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:28 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:21 AM(foreman)-)
//


package com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Anec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Anec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exitoso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ubicacionFuente" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}Ubicacion" minOccurs="0"/>
 *         &lt;element name="nombrePersona" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}Persona" minOccurs="0"/>
 *         &lt;element name="seccional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaActualizacionRegistro" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
@XmlType(name = "Anec", propOrder = {
    "exitoso",
    "ubicacionFuente",
    "nombrePersona",
    "seccional",
    "fechaActualizacionRegistro",
    "datosRegistro",
    "estadoPersona"
})
public class Anec {

    protected String exitoso;
    protected Ubicacion ubicacionFuente;
    protected Persona nombrePersona;
    protected String seccional;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaActualizacionRegistro;
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
     * Gets the value of the ubicacionFuente property.
     * 
     * @return
     *     possible object is
     *     {@link Ubicacion }
     *     
     */
    public Ubicacion getUbicacionFuente() {
        return ubicacionFuente;
    }

    /**
     * Sets the value of the ubicacionFuente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ubicacion }
     *     
     */
    public void setUbicacionFuente(Ubicacion value) {
        this.ubicacionFuente = value;
    }

    /**
     * Gets the value of the nombrePersona property.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getNombrePersona() {
        return nombrePersona;
    }

    /**
     * Sets the value of the nombrePersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setNombrePersona(Persona value) {
        this.nombrePersona = value;
    }

    /**
     * Gets the value of the seccional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeccional() {
        return seccional;
    }

    /**
     * Sets the value of the seccional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeccional(String value) {
        this.seccional = value;
    }

    /**
     * Gets the value of the fechaActualizacionRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaActualizacionRegistro() {
        return fechaActualizacionRegistro;
    }

    /**
     * Sets the value of the fechaActualizacionRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaActualizacionRegistro(XMLGregorianCalendar value) {
        this.fechaActualizacionRegistro = value;
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
