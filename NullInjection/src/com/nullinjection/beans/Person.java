package com.nullinjection.beans;

public class Person {
	private Integer ssid;
	private String name;
	private String address;
	public Person(Integer ssid, String name, String address) {
		super();
		System.out.println("constructor called");
		this.ssid = ssid;
		this.name = name;
		this.address = address;
	}
	public String toString() {
		return "Person [ssid=" + ssid + ", name=" + name + ", address=" + address + "]";
	}
    
}
