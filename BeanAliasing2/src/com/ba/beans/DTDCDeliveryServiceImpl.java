package com.ba.beans;

public class DTDCDeliveryServiceImpl implements ICourier{
  private DTDCParcelService dtdcparcelservice;
	public String deliver(String Address, int orderId) {
		System.out.println("This is Icourier implemented DTDCDelivery service class");
		String dmessage=null;
		dtdcparcelservice =new DTDCParcelService();
		dmessage = dtdcparcelservice.parcel(Address, orderId);
		return dmessage;
	}

}
