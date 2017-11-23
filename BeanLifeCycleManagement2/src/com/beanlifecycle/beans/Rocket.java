package com.beanlifecycle.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Rocket implements BeanFactoryAware {
private int treshold;
private int level;
private int distance;

public int getLevel() {
	return level;
}

@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalize() method called");
	}

public void setLevel(int level) {
	System.out.println("setter method called");
	this.level = level;
}

@Override
public String toString() {
	return "Rocket [treshold=" + treshold + ", level=" + level + ", distance=" + distance + "]";
}

public Rocket(int treshold) {
	super();
	System.out.println("constructor called");
	this.treshold = treshold;
}

/**
 * This method is the life cycle method of spring bean.This method called by IOC Container
 * to perform post construction activity
 */
public void init() {
	System.out.println("init method called");
	distance = level * treshold;
}

/**
 * This method is the life cycle method of spring bean.This method called by IOC Container
 * to perform any resource closing bofore removing it from IOC Container
 */
public void destroy() {
   System.out.println("destory method called");	
}

@Override
public void setBeanFactory(BeanFactory factory) throws BeansException {
	System.out.println("Aware injection method called");
}

}
