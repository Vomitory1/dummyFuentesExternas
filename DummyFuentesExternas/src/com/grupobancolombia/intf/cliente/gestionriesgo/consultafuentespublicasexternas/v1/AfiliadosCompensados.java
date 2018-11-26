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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AfiliadosCompensados complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AfiliadosCompensados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exitoso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ubicacionFuente" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}Ubicacion" minOccurs="0"/>
 *         &lt;element name="nombrePersona" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}Persona" minOccurs="0"/>
 *         &lt;element name="reporteAfiliado" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}Afiliado" minOccurs="0"/>
 *         &lt;element name="periodosCompensados" type="{http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/V1.0}Periodos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AfiliadosCompensados", propOrder = {
    "exitoso",
    "ubicacionFuente",
    "nombrePersona",
    "reporteAfiliado",
    "periodosCompensados"
})
public class AfiliadosCompensados {

    protected String exitoso;
    protected Ubicacion ubicacionFuente;
    protected Persona nombrePersona;
    protected Afiliado reporteAfiliado;
    @XmlElementWrapper(name="periodosCompensados")
    @XmlElement(name="Periodos")
    protected List<Periodos> periodosCompensados;

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
     * Gets the value of the reporteAfiliado property.
     * 
     * @return
     *     possible object is
     *     {@link Afiliado }
     *     
     */
    public Afiliado getReporteAfiliado() {
        return reporteAfiliado;
    }

    /**
     * Sets the value of the reporteAfiliado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Afiliado }
     *     
     */
    public void setReporteAfiliado(Afiliado value) {
        this.reporteAfiliado = value;
    }

    /**
     * Gets the value of the periodosCompensados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodosCompensados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodosCompensados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Periodos }
     * 
     * 
     */
    public List<Periodos> getPeriodosCompensados() {
        if (periodosCompensados == null) {
            periodosCompensados = new ArrayList<Periodos>();
        }
        return this.periodosCompensados;
    }

}
