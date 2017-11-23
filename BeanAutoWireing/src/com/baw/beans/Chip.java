package com.baw.beans;

public class Chip { 
	private int id;
	private String chipType;
	
	public Chip() {
		System.out.println("chip con called");
	}
	public void setId(int id) {
		System.out.println("chip id setter called"+id);
		this.id = id;
	}
	public void setChipType(String chipType) {
		System.out.println("chiptype setter called"+chipType);
		this.chipType = chipType;
	}
	public String toString() {
		return "Chip [id=" + id + ", chipType=" + chipType + "]";
	}
	

}
