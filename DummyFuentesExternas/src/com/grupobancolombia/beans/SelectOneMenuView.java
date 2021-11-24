package com.grupobancolombia.beans;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class SelectOneMenuView {

	private String path;
	private Map<String, String> paths = new HashMap<String, String>();
	

	

	public String getPath() {
		return path;
	}

	public Map<String, String> getPaths() {
		return paths;
	}

	@PostConstruct
	public void init() {

		// paths
		paths = new HashMap<String, String>();
		paths.put("CUNCE", "/dummyCUN/XMLResponse/CunCE");
		paths.put("CUNCI", "/dummyCUN/XMLResponse/CunCI");
		paths.put("Fuentes Externas", "/dummyFuentesExternas");
		paths.put("Recuperar DatosClientes", "/dummyDatosCliente");
		paths.put("Soi Data", "/dummySoiData");
		paths.put("G del Banco", "/dummyGDelbanco");

	}

	

	

	public void setPath(String path) {
		this.path = path;
	}

	public void setPaths(Map<String, String> paths) {
		this.paths = paths;
	}

}
