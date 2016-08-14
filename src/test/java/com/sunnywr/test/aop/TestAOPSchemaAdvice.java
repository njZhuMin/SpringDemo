package com.sunnywr.test.aop;

import com.sunnywr.aop.schema.advice.Fit;
import com.sunnywr.aop.schema.advice.biz.AspectBiz;
import com.sunnywr.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPSchemaAdvice extends UnitTestBase {
    public TestAOPSchemaAdvice() {
        super("classpath:spring-aop-schema-advice.xml");
    }

    @Test
    public void testBiz() {
        AspectBiz biz = super.getBean("aspectBiz");
        biz.biz();
    }

    @Test
    public void testInit() {
        AspectBiz biz = super.getBean("aspectBiz");
        biz.init("myService", 3);
    }

    @Test
    public void testFit() {
        Fit fit = (Fit)super.getBean("aspectBiz");
        fit.filter();
    }
}
