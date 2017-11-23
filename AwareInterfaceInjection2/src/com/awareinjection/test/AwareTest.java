package com.awareinjection.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.awareinjection.beans.Radio;

public class AwareTest {
   public static void main(String[] args) {
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com//awareinjection//common//application-context.xml"));
	Radio radio = factory.getBean("radio", Radio.class);
	radio.play();
}
}
