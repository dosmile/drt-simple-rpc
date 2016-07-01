package com.drttest.rpc.provider;

import com.drttest.rpc.provider.framework.RpcFramework;
import com.drttest.rpc.provider.service.api.HelloService;
import com.drttest.rpc.provider.service.impl.HelloServiceImpl;

/**
 * Created by duruitao on 16/6/30.
 */
public class RpcProvider {

    //通过 RPC framework 对外发布服务
    public static void main(String[] args) throws Exception {
        HelloService service = new HelloServiceImpl();
        RpcFramework.export(service, 1234);
    }

}
