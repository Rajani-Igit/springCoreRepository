package com.instancefactory.ext.beans;

public class USGoogleEngine implements IGoogleEngine {

	@Override
	public String[] getDirections(String source, String destination) {
		String[] directions=null;
		System.out.println("source is "+source+"    Destination is   "+destination);
		directions = new String[] {"California","Connecticut","Fullorton","WashingtonDC","SiliconValley"};
		return directions;
	}

}
