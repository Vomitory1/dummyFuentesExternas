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
 * <p>Java class for RuntPlaca complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuntPlaca">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exitoso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ubicacionFuente" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}Ubicacion" minOccurs="0"/>
 *         &lt;element name="nombrePersona" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}Persona" minOccurs="0"/>
 *         &lt;element name="estadoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placaVehiculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroLicenciaTransito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoVehiculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claseVehiculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informacionGeneralVehiculo" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}InformacionGeneralVehiculo" minOccurs="0"/>
 *         &lt;element name="datosTecnicosVehiculo" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}DatosTecnicosVehiculo" minOccurs="0"/>
 *         &lt;element name="polizaSoat" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}PolizaSoat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="certificadoTecnicoMecanicoGases" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}CertificadoTecnicoMecanicoGases" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="solicitudes" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}Solicitud" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="limitacionesPropiedad" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}LimitacionesPropiedad" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuntPlaca", propOrder = {
    "exitoso",
    "ubicacionFuente",
    "nombrePersona",
    "estadoPersona",
    "placaVehiculo",
    "numeroLicenciaTransito",
    "estadoVehiculo",
    "tipoServicio",
    "claseVehiculo",
    "informacionGeneralVehiculo",
    "datosTecnicosVehiculo",
    "polizaSoat",
    "certificadoTecnicoMecanicoGases",
    "solicitudes",
    "limitacionesPropiedad"
})
public class RuntPlaca {

    protected String exitoso;
    protected Ubicacion ubicacionFuente;
    protected Persona nombrePersona;
    protected String estadoPersona;
    protected String placaVehiculo;
    protected String numeroLicenciaTransito;
    protected String estadoVehiculo;
    protected String tipoServicio;
    protected String claseVehiculo;
    protected InformacionGeneralVehiculo informacionGeneralVehiculo;
    protected DatosTecnicosVehiculo datosTecnicosVehiculo;
    protected List<PolizaSoat> polizaSoat;
    protected List<CertificadoTecnicoMecanicoGases> certificadoTecnicoMecanicoGases;
    protected List<Solicitud> solicitudes;
    protected List<LimitacionesPropiedad> limitacionesPropiedad;

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
     * Gets the value of the placaVehiculo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    /**
     * Sets the value of the placaVehiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacaVehiculo(String value) {
        this.placaVehiculo = value;
    }

    /**
     * Gets the value of the numeroLicenciaTransito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLicenciaTransito() {
        return numeroLicenciaTransito;
    }

    /**
     * Sets the value of the numeroLicenciaTransito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLicenciaTransito(String value) {
        this.numeroLicenciaTransito = value;
    }

    /**
     * Gets the value of the estadoVehiculo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoVehiculo() {
        return estadoVehiculo;
    }

    /**
     * Sets the value of the estadoVehiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoVehiculo(String value) {
        this.estadoVehiculo = value;
    }

    /**
     * Gets the value of the tipoServicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoServicio() {
        return tipoServicio;
    }

    /**
     * Sets the value of the tipoServicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoServicio(String value) {
        this.tipoServicio = value;
    }

    /**
     * Gets the value of the claseVehiculo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaseVehiculo() {
        return claseVehiculo;
    }

    /**
     * Sets the value of the claseVehiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaseVehiculo(String value) {
        this.claseVehiculo = value;
    }

    /**
     * Gets the value of the informacionGeneralVehiculo property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionGeneralVehiculo }
     *     
     */
    public InformacionGeneralVehiculo getInformacionGeneralVehiculo() {
        return informacionGeneralVehiculo;
    }

    /**
     * Sets the value of the informacionGeneralVehiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionGeneralVehiculo }
     *     
     */
    public void setInformacionGeneralVehiculo(InformacionGeneralVehiculo value) {
        this.informacionGeneralVehiculo = value;
    }

    /**
     * Gets the value of the datosTecnicosVehiculo property.
     * 
     * @return
     *     possible object is
     *     {@link DatosTecnicosVehiculo }
     *     
     */
    public DatosTecnicosVehiculo getDatosTecnicosVehiculo() {
        return datosTecnicosVehiculo;
    }

    /**
     * Sets the value of the datosTecnicosVehiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosTecnicosVehiculo }
     *     
     */
    public void setDatosTecnicosVehiculo(DatosTecnicosVehiculo value) {
        this.datosTecnicosVehiculo = value;
    }

    /**
     * Gets the value of the polizaSoat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polizaSoat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolizaSoat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolizaSoat }
     * 
     * 
     */
    public List<PolizaSoat> getPolizaSoat() {
        if (polizaSoat == null) {
            polizaSoat = new ArrayList<PolizaSoat>();
        }
        return this.polizaSoat;
    }

    /**
     * Gets the value of the certificadoTecnicoMecanicoGases property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificadoTecnicoMecanicoGases property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificadoTecnicoMecanicoGases().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificadoTecnicoMecanicoGases }
     * 
     * 
     */
    public List<CertificadoTecnicoMecanicoGases> getCertificadoTecnicoMecanicoGases() {
        if (certificadoTecnicoMecanicoGases == null) {
            certificadoTecnicoMecanicoGases = new ArrayList<CertificadoTecnicoMecanicoGases>();
        }
        return this.certificadoTecnicoMecanicoGases;
    }

    /**
     * Gets the value of the solicitudes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solicitudes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolicitudes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Solicitud }
     * 
     * 
     */
    public List<Solicitud> getSolicitudes() {
        if (solicitudes == null) {
            solicitudes = new ArrayList<Solicitud>();
        }
        return this.solicitudes;
    }

    /**
     * Gets the value of the limitacionesPropiedad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitacionesPropiedad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitacionesPropiedad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitacionesPropiedad }
     * 
     * 
     */
    public List<LimitacionesPropiedad> getLimitacionesPropiedad() {
        if (limitacionesPropiedad == null) {
            limitacionesPropiedad = new ArrayList<LimitacionesPropiedad>();
        }
        return this.limitacionesPropiedad;
    }

}
