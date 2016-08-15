package com.sunnywr.aop.aspectj.biz;

import com.sunnywr.aop.aspectj.MyMethod;
import org.springframework.stereotype.Service;

@Service
public class MyBiz {

    @MyMethod("MyBiz save from MyMethod")
    public String save(String arg) {
        System.out.println("MyBiz save: " + arg);
//        throw new RuntimeException("Save fail!");
        return "Save success!";
    }
}