package com.cc.beans;

public class Machine {
	private int id;
	private String name;
    private int productNo;
	public Machine(String name,int id, int productNo) {
		System.out.println("constructor called");
		this.id = id;
		this.name = name;
		this.productNo = productNo;
	}
	public String toString() {
		return "Machine [id=" + id + ", name=" + name + ", productNo=" + productNo + "]";
	}   
	
}
