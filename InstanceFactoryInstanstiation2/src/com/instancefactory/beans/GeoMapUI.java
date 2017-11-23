package com.instancefactory.beans;

import com.instancefactory.ext.beans.IGoogleEngine;

public class GeoMapUI {
private IGoogleEngine iGoogleEngine;

public void setiGoogleEngine(IGoogleEngine iGoogleEngine) {
	System.out.println("setter method of GEOMAPUI");
	this.iGoogleEngine = iGoogleEngine;
}
  public void render() {
	String[] directions=null;
	directions = iGoogleEngine.getDirections("Mithrivanam", "Jntu");
	for(String direction :directions) {
		System.out.println(direction);	
	}
  }
}
