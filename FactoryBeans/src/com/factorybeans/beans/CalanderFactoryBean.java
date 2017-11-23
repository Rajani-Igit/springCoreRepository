package com.factorybeans.beans;
import java.util.Calendar;

import  org.springframework.beans.factory.FactoryBean;

public class CalanderFactoryBean implements FactoryBean<Calendar>
{
	private int date;
	private int month;
	private int year;
	

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public Calendar getObject() throws Exception {
		System.out.println("getObject of CalenderFactoryBean class called");
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, date);
		return calendar;
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("getObjectType method in calander factorybean class called");
		// TODO Auto-generated method stub
		return Calendar.class;
	}

	@Override
	public boolean isSingleton() {
		System.out.println("isSingleton method of Calander Factory Bean class called");
		return false;
	}

	@Override
	public String toString() {
		return "CalanderFactoryBean [date=" + date + ", month=" + month + ", year=" + year + "]";
	}

}
