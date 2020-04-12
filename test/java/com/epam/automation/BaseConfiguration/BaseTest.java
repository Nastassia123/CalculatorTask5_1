package com.epam.automation.BaseConfiguration;



import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {

    protected Calculator calculator;

    @Before
    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    @AfterClass
    public void tearDown() {
        calculator = null;
    }

}