//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:28 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:21 AM(foreman)-)
//


package com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompensacionFamiliar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompensacionFamiliar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoAfiliado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ubicacionLaboral" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}Ubicacion" minOccurs="0"/>
 *         &lt;element name="afiliacion" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}Afiliacion" minOccurs="0"/>
 *         &lt;element name="administradora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoMiembroCompensacionCubierta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompensacionFamiliar", propOrder = {
    "tipoAfiliado",
    "ubicacionLaboral",
    "afiliacion",
    "administradora",
    "tipoMiembroCompensacionCubierta"
})
public class CompensacionFamiliar {

    protected String tipoAfiliado;
    protected Ubicacion ubicacionLaboral;
    protected Afiliacion afiliacion;
    protected String administradora;
    protected String tipoMiembroCompensacionCubierta;

    /**
     * Gets the value of the tipoAfiliado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAfiliado() {
        return tipoAfiliado;
    }

    /**
     * Sets the value of the tipoAfiliado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAfiliado(String value) {
        this.tipoAfiliado = value;
    }

    /**
     * Gets the value of the ubicacionLaboral property.
     * 
     * @return
     *     possible object is
     *     {@link Ubicacion }
     *     
     */
    public Ubicacion getUbicacionLaboral() {
        return ubicacionLaboral;
    }

    /**
     * Sets the value of the ubicacionLaboral property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ubicacion }
     *     
     */
    public void setUbicacionLaboral(Ubicacion value) {
        this.ubicacionLaboral = value;
    }

    /**
     * Gets the value of the afiliacion property.
     * 
     * @return
     *     possible object is
     *     {@link Afiliacion }
     *     
     */
    public Afiliacion getAfiliacion() {
        return afiliacion;
    }

    /**
     * Sets the value of the afiliacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Afiliacion }
     *     
     */
    public void setAfiliacion(Afiliacion value) {
        this.afiliacion = value;
    }

    /**
     * Gets the value of the administradora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministradora() {
        return administradora;
    }

    /**
     * Sets the value of the administradora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministradora(String value) {
        this.administradora = value;
    }

    /**
     * Gets the value of the tipoMiembroCompensacionCubierta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMiembroCompensacionCubierta() {
        return tipoMiembroCompensacionCubierta;
    }

    /**
     * Sets the value of the tipoMiembroCompensacionCubierta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMiembroCompensacionCubierta(String value) {
        this.tipoMiembroCompensacionCubierta = value;
    }

}
