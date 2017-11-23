package com.cdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cdi.beans.College;

public class CollegeTest {
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com//cdi//common//application-context.xml"));
		College college = factory.getBean("college",College.class);
		System.out.println(college);
	}

}
