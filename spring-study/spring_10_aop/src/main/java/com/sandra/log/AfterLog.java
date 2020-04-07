package com.sandra.log;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterLog implements AfterReturningAdvice {

    /**
     * 目标对象的方法执行返回后执行该切面的方法
     * @param returnValue
     *             返回值
     * @param method
     * @param objects
     * @param o1
     * @throws Throwable
     */
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了" + method.getName() + "方法，返回结果为：" + returnValue);
    }
}
