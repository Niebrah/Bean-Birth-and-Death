package com.tutorialspoint;

public class HelloWorld3 {

	
	private String message;
	
	public void setMessage (String message) {
		this.message = message;
	}
	
	
	public void getMessage() {
		System.out.println("Your telegram: " + message);
	}
	
	public void init() {
		System.out.println("BIRTH");
	}
	
	public void destroy() {
		System.out.println("DEATH");
	}
	
	
	
}
