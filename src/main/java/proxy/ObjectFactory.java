
package proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _GetStudentByCIN_QNAME = new QName("http://WS/", "getStudentByCIN");
    private final static QName _GetAllStudents_QNAME = new QName("http://WS/", "getAllStudents");
    private final static QName _GetStudentByCINResponse_QNAME = new QName("http://WS/", "getStudentByCINResponse");
    private final static QName _GetAllStudentsResponse_QNAME = new QName("http://WS/", "getAllStudentsResponse");
    private final static QName _GetLimitStudents_QNAME = new QName("http://WS/", "getLimitStudents");
    private final static QName _GetLimitStudentsResponse_QNAME = new QName("http://WS/", "getLimitStudentsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStudentByCIN }
     * 
     */
    public GetStudentByCIN createGetStudentByCIN() {
        return new GetStudentByCIN();
    }

    /**
     * Create an instance of {@link GetAllStudents }
     * 
     */
    public GetAllStudents createGetAllStudents() {
        return new GetAllStudents();
    }

    /**
     * Create an instance of {@link GetStudentByCINResponse }
     * 
     */
    public GetStudentByCINResponse createGetStudentByCINResponse() {
        return new GetStudentByCINResponse();
    }

    /**
     * Create an instance of {@link GetAllStudentsResponse }
     * 
     */
    public GetAllStudentsResponse createGetAllStudentsResponse() {
        return new GetAllStudentsResponse();
    }

    /**
     * Create an instance of {@link GetLimitStudents }
     * 
     */
    public GetLimitStudents createGetLimitStudents() {
        return new GetLimitStudents();
    }

    /**
     * Create an instance of {@link GetLimitStudentsResponse }
     * 
     */
    public GetLimitStudentsResponse createGetLimitStudentsResponse() {
        return new GetLimitStudentsResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentByCIN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getStudentByCIN")
    public JAXBElement<GetStudentByCIN> createGetStudentByCIN(GetStudentByCIN value) {
        return new JAXBElement<GetStudentByCIN>(_GetStudentByCIN_QNAME, GetStudentByCIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getAllStudents")
    public JAXBElement<GetAllStudents> createGetAllStudents(GetAllStudents value) {
        return new JAXBElement<GetAllStudents>(_GetAllStudents_QNAME, GetAllStudents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentByCINResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getStudentByCINResponse")
    public JAXBElement<GetStudentByCINResponse> createGetStudentByCINResponse(GetStudentByCINResponse value) {
        return new JAXBElement<GetStudentByCINResponse>(_GetStudentByCINResponse_QNAME, GetStudentByCINResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getAllStudentsResponse")
    public JAXBElement<GetAllStudentsResponse> createGetAllStudentsResponse(GetAllStudentsResponse value) {
        return new JAXBElement<GetAllStudentsResponse>(_GetAllStudentsResponse_QNAME, GetAllStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLimitStudents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getLimitStudents")
    public JAXBElement<GetLimitStudents> createGetLimitStudents(GetLimitStudents value) {
        return new JAXBElement<GetLimitStudents>(_GetLimitStudents_QNAME, GetLimitStudents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLimitStudentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getLimitStudentsResponse")
    public JAXBElement<GetLimitStudentsResponse> createGetLimitStudentsResponse(GetLimitStudentsResponse value) {
        return new JAXBElement<GetLimitStudentsResponse>(_GetLimitStudentsResponse_QNAME, GetLimitStudentsResponse.class, null, value);
    }

}
