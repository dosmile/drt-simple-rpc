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

        //refer方法返回的是一个代理对象，该对象代理（FindSomebodyService）
        //代理对象类似于一个空壳，调代理对象的loadPersonInfo方法时，实际是调用代理对象内部的invoke经socket通信获取方法的执行结果
        FindSomebodyService service = RpcFramework.refer(FindSomebodyService.class, "127.0.0.1", 1234);

        for (int i = 0; i < 10; i ++) {
            Person person = service.loadPersonInfo(i);
            System.out.println("hello , " + person.getName() + " " + i);
            Thread.sleep(1000);
        }
    }

}
