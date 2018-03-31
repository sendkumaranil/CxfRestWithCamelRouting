package com.cxf.rest.example.camel.exception;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class ValidationException extends Exception {
	
	private static final long serialVersionUID = 100090L;
	
	private final String description;
	private final String errorCode;
	private final String severity;
	private final List<String> sources;
	private final List<String> destinations;
	
	public ValidationException(@Value("") String message,@Value("desc") String description,
			@Value("") String errorCode,@Value("") String severity,@Value("") List<String> sources,@Value("") List<String> destinations) {
		super(message);
		this.description=description;
		this.errorCode=errorCode;
		this.severity=severity;
		this.sources=sources;
		this.destinations=destinations;
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
