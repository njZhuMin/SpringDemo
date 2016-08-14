package com.sunnywr.test.aop;

import com.sunnywr.aop.api.BizLogic;
import com.sunnywr.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPAPI extends UnitTestBase {
    public TestAOPAPI() {
        super("classpath:spring-aop-api.xml");
    }

    @Test
    public void testSave() {
        BizLogic logic = (BizLogic)super.getBean("bizLogicImpl");
        logic.save();
    }
}
