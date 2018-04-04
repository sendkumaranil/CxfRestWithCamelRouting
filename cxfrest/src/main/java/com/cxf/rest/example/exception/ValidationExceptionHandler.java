package com.cxf.rest.example.exception;

import org.springframework.stereotype.Component;

import com.cxf.rest.example.model.ErrorResponse;

@Component
public class ValidationExceptionHandler {

	public ErrorResponse validateHandleException(ValidationException exception) {
		
		ErrorResponse errorResponse=new ErrorResponse();
		
		errorResponse.setErrorCode(exception.getErrorCode());
		errorResponse.setErrorDescription(exception.getDescription());
		errorResponse.setSeverity(exception.getSeverity());
		errorResponse.setDestinationList(exception.getDestinations());
		errorResponse.setSourceList(exception.getSources());
		
		return errorResponse;
	}
}
