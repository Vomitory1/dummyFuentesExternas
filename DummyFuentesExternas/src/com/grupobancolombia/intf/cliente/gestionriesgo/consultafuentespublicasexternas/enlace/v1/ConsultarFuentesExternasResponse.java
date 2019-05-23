package com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.enlace.v1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.grupobancolombia.beans.AfiliadosCompensados;
import com.grupobancolombia.beans.RuesCamaras;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Asopagos;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Bdua;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.ConsejoProfesional;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Copnia;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.DianRut;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Persona;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Procuraduria;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Ruaf;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Runt;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.RuntPlaca;

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
	
	@XmlElement(name = "ruesCamaras")
	protected RuesCamaras ruesCamaras;
	
	@XmlElement(name = "runt")
	protected Runt runt;
	
	@XmlElement(name = "runtPlaca")
	protected RuntPlaca runtPlaca;
	
	@XmlElement(name = "procuraduria")
	protected Procuraduria procuraduria;
	
	@XmlElement(name = "nombreCompleto")
	protected Persona nombreCompleto;
	
	@XmlElement(name = "copnia")
	protected Copnia copnia;
		
	@XmlElement(name = "consejoProfesional")
	protected ConsejoProfesional consejoProfesional;
	
	
	public ConsultarFuentesExternasResponse() {
	}

	public ConsultarFuentesExternasResponse(Bdua eBdua, Ruaf eRuaf, Asopagos eAsopagos,
			AfiliadosCompensados eAfiliadosCompensados, DianRut eDianRut, Runt eRunt, RuntPlaca eRuntPlaca, Copnia eCopnia, ConsejoProfesional eConsejoProfesional) {
		this.bdua = eBdua;
		this.ruaf = eRuaf;
		this.asopagos = eAsopagos;
		this.afiliadosCompensados = eAfiliadosCompensados;
		this.dianRut = eDianRut;
		this.runt = eRunt;
		this.runtPlaca = eRuntPlaca;
		this.copnia = eCopnia;
		this.consejoProfesional = eConsejoProfesional;
	}

	

}
