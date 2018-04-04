package com.cxf.rest.example.exception;

import java.util.List;


public class ValidationException extends RuntimeException {
	
	private static final long serialVersionUID = 100090L;
	
	private final String description;
	private final String errorCode;
	private final String severity;
	private final List<String> sources;
	private final List<String> destinations;
	
	public ValidationException() {
		this.description=null;
		this.errorCode=null;
		this.severity=null;		
		this.sources=null;
		this.destinations=null;		
	}
	
	public ValidationException(String message, String description,
			 String errorCode,String severity,List<String> sources,List<String> destinations) {
		super(message);
		this.description=description;
		this.errorCode=errorCode;
		this.severity=severity;
		this.sources=sources;
		this.destinations=destinations;
	}

	public ValidationException(String message,String description,
			 String errorCode,String severity) {
		super(message);
		this.description=description;
		this.errorCode=errorCode;
		this.severity=severity;		
		this.sources=null;
		this.destinations=null;
	}
	
	public ValidationException(String message) {
		super(message);
		this.description=null;
		this.errorCode=null;
		this.severity=null;		
		this.sources=null;
		this.destinations=null;
	}
	
	public String getDescription() {
		return description;
	}

	public String getErrorCode() {
		return errorCode;
	}


	public String getSeverity() {
		return severity;
	}

	public List<String> getSources() {
		return sources;
	}

	public List<String> getDestinations() {
		return destinations;
	}
}
