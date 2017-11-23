package com.springsingle.beans;

import java.util.Date;

public class DateConverter {
  private Date fromDate;
  private Date toDate;
public Date getFromDate() {
	return fromDate;
}
public void setFromDate(Date fromDate) {
	this.fromDate = fromDate;
}
public Date getToDate() {
	return toDate;
}
@Override
public String toString() {
	return "DateConverter [fromDate=" + fromDate + ", toDate=" + toDate + "]";
}
public void setToDate(Date toDate) {
	this.toDate = toDate;
}
  
}
