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
 * Main request handler
 * 
 * @author Josué Pech Ucán
 *
 * @param <InputType> Request type
 * @param <OutputType> Response type
 */
public interface RequestHandler<InputType extends Request,OutputType> {

	/**
	 * Handle the request and respond the handling result
	 * 
	 * @param request Request to handle
	 * @return Response
	 */
	public OutputType handle(InputType request);
}
