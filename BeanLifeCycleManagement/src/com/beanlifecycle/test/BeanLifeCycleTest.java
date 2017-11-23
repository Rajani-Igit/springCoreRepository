package com.beanlifecycle.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.beanlifecycle.beans.Calculator;

public class BeanLifeCycleTest {
   public static void main(String[] args) {
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com//beanlifecycle//common//application-context.xml"));
	Calculator calc = factory.getBean("calculator",Calculator.class);
	System.out.println(calc);
}
}
