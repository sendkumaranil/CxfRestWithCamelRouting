
package com.cxfsoap.example.resource;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for errorSeverity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="errorSeverity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="CRITICAL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "errorSeverity")
@XmlEnum
public enum ErrorSeverity {

    NORMAL,
    CRITICAL,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ErrorSeverity fromValue(String v) {
        return valueOf(v);
    }

}
