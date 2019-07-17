package com.grupobancolombia.beans;

import java.io.Serializable;

public class FileDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3027200901691742185L;

	private String name;

	private String path;

	private String size;

	public String getName() {
		return name;
	}

	public String getPath() {
		return path;
	}

	public String getSize() {
		return size;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setSize(String size) {
		this.size = size;
	}
}
