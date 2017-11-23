package com.factorybeans.test;

import java.util.Calendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.factorybeans.beans.CalanderFactoryBean;
import com.factorybeans.beans.Meeting;

public class FactoryBeanTest {
  public static void main(String[] args) {
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com\\factorybeans\\common\\application-context.xml"));
	Meeting meeting = factory.getBean("meeting",Meeting.class);
	
	System.out.println("Meeting information is   "+meeting);
	
	CalanderFactoryBean cfb1 = factory.getBean("&calander",CalanderFactoryBean.class);
	CalanderFactoryBean cfb2 = factory.getBean("&calander",CalanderFactoryBean.class);
	
	CalanderFactoryBean cfb3 = factory.getBean("&calander",CalanderFactoryBean.class);
	System.out.println(cfb3.getClass().getName());
	
	System.out.println(cfb1);
	System.out.println(cfb2);
	
	Calendar calender1 = factory.getBean("calander",Calendar.class);
	Calendar calender2 = factory.getBean("calander",Calendar.class);
	
	System.out.println(calender1.hashCode());
	System.out.println(calender2.hashCode());
	  
	System.out.println("calender1 == calender2 : ?  "+ (calender1 == calender2) );
	
}
}
