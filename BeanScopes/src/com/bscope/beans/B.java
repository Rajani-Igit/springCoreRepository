package com.bscope.beans;

public class B {
public static void main(String[] args) {
	A a;
	try {
		a = A.getInstance();
		System.out.println(a);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
