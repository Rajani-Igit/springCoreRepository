package com.dependson.util;

import java.io.IOException;
import java.util.Properties;

public class IntrestRateAcessor implements IAcessor{
	 private String ri_key; 
	 public IntrestRateAcessor(String ri_key) {
		 this.ri_key=ri_key;
	}
	@Override
	public String geyKey() {
		return ri_key;
	}

	@Override
	public Object getData() {
		 Properties props = new Properties();
		 try {
			props.load(getClass().getClassLoader().getResourceAsStream("com/dependson/common/intrest_rate.properties"));
			System.out.println("Intrest Rate properties file object  "+props);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return props;
	}
}
