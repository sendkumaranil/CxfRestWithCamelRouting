
package com.cxfsoap.example.resource;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cxfsoap.example.resource package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FlightDetailsRequest_QNAME = new QName("http://resource.example.cxfsoap.com/", "flightDetailsRequest");
    private final static QName _GetFlightDetails_QNAME = new QName("http://resource.example.cxfsoap.com/", "getFlightDetails");
    private final static QName _ParseException_QNAME = new QName("http://resource.example.cxfsoap.com/", "ParseException");
    private final static QName _GetFlightDetailsResponse_QNAME = new QName("http://resource.example.cxfsoap.com/", "getFlightDetailsResponse");
    private final static QName _BookingDetailsResponse_QNAME = new QName("http://resource.example.cxfsoap.com/", "bookingDetailsResponse");
    private final static QName _FlightDetails_QNAME = new QName("http://resource.example.cxfsoap.com/", "flightDetails");
    private final static QName _DocumentException_QNAME = new QName("http://resource.example.cxfsoap.com/", "DocumentException");
    private final static QName _GetBookingDetailsResponse_QNAME = new QName("http://resource.example.cxfsoap.com/", "getBookingDetailsResponse");
    private final static QName _IOException_QNAME = new QName("http://resource.example.cxfsoap.com/", "IOException");
    private final static QName _ErrorResponse_QNAME = new QName("http://resource.example.cxfsoap.com/", "errorResponse");
    private final static QName _DestinationList_QNAME = new QName("http://resource.example.cxfsoap.com/", "destinationList");
    private final static QName _GetBookingDetails_QNAME = new QName("http://resource.example.cxfsoap.com/", "getBookingDetails");
    private final static QName _SourceList_QNAME = new QName("http://resource.example.cxfsoap.com/", "sourceList");
    private final static QName _BookingDetailsRequest_QNAME = new QName("http://resource.example.cxfsoap.com/", "bookingDetailsRequest");
    private final static QName _FlightDetailsResponse_QNAME = new QName("http://resource.example.cxfsoap.com/", "flightDetailsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cxfsoap.example.resource
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DestinationList }
     * 
     */
    public DestinationList createDestinationList() {
        return new DestinationList();
    }

    /**
     * Create an instance of {@link GetBookingDetails }
     * 
     */
    public GetBookingDetails createGetBookingDetails() {
        return new GetBookingDetails();
    }

    /**
     * Create an instance of {@link SourceList }
     * 
     */
    public SourceList createSourceList() {
        return new SourceList();
    }

    /**
     * Create an instance of {@link BookingDetailsRequest }
     * 
     */
    public BookingDetailsRequest createBookingDetailsRequest() {
        return new BookingDetailsRequest();
    }

    /**
     * Create an instance of {@link FlightDetailsResponse }
     * 
     */
    public FlightDetailsResponse createFlightDetailsResponse() {
        return new FlightDetailsResponse();
    }

    /**
     * Create an instance of {@link GetBookingDetailsResponse }
     * 
     */
    public GetBookingDetailsResponse createGetBookingDetailsResponse() {
        return new GetBookingDetailsResponse();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link ErrorResponse }
     * 
     */
    public ErrorResponse createErrorResponse() {
        return new ErrorResponse();
    }

    /**
     * Create an instance of {@link BookingDetailsResponse }
     * 
     */
    public BookingDetailsResponse createBookingDetailsResponse() {
        return new BookingDetailsResponse();
    }

    /**
     * Create an instance of {@link FlightDetails }
     * 
     */
    public FlightDetails createFlightDetails() {
        return new FlightDetails();
    }

    /**
     * Create an instance of {@link DocumentException }
     * 
     */
    public DocumentException createDocumentException() {
        return new DocumentException();
    }

    /**
     * Create an instance of {@link FlightDetailsRequest }
     * 
     */
    public FlightDetailsRequest createFlightDetailsRequest() {
        return new FlightDetailsRequest();
    }

    /**
     * Create an instance of {@link GetFlightDetails }
     * 
     */
    public GetFlightDetails createGetFlightDetails() {
        return new GetFlightDetails();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link GetFlightDetailsResponse }
     * 
     */
    public GetFlightDetailsResponse createGetFlightDetailsResponse() {
        return new GetFlightDetailsResponse();
    }

    /**
     * Create an instance of {@link PassengerList }
     * 
     */
    public PassengerList createPassengerList() {
        return new PassengerList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.example.cxfsoap.com/", name = "flightDetailsRequest")
    public JAXBElement<FlightDetailsRequest> createFlightDetailsRequest(FlightDetailsRequest value) {
        return new JAXBElement<FlightDetailsRequest>(_FlightDetailsRequest_QNAME, FlightDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.example.cxfsoap.com/", name = "getFlightDetails")
    public JAXBElement<GetFlightDetails> createGetFlightDetails(GetFlightDetails value) {
        return new JAXBElement<GetFlightDetails>(_GetFlightDetails_QNAME, GetFlightDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.example.cxfsoap.com/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.example.cxfsoap.com/", name = "getFlightDetailsResponse")
    public JAXBElement<GetFlightDetailsResponse> createGetFlightDetailsResponse(GetFlightDetailsResponse value) {
        return new JAXBElement<GetFlightDetailsResponse>(_GetFlightDetailsResponse_QNAME, GetFlightDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.example.cxfsoap.com/", name = "bookingDetailsResponse")
    public JAXBElement<BookingDetailsResponse> createBookingDetailsResponse(BookingDetailsResponse value) {
        return new JAXBElement<BookingDetailsResponse>(_BookingDetailsResponse_QNAME, BookingDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.example.cxfsoap.com/", name = "flightDetails")
    public JAXBElement<FlightDetails> createFlightDetails(FlightDetails value) {
        return new JAXBElement<FlightDetails>(_FlightDetails_QNAME, FlightDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.example.cxfsoap.com/", name = "DocumentException")
    public JAXBElement<DocumentException> createDocumentException(DocumentException value) {
        return new JAXBElement<DocumentException>(_DocumentException_QNAME, DocumentException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.example.cxfsoap.com/", name = "getBookingDetailsResponse")
    public JAXBElement<GetBookingDetailsResponse> createGetBookingDetailsResponse(GetBookingDetailsResponse value) {
        return new JAXBElement<GetBookingDetailsResponse>(_GetBookingDetailsResponse_QNAME, GetBookingDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.example.cxfsoap.com/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.example.cxfsoap.com/", name = "errorResponse")
    public JAXBElement<ErrorResponse> createErrorResponse(ErrorResponse value) {
        return new JAXBElement<ErrorResponse>(_ErrorResponse_QNAME, ErrorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.example.cxfsoap.com/", name = "destinationList")
    public JAXBElement<DestinationList> createDestinationList(DestinationList value) {
        return new JAXBElement<DestinationList>(_DestinationList_QNAME, DestinationList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.example.cxfsoap.com/", name = "getBookingDetails")
    public JAXBElement<GetBookingDetails> createGetBookingDetails(GetBookingDetails value) {
        return new JAXBElement<GetBookingDetails>(_GetBookingDetails_QNAME, GetBookingDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.example.cxfsoap.com/", name = "sourceList")
    public JAXBElement<SourceList> createSourceList(SourceList value) {
        return new JAXBElement<SourceList>(_SourceList_QNAME, SourceList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.example.cxfsoap.com/", name = "bookingDetailsRequest")
    public JAXBElement<BookingDetailsRequest> createBookingDetailsRequest(BookingDetailsRequest value) {
        return new JAXBElement<BookingDetailsRequest>(_BookingDetailsRequest_QNAME, BookingDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.example.cxfsoap.com/", name = "flightDetailsResponse")
    public JAXBElement<FlightDetailsResponse> createFlightDetailsResponse(FlightDetailsResponse value) {
        return new JAXBElement<FlightDetailsResponse>(_FlightDetailsResponse_QNAME, FlightDetailsResponse.class, null, value);
    }

}
