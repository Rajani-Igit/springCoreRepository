package com.beanlifecycle.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class ShutDownHookup implements Runnable,BeanFactoryAware {
    
	private BeanFactory factory;
	/**
	 * It is an aware interface injection.to perform destruction activity before ioc application is going
	 * to terminate.but ioc container dont know when it is going to terminate.but jvm knows 
	 * when it is going to terminate.so we have to hookup our class with jvm so that jvm will call 
	 * one call back method from our HookUp class
	 */
	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		// TODO Auto-generated method stub
		this.factory = factory;
		System.out.println("setBeanFactory method called from ShutDownHookup class");
		
	}

	@Override
	public void run() {
		System.out.println("before destroying run method");
		((ConfigurableListableBeanFactory)factory).destroySingletons();
	}

}
