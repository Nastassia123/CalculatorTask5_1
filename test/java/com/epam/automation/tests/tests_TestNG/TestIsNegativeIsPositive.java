package com.epam.automation.tests.tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestIsNegativeIsPositive extends BaseTest {

	@Test (dataProvider = "ValuesForIsNegative", description = "Testing IsNegative() method")
	public void testIsNegative(long value, boolean expected) {
		boolean actual = calculator.isNegative(value);
		Assert.assertEquals(actual, expected, "Invalid result of IsNegative operation");
	}

	@DataProvider(name = "ValuesForIsNegative")
	public Object[][] ValuesForIsNegative() {
		return new Object[][] { 
            { 0, false},
            { -1, true},
            { -13, true},
            { 1, false},
            { 8888, false}
		};
	}

	@Test (dataProvider = "ValuesForIsPositive", description = "Testing IsPositive() method")
	public void testIsPositive(long value, boolean expected) {
		boolean actual = calculator.isPositive(value);
		Assert.assertEquals(actual, expected, "Invalid result of IsPositive operation");
	}

	@DataProvider(name = "ValuesForIsPositive")
	public Object[][] ValuesForIsPositive() {
		return new Object[][] { 
            { 1, true},
            { -1, false},
            { -13, false},
            { 0, false}
		};
	}

}
