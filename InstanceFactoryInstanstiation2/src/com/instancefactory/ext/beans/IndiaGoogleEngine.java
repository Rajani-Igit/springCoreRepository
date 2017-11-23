package com.instancefactory.ext.beans;

public class IndiaGoogleEngine implements IGoogleEngine{

	@Override
	public String[] getDirections(String source, String destination) {
		String[] directions=null;
		System.out.println("source is "+source+"    Destination is   "+destination);
		directions = new String[] {"SRNagar","Erragada","ESI","Kukatpally","Jntu"};
		return directions;
	}

}
