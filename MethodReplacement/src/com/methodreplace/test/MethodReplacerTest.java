package com.methodreplace.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.methodreplace.beans.PlanFinder;

public class MethodReplacerTest {
   public static void main(String[] args) {
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com//methodreplace//common//application-context.xml"));
	PlanFinder planFinder = factory.getBean("planFinder",PlanFinder.class);
	
	//Below two over loaded methods are belongs to proxy class not PlanFinder class
	String[] plans = planFinder.findPlan(20,"Male",10,"All",100);
	String[] plans1 = planFinder.findPlan(20,"Male",10);
	for(String plan : plans) {
		System.out.println("Plans for this 5-Arg method requirement is "+plan);
	}
	System.out.println("----------------------------------------------");
	for(String plan : plans1) {
		System.out.println("Plans for this 3-Arg method requirement is "+plan);
	}
}
}
