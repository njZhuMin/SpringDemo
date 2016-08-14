package com.sunnywr.aop.schema.advisors;

import org.aspectj.lang.ProceedingJoinPoint;

import javax.persistence.PessimisticLockException;

public class ConcurrentOperationExecutor {

    private static final int DEFAULT_MAX_RETRIES = 2;

    private int maxRetries = DEFAULT_MAX_RETRIES;

    private int order = 1;

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public Object doConcurrentOperation(ProceedingJoinPoint pjp) throws Throwable {
        int numAttempts = 0;
        PessimisticLockException lockFailureException;
        do {
            numAttempts++;
            System.out.println("Try times: " + numAttempts);
            try {
                return pjp.proceed();
            } catch (PessimisticLockException ex) {
                lockFailureException = ex;
            }
        } while (numAttempts <= this.maxRetries);
        System.out.println("Try error: " + numAttempts);
        throw lockFailureException;
    }
}
