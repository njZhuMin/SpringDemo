package com.sunnywr.ioc.injection.service;

import com.sunnywr.ioc.injection.dao.InjectionDao;

public class InjectionServiceImpl implements InjectionService {

    private InjectionDao injectionDao;

    // 构造注入
    public InjectionServiceImpl(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }

    // 设值注入
    public void setInjectionDao(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }

    public void save(String arg) {
        System.out.println("Receive data: " + arg);
        arg = arg + ": " + this.hashCode();
        injectionDao.save(arg);
    }
}
