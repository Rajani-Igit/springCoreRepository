package com.springsingle.beans;

import java.util.Date;

public class Meeting {
	private String startDate;
	private Date endDate;
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	DateTimeConverter dateTimeConverter;
	
	public DateTimeConverter getDateTimeConverter() {
		return dateTimeConverter;
	}
	public void setDateTimeConverter(DateTimeConverter dateTimeConverter) {
		this.dateTimeConverter = dateTimeConverter;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	/**
	 *This method uses the functionality of DateTimeConverter to reverse the formats
	 *
	 */
	public void reverseConversion() {
		String stringEndDate = dateTimeConverter.fomat(endDate);
		//Date  dateStartDate = dateTimeConverter.parse(startDate);
		System.out.println(stringEndDate +"   we reversed the formats of the dates and the messae is    :"+dateTimeConverter.getMessage(message));
	}

}
