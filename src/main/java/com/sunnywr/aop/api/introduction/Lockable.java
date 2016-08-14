package com.sunnywr.aop.api.introduction;

public interface Lockable {
    void lock();
    void unlock();
    boolean isLocked();
}
