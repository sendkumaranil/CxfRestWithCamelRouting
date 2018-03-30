package com.cxf.rest.example.camel.exception;

import org.springframework.stereotype.Component;

import com.cxf.rest.example.model.ErrorResponse;


public class ValidationException extends RuntimeException {
	
	private static final long serialVersionUID = 100090L;

	private final transient ErrorResponse errorResponse;
	
	public ValidationException(String message,ErrorResponse errorResponse) {
		super(message);
		this.errorResponse=errorResponse;
	}
	
	public ErrorResponse getErrorResponse() {
		return errorResponse;
	}
}
