package com.cm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cm.beans.Meeting;

public class MergeTest {
public static void main(String[] args) {
	BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com\\cm\\common\\application-context.xml"));
	Meeting meeting = factory.getBean("standupcall", Meeting.class);
	System.out.println(meeting);
}
}
