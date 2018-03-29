
package com.cxfsoap.example.resource;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookingDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookingDetailsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flightId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="govtIdentityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="govtIdentityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noOfAdults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="noOfChildren" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="passengerList" type="{http://resource.example.cxfsoap.com/}passengerList" minOccurs="0"/>
 *         &lt;element name="totalFare" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="travelClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookingDetailsRequest", propOrder = {
    "departDate",
    "flightId",
    "govtIdentityId",
    "govtIdentityType",
    "noOfAdults",
    "noOfChildren",
    "passengerList",
    "totalFare",
    "travelClass"
})
public class BookingDetailsRequest {

    protected String departDate;
    protected String flightId;
    protected String govtIdentityId;
    protected String govtIdentityType;
    protected int noOfAdults;
    protected int noOfChildren;
    protected PassengerList passengerList;
    protected BigDecimal totalFare;
    protected String travelClass;

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
     * Gets the value of the noOfAdults property.
     * 
     */
    public int getNoOfAdults() {
        return noOfAdults;
    }

    /**
     * Sets the value of the noOfAdults property.
     * 
     */
    public void setNoOfAdults(int value) {
        this.noOfAdults = value;
    }

    /**
     * Gets the value of the noOfChildren property.
     * 
     */
    public int getNoOfChildren() {
        return noOfChildren;
    }

    /**
     * Sets the value of the noOfChildren property.
     * 
     */
    public void setNoOfChildren(int value) {
        this.noOfChildren = value;
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

}
