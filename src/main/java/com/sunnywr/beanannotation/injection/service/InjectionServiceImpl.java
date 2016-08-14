package com.sunnywr.beanannotation.injection.service;

import com.sunnywr.beanannotation.injection.dao.InjectionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InjectionServiceImpl implements InjectionService {

//    @Autowired
    private InjectionDao injectionDao;

    // 构造注入
    @Autowired
    public InjectionServiceImpl(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }

    // 设值注入
//    @Autowired
    public void setInjectionDao(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }

    public void save(String arg) {
        System.out.println("Receive data: " + arg);
        arg = arg + ": " + this.hashCode();
        injectionDao.save(arg);
    }
}
