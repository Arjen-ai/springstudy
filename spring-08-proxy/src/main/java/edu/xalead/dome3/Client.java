package edu.xalead.dome3;

import edu.xalead.dome1.Proxy;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //获取代理角色
        ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler();
        invocationHandler.setRent(host);
        //获去代理类
        Rent proxy = (Rent) invocationHandler.getProxy();
        proxy.rent();
    }
}
