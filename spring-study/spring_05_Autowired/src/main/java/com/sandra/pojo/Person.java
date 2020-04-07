package com.sandra.pojo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {

    /**
     * Resource是Java的原生注解
     */
    @Resource(name = "cat222")
    private Cat cat;

    @Autowired
    @Qualifier(value = "dog111")
    private Dog dog;

    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
            "cat=" + cat +
            ", dog=" + dog +
            ", name='" + name + '\'' +
            '}';
    }
}

