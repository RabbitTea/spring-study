package com.sandra.diy;

/**
 * 自定义切入点类
 */
public class DiyPointCut {

    public void before() {
        System.out.println("========方法执行前=======");
    }

    public void after() {
        System.out.println("========方法执行后=======");
    }
}
