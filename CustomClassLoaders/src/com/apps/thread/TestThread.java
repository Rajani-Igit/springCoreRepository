package com.apps.thread;

import java.util.concurrent.FutureTask;


public class TestThread {
	public static void main(String[] args) {
		ThreadCreation tt=new ThreadCreation();
		  FutureTask futureTask = new FutureTask(tt);
		  futureTask.run();
		  System.out.println("hi");
		  try {
		   System.out.println(futureTask.get());
		   System.out.println("main thread will be finished by last");
		  } catch (Exception e) {
		  }
	}

	}
