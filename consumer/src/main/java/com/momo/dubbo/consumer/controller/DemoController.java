package com.momo.dubbo.consumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.momo.dubbo.api.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018-12-16.
 */
@RestController
public class DemoController {
    @Reference(version = "1.0.0")
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return demoService.sayHello();
    }
}
