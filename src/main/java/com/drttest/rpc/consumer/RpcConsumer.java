package com.drttest.rpc.consumer;

import com.drttest.rpc.provider.framework.RpcFramework;
import com.drttest.rpc.provider.service.api.HelloService;
import com.drttest.rpc.provider.service.api.model.Person;

/**
 * Created by duruitao on 16/6/30.
 */
public class RpcConsumer {

    //调用 service 的客户端
    public static void main(String[] args) throws Exception {
        HelloService service = RpcFramework.refer(HelloService.class, "127.0.0.1", 1234);
        for (int i = 0; i < 10; i ++) {
//            String hello = service.hello("World" + i);
            String hello = service.helloToSomebody(new Person("person" + i));
            System.out.println(hello);
            Thread.sleep(1000);
        }
    }

}
