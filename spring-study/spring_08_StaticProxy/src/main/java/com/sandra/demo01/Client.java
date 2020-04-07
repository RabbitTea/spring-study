package com.sandra.demo01;

/**
 * 租房者；客户角色
 */
public class Client {

    public static void main(String[] args) {
        /**
         * 没有代理模式前，租房的需求处理：
         * 需要实例化房东对象，调用其中的出租方法
         */

         //Owner owner = new Owner();
         //owner.rent();

        /**
         * 有了代理之后;
         * 实例化代理对象，通过代理来出租房屋;
         * 但是代理角色一般会有一些附属操作；
         */
        Owner owner = new Owner();
        Proxy proxy = new Proxy(owner);
        //客户端不用面对房东，直接找中介即可；
        proxy.rent();

    }
}
