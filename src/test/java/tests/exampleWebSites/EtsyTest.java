package tests.exampleWebSites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.SeleniumUtils;

public class EtsyTest {

    @BeforeTest
    public void beforeTest() {
        System.out.println("THIS IS BEFORE TEST INSIDE ETSY CLASS");
    }
    @BeforeTest
    public void afterTest() {
        System.out.println("THIS IS AFTER TEST INSIDE ETSY CLASS");
    }

    @Test(groups = {"login"})
    public void etsyTest1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
    }

    @Test(groups = {"sanity"})
    public void etsyTest2() {
        System.out.println("This is test 2 of etsy");
        SeleniumUtils.waitForSeconds(3);
    }

    @Test
    public void etsyTest3() {
        System.out.println("This is test 3 of etsy");
        SeleniumUtils.waitForSeconds(8);
    }

    @Test(groups = {"loginTest"})
    public void login1() {
        System.out.println("login etsy test 1");
    }

    @Test(groups = {"loginTest"})
    public void login2() {
        System.out.println("login etsy test 1");
    }
}
