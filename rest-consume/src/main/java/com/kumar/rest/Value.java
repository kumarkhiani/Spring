package com.kumar.rest;

public class Value {

	private long id;
	private String quote;
	
	public long getId() {
		return id;
	}

	public String getQuote() {
		return quote;
	}
	
	@Override
	public String toString() {
		return "Value { " + id + ", " + quote + " } ";
	}
}
