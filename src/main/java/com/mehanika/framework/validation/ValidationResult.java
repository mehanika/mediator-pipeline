package com.mehanika.framework.validation;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 * @author jpech
 *
 */
public class ValidationResult {
	
	private Collection<ValidationFailure> errors = new ArrayList<ValidationFailure>();
	
	/**
	 * 
	 * @return
	 */
	public boolean isValid(){
		
		return errors.isEmpty();
	}

	/**
	 * 
	 * @return
	 */
	public Collection<ValidationFailure> getErrors(){
		
		return new ArrayList<ValidationFailure>(errors);
	}
}
