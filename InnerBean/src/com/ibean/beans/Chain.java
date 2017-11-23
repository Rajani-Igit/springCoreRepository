package com.ibean.beans;

public class Chain {
	private String id;
	private int leng;
	public void setId(String id) {
		System.out.println("ids setter method");
		this.id = id;
	}
	public void setLeng(int leng) {
		System.out.println("lengths setter method");
		this.leng = leng;
	}
	public String toString() {
		return "Chain [id=" + id + ", leng=" + leng + "]";
	}
}
