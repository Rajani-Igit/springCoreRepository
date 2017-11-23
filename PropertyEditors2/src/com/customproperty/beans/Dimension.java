package com.customproperty.beans;

public class Dimension {
private int height;
private int width;
private int thickness;
public int getHeight() {
	return height;
}
@Override
public String toString() {
	return "Dimension [height=" + height + ", width=" + width + ", thickness=" + thickness + "]";
}
public void setHeight(int height) {
	this.height = height;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
public int getThickness() {
	return thickness;
}
public void setThickness(int thickness) {
	this.thickness = thickness;
}
}
