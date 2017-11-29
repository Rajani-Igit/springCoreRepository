package com.i18n.test;

import java.util.Locale;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.io.ClassPathResource;

public class I18NTest {
    public static void main(String[] args) {
    	
      /* Previous Examples for ResourceBundles are Written inside DependsOn Usecase Please Refer it.For Managing the ResourceBundles Through Java Codeing
        
        If you use BeanFactory to find particular bundle(messages.properties)we can do by this way
    	but the problem with this approach is we have to write the entire logic for creating the MessageSource Object
    	First we have to configure it in application-context.xml then create BeanFactory object, by using this Object we have to get
    	MessageSource object 
    	Not Exactly the MessageSource Object but its implementation class.It is an interface
    	There are two implementation classes are there
    	1---->ResourceBundleMessageSource
    	2---->ReloadableResourceBundleMessageSource
    	To Make it lossely coupled we have to provide Interface references
    	And BeanFactory is not supporting Internationalization by default where as 
    	ApplicationContext is Supporting Internationalization bcz it is implementing MessageResource 
    	and provided the implementation for unimplemented methods so with the help of applicationContext Object we can directly access this 
    	But how context object will know about our message bundles means we have to configure all our message and error bundles in configuration file
    	so at the time of creating the object for ResourceBundleMessageSource Objet it will identify the bean id as messageSource 
    	the same we have to configure in configuration file bcz it will be injected to ApplicationContext implemented class
    	In that class contains one attribute named with messageName so it will be injected through autowireing by name
    	and it will read all the properties files at one shot and placed inside ioc container 
    	the problem with the normal approach is for each and every bundle we have to write separate Resourcebundle object then it will be a problem 
    	means we can not identified which resourcebundle object refereing to which other Messages bundles one can not identified easily
    	The code will be clusterd .
    	To avoid these problems spring came up with a topic called spring internationalization it provides a support to avoid these problems
    	means we can read any no of Resource bundles at a time
    	*/
    	
/*		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/i18n/common/application-context.xml"));
		System.out.println("Chinese Locale "+ Locale.CHINA);
		MessageSource messageSource = factory.getBean("resourceBundle",MessageSource.class);
		String messageFromBeanFactory = messageSource.getMessage("to.required", null, Locale.CHINA);
		System.out.println(messageFromBeanFactory);*/
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/i18n/common/application-context.xml");
		System.out.println("ApplicationContext class Object type  "+applicationContext.getClass().getName());
		String messageFromApplivationContext = applicationContext.getMessage("title",null,Locale.getDefault());
		System.out.println("Message From ApplicationContext  "+messageFromApplivationContext);;
		
	}
}
