
package proxy;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudentService", targetNamespace = "http://WS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StudentService {


    /**
     * 
     * @return
     *     returns java.util.List<proxy.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllStudents", targetNamespace = "http://WS/", className = "proxy.GetAllStudents")
    @ResponseWrapper(localName = "getAllStudentsResponse", targetNamespace = "http://WS/", className = "proxy.GetAllStudentsResponse")
    @Action(input = "http://WS/StudentService/getAllStudentsRequest", output = "http://WS/StudentService/getAllStudentsResponse")
    public List<Student> getAllStudents();

    /**
     * 
     * @param arg0
     * @return
     *     returns proxy.Student
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudmetsBycin", targetNamespace = "http://WS/", className = "proxy.GetStudmetsBycin")
    @ResponseWrapper(localName = "getStudmetsBycinResponse", targetNamespace = "http://WS/", className = "proxy.GetStudmetsBycinResponse")
    @Action(input = "http://WS/StudentService/getStudmetsBycinRequest", output = "http://WS/StudentService/getStudmetsBycinResponse")
    public Student getStudmetsBycin(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<proxy.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLimitStudents", targetNamespace = "http://WS/", className = "proxy.GetLimitStudents")
    @ResponseWrapper(localName = "getLimitStudentsResponse", targetNamespace = "http://WS/", className = "proxy.GetLimitStudentsResponse")
    @Action(input = "http://WS/StudentService/getLimitStudentsRequest", output = "http://WS/StudentService/getLimitStudentsResponse")
    public List<Student> getLimitStudents(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
