package com.mehanika.framework.mediator;

import java.util.ArrayList;
import java.util.List;

import  com.mehanika.framework.core.*;


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
 * Taken from http://lostechies.com/jimmybogard/2014/09/09/tackling-cross-cutting-concerns-with-a-mediator-pipeline/
 * 
 * @author Josué Pech Ucán
 *
 * @param <OutputType> Response type
 */
public class MediatorPipeline<OutputType> implements RequestHandler<Request, OutputType>{

	private List<PreRequestHandler<Request>> preRequestHandlers = new ArrayList<PreRequestHandler<Request>>();
	
	private List<PostRequestHandler<Request, OutputType>> postRequestHandlers = new ArrayList<PostRequestHandler<Request,OutputType>>();
	
	private RequestHandler<Request, OutputType> inner = null;
	
	/**
	 * 
	 * @param preRequestHandlers Handlers executed before main request handler
	 * @param postRequestHandlers Handlers executed after main request handler
	 * @param inner Main request handler
	 */
	public MediatorPipeline(
			List<PreRequestHandler<Request>> preRequestHandlers,
			List<PostRequestHandler<Request, OutputType>> postRequestHandlers,
			RequestHandler<Request, OutputType> inner) {
		
		this.preRequestHandlers = preRequestHandlers;
		this.postRequestHandlers = postRequestHandlers;
		this.inner = inner;
	}



	/**
	 * Handle de request using before an after request handlers
	 */
	public OutputType handle(Request request) {
		
		for(PreRequestHandler<Request> currentPreRequestHandler : preRequestHandlers){
			
			currentPreRequestHandler.handle(request);
		}
		
		OutputType result = inner.handle(request);
		
		for(PostRequestHandler<Request, OutputType> currentPostRequestHandler : postRequestHandlers){
			
			currentPostRequestHandler.handle(request, result);
		}
		
		return result;
	}

}
