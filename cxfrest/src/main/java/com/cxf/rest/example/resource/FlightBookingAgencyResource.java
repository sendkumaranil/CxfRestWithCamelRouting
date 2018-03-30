package com.cxf.rest.example.resource;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;

import com.cxf.rest.example.model.BookFlightRequest;
import com.cxf.rest.example.model.BookingDetailsResponse;
import com.cxf.rest.example.model.SearchFlightResponse;
import com.cxf.rest.example.model.SourceDestinationList;
import com.cxf.rest.example.service.FlightBookingAgencyService;
import com.cxf.rest.example.util.FlightBookingAgencyValidator;
/**
 * 
 * @author Anil Kumar
 *
 */
@Resource
public class FlightBookingAgencyResource {

	@Autowired
	private FlightBookingAgencyService service;
	@Autowired
	private FlightBookingAgencyValidator validate;
	
	@GET
	@Path("/search")
	@Produces(MediaType.APPLICATION_JSON)
	public Response searchFlights(@QueryParam("source") String source,
			@QueryParam("destination") String destination,@QueryParam("travel_date") String journeyDate) {
		
		SearchFlightResponse response=null;
		SourceDestinationList sourceDestinationList =validate.validateSourceDestination(source, destination);
		
		if(sourceDestinationList == null) {
			response=service.searchFlights(source, destination, journeyDate);
			return Response.ok().entity(response).build();
		}else {
			return Response.ok(Status.BAD_REQUEST).entity(sourceDestinationList).build();
		}
	}
	
	@POST
	@Path("/booking")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response bookFlight(BookFlightRequest bookFlightRequest) {
		BookingDetailsResponse bookingDetailsResponse =null;
		try {
			bookingDetailsResponse=service.bookFlight(bookFlightRequest);
		}catch(Exception e){
			return Response.ok(Status.BAD_REQUEST).entity(e.getMessage()).build();
		}
		return Response.ok().entity(bookingDetailsResponse).build();
	}
}
