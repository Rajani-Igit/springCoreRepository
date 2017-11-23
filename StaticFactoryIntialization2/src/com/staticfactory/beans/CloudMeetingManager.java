package com.staticfactory.beans;

import java.util.Date;

public class CloudMeetingManager {
private String agenda;
private String description;
private DateConverter dateConverter;
public String getAgenda() {
	return agenda;
}
public void setAgenda(String agenda) {
	this.agenda = agenda;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public DateConverter getDateConverter() {
	return dateConverter;
}

public void setDateConverter(DateConverter dateConverter) {
	this.dateConverter = dateConverter;
}
   /**
   *This method is required to create entire meeting object rather than creating it many places.
   *where ever Meeting object require call this method
   *So that i can update in my google cloud 
   */
public void createMeeting(Date mDate) {
	String cDate = dateConverter.fomat(mDate);
	System.out.println("Meeting will be held on  "+cDate +" And Meeting info of CloudMeeting [agenda=" + agenda + ", description=" + description + "]" );
 }
}
