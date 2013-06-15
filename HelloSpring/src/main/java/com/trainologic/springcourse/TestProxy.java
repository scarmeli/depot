package com.trainologic.springcourse;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class TestProxy {
	
	public static void main(String[] args) {
		MyInterface myIf = (MyInterface) Proxy.newProxyInstance(TestProxy.class.getClassLoader(), 
				new Class[]{MyInterface.class}, new InvocationHandler() {
					
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						System.out.println("Invoking method " + method.getName() + " with args " + Arrays.toString(args));
						return null;
					}
				});
		
		
		myIf.bar("Hello");
		myIf.foo();
	}

}
