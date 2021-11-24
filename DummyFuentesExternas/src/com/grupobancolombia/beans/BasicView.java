package com.grupobancolombia.beans;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "dtBasicView")
@SessionScoped
public class BasicView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8472940342208626398L;
	/**
	 * 
	 */

	private List<FileDetail> listFileDetail;
	private List<FileDetail> listFileDetailFiltered;

	public void setListFileDetail(List<FileDetail> listFileDetail) {
		this.listFileDetail = listFileDetail;
	}

	public List<FileDetail> getListFileDetail() {
		if (listFileDetail == null || listFileDetail.isEmpty()) {
			return new ArrayList<FileDetail>();
		} else {
			return listFileDetail;
		}
	}

	public void onPathChange(String path) {
		if (path != null && !path.equals("")) {
			File folder = new File(path);
			File[] listOfFiles = folder.listFiles();
			

			List<FileDetail> listFileDetailL = new ArrayList<FileDetail>();
			for (File file : listOfFiles) {
				if (folder.isDirectory()) {

					if (file.length() == 0) {
						file.delete();
						continue;
					} else {

						FileDetail detail = new FileDetail();
						detail.setName(file.getName());
						detail.setPath(file.getPath());
						detail.setSize(getfileSizeKiloBytess(file));
						listFileDetailL.add(detail);
					}
				}
			}
			if (!listFileDetailL.isEmpty()) {
				this.setListFileDetail(listFileDetailL);
				this.listFileDetailFiltered = listFileDetailL;
			}
		}
	}

//	private static String getfileSizeMegaBytes(File file) {
//		return (double) file.length() / (1024 * 1024) + " mb ";
//	}

	private static String getfileSizeKiloBytess(File file) {
		return (double) file.length() / (1024) + " kb ";
	}

//	private static String getfileSizeBytes(File file) {
//		return (double) file.length() + " bytes ";
//	}

	public List<FileDetail> getListFileDetailFiltered() {
		return listFileDetailFiltered;
	}

	public void setListFileDetailFiltered(List<FileDetail> listFileDetailFiltered) {
		this.listFileDetailFiltered = listFileDetailFiltered;
	}
}
