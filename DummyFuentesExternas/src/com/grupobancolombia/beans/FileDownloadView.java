package com.grupobancolombia.beans;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.activation.MimetypesFileTypeMap;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

import org.primefaces.model.StreamedContent;

@SessionScoped
@ManagedBean(name = "fileDownloadView")

public class FileDownloadView {
	private StreamedContent file;
	private String urlPathFile;

	public void prepDownload() {
		try {
			String fileName = this.getUrlPathFile().substring(this.getUrlPathFile().lastIndexOf('/') + 1,
					this.getUrlPathFile().length());
			File file = new File(this.getUrlPathFile());

			FacesContext facesContext = FacesContext.getCurrentInstance();

			HttpServletResponse response = (HttpServletResponse) facesContext.getExternalContext().getResponse();

			response.reset();
			response.setHeader("Content-Type", getMineType(this.getUrlPathFile()));
			response.setHeader("Content-Disposition", "attachment;filename=" + fileName);

			OutputStream responseOutputStream = response.getOutputStream();

			InputStream fileInputStream = new FileInputStream(file);

			byte[] bytesBuffer = new byte[2048];
			int bytesRead;
			while ((bytesRead = fileInputStream.read(bytesBuffer)) > 0) {
				responseOutputStream.write(bytesBuffer, 0, bytesRead);
			}		

//			this.file = new DefaultStreamedContent(fileInputStream, getMineType(this.getUrlPathFile()), fileName);
			responseOutputStream.flush();
			facesContext.responseComplete();
			fileInputStream.close();
			responseOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
			FacesMessage error = new FacesMessage("The files does not exist");
			FacesContext.getCurrentInstance().addMessage(null, error);
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
