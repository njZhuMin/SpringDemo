package com.sunnywr.ioc.injection.dao;

public class InjectionDaoImpl implements InjectionDao {
    public void save(String arg) {
        System.out.println("Saving data: " + arg);
    }
}
