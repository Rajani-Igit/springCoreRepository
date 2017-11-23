package com.dcheck.beans;

public class Engine {
private String type;
private int chasisNo;
private String fuelType;
public Engine(String type, int chasisNo, String fuelType) {
	super();
	this.type = type;
	this.chasisNo = chasisNo;
	this.fuelType = fuelType;
}
public String toString() {
	return "Engine [type=" + type + ", chasisNo=" + chasisNo + ", fuelType=" + fuelType + "]";
}

}
