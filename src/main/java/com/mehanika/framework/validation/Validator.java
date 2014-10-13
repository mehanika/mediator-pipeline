package com.mehanika.framework.validation;

/**
 * 
 * @author jpech
 *
 * @param <InputType>
 */
public interface Validator<InputType> {

	/**
	 * 
	 * @param entity
	 * @return
	 */
	public ValidationResult validate(InputType entity);
}
