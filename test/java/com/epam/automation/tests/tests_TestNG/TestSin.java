package com.epam.automation.tests.tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSin extends BaseTest {

	@Test (groups = { "Trigonometry", "SinCos" }, dataProvider = "ValuesForSin", description = "Testing sin() method")
	public void testCos(double value, double expected) {
		double actual = calculator.sin(value);
		Assert.assertEquals(actual, expected, "Invalid result of Sin operation");
	}

	@DataProvider(name = "ValuesForSin")
	public Object[][] ValuesForSin() {
		return new Object[][] { 
            { 0, 0 },
            { Math.PI / 2, 1 },
            { Math.PI / 4, 0.7071067811865475 }

		};
	}

}
