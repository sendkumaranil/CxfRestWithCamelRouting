package com.cxf.rest.example.camel.transformer;

import java.util.ArrayList;
import java.util.List;

import com.cxf.rest.example.camel.exception.ValidationException;
import com.cxf.rest.example.model.SearchFlightDetails;
import com.cxf.rest.example.model.SearchFlightResponse;
import com.cxfsoap.example.resource.ErrorResponse;
import com.cxfsoap.example.resource.FlightDetails;
import com.cxfsoap.example.resource.FlightDetailsResponse;

public class SearchFlightResponseTransformer {

	public SearchFlightResponse searchFlightResponse(FlightDetailsResponse flightDetailsResponse) throws Exception {
		SearchFlightResponse searchFlightResponse =new SearchFlightResponse();
		List<SearchFlightDetails> searchFlightDetailslist=new ArrayList<>();
		
		List<FlightDetails> detailsResponse=flightDetailsResponse.getFlightdetails();
		ErrorResponse errorResponse=flightDetailsResponse.getFaultDetails();
		if(errorResponse!=null) {
			com.cxf.rest.example.model.ErrorResponse errResponse=new com.cxf.rest.example.model.ErrorResponse();
			errResponse.setErrorCode(errorResponse.getErrorCode());
			errResponse.setErrorDescription(errorResponse.getDescription());
			errResponse.setSeverity(errorResponse.getErrSeverity().toString());
			
			//throw new ValidationException("Validation Exception Occurred:"+errorResponse.getDescription(),errResponse);
		}
				
		for(FlightDetails details:detailsResponse) {
			SearchFlightDetails searchFlightDetail =new SearchFlightDetails();
			searchFlightDetail.setFlightId(details.getFlightId());
			searchFlightDetail.setFlightName(details.getFlightName());
			searchFlightDetail.setSource(details.getSource());
			searchFlightDetail.setDestination(details.getDestination());
			searchFlightDetail.setDepTime(details.getDepTime());
			searchFlightDetail.setTravelHours(details.getDuration());
			searchFlightDetail.setTravelDate(details.getDepartDate());
			searchFlightDetail.setStop(details.getTotalStop());
			StringBuilder stringBuilder=new StringBuilder();
			for(String airport:details.getStopageAirports()) {
				stringBuilder.append(airport+",");
			}
			searchFlightDetail.setStopageAirport(stringBuilder.toString());
			searchFlightDetail.setTotalFare(details.getTotalFare());
			
			searchFlightDetailslist.add(searchFlightDetail);
		}
		searchFlightResponse.setFlightDetails(searchFlightDetailslist);
		
		return searchFlightResponse;
	}
}
