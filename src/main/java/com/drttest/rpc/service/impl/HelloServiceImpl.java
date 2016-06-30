package com.drttest.rpc.service.impl;

import com.drttest.rpc.service.api.HelloService;

/**
 * Created by duruitao on 16/6/30.
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "hello , " + name;
    }

}
