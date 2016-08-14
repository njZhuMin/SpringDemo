package com.sunnywr.test.beanannotation;

import com.sunnywr.beanannotation.javabased.MyDriverManager;
import com.sunnywr.beanannotation.javabased.Store;
import com.sunnywr.beanannotation.javabased.StringStore;
import com.sunnywr.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
    public class TestJavaBased extends UnitTestBase {
        public TestJavaBased() {
            super("classpath*:spring-beanannotation.xml");
        }

    @Test
    public void test() {
//        Store store = super.getBean("stringStore");
        Store store = super.getBean("store");
        System.out.println(store.getClass().getName());
    }

    @Test
    public void testMyDriverManager() {
        MyDriverManager manager = super.getBean("myDriverManager");
        System.out.println(manager.getClass().getName());
    }

    @Test
    public void testG() {
        StringStore store = super.getBean("stringStoreTest");
    }
}
