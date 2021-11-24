package com.grupobancolombia.beans;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

import javax.activation.MimetypesFileTypeMap;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@ViewScoped
@ManagedBean(name = "fileDownloadView")

public class FileDownloadView implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private StreamedContent file;
	private String urlPathFile;

	public void prepDownload(String name, String path) {
		try {
			urlPathFile = path ;
			File file = new File(this.getUrlPathFile());

			FacesContext facesContext = FacesContext.getCurrentInstance();

			HttpServletResponse response = (HttpServletResponse) facesContext.getExternalContext().getResponse();

			response.reset();
			response.setHeader("Content-Type", getMineType(this.getUrlPathFile()));
			response.setHeader("Content-Disposition", "attachment;filename=" + name);

			OutputStream responseOutputStream = response.getOutputStream();

			InputStream fileInputStream = new FileInputStream(file);

			byte[] bytesBuffer = new byte[2048];
			int bytesRead;
			while ((bytesRead = fileInputStream.read(bytesBuffer)) > 0) {
				responseOutputStream.write(bytesBuffer, 0, bytesRead);
			}

			responseOutputStream.flush();

			fileInputStream.close();
			responseOutputStream.close();

			facesContext.responseComplete();

			InputStream stream = this.getClass().getResourceAsStream(this.getUrlPathFile());
			
			 this.file = new DefaultStreamedContent(stream, "application/pdf",
					 name);
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}

	}
	
	public void deleteFile(String name, String path) {
		try {
			urlPathFile = path ;
			File file = new File(this.getUrlPathFile());
			if(file.exists())
				file.delete();
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}

	}

	public StreamedContent getFile() {
		return file;
	}

	public String getUrlPathFile() {
		return urlPathFile;
	}

	public void setUrlPathFile(String urlPathFile) {
		this.urlPathFile = urlPathFile;
	}

	public String getMineType(String filepath) {
		MimetypesFileTypeMap mimeTypesMap = new MimetypesFileTypeMap();
		// only by file name
		String mimeType = mimeTypesMap.getContentType(filepath);
		return mimeType;

	}

}