package com.sandra.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.sandra.demo01.Rent;

/**
 * 我们会用这个类，自动生成代理类；
 * 对照jdk文档中Proxy和InvocationHandler的说明去写；
 *
 * 现在我们没有写代理类，只有一个代理类的生成程序；
 *
 * 这里把整个操作变成一个公式，更具备通用性，成为一个工具类；
 */
public class ProxyInvocationHandler implements InvocationHandler {

    /**
     * 被代理的接口；
     * 这里改成活的更通用的接口；可以是任意的object
     */
    private Object target;

    /**
     * 注入代理接口对象
     * @param target
     */
    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 生成并得到代理类
     * @return
     */
    public Object getProxy() {

        //Proxy类中有生成代理对象的方法；
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                               target.getClass().getInterfaces(),
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

        // 通过反射动态地得到方法的名字
        log(method.getName());

        /**
         * 动态代理的本质，就是使用反射机制实现；
         */
        Object result = method.invoke(target, args);

        return result;
    }

    /**
     * 执行公共操作
     * @param msg
     */
    public void log(String msg) {
        System.out.println("调用了" + msg + "方法");
    }
}
