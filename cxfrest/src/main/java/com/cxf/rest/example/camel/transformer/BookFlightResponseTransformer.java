package com.cxf.rest.example.camel.transformer;

import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.List;
import java.util.Map;

import javax.activation.DataHandler;

import org.apache.camel.Exchange;

import com.cxf.rest.example.camel.exception.ValidationException;
import com.cxf.rest.example.model.BookingDetailsResponse;
import com.cxfsoap.example.resource.ErrorResponse;
import com.cxfsoap.example.resource.PassengerList;

public class BookFlightResponseTransformer {

	public BookingDetailsResponse bookFlightResponse(com.cxfsoap.example.resource.BookingDetailsResponse detailsResponse,Exchange exchange) throws ValidationException {
		
		BookingDetailsResponse response =new BookingDetailsResponse();
		
		ErrorResponse errorResponse=detailsResponse.getFault();
		if(errorResponse!=null) {
			
			throw new ValidationException(errorResponse.getDescription(),errorResponse.getDescription(),
					errorResponse.getErrorCode(),errorResponse.getErrSeverity().toString(),null,null);
		}
						
		populateBookingDetailsResponse(detailsResponse,response);
		try {
			pupolateSoapAttachmentData(detailsResponse,response,exchange);
		} catch (IOException e) {
			throw new ValidationException(e.getMessage(),null,null,null,null,null);
		}
				
		return response;
	}

	private void pupolateSoapAttachmentData(com.cxfsoap.example.resource.BookingDetailsResponse detailsResponse,
			BookingDetailsResponse response, Exchange exchange) throws IOException {

		Map<String, DataHandler> soapAttachments=exchange.getIn().getAttachments();
		String fileContentId=detailsResponse.getFileContentId();
		
		DataHandler dataHandler=soapAttachments.get(fileContentId);
		InputStream inputStream=dataHandler.getInputStream();
		byte[] bytes=new byte[inputStream.available()];
		inputStream.read(bytes, 0, bytes.length);
		String recieptData=Base64.getEncoder().encodeToString(bytes);
		response.setBookingRecieptData(recieptData);
	}

	private void populateBookingDetailsResponse(com.cxfsoap.example.resource.BookingDetailsResponse detailsResponse,
			BookingDetailsResponse response) {

		response.setFlightId(detailsResponse.getFlightId());
		response.setFlightName(detailsResponse.getFlightName());
		response.setBoardingTime(detailsResponse.getDeptTime());
		response.setJourneyDate(detailsResponse.getDepartDate());
		response.setArrivalAirport(detailsResponse.getArrivalAirport());
		response.setDepAirport(detailsResponse.getBoardingAirport());
		response.setTravelHours(detailsResponse.getDuration());
		response.setBookingAmount(detailsResponse.getTotalFare());
		response.setStop(detailsResponse.getStops());
		
		List<String> stopageAirports=detailsResponse.getStopageAirports();
		final StringBuilder stringBuilder=new StringBuilder();
		
		if(stopageAirports!=null && !stopageAirports.isEmpty()) {
			stopageAirports.forEach(value->	stringBuilder.append(value+","));			
		}
		
		response.setStopageAirport(stringBuilder.toString());
		response.setAdults(detailsResponse.getNoOfAdults());
		response.setChildren(detailsResponse.getNoOfChildren());
		
		PassengerList passengerList=detailsResponse.getPassengerList();
		List<String> passengers=passengerList.getName();
		final StringBuilder stringNameBuilder=new StringBuilder();
		passengers.forEach(value->stringNameBuilder.append(value+","));
		
		response.setPassengers(stringNameBuilder.toString());
		response.setGovtId(detailsResponse.getGovtIdentityId());
		response.setGovtIdType(detailsResponse.getGovtIdentityType());
		response.setBookingDate(detailsResponse.getBookingDate());
		response.setDescription(detailsResponse.getDescription());
	}
	
}
