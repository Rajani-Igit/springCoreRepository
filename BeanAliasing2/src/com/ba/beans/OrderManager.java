package com.ba.beans;

import java.util.List;
import java.util.Random;

public class OrderManager {
private ICourier dtdcdeliverservice;
private ICourier bluedartdeliverservice;
public void processOrder(List<String> selecteditems,String Address,int ZipCode)
{
	String dmessage =null;
	System.out.println("this is OrderManager class");
  	System.out.println("selected items are :"+selecteditems);
  	Random randomNumber =new Random();
  	int orderId = (randomNumber.nextInt(500000)+1);
  	System.out.println(orderId);
  	if(ZipCode >3000 && ZipCode <599500)
  	{
  		System.out.println("Citys will be deliverd by BlueDart people");
  		dmessage = bluedartdeliverservice.deliver(Address, orderId);
  		System.out.println(dmessage);
  	}
  	else
  	{
  		System.out.println("Towns will be deliverd by DTDC People");
  		dmessage  = dtdcdeliverservice.deliver(Address, orderId);
  		System.out.println(dmessage);
  	}
}
public void setDtdcdeliverservice(ICourier dtdcdeliverservice) {
	this.dtdcdeliverservice = dtdcdeliverservice;
}
public void setBluedartdeliverservice(ICourier bluedartdeliverservice) {
	this.bluedartdeliverservice = bluedartdeliverservice;
}
}
