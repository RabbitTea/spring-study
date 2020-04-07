package com.sandra.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 我们会用这个类，自动生成代理类；
 * 对照jdk文档中Proxy和InvocationHandler的说明去写；
 *
 * 现在我们没有写代理类，只有一个代理类的生成程序；
 */
public class ProxyInvocationHandler implements InvocationHandler {

    /**
     * 被代理的接口
     */
    private Rent rent;

    /**
     * 注入代理接口对象
     * @param rent
     */
    public void setRent(Rent rent) {
        this.rent = rent;
    }

    /**
     * 生成并得到代理类
     * @return
     */
    public Object getProxy() {

        //Proxy类中有生成代理对象的方法；
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                               rent.getClass().getInterfaces(),
                               this);
    }

    /**
     * 处理代理实例，并返回结果；即调用真实角色的方法，并做一些处理
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //调用委托类方法前，执行公共的操作
        seeHouse();

        /**
         * 动态代理的本质，就是使用反射机制实现；
         */
        Object result = method.invoke(rent, args);

        //调用委托类方法后，执行公共的操作
        fee();

        return result;
    }

    /**
     * 代理类需要增加的一些公共操作；
     */
    public void seeHouse() {
        System.out.println("中介带看房子...");
    }

    public void fee() {
        System.out.println("收中介费");
    }
}
