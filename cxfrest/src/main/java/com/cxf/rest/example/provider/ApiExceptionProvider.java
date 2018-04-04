package com.cxf.rest.example.provider;


import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.cxf.rest.example.exception.ValidationException;
import com.cxf.rest.example.exception.ValidationExceptionHandler;
import com.cxf.rest.example.model.ErrorResponse;

@Provider
public class ApiExceptionProvider implements ExceptionMapper<Exception> {

	@Inject
	private ValidationExceptionHandler validateHandler;
	
	@Override
	public Response toResponse(Exception exception) {
		
		ErrorResponse errorResponse=handleException(exception);
		if(errorResponse != null) {
			return Response.status(Status.BAD_REQUEST).entity(errorResponse).build();	
		}
		
		return Response.status(Status.INTERNAL_SERVER_ERROR).build();
	}

	private ErrorResponse handleException(Exception exception) {
		
		if(exception.getCause() instanceof ValidationException) {
			
			ValidationException exp=(ValidationException)exception.getCause();
			
			return validateHandler.validateHandleException(exp);						
		}
		return null;
	}
}
