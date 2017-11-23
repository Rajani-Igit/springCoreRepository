package com.cdi.beans;

import java.util.Map;
import java.util.Properties;

public class College {
	private Map<String,Student> hodepartment;
	private Properties topper;
	
	public College(Map<String, Student> hodepartment) {
		super();
		System.out.println("Constructor called");
		System.out.println("Map is a type of  "+hodepartment.getClass().getName() );
		this.hodepartment = hodepartment;
	}

	public void setTopper(Properties topper) {
		System.out.println("setter methos called");
		System.out.println("Property is a type of "+topper.getClass().getName());
		this.topper = topper;
	}


	@Override
	public String toString() {
		return "College [hodepartment=" + hodepartment + ", topper=" + topper + "]";
	}
    
}
