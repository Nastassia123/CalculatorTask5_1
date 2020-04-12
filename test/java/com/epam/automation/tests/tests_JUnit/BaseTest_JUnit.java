package com.epam.automation.tests.tests_JUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import com.epam.tat.module4.Calculator;

public class BaseTest_JUnit {

	protected static Calculator calculator;

	@BeforeAll
	public static void setUp() {
		calculator = new Calculator();
	}
	
	@AfterAll
	public static void tearDown() {
		calculator = null;
	}
}
