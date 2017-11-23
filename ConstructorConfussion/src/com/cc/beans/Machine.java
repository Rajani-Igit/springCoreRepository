package com.cc.beans;

public class Machine {
	private int id;
	private String name;
	public String toString() {
		return "Machine [id=" + id + ", name=" + name + "]";
	}
	public Machine(int id) {
		super();
		System.out.println("id constructor called");
		this.id = id;
	}
	public Machine(String name) {
		super();
		System.out.println("name constructor called");
		this.name = name;
	}
		
}
