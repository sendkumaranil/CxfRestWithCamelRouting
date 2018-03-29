package com.cxf.rest.example.camel.transformer;

import org.apache.camel.Exchange;

import com.cxf.rest.example.model.SearchFlightRequest;
import com.cxfsoap.example.resource.FlightDetailsRequest;
import com.cxfsoap.example.resource.GetFlightDetails;

public class SearchFlightRequestTransformer {

	public void searchFlightRequest(SearchFlightRequest flightRequest,Exchange exchange) {
		exchange.getIn().setBody(createSearchFlightReqest(flightRequest));
	}

	private GetFlightDetails createSearchFlightReqest(SearchFlightRequest flightRequest) {
		
		GetFlightDetails flightDetails =new GetFlightDetails();
		
		FlightDetailsRequest flightDetailsRequest=new FlightDetailsRequest();
		flightDetailsRequest.setSource(flightRequest.getSource());
		flightDetailsRequest.setDestination(flightRequest.getDestination());
		flightDetailsRequest.setDepartDate(flightRequest.getTravelDate());
		
		flightDetails.setArg0(flightDetailsRequest);
		
		return flightDetails;
	}
}
