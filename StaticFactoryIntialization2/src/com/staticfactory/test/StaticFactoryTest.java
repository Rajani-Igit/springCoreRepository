package com.staticfactory.test;



import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.staticfactory.beans.CloudMeetingManager;
import com.staticfactory.beans.DateConverter;

public class StaticFactoryTest {
  public static void main(String[] args) {
	  
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com//staticfactory//common//application-context.xml"));
	CloudMeetingManager cloudMeetingManager = factory.getBean("cloudMeetingManager",CloudMeetingManager.class);
	cloudMeetingManager.createMeeting(new Date());
	
	DateConverter dc1 = factory.getBean("dateConverter",DateConverter.class);
	DateConverter dc2 = factory.getBean("dateConverter",DateConverter.class);
	
	System.out.println(dc1.hashCode());
	System.out.println(dc2.hashCode());
	
	DateConverter dc3=DateConverter.getInstance();
	
	System.out.println(dc3.hashCode());
}
}
