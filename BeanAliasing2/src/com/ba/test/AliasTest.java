package com.ba.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.OrderManager;

public class AliasTest {
	private static List<String> selecteditems;
	private String Address;
	private int ZipCode;
public static void main(String[] args) {
	selecteditems=new ArrayList<String>();
	selecteditems.add("Jeans");
	selecteditems.add("Bags");
	selecteditems.add("Shirts");
	BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/ba/common/application-context.xml"));
	OrderManager orderManager = factory.getBean("ordermanager", OrderManager.class);
	orderManager.processOrder(selecteditems, "JUTU, Kukatpally, Hyderabad, Telangana", 400344);
}
}
