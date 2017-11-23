package com.instancefactory.beans;

public class StackTrade implements IStackTrade {
    
	/* 
	 *This method is used tto find the price for given stackName 
	 *actually it is part of BSE StackExcahnge in our usecase  	 
	 */
	@Override
	public double getStackPrice(String stackName) {
		System.out.println("getStackPrice method of StackTrade");
		System.out.println(stackName+" For the given stack price is  ");
		if(stackName.equalsIgnoreCase("cipla")) {
			return 800.00f;
		}
		else if(stackName.equalsIgnoreCase("ranboxy")) {
			return 700.44f;
		}
		else {
			return 444.44f;			
		}
	}

}
