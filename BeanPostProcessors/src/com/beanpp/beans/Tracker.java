package com.beanpp.beans;

import java.util.concurrent.atomic.AtomicInteger;

public class Tracker {
  private static AtomicInteger counter = new AtomicInteger(0);
  public static void runCounter() {
	counter.incrementAndGet();  
  }
public static int getOut() {
	return counter.get();
}
  
}
