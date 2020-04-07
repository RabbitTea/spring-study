package com.sandra.demo01;


public class Client {

    public static void main(String[] args) {

        //真实角色
        Owner owner = new Owner();

        //代理角色：现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //通过调用处理程序角色来处理我们要调用的接口对象；原来静态代理时代理类和委托类都要实现同一接口，这里由调用处理程序负责实现；
        pih.setRent(owner);

        //通过调用处理程序角色来生成代理类；
        Rent proxy = (Rent)pih.getProxy();

        proxy.rent();
    }
}
