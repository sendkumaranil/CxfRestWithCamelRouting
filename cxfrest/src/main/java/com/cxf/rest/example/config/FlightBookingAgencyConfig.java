package com.cxf.rest.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.cxf.rest.example.model.ErrorResponse;
/**
 * 
 * @author Anil Kumar
 *
 */
@Configuration
@ComponentScan(basePackages="com.cxf.rest.example")
@ImportResource({"classpath:cxf.xml","classpath:camel-config.xml"})
@PropertySource(value = { "classpath:application.properties"})
public class FlightBookingAgencyConfig {

	@Bean
	PropertySourcesPlaceholderConfigurer propertyConfig() {
		
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	ErrorResponse errorResponse() {
		return new ErrorResponse();
	}
}
