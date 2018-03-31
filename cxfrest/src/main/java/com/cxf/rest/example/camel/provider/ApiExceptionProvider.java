package com.cxf.rest.example.camel.provider;


import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.cxf.rest.example.camel.exception.ValidationException;
import com.cxf.rest.example.model.ErrorResponse;

@Provider
public class ApiExceptionProvider implements ExceptionMapper<Exception> {

	
	@Override
	public Response toResponse(Exception validateException) {
		
			if(validateException.getCause() instanceof ValidationException) {
				ValidationException exp=(ValidationException)validateException.getCause();
				
				ErrorResponse errorResponse=new ErrorResponse();
				errorResponse.setErrorDescription(exp.getDescription());
				errorResponse.setErrorCode(exp.getErrorCode());		
				errorResponse.setSeverity(exp.getSeverity());
				errorResponse.setSourceList(exp.getSources());
				errorResponse.setDestinationList(exp.getDestinations());
				
				return Response.status(Status.BAD_REQUEST).entity(errorResponse).build();				
			}
			return Response.status(Status.INTERNAL_SERVER_ERROR).build();
	}
}
