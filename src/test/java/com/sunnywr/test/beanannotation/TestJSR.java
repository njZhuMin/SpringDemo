package com.sunnywr.test.beanannotation;

import com.sunnywr.beanannotation.jsr.JsrService;
import com.sunnywr.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJSR extends UnitTestBase {
    public TestJSR() {
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void testSave() {
        JsrService service = super.getBean("jsrService");
        service.save();
    }
}
