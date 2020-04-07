package com.sandra.demo02;

/**
 * 真实角色；
 */
public class UserServiceImpl implements UserService{

    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("修改了一个用户");
    }

    public void query() {
        System.out.println("查询了一个用户");
    }

    /**
     * 1. 改动原有的业务代码，在公司是大忌；
     * 2. AOP的实现机制是从原来的纵向开发代码上通过代理横切进去，实现横向开发；
     */
}
