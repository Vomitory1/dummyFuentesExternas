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
 * <p>Java class for PolizaSoat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolizaSoat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroPoliza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="fechaInicioVigencia" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="fechaFinVigencia" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="entidadSoat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolizaSoat", propOrder = {
    "numeroPoliza",
    "fechaExpedicion",
    "fechaInicioVigencia",
    "fechaFinVigencia",
    "entidadSoat",
    "estado"
})
public class PolizaSoat {

    protected String numeroPoliza;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaExpedicion;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaInicioVigencia;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaFinVigencia;
    protected String entidadSoat;
    protected String estado;

    /**
     * Gets the value of the numeroPoliza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    /**
     * Sets the value of the numeroPoliza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPoliza(String value) {
        this.numeroPoliza = value;
    }

    /**
     * Gets the value of the fechaExpedicion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Sets the value of the fechaExpedicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaExpedicion(XMLGregorianCalendar value) {
        this.fechaExpedicion = value;
    }

    /**
     * Gets the value of the fechaInicioVigencia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    /**
     * Sets the value of the fechaInicioVigencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicioVigencia(XMLGregorianCalendar value) {
        this.fechaInicioVigencia = value;
    }

    /**
     * Gets the value of the fechaFinVigencia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    /**
     * Sets the value of the fechaFinVigencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFinVigencia(XMLGregorianCalendar value) {
        this.fechaFinVigencia = value;
    }

    /**
     * Gets the value of the entidadSoat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidadSoat() {
        return entidadSoat;
    }

    /**
     * Sets the value of the entidadSoat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidadSoat(String value) {
        this.entidadSoat = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

}
