package com.epam.automation.tests.tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestMult extends BaseTest {

	@Test (dataProvider = "ValuesForMultDouble", description = "Testing mult(double) method")
	public void testMultDouble(double value1, double value2, double expected) {
		double actual = calculator.mult(value1, value2);
		Assert.assertEquals(actual, expected, "Invalid result of MultDouble operation");
	}

	@DataProvider(name = "ValuesForMultDouble")
	public Object[][] ValuesForMultDouble() {
		return new Object[][] { 
            { 1.1, 2.0, 2.2 },
            { 0, 3.5, 0 },
            { 0.5, -3.5, -1.75 },
            { -1, -39, 39 },
            { 0, 0, 0 }
		};
	}
	
	@Test (dataProvider = "ValuesForMultLong", description = "Testing mult(long) method")
	public void testMultLong(long value1, long value2, long expected) {
		long actual = calculator.mult(value1, value2);
		Assert.assertEquals(actual, expected, "Invalid result of MultLong operation");
	}

	@DataProvider(name = "ValuesForMultLong")
	public Object[][] ValuesForMultLong() {
		return new Object[][] { 
            { 5, 6, 30 },
            { 0, -4, 0 },
            { 6, -3, -18 },
            { -10, 5, -50 },
            { 0, 1, 0 }

		};
	}
}
