package tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGIntroTests {

    @BeforeTest
    public static void beforeTestMethod() {
        System.out.println("THIS IS BEFORE TEST IN TESTNG INTRO CLASS");
    }

    @AfterTest
    public static void afterTestMethod() {
        System.out.println("THIS IS AFTER TEST IN TESTNG INTRO CLASS");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("This is before class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("this is before method");
    }

    @Test
    public void test1() {
        System.out.println("I am test 1");
        Assert.assertTrue(5 > 2);
    }

    @Test
    public void test2() {
        Assert.assertFalse(2 > 5);
        System.out.println("I am test 2");
    }

    @Test
    public void test3() {
        Assert.assertEquals(2, 5 - 3);
        System.out.println("I am test 3");
    }

    @Test
    public void test4() {
        Assert.assertFalse(2 > 5);
        System.out.println("I am test 4");
    }

}
