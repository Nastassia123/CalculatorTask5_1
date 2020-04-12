package com.epam.automation.tests.tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSum extends BaseTest {

	@Test(dataProvider = "ValuesForSumDouble", description = "Testing sum(double) method")
	public void testSumDouble(double value1, double value2, double expected) {
		double actual = calculator.sum(value1, value2);
		Assert.assertEquals(actual, expected, "Invalid result of SumDouble operation");
	}

	@DataProvider(name = "ValuesForSumDouble")
	public Object[][] ValuesForSumDouble() {
		return new Object[][] { 
            { 1.1, 2.0, 3.1 },
            { 0, 3.5, 3.5 },
            { 0.5, -3.5, -3.0 },
            { -1, -39, -40 },
            { 0, 0, 0 }
		};
	}
	
	@Test(dataProvider = "ValuesForSumLong", description = "Testing sum(double) method")
	public void testSumLong(long value1, long value2, long expected) {
		long actual = calculator.sum(value1, value2);
		Assert.assertEquals(actual, expected, "Invalid result of SumLong operation");
	}

	@DataProvider(name = "ValuesForSumLong")
	public Object[][] ValuesForSumLong() {
		return new Object[][] { 
            { 5, 6, 11 },
            { 0, -4, -4 },
            { 6, -3, 3 },
            { -10, 5, -5 },
            { 0, 0, 0 }
		};
	}
}

