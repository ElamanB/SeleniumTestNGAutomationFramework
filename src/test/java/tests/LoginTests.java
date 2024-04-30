package tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginBasePage;
import utilities.Driver;

public class LoginTests {

    WebDriver driver;
    LoginBasePage loginPage;


    @BeforeMethod
    public void before() {
        driver = Driver.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }


    @Test
    public void testSuccessfulLogin() {
        loginPage = new LoginBasePage();
        loginPage.login("Admin", "admin123");
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));

    }

    @Test
    public void testUnsuccessfulLogin() {
        loginPage.login("Admin123", "admin");
        Assert.assertTrue(loginPage.invalidLoginMessage.isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        // Optionally clear session data or navigate back if needed
        driver.manage().deleteAllCookies(); // Clears cookies to reset session
    }



}
