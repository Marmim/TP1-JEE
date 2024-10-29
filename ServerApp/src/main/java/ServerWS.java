import WS.StudentService;

import javax.xml.ws.Endpoint;

public class ServerWS {
    public static void main(String[] args){
        String url ="http://localhost:8090/";
        Endpoint.publish(url, new StudentService());
        System.out.println(url);
    }
}
