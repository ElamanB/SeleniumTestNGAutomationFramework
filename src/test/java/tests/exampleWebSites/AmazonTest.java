package tests.exampleWebSites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.SeleniumUtils;

public class AmazonTest {

    @BeforeTest
    public void beforeTest() {
        System.out.println("THIS IS BEFORE TEST INSIDE AMAZON CLASS");
    }
    @BeforeTest
    public void afterTest() {
        System.out.println("THIS IS AFTER TEST INSIDE AMAZON CLASS");
    }

    @Test(groups = {"sanity"})
    public void amazonTest1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
    }

    @Test
    public void amazonTest2() {
        System.out.println("This is test 2 of amazon");
        SeleniumUtils.waitForSeconds(5);
    }

    @Test(groups = {"login"})
    public void amazonTest3() {
        System.out.println("This is test 3 of amazon");
        SeleniumUtils.waitForSeconds(3);
    }

    @Test(groups = {"loginTest"})
    public void login1() {
        System.out.println("login amazon test 1");
    }

    @Test(groups = {"loginTest"})
    public void login2() {
        System.out.println("login amazon test 1");
    }
}
