
package com.cxfsoap.example.resource;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flightDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faultDetails" type="{http://resource.example.cxfsoap.com/}errorResponse" minOccurs="0"/>
 *         &lt;element name="sourceList" type="{http://resource.example.cxfsoap.com/}sourceList" minOccurs="0"/>
 *         &lt;element name="destinationList" type="{http://resource.example.cxfsoap.com/}destinationList" minOccurs="0"/>
 *         &lt;element name="flightdetails" type="{http://resource.example.cxfsoap.com/}flightDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightDetailsResponse", propOrder = {
    "faultDetails",
    "sourceList",
    "destinationList",
    "flightdetails"
})
public class FlightDetailsResponse {

    protected ErrorResponse faultDetails;
    protected SourceList sourceList;
    protected DestinationList destinationList;
    @XmlElement(nillable = true)
    protected List<FlightDetails> flightdetails;

    /**
     * Gets the value of the faultDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorResponse }
     *     
     */
    public ErrorResponse getFaultDetails() {
        return faultDetails;
    }

    /**
     * Sets the value of the faultDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorResponse }
     *     
     */
    public void setFaultDetails(ErrorResponse value) {
        this.faultDetails = value;
    }

    /**
     * Gets the value of the sourceList property.
     * 
     * @return
     *     possible object is
     *     {@link SourceList }
     *     
     */
    public SourceList getSourceList() {
        return sourceList;
    }

    /**
     * Sets the value of the sourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceList }
     *     
     */
    public void setSourceList(SourceList value) {
        this.sourceList = value;
    }

    /**
     * Gets the value of the destinationList property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationList }
     *     
     */
    public DestinationList getDestinationList() {
        return destinationList;
    }

    /**
     * Sets the value of the destinationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationList }
     *     
     */
    public void setDestinationList(DestinationList value) {
        this.destinationList = value;
    }

    /**
     * Gets the value of the flightdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightdetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightDetails }
     * 
     * 
     */
    public List<FlightDetails> getFlightdetails() {
        if (flightdetails == null) {
            flightdetails = new ArrayList<FlightDetails>();
        }
        return this.flightdetails;
    }

}
