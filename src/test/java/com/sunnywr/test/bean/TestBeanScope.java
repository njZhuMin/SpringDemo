package com.sunnywr.test.bean;

import com.sunnywr.bean.BeanScope;
import com.sunnywr.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase {
    public TestBeanScope() {
        super("classpath*:spring-beanscope.xml");
    }

    @Test
    public void testSingleton() {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

        BeanScope beanScope2 = super.getBean("beanScope");
        beanScope2.say();
    }

    @Test
    public void testPrototype() {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();
    }
}
