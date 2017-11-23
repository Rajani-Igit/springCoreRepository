package com.dcheck.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dcheck.beans.Car;

public class DependencyCheckTest {
public static void main(String[] args) {
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com//dcheck//common/application-context.xml"));
	Car car=(Car) factory.getBean("car",Car.class);
	System.out.println(car);
}
}
