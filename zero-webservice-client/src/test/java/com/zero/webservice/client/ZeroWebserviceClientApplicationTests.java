package com.zero.webservice.client;

import com.zero.webservice.client.service.WebClientService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZeroWebserviceClientApplicationTests {

    /**
     * 客户端调用类，用于通过JAX-WS代理方式访问HelloService Web服务。
     */
    @Test
    void contextLoads() {

        // 创建JAX-WS代理工厂对象
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();

        // 设置要访问的服务地址 这里需要启动 zero-webservice-server 服务
        // 设置CXF Servlet的映射路径为"/services/*"，表示所有以"/services/"开头的HTTP请求都将由CXF Servlet处理。对应 zero-webservice-server 中的  CxfConfig 类中的 wsServlet 发方法
        // 将服务实现类与Spring Bus关联，并指定发布地址为"/1"。 对应 zero-webservice-server 中的 CxfConfig 类中的 endpoint 方法
        jaxWsProxyFactoryBean.setAddress("http://localhost:8081/services/1?wsdl");

        // 设置服务接口类，即HelloService
        jaxWsProxyFactoryBean.setServiceClass(WebClientService.class);

        // 使用工厂对象创建HelloService接口的代理实例
        WebClientService webClientService = jaxWsProxyFactoryBean.create(WebClientService.class);

        System.out.println(webClientService.getClass());

        // 调用代理实例的方法，向服务端发送请求，并打印返回结果
        System.out.println(webClientService.sayHello("hello world"));

    }

}
