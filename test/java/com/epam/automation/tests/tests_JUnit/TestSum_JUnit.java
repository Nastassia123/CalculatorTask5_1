package com.epam.automation.tests.tests_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestSum_JUnit extends BaseTest_JUnit {

	@ParameterizedTest
	@CsvSource({ "1.1, 2.0, 3.1", 
				"0, 3.5, 3.5",
				"0.5, -3.5, -3.0",
				"-1, -39, -40",
				"0, 0, 0" })
	public void testSumDouble(double value1, double value2, double expected) {
		double actual = calculator.sum(value1, value2);
		assertEquals(expected, actual, "Invalid result of Sum(double) operation");
	}
	
	@ParameterizedTest
	@CsvSource({ "5, 6, 11", 
				"0, -4, -4",
				"6, -3, 3",
				"-10, 5, -5",
				"0, 0, 0" })
	public void testSumLong(long value1, long value2, long expected) {
		long actual = calculator.sum(value1, value2);
		assertEquals(expected, actual, "Invalid result of Sum(long) operation");
	}
}
