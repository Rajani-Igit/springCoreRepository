package com.beanlifecycle.beans;

public class Calculator {
   private int a;
   private int b;
     
    public Calculator(int a) {
    	this.a = a;
    	 System.out.println("Constructor called");
     }
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	private int sum;
	
	@Override
	public String toString() {
		return "Calculator [sum=" + sum + "]";
	}
	
	/**
	 * This method is part of bean Birth cycle so this will be called by IOC Container
	 */
	public void init() {
		System.out.println("init method called");
		sum = a+b;
	}
	public void destroy() {
		System.out.println("destroy method called");
	}
}
