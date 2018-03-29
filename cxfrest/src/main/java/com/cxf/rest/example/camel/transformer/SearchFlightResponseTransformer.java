package com.cxf.rest.example.camel.transformer;

import java.util.ArrayList;
import java.util.List;

import com.cxf.rest.example.model.SearchFlightDetails;
import com.cxf.rest.example.model.SearchFlightResponse;
import com.cxfsoap.example.resource.ErrorResponse;
import com.cxfsoap.example.resource.FlightDetails;
import com.cxfsoap.example.resource.FlightDetailsResponse;
import com.cxfsoap.example.resource.GetFlightDetailsResponse;

public class SearchFlightResponseTransformer {

	public SearchFlightResponse searchFlightResponse(GetFlightDetailsResponse flightDetailsResponse) throws Exception {
		SearchFlightResponse searchFlightResponse =new SearchFlightResponse();
		List<SearchFlightDetails> searchFlightDetailslist=new ArrayList<>();
		
		FlightDetailsResponse detailsResponse=flightDetailsResponse.getReturn();
		ErrorResponse errorResponse=detailsResponse.getFaultDetails();
		if(errorResponse!=null) {
			throw new Exception(errorResponse.getErrorCode());
		}
		
		List<FlightDetails> flightDetails=detailsResponse.getFlightdetails();
		for(FlightDetails details:flightDetails) {
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
