package tests.testNGPractice;

import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationsExample {

    @BeforeSuite
    public static void beforeSuiteMethod() {
        System.out.println("Setting up the suite environment.");
    }

    @BeforeTest
    public static void beforeTestMethod() {
        System.out.println("Configuring test environment.");
    }
    @BeforeClass
    public static void beforeClassMethod() {
        System.out.println("Loading class resources.");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Initializing test method setup");
    }

    @Test
    public void test1() {
        System.out.println("Assert that sum of two integers is correct" );
        Assert.assertEquals(8, 5 + 3);
    }

    @Test
    public void test2() {
        System.out.println("Assert that string contains 'sum'");
        Assert.assertTrue("summary".contains("sum"));
    }

    @Test
    public void test3() {
        System.out.println("Assert that sum of two integers is incorrect" );
        Assert.assertNotEquals(11, 5 + 3);
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Cleaning up after test method");
    }

    @AfterClass
    public static void afterClassMethod() {
        System.out.println("Releasing class resources");
    }

    @AfterTest
    public static void afterTestMethod() {
        System.out.println("Tearing down test environment");
    }

    @AfterSuite
    public static void afterSuiteMethod() {
        System.out.println("Cleaning up the suite environment");

    }


}
