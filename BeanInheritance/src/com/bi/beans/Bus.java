package com.bi.beans;

public class Bus {
	private int id;
	private String model;
	private String manufaturer;
	private String fuelType;
	private String transimissionType;
	private int capacity;
	public String toString() {
		return "Bus [id=" + id + ", model=" + model + ", manufaturer=" + manufaturer + ", fuelType=" + fuelType
				+ ", transimissionType=" + transimissionType + ", capacity=" + capacity + "]";
	}
	
	public Bus() {
		System.out.println("Bus con called");
	}
	
	/*public Bus(int id, String model, String manufaturer, String fuelType, String transimissionType, int capacity) {
		this.id = id;
		this.model = model;
		this.manufaturer = manufaturer;
		this.fuelType = fuelType;
		this.transimissionType = transimissionType;
		this.capacity = capacity;
	}*/
	
	public void setId(int id) {
		System.out.println(" bus id setter");
		this.id = id;
	}
	public void setModel(String model) {
		System.out.println("bus model setter");
		this.model = model;
	}
	public void setManufaturer(String manufaturer) {
		System.out.println("bus manufacturer setter");
		this.manufaturer = manufaturer;
	}
	public void setFuelType(String fuelType) {
		System.out.println("bus fuel setter");
		this.fuelType = fuelType;
	}
	public void setTransimissionType(String transimissionType) {
		System.out.println("bus transimission type setter");
		this.transimissionType = transimissionType;
	}
	public void setCapacity(int capacity) {
		System.out.println("bus capacity setter");
		this.capacity = capacity;
	}
}
