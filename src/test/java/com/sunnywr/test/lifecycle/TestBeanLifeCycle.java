package com.sunnywr.test.lifecycle;

import com.sunnywr.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanLifeCycle extends UnitTestBase {
    public TestBeanLifeCycle() {
        super("classpath*:spring-lifecycle.xml");
    }

    @Test
    public void test() {
        super.getBean("beanLifeCycle");
    }
}
