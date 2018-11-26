//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:28 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:21 AM(foreman)-)
//


package com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Asopagos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Asopagos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exitoso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ubicacionFuente" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}Ubicacion" minOccurs="0"/>
 *         &lt;element name="nombrePersona" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}Persona" minOccurs="0"/>
 *         &lt;element name="numeroPlanilla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPlanilla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaPago" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="tarifaRiesgos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="administradoraCubierta" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}Administradora" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asopagos", propOrder = {
    "exitoso",
    "ubicacionFuente",
    "nombrePersona",
    "numeroPlanilla",
    "tipoPlanilla",
    "fechaPago",
    "tarifaRiesgos",
    "estado",
    "administradoraCubierta"
})
public class Asopagos {

    protected String exitoso;
    protected Ubicacion ubicacionFuente;
    protected Persona nombrePersona;
    protected String numeroPlanilla;
    protected String tipoPlanilla;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaPago;
    protected String tarifaRiesgos;
    protected String estado;
    @XmlElementWrapper(name="administradoraCubierta")
    @XmlElement(name="AdministradoraCubierta")
    protected List<Administradora> administradoraCubierta;

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
     * Gets the value of the numeroPlanilla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPlanilla() {
        return numeroPlanilla;
    }

    /**
     * Sets the value of the numeroPlanilla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPlanilla(String value) {
        this.numeroPlanilla = value;
    }

    /**
     * Gets the value of the tipoPlanilla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPlanilla() {
        return tipoPlanilla;
    }

    /**
     * Sets the value of the tipoPlanilla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPlanilla(String value) {
        this.tipoPlanilla = value;
    }

    /**
     * Gets the value of the fechaPago property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaPago() {
        return fechaPago;
    }

    /**
     * Sets the value of the fechaPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaPago(XMLGregorianCalendar value) {
        this.fechaPago = value;
    }

    /**
     * Gets the value of the tarifaRiesgos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarifaRiesgos() {
        return tarifaRiesgos;
    }

    /**
     * Sets the value of the tarifaRiesgos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarifaRiesgos(String value) {
        this.tarifaRiesgos = value;
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

    /**
     * Gets the value of the administradoraCubierta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the administradoraCubierta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdministradoraCubierta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Administradora }
     * 
     * 
     */
    public List<Administradora> getAdministradoraCubierta() {
        if (administradoraCubierta == null) {
            administradoraCubierta = new ArrayList<Administradora>();
        }
        return this.administradoraCubierta;
    }

}