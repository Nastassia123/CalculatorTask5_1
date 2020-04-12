package com.epam.automation.tests.tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestPow extends BaseTest {

	@Test (dataProvider = "ValuesForPow")
	public void testPow(double value1, double value2, double expected) {
		double actual = calculator.pow(value1, value2);
		Assert.assertEquals(actual, expected, "Invalid result of Pow operation");
	}

	@DataProvider(name = "ValuesForPow")
	public Object[][] ValuesForPow() {
		return new Object[][] { 
            { 1, 200, 1 },
            { 0, 3.5435345, 0 },
            { 2, -3, 0.125 },
            { -1, -39, -1 },
            { 1, 0, 1 },
            { 0.545, 4.5, 0.0651304772},
            { -1, 1.5, -1 }
		};
	}
}
