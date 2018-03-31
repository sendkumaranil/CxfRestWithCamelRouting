package com.cxf.rest.example.camel.transformer;

import org.apache.camel.Exchange;

import com.cxf.rest.example.model.BookFlightRequest;
import com.cxfsoap.example.resource.BookingDetailsRequest;
import com.cxfsoap.example.resource.PassengerList;

public class BookFlightRequestTransformer {

	public void bookFlightRequest(BookFlightRequest bookFlightRequest,Exchange exchange) {
		
		exchange.getIn().setBody(createBookFlightRequest(bookFlightRequest));
	}

	private BookingDetailsRequest createBookFlightRequest(BookFlightRequest bookFlightRequest) {
		BookingDetailsRequest request=new BookingDetailsRequest();
		request.setFlightId(bookFlightRequest.getFlightId());
		request.setGovtIdentityId(bookFlightRequest.getPassengerGovtid());
		request.setGovtIdentityType(bookFlightRequest.getIdType());
		request.setTotalFare(bookFlightRequest.getTotalFare());
		request.setTravelClass(bookFlightRequest.getTravelClass());
		request.setDepartDate(bookFlightRequest.getTravelDate());
		request.setNoOfAdults(bookFlightRequest.getAdults());
		request.setNoOfChildren(bookFlightRequest.getChildren());
		
		PassengerList passengerList=new PassengerList();		
		passengerList.setName(bookFlightRequest.getPassengerList());
		request.setPassengerList(passengerList);
		
		return request;
	}
}
