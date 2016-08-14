package com.sunnywr.aop.api;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("MyMethodInterceptor 1: " + invocation.getMethod().getName()
            + " " + invocation.getStaticPart().getClass().getName());
        Object obj = invocation.proceed();
        System.out.println("MyMethodInterceptor 2: " + obj);
        return obj;
    }
}
