package com.nbf.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nbf.beans.Toy;

public class NestedBFTest {
   public static void main(String[] args) {
	BeanFactory parentfactory=new XmlBeanFactory(new ClassPathResource("com\\nbf\\common\\parent-context.xml"));
	BeanFactory childFactory =new XmlBeanFactory(new ClassPathResource("com\\nbf\\common\\child-context.xml"),parentfactory);
	Toy toy = (Toy)childFactory.getBean("toy",Toy.class);
	System.out.println(toy);
}
}
