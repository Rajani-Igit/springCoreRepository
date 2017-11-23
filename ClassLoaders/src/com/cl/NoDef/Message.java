package com.cl.NoDef;

public class Message {
	public void main() {
		System.out.println("This is inside Message Class");
		System.out.println("This class is loaded by "+Message.class.getClassLoader());
	}
}
