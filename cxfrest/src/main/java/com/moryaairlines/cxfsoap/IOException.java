
package com.moryaairlines.cxfsoap;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "IOException", targetNamespace = "http://resource.example.cxfsoap.com/")
public class IOException
    extends Exception
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 10909L;
	/**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.cxfsoap.example.resource.IOException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public IOException(String message, com.cxfsoap.example.resource.IOException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public IOException(String message, com.cxfsoap.example.resource.IOException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.cxfsoap.example.resource.IOException
     */
    public com.cxfsoap.example.resource.IOException getFaultInfo() {
        return faultInfo;
    }

}
