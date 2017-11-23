package com.customproperty.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.customproperty.beans.Metal;
import com.customproperty.util.CustomPropertyEditorRegistar;

public class CustomPropertyTest {
    public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com//customproperty//common//application-context.xml"));
		
		((ConfigurableListableBeanFactory)factory).addPropertyEditorRegistrar(new CustomPropertyEditorRegistar());
		Metal metal = factory.getBean("metal",Metal.class);
		System.out.println(metal);
	}
}
