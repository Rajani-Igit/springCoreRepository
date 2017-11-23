package com.bscope.beans;

public class A {
	public static A instance;
int id=10;
String name="class A";
private A(){
	//dont remove this constructor

}
public static synchronized A getInstance() throws InterruptedException
{
	if(instance == null)
	{
		System.out.println("inside if");
		instance = new A();
	}
	return instance;
}
}
