package com.springsingle.beans;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;


public abstract class DateTimeConverter {
	
	/**
	 * If we defined our methods as static methods insted of singleton we can directly acess those methods but some problems are there
	 * Iwant to provide some more functionality to this in child class of this where as in static methods you can not over ride static methods
	 */
	//private static DateTimeConverter instance = null;
	//DateFormat dateFormat = null;
	
	
	/**
	 * This Private constructor does not allow any other people to acess from outside of the class 
	 *
	 */
	
/*	private DateTimeConverter() {
		System.out.println("inside constructor ofDateTimeConverter");
		dateFormat =  DateFormat.getDateInstance();		
	}*/
	/**
	 * This method is used to create and return the same class Object
	 *
	 */
	public static synchronized DateTimeConverter getInstance() {
		System.out.println("inside getInstance method of DateTimeConverter class");
		DateTimeZoneConverter dateTimeZoneConverter = DateTimeZoneConverter.getInstance();
		/*if(instance == null) {
			instance = new DateTimeConverter();
		}*/
		return dateTimeZoneConverter;
	}
	
	
	/**
	 * This method is used to convert the given Date into String
	 *
	 */	
    public synchronized String fomat(Date date) {
    System.out.println("inside formatt class");
    DateFormat dateFormat = DateFormat.getDateInstance();
	String formatteDate = null;
	formatteDate = dateFormat.format(date);
	return formatteDate;
    }

	/**
	 *This method is used to convert the given String to Date Object
	 *
	 */
	public synchronized Date parse(String date) {
		System.out.println("inside parse method of DateTimeConverter class");
		 DateFormat dateFormat = DateFormat.getDateInstance();
		Date parseDate = null;
		try {
			parseDate = dateFormat.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return parseDate;
	}
	
	public abstract String getMessage(String str);
}
