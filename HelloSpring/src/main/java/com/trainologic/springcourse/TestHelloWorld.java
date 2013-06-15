package com.trainologic.springcourse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestHelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("/META-INF/spring/app-context.xml");
		
		HelloWorld hello = factory.getBean(HelloWorld.class);
		
		System.out.println(hello.hello());
	}

}
