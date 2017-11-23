package com.springsingle.beans;

public class DateTimeZoneConverter extends DateTimeConverter{
    private static DateTimeZoneConverter instance;
    
    private  DateTimeZoneConverter() {
		// TODO Auto-generated constructor stub
	}
    
    /**
     * This method is used to create the DateTimeZoneConverter 
     * Object it is static factory method
     */
    public static synchronized DateTimeZoneConverter getInstance() {
    	if(instance == null) {
    		instance = new DateTimeZoneConverter();
    	}
    	return instance;
    }
    
    /**
     * This is the extra method defined inside DateTimeZoneConverter class
     *
     */
	public String getMessage(String message) {
	return message+"  DateTimeZoneConverter class";
   }
}
