package com.epam.automation.tests.tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDiv extends BaseTest {

	@Test (dataProvider = "ValuesForDivDouble", description = "Testing Div(double) method")
	public void testDivDouble(double value1, double value2, double expected) {
		double actual = calculator.div(value1, value2);
		Assert.assertEquals(actual, expected, "Invalid result of DivDouble operation");
	}

	@DataProvider(name = "ValuesForDivDouble")
	public Object[][] ValuesForDivDouble() {
		return new Object[][] { 
            { 0, 5.1234, 0 },
            { 1.1, 2, 0.55 },
            { -1.4361234781234027834, 1, -1.4361234781234027834 }
		};
	}

	@Test (dataProvider = "ValuesForDivLong", description = "Testing Div(long) method")
	public void testDivLong(long value1, long value2, long expected) {
		long actual = calculator.div(value1, value2);
		Assert.assertEquals(actual, expected, "Invalid result of DivLong operation");
	}

	@DataProvider(name = "ValuesForDivLong")
	public Object[][] ValuesForDivLong() {
		return new Object[][] { 
            { 0, 5, 0},
            { -1, 1, -1},
            { 10, 2, 5}

		};
	}
}
