package com.sandra.pojo;

/**
 * 用户实体类；
 * 为学习p标签和c标签；
 * 拓展注入方式；
 */
public class User {

    private String name;
    private int age;

    public User() {

    }

    /**
     * 有参构造函数；
     * 构造器或c命名空间注入需要；
     * @param name
     * @param age
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
