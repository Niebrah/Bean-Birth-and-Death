package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//there is a bean called HelloWorld which is its id, its value is different
		HelloWorld3 obj = (HelloWorld3) context.getBean("HelloWorld");
		obj.getMessage();
		context.registerShutdownHook();
	}

}
