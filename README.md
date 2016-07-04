drt-simple-rpc
一个简单的RPC框架

参考来源：http://javatar.iteye.com/blog/1123915#comments

重点体味其中的动态代理：
在RpcFramework.refer()方法中，通过动态代理，生成一个代理对象，每次经RPC执行方法时，实际上都是调用代理对象的invoke()方法，
把方法参数经socket通信传给服务端，由服务端执行具体逻辑并将执行结果经socket返给客户端。

通过动态代理，实现了对service中具体方法的隐藏，在：
        FindSomebodyService service = RpcFramework.refer(FindSomebodyService.class, "127.0.0.1", 1234);
中，获取了一个动态代理对象，该对象只是包含了网络通信的一个空壳而已

在执行具体方法时：
        Person person = service.loadPersonInfo(i);
再将参数i经代理对象传给服务端，并获取执行结果


