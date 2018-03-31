package com.cxf.rest.example.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name="BookingDetails")
@XmlType(propOrder= {"passengers","govtId","govtIdType","bookingDate",
		"flightId","flightName","source","destination","depAirport",
		"arrivalAirport","journeyDate","boardingTime","travelHours",
		"bookingAmount","stop","stopageAirport","adults","children","description","bookingRecieptData"})
public class BookingDetailsResponse {
		
	private BigDecimal bookingAmount;
	
	private String govtId;
	
	private String govtIdType;
	
	private String journeyDate;
	
	private String source;
	
	private String destination;
	
	private String depAirport;
	
	private String arrivalAirport;
	
	private String boardingTime;
	
	private String flightId;
	
	private String flightName;
	
	private String travelHours;
	
	private int stop;
	
	private String stopageAirport;
	
	private String bookingRecieptData;
	
	private Integer adults;
	
	private Integer children;
	
	private String passengers;
	
	private String bookingDate;
	
	private String description;
		
	public BigDecimal getBookingAmount() {
		return bookingAmount;
	}
	public void setBookingAmount(BigDecimal bookingAmount) {
		this.bookingAmount = bookingAmount;
	}
	public String getGovtId() {
		return govtId;
	}
	public void setGovtId(String govtId) {
		this.govtId = govtId;
	}
	public String getGovtIdType() {
		return govtIdType;
	}
	public void setGovtIdType(String govtIdType) {
		this.govtIdType = govtIdType;
	}
	public String getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepAirport() {
		return depAirport;
	}
	public void setDepAirport(String depAirport) {
		this.depAirport = depAirport;
	}
	public String getArrivalAirport() {
		return arrivalAirport;
	}
	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}
	public String getBoardingTime() {
		return boardingTime;
	}
	public void setBoardingTime(String boardingTime) {
		this.boardingTime = boardingTime;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getTravelHours() {
		return travelHours;
	}
	public void setTravelHours(String travelHours) {
		this.travelHours = travelHours;
	}
	public int getStop() {
		return stop;
	}
	public void setStop(int stop) {
		this.stop = stop;
	}
	public String getStopageAirport() {
		return stopageAirport;
	}
	public void setStopageAirport(String stopageAirport) {
		this.stopageAirport = stopageAirport;
	}
	
	public String getBookingRecieptData() {
		return bookingRecieptData;
	}
	public void setBookingRecieptData(String bookingRecieptData) {
		this.bookingRecieptData = bookingRecieptData;
	}
	public Integer getAdults() {
		return adults;
	}
	public void setAdults(Integer adults) {
		this.adults = adults;
	}
	public Integer getChildren() {
		return children;
	}
	public void setChildren(Integer children) {
		this.children = children;
	}
	public String getPassengers() {
		return passengers;
	}
	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
