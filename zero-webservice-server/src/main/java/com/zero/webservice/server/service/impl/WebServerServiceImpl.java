package com.zero.webservice.server.service.impl;

import com.zero.webservice.server.service.WebServerService;
import jakarta.jws.WebService;
import org.springframework.stereotype.Service;

@Service
@WebService
public class WebServerServiceImpl implements WebServerService {

    @Override
    public String sayHello(String name) {
        System.err.println("sayHello is called..."); // 只是为了更明显的输出，采用err
        return "Hello, " + name + "!";
    }

}