package com.instancefactory.beans;

public class StackTradeServiceLocator {

	/**
    * This method is used to locate particular service it will provide the abstarction 
    * layer over lookup logic 
    */
public IStackTrade serviceLocator() {
	//Here we have to perform lookup operation
	System.out.println("inside service locator class ServiceLocate method");
	return new StackTrade();
}
}
