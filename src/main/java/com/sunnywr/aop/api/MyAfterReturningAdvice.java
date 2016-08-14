package com.sunnywr.aop.api;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class MyAfterReturningAdvice implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("MyAfterReturningAdvice afterReturning: "
                + method.getName() + " " + target.getClass().getName() + " " + returnValue);
    }
}
