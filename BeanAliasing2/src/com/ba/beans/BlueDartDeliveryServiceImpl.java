package com.ba.beans;

public class BlueDartDeliveryServiceImpl implements ICourier{
private BlueDartParcelService bluedartparcelservice;

	public String deliver(String Address, int orderId) {
		System.out.println("This is ICourier implemented BlueDartService impl class");
		String dmessage=null;
		bluedartparcelservice =new BlueDartParcelService();
		dmessage = bluedartparcelservice.parcel(Address, orderId);
		return dmessage;
	}

}
