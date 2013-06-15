package com.trainologic.springcourse;

public class OrderManager {
	
	
	public void placeOrder() {
		System.out.println("The new Order " + createOrder());
	}
	
	
	public Order createOrder() {
		System.out.println("Here!!!!!!!");
		return new Order("From Code");
	}

}
