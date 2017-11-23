package com.springsingle.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springsingle.beans.DateConverter;

public class SingletonTest {
public static void main(String[] args) {
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com//springsingle//common//application-context.xml"));
	DateConverter dateConverter1 = factory.getBean("dateConverter",DateConverter.class);
	DateConverter dateConverter2 = factory.getBean("dateConverter",DateConverter.class);
	
	System.out.println(dateConverter1);
	System.out.println(dateConverter2);
	
	System.out.println(dateConverter1.hashCode());
	System.out.println(dateConverter2.hashCode());
    }
 }
