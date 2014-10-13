package com.mehanika.framework.core;

/*
 *  Copyright (C) 2011 Josu� Pech Uc�n
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

/**
 * Handles the requests before it gets the main handler
 * 
 * @author Josu� Pech Uc�n
 *
 * @param <InputType> Request type
 */
public interface PreRequestHandler<InputType extends Request>{

	/**
	 * Handle de incoming request
	 * 
	 * @param request to handle
	 */
	public void handle(InputType request);
}
