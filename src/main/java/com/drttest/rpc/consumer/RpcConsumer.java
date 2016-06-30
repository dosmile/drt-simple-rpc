package com.drttest.rpc.consumer;

import com.drttest.rpc.framework.RpcFramework;
import com.drttest.rpc.service.api.HelloService;

/**
 * Created by duruitao on 16/6/30.
 */
public class RpcConsumer {

    public static void main(String[] args) throws Exception {
        HelloService service = RpcFramework.refer(HelloService.class, "127.0.0.1", 1234);
        for (int i = 0; i < 10; i ++) {
            String hello = service.hello("World" + i);
            System.out.println(hello);
            Thread.sleep(1000);
        }
    }

}
