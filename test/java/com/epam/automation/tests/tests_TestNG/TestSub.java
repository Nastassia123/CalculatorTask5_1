package com.epam.automation.tests.tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSub extends BaseTest {

	@Test(dataProvider = "ValuesForSubDouble", description = "Testing sub(double) method")
	public void testSubDouble(double value1, double value2, double expected) {
		double actual = calculator.sub(value1, value2);
		Assert.assertEquals(actual, expected, "Invalid result of SubDouble operation");
	}

	@DataProvider(name = "ValuesForSubDouble")
	public Object[][] ValuesForSubDouble() {
		return new Object[][] { 
            { 1.1, 2.0, -0.9 }, 
            { 0, 3.5, -3.5 },
            { 0.5, -3.5, 4 },
            { -1, -39, 38 },
            { 0, 0, 0 }
		};
	}
	
	@Test(dataProvider = "ValuesForSubLong", description = "Testing sub(long) method")
	public void testSubLong(long value1, long value2, long expected) {
		long actual = calculator.sub(value1, value2);
		Assert.assertEquals(actual, expected, "Invalid result of SubLong operation");
	}

	@DataProvider(name = "ValuesForSubLong")
	public Object[][] ValuesForSubLong() {
		return new Object[][] { 
            { 5, 6, -1 },
            { 0, -4, 4 },
            { 6, -3, 9 },
            { -10, 5, -15 },
            { 0, 0, 0 }

		};
	}
}
