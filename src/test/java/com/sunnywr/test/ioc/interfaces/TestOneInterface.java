package com.sunnywr.test.ioc.interfaces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.sunnywr.ioc.interfaces.OneInterface;
import com.sunnywr.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {

	public TestOneInterface() {
		super("classpath*:spring-interfaces.xml");
	}
	
	@Test
	public void testSay() {
		OneInterface oneInterface = super.getBean("oneInterface");
		oneInterface.say("This is a test.");
	}

}
