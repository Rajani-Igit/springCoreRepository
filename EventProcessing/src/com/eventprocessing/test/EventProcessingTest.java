package com.eventprocessing.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.eventprocessing.beans.UpdateCitys;

public class EventProcessingTest {
   public static void main(String[] args) {
	//BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/eventprocessing/common/application-context.xml"));
	ApplicationContext context = new ClassPathXmlApplicationContext("com/eventprocessing/common/application-context.xml");
	UpdateCitys updateCitys = context.getBean("updateCitys", UpdateCitys.class);
	updateCitys.reloadCity(1,"Hyderabad");
}
}

