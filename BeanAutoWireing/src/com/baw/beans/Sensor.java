package com.baw.beans;

public class Sensor {
private int id;
private String sensorType;

public Sensor() {
	System.out.println("Sensor con called");
}
public void setId(int id) {
	System.out.println("sensor id setter called");
	this.id = id;
}
public void setSensorType(String sensorType) {
	System.out.println("sensor type setter called");
	this.sensorType = sensorType;
}
public String toString() {
	return "Sensor [id=" + id + ", sensorType=" + sensorType + "]";
}

}
