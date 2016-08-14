package com.sunnywr.test.aop;

import com.sunnywr.aop.schema.advisors.service.InvokeService;
import com.sunnywr.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPScbemaAdvisors extends UnitTestBase {
    public TestAOPScbemaAdvisors() {
        super("classpath:spring-aop-schema-advisors.xml");
    }

    @Test
    public void testSave() {
        InvokeService service = super.getBean("invokeService");
        service.invoke();
        System.out.println();
        service.invokeException();
    }
}
