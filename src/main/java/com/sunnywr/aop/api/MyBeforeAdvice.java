package com.sunnywr.aop.api;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyBeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("MyBeforeAdvice: " + method.getName()
                + ", target: " + target.getClass().getName());
    }
}
