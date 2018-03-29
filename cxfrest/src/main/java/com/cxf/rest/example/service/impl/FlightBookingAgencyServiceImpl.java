package com.cxf.rest.example.service.impl;

import javax.inject.Inject;

import org.apache.camel.ProducerTemplate;
import org.springframework.stereotype.Service;

import com.cxf.rest.example.model.BookFlightRequest;
import com.cxf.rest.example.model.BookingDetailsResponse;
import com.cxf.rest.example.model.SearchFlightRequest;
import com.cxf.rest.example.model.SearchFlightResponse;
import com.cxf.rest.example.service.FlightBookingAgencyService;

/**
 * 
 * @author Anil Kumar
 *
 */
@Service
public class FlightBookingAgencyServiceImpl implements FlightBookingAgencyService {

	@Inject
	private ProducerTemplate template;
	
	@Override
	public SearchFlightResponse searchFlights(String source, String destination, String journeyDate) {
		SearchFlightRequest flightRequest =new SearchFlightRequest();
		flightRequest.setSource(source);
		flightRequest.setDestination(destination);
		flightRequest.setTravelDate(journeyDate);
		
		return template.requestBody("direct:moryaairlines", flightRequest, SearchFlightResponse.class);
	}

	@Override
	public BookingDetailsResponse bookFlight(BookFlightRequest bookFlightRequest) throws Exception {
		return null;
	}

}
