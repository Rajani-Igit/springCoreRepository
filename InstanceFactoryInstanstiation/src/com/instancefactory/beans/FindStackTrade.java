package com.instancefactory.beans;

public class FindStackTrade {

private IStackTrade iStackTrade;
private String stackName;

public IStackTrade getiStackTrade() {
	return iStackTrade;
}

public void setiStackTrade(IStackTrade iStackTrade) {
	this.iStackTrade = iStackTrade;
}
public String getStackName() {
	return stackName;
}

public void setStackName(String stackName) {
	this.stackName = stackName;
}

       /**
        *This method is used to getThe Price of the given task
        *Here we should not instantiate the ServiceLocator class
        *bcz my class should know the instantiate logic to create the Object.
        *And we can not call any method on this Concrete class reference bcz infuture if that method changes to 
        *AdvancedLocator we have to change the name
        */
 public Double getStackPrice(String stackName) {
	 System.out.println("getStackPrice method of FindStackTrade");
	 Double price = iStackTrade.getStackPrice(stackName);
	 return price;
 } 
}
