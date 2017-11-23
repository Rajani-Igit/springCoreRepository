package com.ba.beans;

import java.util.Date;

public class BlueDartParcelService {
	public String parcel(String Address,int orderaID)
	{
		  System.out.println("This is BlueDart own Specific class");
		  return "Your Orderd Id is "+orderaID+" Will be deliverd by "+new Date().toString()+" to the "+Address+"  by BlueDart";
	}

}
