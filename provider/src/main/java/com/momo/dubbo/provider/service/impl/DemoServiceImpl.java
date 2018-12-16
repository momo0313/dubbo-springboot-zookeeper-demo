package com.momo.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.momo.dubbo.api.service.DemoService;

/**
 * Created by Administrator on 2018-12-16.
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello() {
        return "hello";
    }
}
