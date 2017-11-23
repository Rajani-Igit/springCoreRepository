package com.propertyeditor.beans;

import java.io.File;
import java.net.URL;
import java.util.Date;

public class Book {
  private int isdn;
  private String name;
  private Date publishedDate;
  private URL site;
  private File tocFile;
  private String[] authors;
  
   /**
   *These are acessor and mutuator methods for all the attributes of a class
   *
   */
  
    public String[] getAuthors() {
		return authors;
	}
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	public int getIsdn() {
		return isdn;
	}
	public void setIsdn(int isdn) {
		this.isdn = isdn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
	public URL getSite() {
		return site;
	}
	public void setSite(URL site) {
		this.site = site;
	}
	public File getTocFile() {
		return tocFile;
	}
	public void setTocFile(File tocFile) {
		this.tocFile = tocFile;
	}
}
