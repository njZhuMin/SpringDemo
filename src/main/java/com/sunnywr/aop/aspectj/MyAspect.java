package com.sunnywr.aop.aspectj;

import com.sunnywr.aop.aspectj.biz.MyMethod;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Pointcut("execution(* com.sunnywr.aop.aspectj.biz.*Biz.*(..))")
    public void pointcut() {

    }

    @Pointcut("within(com.sunnywr.aop.aspectj.biz.*)")
    public void bizPointcut() {

    }

//    @Before("execution(* com.sunnywr.aop.aspectj.biz.*Biz.*(..))")
    @Before("pointcut()")
    public void before() {
        System.out.println("Before...");
    }

    @AfterReturning(pointcut="bizPointcut()", returning="returnValue")
    public void afterReturning(Object returnValue) {
        System.out.println("AfterReturning: " + returnValue);
    }

    @AfterThrowing(pointcut="pointcut()", throwing="e")
    public void afterThrowing(RuntimeException e) {
        System.out.println("AfterThrowing: " + e.getMessage());
    }

    @After("pointcut()")
    public void after() {
        System.out.println("After...");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around 1...");
        Object obj = pjp.proceed();
        System.out.println("Around 2...");
        System.out.println("Around: " + obj);
        return obj;
    }

    @Before("pointcut() && args(arg)")
    public void beforeWithParam(String arg) {
        System.out.println("BeforeWithParam: " + arg);
    }

    @Before("pointcut() && @annotation(myMethod)")
    public void beforeWithAnnotaion(MyMethod myMethod) {
        System.out.println("BeforeWithAnnotation: " + myMethod.value());
    }
}
