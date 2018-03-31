package com.cxf.rest.example.model;

import java.math.BigDecimal;
import java.util.List;

public class BookFlightRequest {

	 private String flightId;
	 private String travelDate;
	 private String passengerGovtid;	
	 private String idType;
	 private Integer adults;
	 private Integer children;
	 private List<String> passengerList;
	 private BigDecimal totalFare;
	 private String travelClass;	
	 
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
	public String getPassengerGovtid() {
		return passengerGovtid;
	}
	public void setPassengerGovtid(String passengerGovtid) {
		this.passengerGovtid = passengerGovtid;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
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
	public List<String> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(List<String> passengerList) {
		this.passengerList = passengerList;
	}
	public BigDecimal getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(BigDecimal totalFare) {
		this.totalFare = totalFare;
	}
	public String getTravelClass() {
		return travelClass;
	}
	public void setTravelClass(String travelClass) {
		this.travelClass = travelClass;
	}
}
