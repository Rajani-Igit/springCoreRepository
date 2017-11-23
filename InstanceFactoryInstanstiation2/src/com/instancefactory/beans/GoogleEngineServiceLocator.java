package com.instancefactory.beans;

import com.instancefactory.ext.beans.IGoogleEngine;
import com.instancefactory.ext.beans.IndiaGoogleEngine;
import com.instancefactory.ext.beans.USGoogleEngine;

public class GoogleEngineServiceLocator {
	
	public GoogleEngineServiceLocator() {
		System.out.println("GoogleEngineServiceLocator constructor");
	}
	
	/**
	 * This method is used for locate GoogleEngine based on argumnet
	 *
	 */
	public IGoogleEngine googleEngineServiceLocator(String name) {
		if(name.equalsIgnoreCase("INDIA")){
			return new IndiaGoogleEngine();
		}
		else if(name.equalsIgnoreCase("US")) {
			return new USGoogleEngine();
		}else {
			return null;
		}
	}
	
	/*
	*//**
	 * This method is help full in locating IndiaSpecific GoogleEngine
	 *
	 *//*
 public IGoogleEngine indiaGoogleEngineServiceLocator() {
	System.out.println("India GoolgeEngine Service Locator Method");
	return new IndiaGoogleEngine();
}


*//**
 * This method is help full in locating USSpecific GoogleEngine
 *
 *//*
 public IGoogleEngine usGoogleEngineServiceLocator() {
   System.out.println("Us GoolgeEngine Service Locator Method");
   return new USGoogleEngine();
 }*/
}
