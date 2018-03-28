package com.cxf.rest.example.service.impl;

import org.springframework.stereotype.Service;

import com.cxf.rest.example.model.BookFlightRequest;
import com.cxf.rest.example.model.BookingDetailsResponse;
import com.cxf.rest.example.model.SearchFlightResponse;
import com.cxf.rest.example.service.FlightBookingAgencyService;

/**
 * 
 * @author Anil Kumar
 *
 */
@Service
public class FlightBookingAgencyServiceImpl implements FlightBookingAgencyService {

	
	
	@Override
	public SearchFlightResponse searchFlights(String source, String destination, String journeyDate) {
		return null;
	}

	@Override
	public BookingDetailsResponse bookFlight(BookFlightRequest bookFlightRequest) throws Exception {
		return null;
	}

}
