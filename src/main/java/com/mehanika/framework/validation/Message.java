package com.mehanika.framework.validation;

public class Message {
	
	private String message;
	
	private Object[] parameters;

	public Message(String message, Object... parameters) {
		
		this.message = message;
		this.parameters = parameters;
	}

	public String getMessage() {
		return message;
	}

	public Object[] getParameters() {
		return parameters;
	}
	
	

}
