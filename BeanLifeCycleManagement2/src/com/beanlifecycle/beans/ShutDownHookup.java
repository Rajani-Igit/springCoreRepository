package com.beanlifecycle.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class ShutDownHookup implements Runnable,BeanFactoryAware{
    private BeanFactory factory;
	@Override
	public void run() {
		System.out.println("run method call by jvm");
		// TODO Auto-generated method stub
		((ConfigurableListableBeanFactory)factory).destroySingletons();
		System.out.println("after destroy singletons method call");
	}

	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		// TODO Auto-generated method stub
		this.factory = factory;
	}

}
