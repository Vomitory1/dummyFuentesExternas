//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:28 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:21 AM(foreman)-)
//


package com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Runt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Runt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exitoso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ubicacionFuente" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}Ubicacion" minOccurs="0"/>
 *         &lt;element name="nombrePersona" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}Persona" minOccurs="0"/>
 *         &lt;element name="numeroInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaInscripcion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="estadoConductor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorMultas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroPazySalvo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licenciaConduccion" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}LicenciaConduccion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="certificadoConduccion" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}CertificadoConduccion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="solicitud" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}Solicitud" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Runt", propOrder = {
    "exitoso",
    "ubicacionFuente",
    "nombrePersona",
    "numeroInscripcion",
    "fechaInscripcion",
    "estadoConductor",
    "estadoPersona",
    "indicadorMultas",
    "numeroPazySalvo",
    "licenciaConduccion",
    "certificadoConduccion",
    "solicitud"
})
public class Runt {

    protected String exitoso;
    protected Ubicacion ubicacionFuente;
    protected Persona nombrePersona;
    protected String numeroInscripcion;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaInscripcion;
    protected String estadoConductor;
    protected String estadoPersona;
    protected String indicadorMultas;
    protected String numeroPazySalvo;
    protected List<LicenciaConduccion> licenciaConduccion;
    protected List<CertificadoConduccion> certificadoConduccion;
    protected List<Solicitud> solicitud;

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
     * Gets the value of the numeroInscripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroInscripcion() {
        return numeroInscripcion;
    }

    /**
     * Sets the value of the numeroInscripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroInscripcion(String value) {
        this.numeroInscripcion = value;
    }

    /**
     * Gets the value of the fechaInscripcion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInscripcion() {
        return fechaInscripcion;
    }

    /**
     * Sets the value of the fechaInscripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInscripcion(XMLGregorianCalendar value) {
        this.fechaInscripcion = value;
    }

    /**
     * Gets the value of the estadoConductor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoConductor() {
        return estadoConductor;
    }

    /**
     * Sets the value of the estadoConductor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoConductor(String value) {
        this.estadoConductor = value;
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

    /**
     * Gets the value of the indicadorMultas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorMultas() {
        return indicadorMultas;
    }

    /**
     * Sets the value of the indicadorMultas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorMultas(String value) {
        this.indicadorMultas = value;
    }

    /**
     * Gets the value of the numeroPazySalvo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPazySalvo() {
        return numeroPazySalvo;
    }

    /**
     * Sets the value of the numeroPazySalvo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPazySalvo(String value) {
        this.numeroPazySalvo = value;
    }

    /**
     * Gets the value of the licenciaConduccion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenciaConduccion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicenciaConduccion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenciaConduccion }
     * 
     * 
     */
    public List<LicenciaConduccion> getLicenciaConduccion() {
        if (licenciaConduccion == null) {
            licenciaConduccion = new ArrayList<LicenciaConduccion>();
        }
        return this.licenciaConduccion;
    }

    /**
     * Gets the value of the certificadoConduccion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificadoConduccion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificadoConduccion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificadoConduccion }
     * 
     * 
     */
    public List<CertificadoConduccion> getCertificadoConduccion() {
        if (certificadoConduccion == null) {
            certificadoConduccion = new ArrayList<CertificadoConduccion>();
        }
        return this.certificadoConduccion;
    }

    /**
     * Gets the value of the solicitud property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solicitud property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolicitud().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Solicitud }
     * 
     * 
     */
    public List<Solicitud> getSolicitud() {
        if (solicitud == null) {
            solicitud = new ArrayList<Solicitud>();
        }
        return this.solicitud;
    }

}
