package com.mehanika.framework.validation;

public class ValidationFailure {

	private String property;
	
	private Object attemptedValue;
	
	private Message message;
	
	

	public ValidationFailure(String property, Object attemptedValue) {
	
		this.property = property;
		this.attemptedValue = attemptedValue;
	}
	
	public ValidationFailure(String property, Object attemptedValue,
			Message message) {
		this.property = property;
		this.attemptedValue = attemptedValue;
		this.message = message;
	}

	public String getProperty() {
		return property;
	}

	public Object getAttemptedValue() {
		return attemptedValue;
	}

	public Message getMessage() {
		return message;
	}
	
	
}
