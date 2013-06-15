package com.trainologic.springcourse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOrderManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("/META-INF/spring/app-context.xml");
		OrderManager om = factory.getBean(OrderManager.class);
		
		om.placeOrder();
		
		System.out.println(om.getClass());
	}

}
