package com.grupobancolombia.beans;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Resolucion;

@XmlRootElement(name = "afiliado")
@XmlAccessorType(XmlAccessType.FIELD)
public class Afiliado {
	@XmlElementWrapper(name = "resolucion2309")
	@XmlElement(name = "Resolucion")
	protected List<Resolucion> resolucion2309;

	@XmlElementWrapper(name = "resolucion2280")
	@XmlElement(name = "Resolucion")
	protected List<Resolucion> resolucion2280;

	@XmlElementWrapper(name = "resolucion4023")
	@XmlElement(name = "Resolucion")
	protected List<Resolucion> resolucion4023;

	public List<Resolucion> getResolucion2280() {
		if (resolucion2280 == null) {
			resolucion2280 = new ArrayList<Resolucion>();
		}
		return this.resolucion2280;
	}

	public List<Resolucion> getResolucion2309() {
		if (resolucion2309 == null) {
			resolucion2309 = new ArrayList<Resolucion>();
		}
		return this.resolucion2309;
	}

	public List<Resolucion> getResolucion4023() {
		if (resolucion4023 == null) {
			resolucion4023 = new ArrayList<Resolucion>();
		}
		return this.resolucion4023;
	}

	public void setResolucion2280(List<Resolucion> resolucion2280) {
		this.resolucion2280 = resolucion2280;
	}

	public void setResolucion2309(List<Resolucion> resolucion2309) {
		this.resolucion2309 = resolucion2309;
	}

	public void setResolucion4023(List<Resolucion> resolucion4023) {
		this.resolucion4023 = resolucion4023;
	}
}
