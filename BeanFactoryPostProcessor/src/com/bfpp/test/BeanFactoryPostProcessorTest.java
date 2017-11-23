package com.bfpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.bfpp.beans.ConnectionFactory;

public class BeanFactoryPostProcessorTest {
	public static void main(String[] args) {
		/*BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/bfpp/common/application-context.xml"));
		BeanFactoryPostProcessor bfpp = factory.getBean("ppc",BeanFactoryPostProcessor.class );
		bfpp.postProcessBeanFactory((ConfigurableListableBeanFactory)factory);
		ConnectionFactory connectionFactory = factory.getBean("connectionFactory",ConnectionFactory.class);
		System.out.println(connectionFactory);*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bfpp/common/application-context.xml");
		ConnectionFactory connectionFactory = context.getBean("connectionFactory",ConnectionFactory.class);
		System.out.println(connectionFactory);
		
	}
}
