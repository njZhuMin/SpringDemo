package com.sunnywr.aop.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void before() {
        System.out.println("MyAspect before...");
    }

    public void afterReturning() {
        System.out.println("MyAspect afterReturning...");
    }

    public void afterThrowing() {
        System.out.println("MyAspect afterThrowing...");
    }

    public void after() {
        System.out.println("MyAspect after...");
    }

    public Object around(ProceedingJoinPoint pjp) {
        Object object = null;
        try {
            System.out.println("MyAspect around 1...");
            object = pjp.proceed();
            System.out.println("MyAspect around 2...");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return object;
    }

    public Object aroundInit(ProceedingJoinPoint pjp, String bizName, int times) {
        System.out.println(bizName + ", " + times);
        Object object = null;
        try {
            System.out.println("MyAspect aroundInit 1...");
            object = pjp.proceed();
            System.out.println("MyAspect aroundInit 2...");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return object;
    }
}
