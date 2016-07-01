package com.drttest.rpc.provider.service.api;

import com.drttest.rpc.provider.service.api.model.Person;

/**
 * Created by duruitao on 16/6/30.
 */
public interface HelloService {

    //service 对外发布的 api
    String hello(String name);

    String helloToSomebody(Person person);

}
