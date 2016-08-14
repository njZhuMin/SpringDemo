package com.sunnywr.test.aop;

import com.sunnywr.aop.aspectj.biz.MyBiz;
import com.sunnywr.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAspectJ extends UnitTestBase {
    public TestAspectJ() {
        super("classpath:spring-aop-aspectj.xml");
    }

    @Test
    public void test() {
        MyBiz biz = super.getBean("myBiz");
        biz.save("this is a test");
    }
}
