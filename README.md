# Zero-WebService
Zero-WebService

# 1. 概述
Zero-WebService 是一个基于 Spring Boot 的微服务框架，它提供了一套完整的微服务解决方案，包括服务注册与发现、配置管理、负载均衡、熔断降级、限流、监控、日志等。
Zero-WebService 的目标是简化微服务的开发，提高开发效率，降低运维成本。

# 2. 特性
## 2.1. 优点
1. 可以让异构的程序相互访问（跨平台）
2. 松耦合
3. 基于标准协议（通用语言，允许其他程序访问）
## 2.2. 原理
1. Service Provider采用WSDL描述服务 
2. Service Provider 采用UDDI将服务的描述文件发布到UDDI服务器（Register server） 
3. Service Requestor在UDDI服务器上查询并 获取WSDL文件 
4. Service requestor将请求绑定到SOAP，并访问相应的服务。

# 3. 功能

# 4. 起步

# 5. 导航
## 5.1. 博客导航
1. [Spring Boot集成webservice快速入门demo](http://www.liuhaihua.cn/archives/710832.html)