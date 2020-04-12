package com.epam.automation.tests.tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCtg extends BaseTest {

	@Test (groups = { "Trigonometry" }, dataProvider = "ValuesForCtg", description = "Testing Ctg() method")
	public void testCtg(double value, double expected) {
		double actual = calculator.ctg(Math.toRadians(value));
		Assert.assertEquals(actual, expected, "Invalid result of Ctg operation");
	}

	@DataProvider(name = "ValuesForCtg")
	public Object[][] ValuesForCtg() {
		return new Object[][] { 
            { 0, 0 },
            { 45, 1 },
            { 90, 0 },
            { 135, -1 },
            { 180, 0 }
		};
	}

}
