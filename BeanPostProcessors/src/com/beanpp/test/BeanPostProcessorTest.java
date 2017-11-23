package com.beanpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.beanpp.beans.EBook;
import com.beanpp.beans.Tracker;
import com.beanpp.beans.TrackingInstancesBeanPostProcessor;
import com.beanpp.beans.Videos;

public class BeanPostProcessorTest {
  public static void main(String[] args) {
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/beanpp/common/application-context.xml"));
	BeanPostProcessor beanPostProcessor = factory.getBean("tibpp",BeanPostProcessor.class);
	((ConfigurableListableBeanFactory)factory).addBeanPostProcessor(beanPostProcessor);
	EBook eBook = factory.getBean("eBook",EBook.class);
	Videos videos = factory.getBean("videos",Videos.class);
	Tracker tracker = factory.getBean("tracker",Tracker.class);
	System.out.println(tracker.getOut());
}
}
