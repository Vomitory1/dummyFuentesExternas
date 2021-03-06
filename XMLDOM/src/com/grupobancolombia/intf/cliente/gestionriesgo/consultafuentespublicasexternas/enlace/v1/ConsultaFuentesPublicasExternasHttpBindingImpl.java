package com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.enlace.v1;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.ws.Holder;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

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
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Salud;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.SisbenPuntaje;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.TramiteCedula;
import com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.v1.Ubicacion;

import DOMTEST.Product;

@javax.jws.WebService(endpointInterface = "com.grupobancolombia.intf.cliente.gestionriesgo.consultafuentespublicasexternas.enlace.v1.ConsultaFuentesPublicasExternas", targetNamespace = "http://grupobancolombia.com/intf/Cliente/GestionRiesgo/ConsultaFuentesPublicasExternas/Enlace/V1.0", serviceName = "ConsultaFuentesPublicasExternas", portName = "ConsultaFuentesPublicasExternasHttpPort")
public class ConsultaFuentesPublicasExternasHttpBindingImpl {

	public void consultarFuentesExternas(Identificacion identificacion, String placaVehiculo, List<String> fuente,
			Holder<Bdua> bdua, Holder<Ruaf> ruaf, Holder<Persona> nombreCompleto, Holder<Procuraduria> procuraduria,
			Holder<SisbenPuntaje> sisbenPuntaje, Holder<DianRut> dianRut, Holder<PuestoVotacion> puestoVotacion,
			Holder<Contraloria> contraloria, Holder<Copnia> copnia, Holder<Asopagos> asopagos,
			Holder<RamaJudicial> ramaJudicial, Holder<TramiteCedula> tramiteCedula,
			Holder<InfraccionesTransito> infraccionesTransitoSimit, Holder<Cpae> cpae,
			Holder<ConsejoProfesional> consejoProfesional, Holder<Cpnaa> cpnaa, Holder<Anec> anec, Holder<Cpip> cpip,
			Holder<Icetex> icetex, Holder<Cpnt> cpnt, Holder<RuesCamaras> ruesCamaras, Holder<Runt> runt,
			Holder<RuntPlaca> runtPlaca, Holder<AfiliadosCompensados> afiliadosCompensados) throws SystemExceptionMsg {
		// TODO Auto-generated method stub
		
		
		
	
		
		
		Document document = null;
		document = getXmlFile(identificacion, document);
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());

		try {
			// get bdua
			getBdua(bdua, document);
			//set Ruaf
			getRuaf(ruaf, document);
		} catch (DOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;
	}
	/**
	 * Permite mappear los valores de ruaf del xml a un objeto
	 * @param ruaf
	 * @param document
	 */
	private void getRuaf(Holder<Ruaf> ruaf, Document document)throws DOMException, ParseException, DatatypeConfigurationException {
		
		NodeList nList = document.getElementsByTagName("ruaf");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node node = nList.item(temp);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				// Print each employee's detail
				Element eElement = (Element) node;
				Ruaf ruafXML = new Ruaf();
				if (!isEmptyNull(eElement, "exitoso"))
					ruafXML.setExitoso(eElement.getElementsByTagName("exitoso").item(0).getTextContent());

				if (!isEmptyNull(eElement, "sexo"))
					ruafXML.setSexo(eElement.getElementsByTagName("sexo").item(0).getTextContent());

				NodeList nListUF = eElement.getElementsByTagName("ubicacionFuente");
				for (int tempUF = 0; tempUF < nListUF.getLength(); tempUF++) {
					Node nodeUF = nListUF.item(tempUF);
					if (nodeUF.getNodeType() == Node.ELEMENT_NODE) {
						Element eElementUF = (Element) nodeUF;
						ruafXML.setUbicacionFuente(new Ubicacion());

						if (!isEmptyNull(eElementUF, "pais"))
							ruafXML.getUbicacionFuente()
									.setPais(eElementUF.getElementsByTagName("pais").item(0).getTextContent());

						if (!isEmptyNull(eElementUF, "departamento"))
							ruafXML.getUbicacionFuente().setDepartamento(
									eElementUF.getElementsByTagName("departamento").item(0).getTextContent());

						if (!isEmptyNull(eElementUF, "departamento"))
							ruafXML.getUbicacionFuente().setMunicipio(
									eElementUF.getElementsByTagName("municipio").item(0).getTextContent());
					}
				}

				NodeList nListNP = eElement.getElementsByTagName("nombrePersona");
				for (int tempNP = 0; tempNP < nListNP.getLength(); tempNP++) {
					Node nodeNP = nListNP.item(tempNP);
					if (nodeNP.getNodeType() == Node.ELEMENT_NODE) {
						Element eElementNP = (Element) nodeNP;
						ruafXML.setNombrePersona(new Persona());
						if (!isEmptyNull(eElementNP, "primerNombre"))
							ruafXML.getNombrePersona().setPrimerNombre(
									eElementNP.getElementsByTagName("primerNombre").item(0).getTextContent());

						if (!isEmptyNull(eElementNP, "segundoNombre"))
							ruafXML.getNombrePersona().setSegundoNombre(
									eElementNP.getElementsByTagName("segundoNombre").item(0).getTextContent());

						if (!isEmptyNull(eElementNP, "primerApellido"))
							ruafXML.getNombrePersona().setPrimerApellido(
									eElementNP.getElementsByTagName("primerApellido").item(0).getTextContent());

						if (!isEmptyNull(eElementNP, "segundoApellido"))
							ruafXML.getNombrePersona().setSegundoApellido(
									eElementNP.getElementsByTagName("segundoApellido").item(0).getTextContent());

						if (!isEmptyNull(eElementNP, "tipoNombre"))
							ruafXML.getNombrePersona().setTipoNombre(
									eElementNP.getElementsByTagName("tipoNombre").item(0).getTextContent());
					}
				}
			
				
				NodeList nListSalud = eElement.getElementsByTagName("salud");
				
				for (int tempSalud = 0; tempSalud < nListSalud.getLength(); tempSalud++) {
					Node nodeSalud = nListSalud.item(tempSalud);  
					if (nodeSalud.getNodeType() == Node.ELEMENT_NODE) {
						Element eElementSalud = (Element) nodeSalud;
						
						List<Salud> listSalud = new ArrayList<Salud>();
						NodeList nListSaludL = eElementSalud.getElementsByTagName("Salud");
						for (int tempSl = 0; tempSl < nListUF.getLength(); tempSl++) {
							Node nodeSL = nListSaludL.item(tempSl);
							if (nodeSL.getNodeType() == Node.ELEMENT_NODE) {
								Element eElementSL = (Element) nodeSL;
								Salud Salud = new Salud(); 
								
								if (!isEmptyNull(eElementSL, "regimen"))
									Salud.setRegimen(eElementSL.getElementsByTagName("regimen").item(0).getTextContent());
								
								if (!isEmptyNull(eElementSL, "tipoAfiliado"))
									Salud.setTipoAfiliado(eElementSL.getElementsByTagName("tipoAfiliado").item(0).getTextContent());
							
								if (!isEmptyNull(eElementSL, "administradora"))
									Salud.setAdministradora(eElementSL.getElementsByTagName("administradora").item(0).getTextContent());
								listSalud.add(Salud);
								
							}
						}
						
						
						
						ruafXML.getSalud().addAll(listSalud);
						
						
						
					}
				}
				ruaf.value = ruafXML;
			}
		}
		
	}

	/**
	 * Permite mappear todos los elementos de bdua
	 * 
	 * @param bdua
	 * @param document
	 * @throws DOMException
	 * @throws ParseException
	 * @throws DatatypeConfigurationException
	 */
	private void getBdua(Holder<Bdua> bdua, Document document)
			throws DOMException, ParseException, DatatypeConfigurationException {
		NodeList nList = document.getElementsByTagName("bdua");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node node = nList.item(temp);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				// Print each employee's detail
				Element eElement = (Element) node;
				Bdua bduaXML = new Bdua();
				if (!isEmptyNull(eElement, "exitoso"))
					bduaXML.setExitoso(eElement.getElementsByTagName("exitoso").item(0).getTextContent());

				if (!isEmptyNull(eElement, "entidad"))
					bduaXML.setEntidad(eElement.getElementsByTagName("entidad").item(0).getTextContent());

				if (!isEmptyNull(eElement, "regimen"))
					bduaXML.setRegimen(eElement.getElementsByTagName("regimen").item(0).getTextContent());

				if (!isEmptyNull(eElement, "fechaAfiliacion"))
					bduaXML.setFechaAfiliacion(stringToJavaDate(
							eElement.getElementsByTagName("fechaAfiliacion").item(0).getTextContent()));
				
				if (!isEmptyNull(eElement, "tipoAfiliado"))
					bduaXML.setTipoAfiliado(eElement.getElementsByTagName("tipoAfiliado").item(0).getTextContent());
				
				if (!isEmptyNull(eElement, "estadoAfiliacion"))
					bduaXML.setEstadoAfiliacion(eElement.getElementsByTagName("estadoAfiliacion").item(0).getTextContent());

				NodeList nListUF = eElement.getElementsByTagName("ubicacionFuente");
				for (int tempUF = 0; tempUF < nListUF.getLength(); tempUF++) {
					Node nodeUF = nListUF.item(tempUF);
					if (nodeUF.getNodeType() == Node.ELEMENT_NODE) {
						Element eElementUF = (Element) nodeUF;
						bduaXML.setUbicacionFuente(new Ubicacion());

						if (!isEmptyNull(eElementUF, "pais"))
							bduaXML.getUbicacionFuente()
									.setPais(eElementUF.getElementsByTagName("pais").item(0).getTextContent());

						if (!isEmptyNull(eElementUF, "departamento"))
							bduaXML.getUbicacionFuente().setDepartamento(
									eElementUF.getElementsByTagName("departamento").item(0).getTextContent());

						if (!isEmptyNull(eElementUF, "departamento"))
							bduaXML.getUbicacionFuente().setMunicipio(
									eElementUF.getElementsByTagName("municipio").item(0).getTextContent());
					}
				}

				NodeList nListUA = eElement.getElementsByTagName("ubicacionAfiliado");
				for (int tempUA = 0; tempUA < nListUA.getLength(); tempUA++) {
					Node nodeUA = nListUA.item(tempUA);
					if (nodeUA.getNodeType() == Node.ELEMENT_NODE) {
						Element eElementUA = (Element) nodeUA;
						bduaXML.setUbicacionAfiliado(new Ubicacion());

						if (!isEmptyNull(eElementUA, "pais"))
							bduaXML.getUbicacionAfiliado()
									.setPais(eElementUA.getElementsByTagName("pais").item(0).getTextContent());

						if (!isEmptyNull(eElementUA, "departamento"))
							bduaXML.getUbicacionAfiliado().setDepartamento(
									eElementUA.getElementsByTagName("departamento").item(0).getTextContent());

						if (!isEmptyNull(eElementUA, "departamento"))
							bduaXML.getUbicacionAfiliado().setMunicipio(
									eElementUA.getElementsByTagName("municipio").item(0).getTextContent());
					}
				}

				NodeList nListNP = eElement.getElementsByTagName("nombrePersona");
				for (int tempNP = 0; tempNP < nListNP.getLength(); tempNP++) {
					Node nodeNP = nListNP.item(tempNP);
					if (nodeNP.getNodeType() == Node.ELEMENT_NODE) {
						Element eElementNP = (Element) nodeNP;
						bduaXML.setNombrePersona(new Persona());
						if (!isEmptyNull(eElementNP, "primerNombre"))
							bduaXML.getNombrePersona().setPrimerNombre(
									eElementNP.getElementsByTagName("primerNombre").item(0).getTextContent());

						if (!isEmptyNull(eElementNP, "segundoNombre"))
							bduaXML.getNombrePersona().setSegundoNombre(
									eElementNP.getElementsByTagName("segundoNombre").item(0).getTextContent());

						if (!isEmptyNull(eElementNP, "primerApellido"))
							bduaXML.getNombrePersona().setPrimerApellido(
									eElementNP.getElementsByTagName("primerApellido").item(0).getTextContent());

						if (!isEmptyNull(eElementNP, "segundoApellido"))
							bduaXML.getNombrePersona().setSegundoApellido(
									eElementNP.getElementsByTagName("segundoApellido").item(0).getTextContent());

						if (!isEmptyNull(eElementNP, "tipoNombre"))
							bduaXML.getNombrePersona().setTipoNombre(
									eElementNP.getElementsByTagName("tipoNombre").item(0).getTextContent());
					}
				}
				bdua.value = bduaXML;
			}
		}
	}

	/**
	 * permite formatear una fecha al xml
	 * 
	 * @param sDate
	 * @return
	 * @throws ParseException
	 * @throws DatatypeConfigurationException
	 */
	public static XMLGregorianCalendar stringToJavaDate(String sDate)
			throws ParseException, DatatypeConfigurationException {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(sDate);

		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);

		XMLGregorianCalendar xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		return xmlGregCal;
	}

	/**
	 * Permite Obtener el file XML para dar la respuesta
	 * 
	 * @param identificacion
	 * @param document
	 * @return
	 */
	private Document getXmlFile(Identificacion identificacion, Document document) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder;

			builder = factory.newDocumentBuilder();

			// Build Document
			document = builder.parse(new File(
					"D:\\Users\\jocastro\\Documents\\dummy\\xml\\" + identificacion.getNumeroDocumento() + ".xml"));

			// Normalize the XML Structure; It's just too important !!
			document.getDocumentElement().normalize();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return document;
	}

	/**
	 * Permite validar si el elemento solicitado esta vacio o ni si quiera existe
	 * 
	 * @param element
	 * @param keyValue
	 * @return
	 */
	private boolean isEmptyNull(Element element, String keyValue) {
		try {
			if (element.getElementsByTagName(keyValue).item(0).getTextContent().isEmpty()
					|| element.getElementsByTagName(keyValue).item(0).getTextContent() == null) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return true;
		}

	}

}