package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.Mobile;

public class BeanAliasTest {
public static void main(String[] args) {
	BeanFactory factory =new XmlBeanFactory(new ClassPathResource("com\\ba\\common\\application-context.xml"));
	Mobile samsungMobile=(Mobile) factory.getBean("s5",Mobile.class);
	System.out.println(samsungMobile);
	
	Mobile motrolaMobile=(Mobile) factory.getBean("g1",Mobile.class);
	System.out.println(motrolaMobile);
	String[] names=factory.getAliases("g1");
	System.out.println("no of names are available  :"+names.length);
	for(String name : names)
	{
		System.out.println(name);
	}
}
}
