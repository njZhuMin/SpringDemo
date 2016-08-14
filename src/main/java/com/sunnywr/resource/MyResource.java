package com.sunnywr.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class MyResource implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void getResource() throws IOException {
//        Resource resource = applicationContext.getResource("classpath:config.txt");
//        Resource resource = applicationContext.getResource("file:" +
//                "/home/silverlining/IdeaProjects/Spring/src/main/resources/config.txt");
        Resource resource = applicationContext.getResource("config.txt");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
}
