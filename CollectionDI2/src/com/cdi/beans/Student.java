package com.cdi.beans;

import java.util.List;
import java.util.Set;

public class Student 
{
private List<String> subjects;
private Set<String> courses;
public Student(Set<String> courses) {
	super();
	System.out.println("Constructor called ");
	System.out.println("Set implemented class type is "+courses.getClass().getName());
	this.courses = courses;
}
public void setSubjects(List<String> subjects) {
	System.out.println("Setter method called");
	System.out.println("List is a type of "+subjects.getClass().getName());
	this.subjects = subjects;
}
@Override
public String toString() {
	return "Student [subjects=" + subjects + ", courses=" + courses + "]";
}
}
