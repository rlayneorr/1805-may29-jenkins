package com.revature.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestClassTester {

	@Test
	public void test() {
		assertEquals("Should return true",true,(new TestClass()).test());
	}
}
