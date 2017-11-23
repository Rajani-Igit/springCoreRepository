package com.cm.beans;

import java.util.List;

public class Meeting {
	private List<String> participents;

	public void setParticipents(List<String> participents) {
		this.participents = participents;
		System.out.println("setter method of meeting");
	}

	@Override
	public String toString() {
		return "Meeting [participents=" + participents + "]";
	}
	

}
