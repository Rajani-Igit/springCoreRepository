package com.customproperty.beans;

public class Metal {
private String metalName;
private Dimension dimension;
public String getMetalName() {
	return metalName;
}
public void setMetalName(String metalName) {
	this.metalName = metalName;
}
@Override
public String toString() {
	return "Metal [metalName=" + metalName + ", dimension=" + dimension + "]";
}
public Dimension getDimension() {
	return dimension;
}
public void setDimension(Dimension dimension) {
	this.dimension = dimension;
}
}
