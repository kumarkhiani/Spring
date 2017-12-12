package com.kumar.rest;

public class Quote {

	private String type;
	private Value value;

	public String getType() {
		return type;
	}

	public Value getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return "Quote { type ="+ type + ", value =" + value + " } ";
	}
}
