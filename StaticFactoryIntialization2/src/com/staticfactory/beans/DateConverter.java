package com.staticfactory.beans;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateConverter {
  private static DateConverter instance;
  
  /**
   * Declared it as private so that no one can acess it from out side of this class
   *
   */
  private DateConverter() {
	  //Don't remove this converter
	  System.out.println("private constructor called ");
  }
  
  /**
   * This method is used to create the single instance of the same class
   *
   */
   public static synchronized DateConverter getInstance() {
	   if(instance == null) {
		   System.out.println("inside if block of Date Converter");
		   instance = new DateConverter();
	   }
	   return instance;
   }
   
   /**
	 * This method is used to convert the given Date into String
	 *
	 */	
   public synchronized String fomat(Date date) {
   System.out.println("inside formatt method of DateConverter class");
   DateFormat dateFormat = DateFormat.getDateInstance();
	String formatedDate = null;
	formatedDate = dateFormat.format(date);
	return formatedDate;
   }

	/**
	 *This method is used to convert the given String to Date Object
	 *
	 */
	public synchronized Date parse(String mDate) {
		System.out.println("inside parse method of DateTimeConverter class");
		 DateFormat dateFormat = DateFormat.getDateInstance();
		Date cDate = null;
		try {
			cDate = dateFormat.parse(mDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cDate;
	}
}
