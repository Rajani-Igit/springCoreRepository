package com.pandcns.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pandcns.beans.Account;

public class AccountTest {
public static void main(String[] args) {
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com//pandcns//common//application-context1.xml"));
	Account account = (Account)factory.getBean("account", Account.class);
	System.out.println(account);
}
}
