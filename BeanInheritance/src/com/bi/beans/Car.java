package com.bi.beans;

public class Car {
private int id;
private String model;
private String manufaturer;
private String fuelType;
private String transimissionType;

public String toString() {
	return "Car [id=" + id + ", model=" + model + ", manufaturer=" + manufaturer + ", fuelType=" + fuelType
			+ ", transimissionType=" + transimissionType + "]";
}

public Car() {
	System.out.println("Car con called");
}

/*public Car(int id, String model, String manufaturer, String fuelType, String transimissionType) {
	super();
	System.out.println("car constructor called");
	this.id = id;
	this.model = model;
	this.manufaturer = manufaturer;
	this.fuelType = fuelType;
	this.transimissionType = transimissionType;
}*/


public void setId(int id) {
	//System.out.println("setter id");
	this.id = id;
}

public void setModel(String model) {
	System.out.println("setter model");
	this.model = model;
}

public void setManufaturer(String manufaturer) {
	System.out.println("setter manufaturer");
	this.manufaturer = manufaturer;
}

public void setFuelType(String fuelType) {
	System.out.println("setter fuel type");
	this.fuelType = fuelType;
}

public void setTransimissionType(String transimissionType) {
	System.out.println("setter transimission type");
	this.transimissionType = transimissionType;
}

}
