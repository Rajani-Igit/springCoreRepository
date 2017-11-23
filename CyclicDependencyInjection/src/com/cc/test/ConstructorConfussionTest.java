package com.cc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cc.beans.A;

public class ConstructorConfussionTest {
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com//cc//common//application-context.xml"));
		factory.getBean("a",A.class);
		System.out.println("Beans are created");
	}

}
