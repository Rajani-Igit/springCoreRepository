package com.cinjection.beans;

import java.util.List;

public class OrderdManager {
private ICourier courier;
public void processOrder(List<String> selectedItems,String adress,String orderdId) {
	//logic to check availability
	//Block that selectedItems By concurent lock
	String dmessage = courier.deliver(orderdId, adress);
	System.out.println(dmessage);
	System.out.println("Your selected items are  "+selectedItems+"  Items are stored into the the database");
}
public OrderdManager(ICourier courier)
{
this.courier=courier;	
}
}
