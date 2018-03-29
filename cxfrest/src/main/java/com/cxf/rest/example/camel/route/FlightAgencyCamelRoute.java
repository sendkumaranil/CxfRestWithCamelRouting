package com.cxf.rest.example.camel.route;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.component.cxf.CxfConstants;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.http.MediaType;

public class FlightAgencyCamelRoute extends SpringRouteBuilder {

	@Override
	public void configure() throws Exception {
		
		from("direct:moryaairlines").routeId("moryaairlines")
		.bean("SearchFlightRequestTransformer", "searchFlightRequest")
		.setHeader(Exchange.CONTENT_TYPE,constant(MediaType.APPLICATION_XML))
		.setHeader(CxfConstants.OPERATION_NAME, constant("getFlightDetails"))
		.setExchangePattern((ExchangePattern.InOut))
		.to("moryaAirlinesEndpoint")
		.bean("SearchFlightResponseTransformer", "searchFlightResponse").end();		
	}

}
