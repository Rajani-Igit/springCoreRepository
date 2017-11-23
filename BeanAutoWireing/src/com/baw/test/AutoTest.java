package com.baw.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.baw.beans.Roboat;

public class AutoTest {
public static void main(String[] args) {
	BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com//baw//common//application-context.xml"));
	Roboat roboat = (Roboat)factory.getBean("roboat",Roboat.class);
	System.out.println(roboat);
}
}
