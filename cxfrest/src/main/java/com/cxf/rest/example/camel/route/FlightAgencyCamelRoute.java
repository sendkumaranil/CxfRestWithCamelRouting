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
		
		from("direct:start").routeId("moryaairlines")
		.bean("searchFlightRequestBean", "searchFlightRequest")
		.setHeader(Exchange.CONTENT_TYPE,constant(MediaType.APPLICATION_XML))
		.setHeader(CxfConstants.OPERATION_NAME, constant("getFlightDetails"))
		.setExchangePattern((ExchangePattern.InOut))
		.to("cxf:bean:moryaAirlinesEndpoint")
		.bean("searchFlightResponseBean", "searchFlightResponse").end();		
	}

}
