package com.mehanika.framework.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.mehanika.framework.core.RequestHandler;

import  com.mehanika.framework.core.Request;

/**
 * 
 * @author jpech
 *
 * @param <OutputType>
 */
public class ValidationHandler<OutputType> implements RequestHandler<Request, OutputType>{

	private RequestHandler<Request, OutputType> inner;
	
	private List<Validator<Request>> validators;
	
	public ValidationHandler(RequestHandler<Request, OutputType> inner,
			List<Validator<Request>> validators) {
	
		this.inner = inner;
		this.validators = validators;
	}

	public OutputType handle(Request request) {
		
		Collection<ValidationFailure> errors = new ArrayList<ValidationFailure>();
		
		for(Validator<Request> currentValidator : validators){
			
			ValidationResult currentResult = currentValidator.validate(request);
			
			errors.addAll(currentResult.getErrors());
		}
		
		if(!errors.isEmpty()){
			
			return null;
		}
		
		
		return inner.handle(request);
	}

}
