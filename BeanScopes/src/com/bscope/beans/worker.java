package com.bscope.beans;

public class worker implements Runnable {
public void run() {
	System.out.println("inside run method");
	
	A a;
	try {
		Thread.sleep(20000);;
		a = A.getInstance();
		System.out.println("hashCode of clas A is  "+a.hashCode());
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
