package com.drttest.rpc.consumer;

import com.drttest.rpc.provider.framework.RpcFramework;
import com.drttest.rpc.provider.service.api.FindSomebodyService;
import com.drttest.rpc.provider.service.api.model.Person;

/**
 * Created by duruitao on 16/6/30.
 */
public class RpcConsumer {

    //调用 service 的客户端
    public static void main(String[] args) throws Exception {

        FindSomebodyService service = RpcFramework.refer(FindSomebodyService.class, "127.0.0.1", 1234);

        for (int i = 0; i < 10; i ++) {
            Person person = service.loadPersonInfo(i);
            System.out.println("hello , " + person.getName() + " " + i);
            Thread.sleep(1000);
        }
    }

}
