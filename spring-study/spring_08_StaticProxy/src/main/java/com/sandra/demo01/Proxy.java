package com.sandra.demo01;

/**
 * 中介实体类；代理角色；
 * 同样实现租房接口；
 *
 * 需要帮房东出租房屋，尽量使用组合的方式，即引入房东类对象为内部属性，少用继承，因为继承会有局限性；
 *
 * 其作用就在于：可以在内部调用房东出租房屋的方法前后进行一些处理操作，这些是房东不需要做的。
 */
public class Proxy implements Rent {

    /**
     * 组合的方式引入房东；
     * 代理类的出租方法实际上是调用真实角色的出租方法；
     */
    private Owner owner;

    public Proxy() {

    }

    /**
     * 实际调用时，客户端传入哪个房东就代理哪个房东；
     * @param owner
     */
    public Proxy(Owner owner) {
        this.owner = owner;
    }

    public void rent() {
        // 前处理
        seeHouse();

        // 调用房东的出租方法
        owner.rent();

        // 后处理
        heTong();
        fee();
    }

    /**
     * 看房
     */
    private void seeHouse() {
        System.out.println("中介带你看房...");
    }

    /**
     * 签合同
     */
    private void heTong() {
        System.out.println("签租赁合同...");
    }

    /**
     * 收中介费
     */
    private void fee() {
        System.out.println("收中介费...");
    }
}
