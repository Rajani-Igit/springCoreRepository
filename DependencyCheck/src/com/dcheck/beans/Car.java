package com.dcheck.beans;

import java.util.Date;

public class Car {
private int id;
private String company;
private float cost;
public String toString() {
	return "Car [id=" + id + ", company=" + company + ", cost=" + cost + ", modelYear=" + modelYear + ", engine="
			+ engine + "]";
}
private Date modelYear;
private Engine engine;
public Car() {
	System.out.println("Car class constructor");
}

public void setId(int id) {
	System.out.println("setId");
	this.id = id;
}
public void setCompany(String company) {
	System.out.println("setCompany");
	this.company = company;
}
public void setCost(float cost) {
	System.out.println("setCost");
	this.cost = cost;
}
public void setModelYear(Date modelYear) {
	this.modelYear = modelYear;
	System.out.println("setModelYear");
}
public void setEngine(Engine engine)
{
	System.out.println("setEngine");
	this.engine = engine;
}
}
