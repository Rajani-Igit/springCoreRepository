package com.bi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bi.beans.Bus;
import com.bi.beans.Car;

public class InheritanceTest {
  public static void main(String[] args) {
	BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com//bi//common//application-context.xml"));
//	Car car = (Car)factory.getBean("car",Car.class);
//	Car car1 = (Car)factory.getBean("car1",Car.class);
	Bus bus = (Bus)factory.getBean("bus",Bus.class);
	System.out.println(bus);
	//System.out.println("First car  "+car);
	//System.out.println("second car  "+car1);
	System.out.println(bus);
}
}
