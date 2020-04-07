package com.sandra.log;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * 这里日志类是一个切面；
 * 是抽象了业务方法中需要的公共操作，模块化出来的类；
 *
 * 实现Spring API中MethodBeforeAdvice接口
 */
public class BeforeLog implements MethodBeforeAdvice {

    /**
     *
     * @param method
     *          要执行的目标对象的方法
     * @param objects
     *          参数
     * @param target
     *          目标对象
     * @throws Throwable
     */
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "被执行了");
    }
}
