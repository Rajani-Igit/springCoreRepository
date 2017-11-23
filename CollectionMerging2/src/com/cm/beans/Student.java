package com.cm.beans;

import java.util.List;

public class Student { 
	private List<String> subjects;

	public void setSubjects(List<String> subjects) {
		System.out.println("setter method of Student called");
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [subjects=" + subjects + "]";
	}
	

}
