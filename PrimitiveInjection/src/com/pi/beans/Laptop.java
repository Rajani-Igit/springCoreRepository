package com.pi.beans;

public class Laptop {
	private String laptopName;
	private int serialNo;
	private double producyKey;
	private float batteryPersent;
	private long price;
	
	public Laptop(long price,String laptopName)
	{
		System.out.println("constructor called");
		this.laptopName=laptopName;
		this.price=price;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public void setProducyKey(double producyKey) {
		this.producyKey = producyKey;
	}

	public void setBatteryPersent(float batteryPersent) {
		this.batteryPersent = batteryPersent;
	}

	public String toString() {
		return "Laptop [laptopName=" + laptopName + ", serialNo=" + serialNo + ", producyKey=" + producyKey
				+ ", batteryPersent=" + batteryPersent + ", price=" + price + "]";
	}


}
