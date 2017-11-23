package com.beanlifecycle.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.beanlifecycle.beans.Rocket;
import com.beanlifecycle.beans.ShutDownHookup;

public class BeanLifeCycleTest {
   public static void main(String[] args) {
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com//beanlifecycle//common//application-context.xml"));
	//Register the hookup with JVM
	ShutDownHookup shutDownHookup = factory.getBean("shutDownHookup",ShutDownHookup.class);
	Runtime runtime= Runtime.getRuntime();
	runtime.addShutdownHook(new Thread(shutDownHookup));
	Rocket rocket = factory.getBean("rocket",Rocket.class);
	System.out.println(rocket);
}
}
