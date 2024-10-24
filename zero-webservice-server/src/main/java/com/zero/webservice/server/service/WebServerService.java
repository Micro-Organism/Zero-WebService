package com.zero.webservice.server.service;


import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(name = "MyWebService", targetNamespace = "http://zero.cn/mywebservice")
public interface WebServerService {

    @WebMethod
    String sayHello(String name);
}