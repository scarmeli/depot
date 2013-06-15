package com.trainologic.springcourse;

import javax.annotation.PostConstruct;

public class HelloWorldImpl implements HelloWorld {
	
	private UserManager userManager;
	
	public HelloWorldImpl(UserManager userManager) {
		super();
		this.userManager = userManager;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Initializing Hello World");
	}




	/* (non-Javadoc)
	 * @see com.trainologic.springcourse.HelloWorld#hello()
	 */
	public String hello() {
 		return "Hello " + userManager.getCurrUsername();
	}

}
