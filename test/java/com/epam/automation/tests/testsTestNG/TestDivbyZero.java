package com.epam.automation.tests.testsTestNG;

import org.testng.annotations.Test;

public class TestDivbyZero extends BaseTest {
	
	@Test (expectedExceptions = NumberFormatException.class, description = "Testing DivbyZero(double) method")
	public void testDivDouble() {
		double value1d = 1.0;
		double value2d = 0.0;
		calculator.div(value1d, value2d);
	}

	@Test (expectedExceptions = NumberFormatException.class, description = "Testing DivbyZero(long) method")
	public void testDivLong() {
		long value1l = 1;
		long value2l = 0;
		calculator.div(value1l, value2l);
	}
}
