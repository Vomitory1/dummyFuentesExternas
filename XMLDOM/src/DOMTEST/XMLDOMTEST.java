package DOMTEST;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import com.ibm.ws.webservices.engine.xmlsoap.dom.impl.DOMElementImpl;

import javax.xml.parsers.*;
import java.io.*;

public class XMLDOMTEST {

	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();

			// Build Document
			Document document = builder
					.parse(new File("D:\\Users\\jocastro\\Documents\\dummy\\xml\\" + "1040745452" + ".xml"));

			// Normalize the XML Structure; It's just too important !!
			document.getDocumentElement().normalize();

			// Here comes the root node
			Element root = document.getDocumentElement();
			System.out.println(root.getNodeName());

			// Get all employees
			NodeList nList = document.getElementsByTagName("bdua");

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node node = nList.item(temp);
				System.out.println(""); // Just a separator
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					// Print each employee's detail
					Element eElement = (Element) node;
					Bdua bdua = new Bdua();

					bdua.setExitoso(eElement.getElementsByTagName("exitoso").item(0).getTextContent());
					bdua.setUbicacionFuente(new Ubicacion());

					NodeList nListUF = eElement.getElementsByTagName("ubicacionFuente");
					for (int tempUF = 0; tempUF < nListUF.getLength(); tempUF++) {
						Node nodeUF = nListUF.item(tempUF);
						System.out.println(""); // Just a separator
						if (nodeUF.getNodeType() == Node.ELEMENT_NODE) {
							// Print each employee's detail
							Element eElementUF = (Element) nodeUF;

							System.out.println("sisas" +eElementUF.getElementsByTagName("pais").item(0).getTextContent());
						}
					}

				}

			}

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
