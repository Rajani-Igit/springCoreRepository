package com.ibean.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ibean.beans.ByCycle;

public class BeanTest {
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com//ibean//common//application-context.xml"));
		ByCycle bycycle=(ByCycle)factory.getBean("bycycle",ByCycle.class);
		System.out.println(bycycle);
		//System.out.println(factory.getBean("chain"));
	}

}
