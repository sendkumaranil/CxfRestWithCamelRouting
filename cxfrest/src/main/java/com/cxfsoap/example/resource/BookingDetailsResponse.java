
package com.cxfsoap.example.resource;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookingDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookingDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fault" type="{http://resource.example.cxfsoap.com/}errorResponse" minOccurs="0"/>
 *         &lt;element name="bookingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flightId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flightName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deptTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalFare" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="travelClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boardingAirport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalAirport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="stopageAirports" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="noOfAdults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="noOfChildren" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="govtIdentityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="govtIdentityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengerList" type="{http://resource.example.cxfsoap.com/}passengerList" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileContentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookingDetailsResponse", propOrder = {
    "fault",
    "bookingDate",
    "flightId",
    "flightName",
    "deptTime",
    "arrivalTime",
    "duration",
    "totalFare",
    "travelClass",
    "departDate",
    "source",
    "destination",
    "boardingAirport",
    "arrivalAirport",
    "stops",
    "stopageAirports",
    "noOfAdults",
    "noOfChildren",
    "govtIdentityId",
    "govtIdentityType",
    "passengerList",
    "description",
    "fileContentId"
})
public class BookingDetailsResponse {

    protected ErrorResponse fault;
    protected String bookingDate;
    protected String flightId;
    protected String flightName;
    protected String deptTime;
    protected String arrivalTime;
    protected String duration;
    protected BigDecimal totalFare;
    protected String travelClass;
    protected String departDate;
    protected String source;
    protected String destination;
    protected String boardingAirport;
    protected String arrivalAirport;
    protected Integer stops;
    @XmlElement(nillable = true)
    protected List<String> stopageAirports;
    protected Integer noOfAdults;
    protected Integer noOfChildren;
    protected String govtIdentityId;
    protected String govtIdentityType;
    protected PassengerList passengerList;
    protected String description;
    protected String fileContentId;

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorResponse }
     *     
     */
    public ErrorResponse getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorResponse }
     *     
     */
    public void setFault(ErrorResponse value) {
        this.fault = value;
    }

    /**
     * Gets the value of the bookingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingDate() {
        return bookingDate;
    }

    /**
     * Sets the value of the bookingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingDate(String value) {
        this.bookingDate = value;
    }

    /**
     * Gets the value of the flightId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightId() {
        return flightId;
    }

    /**
     * Sets the value of the flightId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightId(String value) {
        this.flightId = value;
    }

    /**
     * Gets the value of the flightName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightName() {
        return flightName;
    }

    /**
     * Sets the value of the flightName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightName(String value) {
        this.flightName = value;
    }

    /**
     * Gets the value of the deptTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptTime() {
        return deptTime;
    }

    /**
     * Sets the value of the deptTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptTime(String value) {
        this.deptTime = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the totalFare property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalFare() {
        return totalFare;
    }

    /**
     * Sets the value of the totalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalFare(BigDecimal value) {
        this.totalFare = value;
    }

    /**
     * Gets the value of the travelClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelClass() {
        return travelClass;
    }

    /**
     * Sets the value of the travelClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelClass(String value) {
        this.travelClass = value;
    }

    /**
     * Gets the value of the departDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartDate() {
        return departDate;
    }

    /**
     * Sets the value of the departDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartDate(String value) {
        this.departDate = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the boardingAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardingAirport() {
        return boardingAirport;
    }

    /**
     * Sets the value of the boardingAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardingAirport(String value) {
        this.boardingAirport = value;
    }

    /**
     * Gets the value of the arrivalAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Sets the value of the arrivalAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalAirport(String value) {
        this.arrivalAirport = value;
    }

    /**
     * Gets the value of the stops property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStops(Integer value) {
        this.stops = value;
    }

    /**
     * Gets the value of the stopageAirports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopageAirports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopageAirports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStopageAirports() {
        if (stopageAirports == null) {
            stopageAirports = new ArrayList<String>();
        }
        return this.stopageAirports;
    }

    /**
     * Gets the value of the noOfAdults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOfAdults() {
        return noOfAdults;
    }

    /**
     * Sets the value of the noOfAdults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfAdults(Integer value) {
        this.noOfAdults = value;
    }

    /**
     * Gets the value of the noOfChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOfChildren() {
        return noOfChildren;
    }

    /**
     * Sets the value of the noOfChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfChildren(Integer value) {
        this.noOfChildren = value;
    }

    /**
     * Gets the value of the govtIdentityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovtIdentityId() {
        return govtIdentityId;
    }

    /**
     * Sets the value of the govtIdentityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovtIdentityId(String value) {
        this.govtIdentityId = value;
    }

    /**
     * Gets the value of the govtIdentityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovtIdentityType() {
        return govtIdentityType;
    }

    /**
     * Sets the value of the govtIdentityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovtIdentityType(String value) {
        this.govtIdentityType = value;
    }

    /**
     * Gets the value of the passengerList property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerList }
     *     
     */
    public PassengerList getPassengerList() {
        return passengerList;
    }

    /**
     * Sets the value of the passengerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerList }
     *     
     */
    public void setPassengerList(PassengerList value) {
        this.passengerList = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the fileContentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileContentId() {
        return fileContentId;
    }

    /**
     * Sets the value of the fileContentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileContentId(String value) {
        this.fileContentId = value;
    }

}
