package com.grupobancolombia.beans;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Periodos;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Persona;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Ubicacion;

public class AfiliadosCompensados {
	protected String exitoso;
	protected Ubicacion ubicacionFuente;
	protected Persona nombrePersona;
	protected Afiliado reporteAfiliado;
	@XmlElementWrapper(name = "periodosCompensados")
	@XmlElement(name = "Periodos")
	protected List<Periodos> periodosCompensados;

	/**
	 * Gets the value of the exitoso property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExitoso() {
		return exitoso;
	}

	/**
	 * Sets the value of the exitoso property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExitoso(String value) {
		this.exitoso = value;
	}

	/**
	 * Gets the value of the ubicacionFuente property.
	 * 
	 * @return possible object is {@link Ubicacion }
	 * 
	 */
	public Ubicacion getUbicacionFuente() {
		return ubicacionFuente;
	}

	/**
	 * Sets the value of the ubicacionFuente property.
	 * 
	 * @param value
	 *            allowed object is {@link Ubicacion }
	 * 
	 */
	public void setUbicacionFuente(Ubicacion value) {
		this.ubicacionFuente = value;
	}

	/**
	 * Gets the value of the nombrePersona property.
	 * 
	 * @return possible object is {@link Persona }
	 * 
	 */
	public Persona getNombrePersona() {
		return nombrePersona;
	}

	/**
	 * Sets the value of the nombrePersona property.
	 * 
	 * @param value
	 *            allowed object is {@link Persona }
	 * 
	 */
	public void setNombrePersona(Persona value) {
		this.nombrePersona = value;
	}

	/**
	 * Gets the value of the reporteAfiliado property.
	 * 
	 * @return possible object is {@link Afiliado }
	 * 
	 */
	public Afiliado getReporteAfiliado() {
		if (reporteAfiliado == null) {
			return new Afiliado();
		} else {
			return reporteAfiliado;
		}

	}

	/**
	 * Sets the value of the reporteAfiliado property.
	 * 
	 * @param value
	 *            allowed object is {@link Afiliado }
	 * 
	 */
	public void setReporteAfiliado(Afiliado value) {
		this.reporteAfiliado = value;
	}

	/**
	 * Gets the value of the periodosCompensados property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the periodosCompensados property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPeriodosCompensados().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Periodos }
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
