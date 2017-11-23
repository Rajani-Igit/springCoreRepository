package com.beanlifecycle.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.beanlifecycle.beans.Rocket;
import com.beanlifecycle.beans.ShutDownHookup;
public class BeanLifeCycleTest {
 
   public static void main(String[] args) throws InterruptedException {
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com//beanlifecycle//common//application-context.xml"));
	ShutDownHookup shutDownHookup = factory.getBean("shutDownHookup", ShutDownHookup.class);
	Runtime runtime = Runtime.getRuntime();
	
  //Register the HookUpClass with JVM so when and ever it is terminating it will call automatically
	runtime.addShutdownHook(new Thread(shutDownHookup));
	
	
	
	Rocket rocket = factory.getBean("rocket",Rocket.class);
	System.out.println(rocket);
	System.exit(0);
	System.out.println("last line by jvm");
	//There are several ways program can be terminated
	//System.exit(0);
	
	// ((ConfigurableListableBeanFactory)factory).destroySingletons();
	
	/*
	 //dangling pointer
	  rocket = null;
	  System.gc();*/
	 
}
}
