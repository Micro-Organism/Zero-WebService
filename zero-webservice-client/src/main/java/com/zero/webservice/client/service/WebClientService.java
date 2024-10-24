package com.zero.webservice.client.service;


import jakarta.jws.WebService;

@WebService(name = "MyWebService", targetNamespace = "http://zero.cn/mywebservice")
public interface WebClientService {

    /**
     * 接口名一样 方法定义名一样
     * @param name  名称
     * @return  返回值
     */
    String sayHello(String name);
}