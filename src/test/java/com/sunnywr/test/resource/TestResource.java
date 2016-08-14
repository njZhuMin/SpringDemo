package com.sunnywr.test.resource;

import com.sunnywr.resource.MyResource;
import com.sunnywr.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.io.IOException;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestResource extends UnitTestBase {
    public TestResource() {
        super("classpath*:spring-resource.xml");
    }

    @Test
    public void testResource() {
        MyResource resource = super.getBean("myResource");
        try {
            resource.getResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
