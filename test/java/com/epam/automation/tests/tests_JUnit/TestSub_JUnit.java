package com.epam.automation.tests.tests_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestSub_JUnit extends BaseTest_JUnit {

	@ParameterizedTest
	@CsvSource({ "1.1, 2.0, -0.9", 
				"0, 3.5, -3.5",
				"0.5, -3.5, 4.0",
				"-1.0, -39.0, 38.0",
				"0, 0, 0" })
	public void testSubDouble(double value1, double value2, double expected) {
		double actual = calculator.sub(value1, value2);
		assertEquals(expected, actual, "Invalid result of Sub(double) operation");
	}
	
	@ParameterizedTest
	@CsvSource({ "5, 6, -1", 
				"0, -4, 4",
				"6, -3, 9",
				"-10, 5, -15",
				"0, 0, 0" })
	public void testSubLong(long value1, long value2, long expected) {
		long actual = calculator.sub(value1, value2);
		assertEquals(expected, actual, "Invalid result of Sub(long) operation");
	}
}
