package com.sandra.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 这里将实体类变为一个组件；
 * 等价于xml配置：<bean id="user" class="com.sandra.pojo.User"/>；
 * id名默认为这个类的开头字母小写
 */
@Component
public class User {

    /**
     * String类型不写值默认为null；
     * value相当于bean标签中的property标签的name属性；
     * 也可以使用在set方法上；
     */
    @Value("兔子")
    public String name;

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            '}';
    }
}
