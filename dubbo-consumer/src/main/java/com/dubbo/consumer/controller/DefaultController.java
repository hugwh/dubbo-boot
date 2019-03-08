package com.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: huangwh
 * @mail huangwh@txtws.com
 * @date: 2019-03-08 15:18
 */
@RestController
@RequestMapping("/user")
public class DefaultController {
    @Reference(version = "1.0.0",
            application = "${dubbo.application.id}")
    private HelloService helloService;

    @RequestMapping("/sayHello")
    public String register(String name) {
        return helloService.sayHello(name);
    }
}
