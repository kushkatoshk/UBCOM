
package org.nike;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "nike", targetNamespace = "http://nike.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Nike {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://nike.org/", className = "org.nike.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://nike.org/", className = "org.nike.HelloResponse")
    @Action(input = "http://nike.org/nike/helloRequest", output = "http://nike.org/nike/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
