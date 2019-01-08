package com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.enlace.v1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.ws.Holder;

import org.xml.sax.InputSource;

import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Afiliado;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.AfiliadosCompensados;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Anec;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Asopagos;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Bdua;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Camara;
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

			File file = new File("/dummyFuentesExternas/" + identificacion.getNumeroDocumento() + ".xml");

			InputStream inputStream = new FileInputStream(file);
			Reader reader = new InputStreamReader(inputStream, "UTF-8");
			InputSource is = new InputSource(reader);
			is.setEncoding("UTF-8");

			JAXBContext jaxbContext;
			jaxbContext = JAXBContext.newInstance(ConsultarFuentesExternasResponse.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			ConsultarFuentesExternasResponse cfep = (ConsultarFuentesExternasResponse) unmarshaller.unmarshal(reader);

			ruaf.value = cfep.ruaf;
			bdua.value = cfep.bdua;
			afiliadosCompensados.value = new AfiliadosCompensados();
			setAfiliadosCompensados(afiliadosCompensados, cfep);

			asopagos.value = cfep.asopagos;
			addRuesCamara(ruesCamaras, cfep);
			dianRut.value = cfep.dianRut;

		} catch (JAXBException e1) {
			e1.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param ruesCamaras
	 * @param cfep
	 */
	private void addRuesCamara(Holder<RuesCamaras> ruesCamaras, ConsultarFuentesExternasResponse cfep) {
		RuesCamaras rues = new RuesCamaras();
		if (cfep.ruesCamaras.getExitoso() != null || cfep.ruesCamaras.getExitoso() != "")
			rues.setExitoso(cfep.ruesCamaras.getExitoso());
		if (!cfep.ruesCamaras.getDetalleCamara().isEmpty()) {
			for (com.grupobancolombia.beans.Camara camera : cfep.ruesCamaras.getDetalleCamara()) {
				Camara cam = new Camara();
				cam.setUbicacionFuente(camera.getUbicacionFuente());
				cam.setNombrePersona(camera.getNombrePersona());
				cam.setCategoriaPersona(camera.getCategoriaPersona());
				cam.setCamaraComercio(camera.getCamaraComercio());
				cam.setRepresentanteLegal(camera.getRepresentanteLegal());
				cam.setSiglaEstablecimiento(camera.getSiglaEstablecimiento());
				cam.setNumeroMatricula(camera.getNumeroMatricula());
				cam.setEstadoMatricula(camera.getEstadoMatricula());
				cam.setAnnoUltimaRenovacion(camera.getAnnoUltimaRenovacion());
				cam.setFechaMatricula(camera.getFechaMatricula());
				cam.setFechaCancelacion(camera.getFechaCancelacion());
				cam.setCategoriaMatricula(camera.getCategoriaMatricula());
				cam.setTipoSociedad(camera.getTipoSociedad());
				cam.setTipoOrganizacionEstablecimiento(camera.getTipoOrganizacionEstablecimiento());
				cam.setNumEmpleados(camera.getNumEmpleados());
				cam.setEsAfiliado(camera.getEsAfiliado());
				cam.setRepresentanteLegal(camera.getRepresentanteLegal());
				cam.getActividadEconomica().clear();
				cam.getActividadEconomica().addAll(camera.getActividadEconomica());
				rues.getDetalleCamara().add(cam);
			}
		}
		ruesCamaras.value = rues;
	}

	private void setAfiliadosCompensados(Holder<AfiliadosCompensados> afiliadosCompensados,
			ConsultarFuentesExternasResponse cfep) {
		if (cfep.afiliadosCompensados != null) {
			afiliadosCompensados.value.setExitoso(cfep.afiliadosCompensados.getExitoso());
			afiliadosCompensados.value.setNombrePersona(cfep.afiliadosCompensados.getNombrePersona());

			Afiliado afiliado = new Afiliado();
			if (!cfep.afiliadosCompensados.getReporteAfiliado().getResolucion2280().isEmpty()) {
				afiliado.getResolucion2280().clear();
				afiliado.getResolucion2280().addAll(cfep.afiliadosCompensados.getReporteAfiliado().getResolucion2280());
			}
			if (!cfep.afiliadosCompensados.getReporteAfiliado().getResolucion2309().isEmpty()) {
				afiliado.getResolucion2309().clear();
				afiliado.getResolucion2309().addAll(cfep.afiliadosCompensados.getReporteAfiliado().getResolucion2309());
			}
			if (!cfep.afiliadosCompensados.getReporteAfiliado().getResolucion4023().isEmpty()) {
				afiliado.getResolucion4023().clear();
				afiliado.getResolucion4023().addAll(cfep.afiliadosCompensados.getReporteAfiliado().getResolucion4023());
			}
			afiliadosCompensados.value.setReporteAfiliado(afiliado);
			if (!cfep.afiliadosCompensados.getPeriodosCompensados().isEmpty()) {
				afiliadosCompensados.value.getPeriodosCompensados()
						.addAll(cfep.afiliadosCompensados.getPeriodosCompensados());
			}
			afiliadosCompensados.value.setUbicacionFuente(cfep.afiliadosCompensados.getUbicacionFuente());
		}
	}

}