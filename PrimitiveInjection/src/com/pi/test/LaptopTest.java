package com.pi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pi.beans.Laptop;

public class LaptopTest {
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com//pi//common//application-context.xml"));
		Laptop laptop=(Laptop)factory.getBean("laptop",Laptop.class);
		System.out.println(laptop);
	}

}
