package com.cl.pvisibility;

public class Runner {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Messanger msg = new Messanger();
		System.out.println("this is the main class");
		System.out.println("Runner class is loaded by  "+Runner.class.getClassLoader());
		System.out.println(msg.getMessage());
		//Class clazz = Class.forName("com.cl.pvisibility.Messanger",true,Runner.class.getClassLoader());
		//Object obj = clazz.newInstance();
		
	}

}
