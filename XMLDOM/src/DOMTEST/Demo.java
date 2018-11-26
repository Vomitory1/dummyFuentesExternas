package DOMTEST;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Demo {
	private static Product product;

	public static void main(String[] args) throws JAXBException {

		File file = new File("D:\\Users\\jocastro\\Documents\\dummy\\\\xml\\product.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Product.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		product = (Product) unmarshaller.unmarshal(file);
		System.out.println(product.toString());
	}
}
