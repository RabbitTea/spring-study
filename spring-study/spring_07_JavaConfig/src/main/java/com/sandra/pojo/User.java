package com.sandra.pojo;

import org.springframework.beans.factory.annotation.Value;

/**
 * 这里不加Component注解也可，因为是在配置类里进行的注入；
 * 等于配置类里的@Bean
 *
 * @Component
 */
public class User {

    @Value("sandra")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            '}';
    }
}
