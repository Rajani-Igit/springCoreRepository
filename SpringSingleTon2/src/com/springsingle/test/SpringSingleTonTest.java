package com.springsingle.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springsingle.beans.DateTimeConverter;
import com.springsingle.beans.Meeting;

public class SpringSingleTonTest {
  public static void main(String[] args) {
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com//springsingle//common//application-context.xml"));
	Meeting meeting = factory.getBean("meeting",Meeting.class);
    meeting.reverseConversion();
    System.out.println("------------------------------------------");
    System.out.println("check how many instances will create to this classeTimeConverter dateTimeConverter1 = ");
    
}
}
