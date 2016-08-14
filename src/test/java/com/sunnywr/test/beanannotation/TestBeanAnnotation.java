package com.sunnywr.test.beanannotation;

import com.sunnywr.beanannotation.BeanAnnotation;
import com.sunnywr.beanannotation.injection.service.InjectionService;
import com.sunnywr.beanannotation.multibean.BeanInvoker;
import com.sunnywr.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase {
    public TestBeanAnnotation() {
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void testSay() {
//      BeanAnnotation bean = super.getBean("bean");
        BeanAnnotation bean = super.getBean("beanAnnotation");
        bean.say("this is a test");
    }

    @Test
    public void testScope() {
        BeanAnnotation bean = super.getBean("beanAnnotation");
        bean.getHashCode();

        bean = super.getBean("beanAnnotation");
        bean.getHashCode();
    }

    @Test
    public void testAutoWiried() {
        InjectionService service = super.getBean("injectionServiceImpl");
        service.save("this is auto-wired test");
    }

    @Test
    public void testMultiBean() {
        BeanInvoker invoker = super.getBean("beanInvoker");
        invoker.say();
    }
}