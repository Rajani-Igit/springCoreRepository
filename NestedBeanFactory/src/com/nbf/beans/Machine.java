package com.nbf.beans;

public class Machine {
   private int id;
   private String machineType;
public void setId(int id) {
	this.id = id;
}
public void setMachineType(String machineType) {
	this.machineType = machineType;
}
public String toString() {
	return "Machine [id=" + id + ", machineType=" + machineType + "]";
}
   
}
