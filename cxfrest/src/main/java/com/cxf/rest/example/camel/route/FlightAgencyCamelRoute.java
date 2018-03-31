package com.cxf.rest.example.camel.route;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.component.cxf.CxfConstants;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@SuppressWarnings("deprecation")
@Component
public class FlightAgencyCamelRoute extends SpringRouteBuilder {

	@Override
	public void configure() throws Exception {
		
	from("direct:searchflights").routeId("searchFlightRouteId")
		.log("Search Flight Details Routing to Soap Request")
		.bean("searchFlightRequestBean", "searchFlightRequest")
		.setHeader(Exchange.CONTENT_TYPE,constant(MediaType.APPLICATION_XML))
		.setHeader(CxfConstants.OPERATION_NAME, constant("getFlightDetails"))
		.setExchangePattern((ExchangePattern.InOut))
		.to("cxf:bean:moryaAirlinesEndpoint")
		.log("Search Flight Details Routing to Soap Response")
		.bean("searchFlightResponseBean", "searchFlightResponse").end();	
		
	from("direct:bookflights").routeId("bookFlightRouteId")
		.log("Booking Flight Details Routing to Soap Request")
		.bean("bookFlightRequestBean", "bookFlightRequest")
		.setHeader(Exchange.CONTENT_TYPE,constant(MediaType.APPLICATION_XML))
		.setHeader(CxfConstants.OPERATION_NAME, constant("getBookingDetails"))
		.setExchangePattern((ExchangePattern.InOut))
		.to("cxf:bean:moryaAirlinesEndpoint")
		.log("Booking Flight Details Routing to Soap Response")
		.bean("bookFlightResponseBean", "bookFlightResponse").end();	
	}

}
