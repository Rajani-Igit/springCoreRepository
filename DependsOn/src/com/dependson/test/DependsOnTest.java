package com.dependson.test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.dependson.beans.LoanPlanner;

public class DependsOnTest {
   public static void main(String[] args)throws Exception {
	System.out.println("hiii");
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com//dependsOn//common//application-context.xml")); 
	//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("");
	LoanPlanner loadPlanner = factory.getBean("loanPlanner",LoanPlanner.class);
	loadPlanner.calculate(10000,20,"delhi");
	Locale locale = Locale.getDefault();
	/*Properties prop =System.getProperties();
	for(Object prop1 : prop.keySet())
	{
		System.out.println(prop1+"----------"+prop.getProperty((String)prop1));	
	}*/
	System.out.println("Locale information  "+locale +"  Locale Language "+            locale.getLanguage() +"  Locale Country  "+locale.getCountry());
	
	//Here we are fetching Bundle of resources Means here we are giving Base Name i.e Messages
	ResourceBundle resourceBundle = ResourceBundle.getBundle("com/dependson/common/Messages", locale);
	System.out.println("zzzzzzzzzzzz"+resourceBundle.getClass().getName());
	
	
	InputStream stream = DependsOnTest.class.getClassLoader().getResourceAsStream("com/dependson/common/Messages.properties");
	
	//Here it is expecting InputStream So we have to pass The Exact Location Of the File it is Implementation Class of ResourceBundle
	PropertyResourceBundle prb = new PropertyResourceBundle(stream);
	System.out.println("ProprtyResourceBundle  "+prb.getString("Appstek"));
	System.out.println("value for the given key "+resourceBundle.getString("Appstek"));
	/*for(Locale allLocale : Locale.getAvailableLocales()) {
		System.out.println("Country Name "+allLocale.getDisplayCountry()+"  CountryLanguage  "+allLocale.getLanguage());
	}*/
}
}
