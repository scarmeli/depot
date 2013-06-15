package com.trainologic.springcourse;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSorter {
	
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("/META-INF/spring/app-context.xml");
		
		SorterImpl<Integer> sorter = factory.getBean(SorterImpl.class);
		
		Integer[] nums = sorter.sort(2,1,3);
		
		
		System.out.println(Arrays.toString(nums));
	}

}
