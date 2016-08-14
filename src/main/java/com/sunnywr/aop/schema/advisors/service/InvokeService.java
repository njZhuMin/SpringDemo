package com.sunnywr.aop.schema.advisors.service;

import org.springframework.stereotype.Service;

import javax.persistence.PessimisticLockException;

@Service
public class InvokeService {

    public void invoke() {
        System.out.println("InvokeService...");
    }

    public void invokeException() {
        throw new PessimisticLockException("");
    }
}
