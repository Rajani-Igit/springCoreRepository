package com.bscope.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bscope.beans.FmRadio;

public class BeanScopeTest {
public static void main(String[] args) {
	BeanFactory factory =new XmlBeanFactory(new ClassPathResource("com//bscope//common//application-context.xml"));
	FmRadio fmradio = factory.getBean("fmRadio", FmRadio.class);
	FmRadio fmradio1 = factory.getBean("fmRadio", FmRadio.class);
	System.out.println(fmradio);
	System.out.println(fmradio1);
}
}
