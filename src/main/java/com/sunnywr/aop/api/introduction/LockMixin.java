package com.sunnywr.aop.api.introduction;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class LockMixin extends DelegatingIntroductionInterceptor implements Lockable {

    private static final long serialVersionUID = 6943163819932660450L;

    private boolean locked;

    public void lock() {
        this.locked = true;
    }

    public void unlock() {
        this.locked = false;
    }

    public boolean isLocked() {
        return this.locked;
    }

    public Object invoke(MethodInvocation invocation) throws Throwable {
        if(isLocked() && invocation.getMethod().getName().indexOf("set") == 0) {
            throw new RuntimeException();
        }
        return super.invoke(invocation);
    }

}