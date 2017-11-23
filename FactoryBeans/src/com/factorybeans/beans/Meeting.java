package com.factorybeans.beans;

import java.util.Calendar;
import java.util.List;

public class Meeting {
	private int meetingId;
	private String description;
	private Calendar dateMeeting;
	private List<String> participents;
	public int getMeetingId() {
		return meetingId;
	}
	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Calendar getDateMeeting() {
		return dateMeeting;
	}
	public void setDateMeeting(Calendar dateMeeting) {
		this.dateMeeting = dateMeeting;
	}
	public List<String> getParticipents() {
		return participents;
	}
	public void setParticipents(List<String> participents) {
		this.participents = participents;
	}
	@Override
	public String toString() {
		return "Meeting [meetingId=" + meetingId + ", description=" + description + ", dateMeeting=" + dateMeeting.getTime()
				+ ", participents=" + participents + "]";
	}
}
