package com.ba.beans;

public class Mobile {
	private String version;
	private String model;
	public void setVersion(String version) {
		this.version = version;
	}
	public String toString() {
		return "Mobile [version=" + version + ", model=" + model + "]";
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
