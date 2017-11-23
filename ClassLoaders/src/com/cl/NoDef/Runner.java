package com.cl.NoDef;

public class Runner {
public static void main(String[] args) {
	System.out.println("This Runner class is loaded by  "+Runner.class.getClassLoader());
	Message msg = new Message();
	msg.main();
}
}
