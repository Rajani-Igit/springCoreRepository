package com.beanpp.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TrackingInstancesBeanPostProcessor implements BeanPostProcessor {

	//if you write here post processor logic it will be called before calling 
	//bean life cycle management methods
	@Override
	public Object postProcessBeforeInitialization(Object object, String beanName) throws BeansException {
		System.out.println("inside postProcessBeforeIntialization");
		return object;
	}
	
	//if you write here post processing logic it will be called after 
	//Bean life cycle management methods so here the object will be available in 
	//completely available state
	@Override
	public Object postProcessAfterInitialization(Object object, String beanName) throws BeansException {
		System.out.println("inside postProcessAfterIntialization");
		System.out.println("object is  "+object.getClass().getName());
		Tracker.runCounter();
		return object;
	}

}
