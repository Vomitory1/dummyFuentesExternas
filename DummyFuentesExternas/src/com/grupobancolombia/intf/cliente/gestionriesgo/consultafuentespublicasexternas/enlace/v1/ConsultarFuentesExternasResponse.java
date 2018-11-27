package com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.enlace.v1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.AfiliadosCompensados;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Asopagos;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Bdua;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.DianRut;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Ruaf;

@XmlRootElement(name = "ConsultarFuentesExternasResponse")
public class ConsultarFuentesExternasResponse {

	@XmlElement(name = "bdua")
	protected Bdua bdua;

	@XmlElement(name = "ruaf")
	protected Ruaf ruaf;

	@XmlElement(name = "asopagos")
	protected Asopagos asopagos;

	@XmlElement(name = "afiliadosCompensados")
	protected AfiliadosCompensados afiliadosCompensados;
	
	@XmlElement(name = "dianRut")
	protected DianRut dianRut;
	

	public ConsultarFuentesExternasResponse() {
	}

	public ConsultarFuentesExternasResponse(Bdua eBdua, Ruaf eRuaf, Asopagos eAsopagos,
			AfiliadosCompensados eAfiliadosCompensados, DianRut eDianRut) {
		this.bdua = eBdua;
		this.ruaf = eRuaf;
		this.asopagos = eAsopagos;
		this.afiliadosCompensados = eAfiliadosCompensados;
		this.dianRut = eDianRut;
	}

	

}
