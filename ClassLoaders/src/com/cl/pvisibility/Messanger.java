package com.cl.pvisibility;

public class Messanger {
	static {
		System.out.println("static block inside Messanger class");
	}
	public Messanger() {
		System.out.println("Constructor called");
	}
   public String getMessage() {
	   System.out.println("Messanger class loaded by  "+Messanger.class.getClassLoader());
	   return "This is the message comming from Message class";
   }
}
