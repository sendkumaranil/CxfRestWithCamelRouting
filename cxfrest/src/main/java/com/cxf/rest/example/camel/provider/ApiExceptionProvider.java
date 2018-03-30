package com.cxf.rest.example.camel.provider;

import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.cxf.rest.example.camel.exception.ValidationException;
import com.cxf.rest.example.model.ErrorResponse;

@Provider
public class ApiExceptionProvider implements ExceptionMapper<Exception> {

	/*@Inject
	private ValidationException validateException;*/
	
	@Override
	public Response toResponse(Exception exception) {
		
		if(exception instanceof ValidationException) {
			/*
			ErrorResponse errResponse=validateException.getErrorResponse();
			
			return Response.status(Status.BAD_REQUEST).entity(errResponse).build();*/
		}
		return Response.status(Status.BAD_REQUEST).entity(exception).build();
	}

}
