package com.sandra.demo01;

/**
 * 房东实体类；属于真实角色；
 * 实现租房接口；
 */
public class Owner implements Rent{

    public void rent() {
        System.out.println("房东要出租房子...");
    }
}
