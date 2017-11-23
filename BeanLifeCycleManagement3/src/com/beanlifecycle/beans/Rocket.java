package com.beanlifecycle.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Rocket implements InitializingBean,DisposableBean,BeanFactoryAware {
   private int threshold;
   private int level;
   private double distance;
	
    public Rocket(int threshold) {
		super();
		System.out.println("Rocket Constructor called------>constructor injection");
		this.threshold = threshold;
	}
   
    public int getLevel() {
		return level;
	}
    
	public void setLevel(int level) {
		System.out.println("setLevel method from rocket class---->setter injection");
		this.level = level;
	}
    
	/**
	 *It is bean death lifecycle method will recognized and executed by the IOC Container
	 */
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy method from programetic approach------>Death life cycle");
		
	}
    
	/**
	 * It is Bean Birth Life cycle method this method will be recognized and executed by the IOC Container
	 *  after performing all the injection
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		distance = level*threshold;
		System.out.println("afterPropertiesSet method with programetic approach----->birth life cycle");
		
	}

	/**
	 *ToString method
	 */
	@Override
	public String toString() {
		return "Rocket [threshold=" + threshold + ", level=" + level + ", distance=" + distance + "]";
	}
    
	/**
	 *It is the BeanFactoryAware injection to perfom Aware interface injection
	 */
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setBeanFactory method called------>Aware injection");
	}
	
   
}
