package com.drttest.rpc.provider.service.impl;

import com.drttest.rpc.provider.service.api.HelloService;
import com.drttest.rpc.provider.service.api.model.Person;

/**
 * Created by duruitao on 16/6/30.
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "hello , " + name;
    }

    @Override
    public String helloToSomebody(Person person) {
        return "hello , " + person.getName();
    }

}
