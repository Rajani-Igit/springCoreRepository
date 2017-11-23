package com.cm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cm.beans.Student;

public class MergeTest {
   public static void main(String[] args) {
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com\\cm\\common\\application-context.xml"));
	Student cseStudent=factory.getBean("CSEStudent",Student.class);
	System.out.println(cseStudent);
	
	Student ecestudent = factory.getBean("ECEStudent",Student.class);
	System.out.println(ecestudent);
}
}
