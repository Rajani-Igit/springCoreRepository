package com.customproperty.beans;

import org.springframework.beans.propertyeditors.PropertiesEditor;

public class DimensionPropertyEditor extends PropertiesEditor{

   @Override
   public void setAsText(String text) throws IllegalArgumentException {
	   System.out.println("setAsText method called");
	//super.setAsText(text);
	Dimension dimension = null;
	String[] tokens = null;
	tokens = text.split(",");
	if(tokens.length !=3) {
		throw new IllegalArgumentException("Provide all the propertieas");
	}
	dimension = new Dimension();
	dimension.setHeight(Integer.parseInt(tokens[0]));
	dimension.setWidth(Integer.parseInt(tokens[1]));
	dimension.setThickness(Integer.parseInt(tokens[2]));
	setValue(dimension);
   }
}
