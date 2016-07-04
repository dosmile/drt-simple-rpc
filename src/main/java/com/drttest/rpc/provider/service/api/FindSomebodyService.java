package com.drttest.rpc.provider.service.api;

import com.drttest.rpc.provider.service.api.model.Person;

/**
 * Created by duruitao on 16/7/1.
 */
public interface FindSomebodyService {

    Person loadPersonInfo(int id);

    int savePersonInfo(Person person);
}
