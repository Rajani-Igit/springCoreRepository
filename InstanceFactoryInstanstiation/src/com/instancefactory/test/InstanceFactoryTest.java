package com.instancefactory.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.instancefactory.beans.FindStackTrade;

public class InstanceFactoryTest {
  public static void main(String[] args) {
  BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com//instancefactory//common//application-context.xml"));
  FindStackTrade findStackTrade = factory.getBean("findStackTrade",FindStackTrade.class);
  System.out.println(findStackTrade.getStackPrice("cipla"));
}
}
