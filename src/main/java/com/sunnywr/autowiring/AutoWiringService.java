package com.sunnywr.autowiring;

public class AutoWiringService {

    private AutoWiringDao autoWiringDao;

    public AutoWiringService(AutoWiringDao autoWiringDao) {
        System.out.println("AutoWiringService");
        this.autoWiringDao = autoWiringDao;
    }

    public void setAutoWiringDao(AutoWiringDao autoWiringDao) {
        System.out.println("setAutoWiringDao");
        this.autoWiringDao = autoWiringDao;
    }

    public void say(String word) {
        this.autoWiringDao.say(word);
    }
}
