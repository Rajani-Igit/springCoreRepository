package com.cinjection.beans;

import java.util.Date;

public class BlueDartServiceProvider implements ICourier {

	public String deliver(String orderdId, String adress) {
		// TODO Auto-generated method stub
		
		return "Your Orderd Id is  "+orderdId+"  Will be deliverd by  "+new Date().toString()+" to the Address  "+adress;
	}

}
