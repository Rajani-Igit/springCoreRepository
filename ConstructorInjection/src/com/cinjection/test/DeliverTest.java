package com.cinjection.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cinjection.beans.OrderdManager;

public class DeliverTest {
public static void main(String[] args) {
	BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/cinjection/common/application-context.xml"));
	OrderdManager orderdmanager= factory.getBean("ordermanager", OrderdManager.class);
	List<String> selectedItems =new ArrayList<String>();
	selectedItems.add("Jeans");
	selectedItems.add("Shoes");
	selectedItems.add("MobilePhones");
	selectedItems.add("Laptop");
	orderdmanager.processOrder(selectedItems,"Kukatpally,HNO-5-39,Near JNTU","101025FS");
	}
}
