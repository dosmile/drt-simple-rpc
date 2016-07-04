package com.drttest.rpc.provider.service.impl;

import com.drttest.rpc.provider.service.api.FindSomebodyService;
import com.drttest.rpc.provider.service.api.model.Person;

/**
 * Created by duruitao on 16/7/1.
 */
public class FindSomebodyServiceImpl implements FindSomebodyService {

    @Override
    public Person loadPersonInfo(int id) {

        //模拟业务逻辑处理
        Person person = new Person();
        person.setName("Mr.du");
        person.setAddress("Shanghai");
        person.setPhoneNo("15316588888");

        return person;
    }
}
