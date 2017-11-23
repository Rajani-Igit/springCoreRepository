package com.ibean.beans;

public class ByCycle {
private int id;
private String name;
private Chain chain;

public void setChain(Chain chain) {
	System.out.println("setter chain method");
	this.chain = chain;
}


public ByCycle(int id, String name) {
	System.out.println("constructor called");
	this.id = id;
	this.name = name;
}


public String toString() {
	return "ByCycle [id=" + id + ", name=" + name + ", chain=" + chain + "]";
}

}
