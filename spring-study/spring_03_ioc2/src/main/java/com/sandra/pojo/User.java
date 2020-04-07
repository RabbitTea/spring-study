package com.sandra.pojo;

public class User {

    private String name;

    /**
     * 无参构造是隐式的，不写也是默认的；
     * Spring获取上下文时，就已经创建对象到容器中了，使用的是无参构造方式；
     * 如果这里写了有参构造，在初始化时会报错；
     */
    /*
    public User() {
        System.out.println("User的无参构造！");
    }
    */

    /**
     * 有参构造方法
     */
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name=" + name);
    }
}
