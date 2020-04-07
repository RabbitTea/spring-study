package com.sandra.demo02;

public class Client {

    public static void main(String[] args) {

        // 委托类实例无论如何要有，这个不能省
        UserServiceImpl userService = new UserServiceImpl();

        // 代理角色：还未实例化

        // 实例化调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        // 设置要代理的对象
        pih.setTarget(userService);

        // 动态生成代理类
        UserService proxy = (UserService)pih.getProxy();

        // 执行委托类的方法
        proxy.add();
    }
}
