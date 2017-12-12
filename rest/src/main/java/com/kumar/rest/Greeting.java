package com.kumar.rest;

public class Greeting {

	private long id;
	private String greeting;
	
	public Greeting(long id, String greeting) {
		super();
		this.id = id;
		this.greeting = greeting;
	}

	public long getId() {
		return id;
	}

	public String getGreeting() {
		return greeting;
	}

}
