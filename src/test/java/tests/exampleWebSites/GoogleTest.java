package tests.exampleWebSites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utilities.SeleniumUtils;

public class GoogleTest {

    @BeforeTest (groups = "sanity")
    public static void beforeTestMethod() {
        System.out.println("THIS IS BEFORE TEST IN TESTNG GOOGLE CLASS");
    }

    @AfterTest (groups = "sanity")
    public static void afterTestMethod() {
        System.out.println("THIS IS AFTER TEST IN TESTNG GOOGLE CLASS");
    }


    @Test(groups = {"login"})
    public void googleTest1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @Test
    public void googleTest2() {
        System.out.println("This is test 2 of google");
        SeleniumUtils.waitForSeconds(5);
    }


    @Test(groups = {"sanity"})
    public void googleTest3() {
        System.out.println("This is test 3 of google");
        SeleniumUtils.waitForSeconds(2);
    }


    @Test(groups = {"loginTest"})
    public void login1() {
        System.out.println("login google test 1");
    }


    @Test(groups = {"loginTest"})
    public void login2() {
        System.out.println("login google test 1");
    }

    @BeforeSuite
    public static void beforeSuiteMethod() {
        System.out.println("THIS IS BEFORE SUITE INSIDE GOOGLE");
    }

    @AfterSuite
    public static void afterSuiteMethod() {
        System.out.println("THIS IS BEFORE SUITE INSIDE GOOGLE");
    }

    @BeforeTest (groups = "login")
    public static void beforeTest() {
        System.out.println("This is before test method google");
    }

    @AfterTest (groups = "login")
    public static void afterTest() {
        System.out.println("This is after test method google");
    }

    @BeforeGroups (groups = "sanity")
    public static void beforeGroups() {
        System.out.println("This is before group method google");
    }
}
