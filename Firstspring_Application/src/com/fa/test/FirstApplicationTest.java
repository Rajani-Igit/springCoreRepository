package com.fa.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fa.beans.IMessageConverter;
import com.fa.beans.MessageWriter;

public class FirstApplicationTest {
	private IMessageConverter messageConverter;
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com\\fa\\common\\application-context.xml"));
		MessageWriter messageWriter= (MessageWriter)factory.getBean("messageWriter");
		messageWriter.writeMessage("Welcome to Spring First Program");
	}

}
