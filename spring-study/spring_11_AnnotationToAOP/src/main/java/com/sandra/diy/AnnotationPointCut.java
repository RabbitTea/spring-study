package com.sandra.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 方式三：使用注解实现AOP；
 *
 * @Aspect 标注这个类是一个切面；
 */

@Aspect
public class AnnotationPointCut {

    /**
     * @Before 表示切入的位置，写法与xml中的expression相同
     */
    @Before("execution(* com.sandra.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("方法执行前");
    }

    @After("execution(* com.sandra.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("方法执行后");
    }

    /**
     * 在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点；
     */
    @Around("execution(* com.sandra.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前");

        //获得签名
        Signature signature = pjp.getSignature();
        System.out.println("signature:" + signature);

        // 执行方法
        Object proceed = pjp.proceed();
        System.out.println("proceed:" + proceed);

        System.out.println("环绕后");
    }
}
