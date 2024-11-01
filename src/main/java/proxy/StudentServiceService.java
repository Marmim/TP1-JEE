
package proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "StudentServiceService", targetNamespace = "http://WS/", wsdlLocation = "http://localhost:8090/?wsdl")
public class StudentServiceService
    extends Service
{

    private final static URL STUDENTSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException STUDENTSERVICESERVICE_EXCEPTION;
    private final static QName STUDENTSERVICESERVICE_QNAME = new QName("http://WS/", "StudentServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8090/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STUDENTSERVICESERVICE_WSDL_LOCATION = url;
        STUDENTSERVICESERVICE_EXCEPTION = e;
    }

    public StudentServiceService() {
        super(__getWsdlLocation(), STUDENTSERVICESERVICE_QNAME);
    }

    public StudentServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), STUDENTSERVICESERVICE_QNAME, features);
    }

    public StudentServiceService(URL wsdlLocation) {
        super(wsdlLocation, STUDENTSERVICESERVICE_QNAME);
    }

    public StudentServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STUDENTSERVICESERVICE_QNAME, features);
    }

    public StudentServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StudentService
     */
    @WebEndpoint(name = "StudentServicePort")
    public StudentService getStudentServicePort() {
        return super.getPort(new QName("http://WS/", "StudentServicePort"), StudentService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StudentService
     */
    @WebEndpoint(name = "StudentServicePort")
    public StudentService getStudentServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WS/", "StudentServicePort"), StudentService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STUDENTSERVICESERVICE_EXCEPTION!= null) {
            throw STUDENTSERVICESERVICE_EXCEPTION;
        }
        return STUDENTSERVICESERVICE_WSDL_LOCATION;
    }

}
