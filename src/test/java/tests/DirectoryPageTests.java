package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CommonBasePage;
import pages.DirectoryBasePage;
import pages.LoginBasePage;
import utilities.Driver;

import java.time.Duration;

public class DirectoryPageTests {

    LoginTests loginTests = new LoginTests();
    CommonBasePage commonPage = new CommonBasePage();
    DirectoryBasePage directoryPage = new DirectoryBasePage();

    LoginBasePage loginPage = new LoginBasePage();

    WebDriver driver = Driver.getDriver();

    @BeforeMethod
    public void startPoint() {

        driver.get("https://opensource-demo.orangehrmlive.com/");
        loginPage.login("Admin", "admin123");
        commonPage.directoryTab.click();
    }

    @Test
    public void clickJobTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        directoryPage.jobTitleDropdown.click();
        directoryPage.hrManager.click();
        directoryPage.searchButton.click();

        if (!directoryPage.hrManagerTitleText.isDisplayed()) {
            directoryPage.searchButton.click();
        }
        Assert.assertEquals(directoryPage.hrManagerTitleText.getText(), "HR Manager");


        Assert.assertTrue(directoryPage.listOfHRManager.get(0).isDisplayed());


    }
}
