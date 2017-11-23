package com.propertyeditor.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.propertyeditor.beans.Book;

public class PropertyEditorTest {
   public static void main(String[] args) {
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com//propertyeditor//common//application-context.xml"));
	Book book = factory.getBean("book",Book.class);
	System.out.println("Published Date   "+book.getPublishedDate());
	System.out.println("Website   "+book.getSite());
	System.out.println("File Location   "+book.getTocFile());
	System.out.println("isdn number   "+book.getIsdn());
	System.out.println("Name of the book   "+book.getName());
	System.out.println("Authors to the book  "+book.getAuthors());
}
}
