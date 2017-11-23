package com.dependson.util;

import java.io.IOException;
import java.util.Properties;

public class CityNamesAcessor implements IAcessor{
	private String cityName; 
	 public CityNamesAcessor(String cityName) {
		 this.cityName=cityName;
	}
	@Override
	public String geyKey() {
		return cityName;
	}

	@Override
	public Object getData() {
		 Properties props = new Properties();
		 try {
			props.load(getClass().getClassLoader().getResourceAsStream("com/dependson/common/citynames.properties"));
			System.out.println("cityNames properties properties file object  "+props);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return props;
	}

}
