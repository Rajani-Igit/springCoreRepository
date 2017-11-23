package com.nullinjection.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nullinjection.beans.Person;

public class NullTest {
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com//nullinjection//common//application-context.xml"));
		Person person =(Person) factory.getBean("person",Person.class);
		System.out.println(person);
	}

}
