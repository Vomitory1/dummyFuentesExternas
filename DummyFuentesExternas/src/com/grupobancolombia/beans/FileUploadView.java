package com.grupobancolombia.beans;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

@SessionScoped
@ManagedBean(name = "fileUploadView")
public class FileUploadView {

	private static final int BUFFER_SIZE = 10000;
	private UploadedFile file;

	private String urlPath;

	/**
	 * permite crear la carpeta si no existe
	 */
	private void createDirectory() {
		File theDir = new File(this.getUrlPath());
		// if the directory does not exist, create it
		if (!theDir.exists()) {
			System.out.println("creating directory: " + theDir.getName());
			boolean result = false;

			try {

				theDir.mkdirs();
				result = true;
			} catch (SecurityException se) {
				// handle it
			}
			if (result) {
				System.out.println("DIR created");
			}
		}

	}

	public UploadedFile getFile() {
		return file;
	}

	private String getFileExtension(File file) {
		String name = file.getName();
		int lastIndexOf = name.lastIndexOf(".");
		if (lastIndexOf == -1) {
			return ""; // empty extension
		}
		return name.substring(lastIndexOf);
	}

	public String getUrlBase() {
		return "/dummyFuentesExternas";
	}

	public String getUrlPath() {
		return urlPath;
	}

	public void handleFileUpload(FileUploadEvent event) {
		this.createDirectory();

		try {
			File result = new File(getUrlPath() + "/" + event.getFile().getFileName());
			File.createTempFile(event.getFile().getFileName(), this.getFileExtension(result), new File(getUrlPath()));
			FileOutputStream fileOutputStream = new FileOutputStream(result);

			byte[] buffer = new byte[BUFFER_SIZE];

			int bulk;
			InputStream inputStream = event.getFile().getInputstream();
			while (true) {
				bulk = inputStream.read(buffer);
				if (bulk < 0) {
					break;
				}
				fileOutputStream.write(buffer, 0, bulk);
				fileOutputStream.flush();
			}
			fileOutputStream.close();
			inputStream.close();

			FacesMessage msg = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
			FacesContext.getCurrentInstance().addMessage("form:fileUoloader", msg);

		} catch (IOException e) {
			e.printStackTrace();
			FacesMessage error = new FacesMessage("The files were not uploaded!");
			FacesContext.getCurrentInstance().addMessage("form:fileUoloader", error);
		}
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}

	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}

	public void upload() {
		if (file != null) {
			FacesMessage message = new FacesMessage("Succesful", file.getFileName() + " is uploaded.");
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}
	
	
	public void onPathChange(String path) {
		if (path != null && !path.equals("")) {
			this.urlPath = path;
		}
	}

}