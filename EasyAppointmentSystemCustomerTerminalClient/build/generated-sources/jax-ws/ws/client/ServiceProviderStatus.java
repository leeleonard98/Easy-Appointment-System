
package ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceProviderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="serviceProviderStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="APPROVE"/>
 *     &lt;enumeration value="BLOCK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "serviceProviderStatus")
@XmlEnum
public enum ServiceProviderStatus {

    PENDING,
    APPROVE,
    BLOCK;

    public String value() {
        return name();
    }

    public static ServiceProviderStatus fromValue(String v) {
        return valueOf(v);
    }

}
