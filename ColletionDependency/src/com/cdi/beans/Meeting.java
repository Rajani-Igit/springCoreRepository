package com.cdi.beans;

import java.util.List;
import java.util.Set;

public class Meeting {
	private List<String> todolist;
	private Set<String> candidates;
	public Meeting(Set<String> candidates) {
		super();
		System.out.println("constructor called");
		System.out.println("The Set type is "+candidates.getClass().getName());
		this.candidates = candidates;
	}
	public void setTodolist(List<String> todolist) {
		System.out.println("setter method called");
		System.out.println("The type of List is "+todolist.getClass().getName());
		this.todolist = todolist;
	}
	@Override
	public String toString() {
		return "Meeting [todolist=" + todolist + ", candidates=" + candidates + "]";
	}
}
