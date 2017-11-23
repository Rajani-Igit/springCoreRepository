package com.staticfactory.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.staticfactory.beans.Meeting;

public class StaticFactoryTest {
public static void main(String[] args) {
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com//staticfactory//common//application-context.xml"));
	Meeting meeting = factory.getBean("meeting",Meeting.class);
	System.out.println(meeting);
}
}
