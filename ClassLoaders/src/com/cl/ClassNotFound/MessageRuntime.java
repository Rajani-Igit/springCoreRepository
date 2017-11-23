package com.cl.ClassNotFound;

public class MessageRuntime {
	public void main() {
		System.out.println("This is inside Message Class");
		System.out.println("This class is loaded by "+MessageRuntime.class.getClassLoader());
	}
}
