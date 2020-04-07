package com.sandra.demo02;

/**
 * 客户角色
 */
public class UserClient {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceProxy proxy = new UserServiceProxy();
        /**
         * Spring推荐注入一个对象使用set方法;
         * 这里代理接管真实角色
         */
        proxy.setUserService(userService);

        proxy.add();
    }
}
