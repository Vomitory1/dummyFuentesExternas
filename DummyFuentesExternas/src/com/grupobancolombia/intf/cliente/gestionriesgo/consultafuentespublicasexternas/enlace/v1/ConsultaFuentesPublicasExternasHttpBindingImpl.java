package com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.enlace.v1;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.ws.Holder;

import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.AfiliadosCompensados;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Anec;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Asopagos;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Bdua;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.ConsejoProfesional;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Contraloria;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Copnia;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Cpae;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Cpip;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Cpnaa;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Cpnt;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.DianRut;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Icetex;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Identificacion;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.InfraccionesTransito;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Persona;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Procuraduria;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.PuestoVotacion;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.RamaJudicial;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Ruaf;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.RuesCamaras;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Runt;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.RuntPlaca;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.SisbenPuntaje;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.TramiteCedula;

@javax.jws.WebService(endpointInterface = "com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.enlace.v1.ConsultaFuentesPublicasExternas", targetNamespace = "http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/Enlace/V1.0", serviceName = "ConsultaFuentesPublicasExternas", portName = "ConsultaFuentesPublicasExternasHttpPort")
public class ConsultaFuentesPublicasExternasHttpBindingImpl {
	
	private static File fileCreater;

	public void consultarFuentesExternas(Identificacion identificacion, String placaVehiculo, List<String> fuente,
			Holder<Bdua> bdua, Holder<Ruaf> ruaf, Holder<Persona> nombreCompleto, Holder<Procuraduria> procuraduria,
			Holder<SisbenPuntaje> sisbenPuntaje, Holder<DianRut> dianRut, Holder<PuestoVotacion> puestoVotacion,
			Holder<Contraloria> contraloria, Holder<Copnia> copnia, Holder<Asopagos> asopagos,
			Holder<RamaJudicial> ramaJudicial, Holder<TramiteCedula> tramiteCedula,
			Holder<InfraccionesTransito> infraccionesTransitoSimit, Holder<Cpae> cpae,
			Holder<ConsejoProfesional> consejoProfesional, Holder<Cpnaa> cpnaa, Holder<Anec> anec, Holder<Cpip> cpip,
			Holder<Icetex> icetex, Holder<Cpnt> cpnt, Holder<RuesCamaras> ruesCamaras, Holder<Runt> runt,
			Holder<RuntPlaca> runtPlaca, Holder<AfiliadosCompensados> afiliadosCompensados) throws SystemExceptionMsg {

		try {
			fileCreater = new File("/dummyFuentesExternas");
			fileCreater.mkdirs();
			
			
			File file = new File("C:\\dummyFuentesExternas\\1040745452.xml");
			JAXBContext jaxbContext;
			jaxbContext = JAXBContext.newInstance(ConsultarFuentesExternasResponse.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			ConsultarFuentesExternasResponse cfep = (ConsultarFuentesExternasResponse) unmarshaller.unmarshal(file);

			ruaf.value = cfep.ruaf;
			bdua.value = cfep.bdua;
			afiliadosCompensados.value = cfep.afiliadosCompensados;
			asopagos.value = cfep.asopagos;

		} catch (JAXBException e1) {

			e1.printStackTrace();
		}
	}

}