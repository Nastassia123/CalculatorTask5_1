package com.epam.automation.tests.tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCos extends BaseTest {

	@Test (groups = { "Trigonometry", "SinCos" }, dataProvider = "ValuesForCos", description = "Testing Cos() method")
	public void testCos(double value, double expected) {
		double actual = calculator.cos(value);
		Assert.assertEquals(actual, expected, "Invalid result of Cos operation");
	}

	@DataProvider(name = "ValuesForCos")
	public Object[][] ValuesForCos() {
		return new Object[][] { 
			{ 0, 1 }, 
			{ Math.PI / 2, 0 }, 
			{ Math.PI / 4, Math.sqrt(2) / 2 } 
		};
	}
}
