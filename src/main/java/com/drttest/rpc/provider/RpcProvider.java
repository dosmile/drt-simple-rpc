package com.drttest.rpc.provider;

import com.drttest.rpc.provider.framework.RpcFramework;
import com.drttest.rpc.provider.service.api.FindSomebodyService;
import com.drttest.rpc.provider.service.impl.FindSomebodyServiceImpl;

/**
 * Created by duruitao on 16/6/30.
 */
public class RpcProvider {

    //通过 RPC framework 对外发布服务
    public static void main(String[] args) throws Exception {
        FindSomebodyService findSomebodyService = new FindSomebodyServiceImpl();
        RpcFramework.export(findSomebodyService, 1234);
    }

}
