package com.epam.automation.tests.tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSqrt extends BaseTest {

	@Test (dataProvider = "ValuesForSqrt", description = "Testing sqrt() method")
	public void testSqrt(double value, double expected) {
		double actual = calculator.sqrt(value);
		Assert.assertEquals(actual, expected, "Invalid result of Sqrt operation");
	}

	@DataProvider(name = "ValuesForSqrt")
	public Object[][] ValuesForSqrt() {
		return new Object[][] { 
            { 0, 0 },
            { 2.5, 1.5811388300841898 },
            { -16, 4 },
            { 9, 3 }
		};
	}
	
    @Test(expectedExceptions = ArithmeticException.class)
    public void testSqrtNegative (){
    	double value = -1;
        calculator.sqrt(value);
    }

}
