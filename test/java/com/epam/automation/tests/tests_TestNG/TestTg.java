package com.epam.automation.tests.tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestTg extends BaseTest {

	@Test (groups = { "Trigonometry" }, dataProvider = "ValuesForTg", description = "Testing tg() method")
	public void testTg(double value, double expected) {
		double actual = calculator.tg(Math.toRadians(value));
		Assert.assertEquals(actual, expected, "Invalid result of Tg operation");
	}

	@DataProvider(name = "ValuesForTg")
	public Object[][] ValuesForTg() {
		return new Object[][] { 
            { 0, 0 },
            { 45, 1 },
            { 90, 0 },
            { 135, -1 },
            { 180, 0 }
		};
	}

}
