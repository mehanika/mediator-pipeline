package com.mehanika.framework.core;

/*
 *  Copyright (C) 2011 Josué Pech Ucán
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
 * Process the response after the main handler was executed.
 * 
 * @author Josué Pech Ucan
 *
 * @param <InputType> Request type
 * @param <ResponseType> Response type
 */

public interface PostRequestHandler<InputType extends Request, ResponseType> {

	/**
	 * Request handler
	 * 
	 * @param request Request to handle
	 * @param response Request's response
	 */
	public void handle(InputType request, ResponseType response);
}
