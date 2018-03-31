package com.cxf.rest.example.camel.transformer;

import java.util.ArrayList;
import java.util.List;

import com.cxf.rest.example.camel.exception.ValidationException;
import com.cxf.rest.example.model.SearchFlightDetails;
import com.cxf.rest.example.model.SearchFlightResponse;
import com.cxfsoap.example.resource.DestinationList;
import com.cxfsoap.example.resource.ErrorResponse;
import com.cxfsoap.example.resource.FlightDetails;
import com.cxfsoap.example.resource.FlightDetailsResponse;
import com.cxfsoap.example.resource.SourceList;

public class SearchFlightResponseTransformer {

	public SearchFlightResponse searchFlightResponse(FlightDetailsResponse flightDetailsResponse) throws ValidationException {
		SearchFlightResponse searchFlightResponse =new SearchFlightResponse();
		List<SearchFlightDetails> searchFlightDetailslist=new ArrayList<>();
		
		List<FlightDetails> detailsResponse=flightDetailsResponse.getFlightdetails();
		ErrorResponse errorResponse=flightDetailsResponse.getFaultDetails();
		List<String> sources=null;
		List<String> destinations=null;
		if(errorResponse!=null) {
			if("INVALID_SOURCE_DESTINATION".equals(errorResponse.getErrorCode())) {
				SourceList sourceList=flightDetailsResponse.getSourceList();
				DestinationList destinationList=flightDetailsResponse.getDestinationList();
				sources=sourceList.getSources();
				destinations=destinationList.getDestinations();
			}
			throw new ValidationException(errorResponse.getDescription(),errorResponse.getDescription(),
					errorResponse.getErrorCode(),errorResponse.getErrSeverity().toString(),sources,destinations);
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
