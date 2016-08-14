package com.sunnywr.test.ioc.injection;

import com.sunnywr.test.base.UnitTestBase;
import com.sunnywr.ioc.injection.service.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {
    public TestInjection() {
        super("classpath:spring-injection.xml");
    }

    @Test
    // 设值注入测试
    public void testSetter() {
        InjectionService service = super.getBean("injectionService");
        service.save("test data");
    }

    @Test
    // 构造注入测试
    public void testCons() {
        InjectionService service = super.getBean("injectionService");
        service.save("test data");
    }
}
