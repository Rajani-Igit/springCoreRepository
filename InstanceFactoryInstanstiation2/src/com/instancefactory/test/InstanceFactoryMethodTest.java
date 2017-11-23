package com.instancefactory.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.instancefactory.beans.GeoMapUI;

public class InstanceFactoryMethodTest {
  public static void main(String[] args) {
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com//instancefactory//common//application-context.xml"));
	GeoMapUI geoMapUI = factory.getBean("geoMapUI",GeoMapUI.class);
	geoMapUI.render();
}
}
