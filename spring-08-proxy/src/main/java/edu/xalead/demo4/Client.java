package edu.xalead.demo4;

import edu.xalead.dome2.UserService;
import edu.xalead.dome2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实对象
        UserServiceImpl userService = new UserServiceImpl();
        //生成代理对象
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setTar(userService);

        UserService proxy = (UserService) proxyInvocationHandler.getProxy();
        proxy.add();
    }
}
