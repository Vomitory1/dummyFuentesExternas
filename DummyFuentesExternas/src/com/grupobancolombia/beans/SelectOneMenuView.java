package com.grupobancolombia.beans;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

	}

	

	

	public void setPath(String path) {
		this.path = path;
	}

	public void setPaths(Map<String, String> paths) {
		this.paths = paths;
	}

}
