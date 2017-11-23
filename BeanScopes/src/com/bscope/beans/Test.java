package com.bscope.beans;

public class Test {

	public static void main(String[] args) {
    worker worker = new worker();
    Thread t1 = new Thread(worker);
    Thread t2 = new Thread(worker);
    t1.start();
    t2.start();
    
	}
}
