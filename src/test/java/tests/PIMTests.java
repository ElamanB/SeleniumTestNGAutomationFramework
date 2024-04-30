package tests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CommonBasePage;
import pages.LoginBasePage;
import pages.PIMPage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class PIMTests {

    LoginBasePage loginPage = new LoginBasePage();
    PIMPage pimPage = new PIMPage();
    CommonBasePage commonPage = new CommonBasePage();
    WebDriver driver = Driver.getDriver();

    @BeforeMethod
    public void startPoint() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        loginPage.login("Admin", "admin123");
        commonPage.pimTab.click();
    }

    @Test
    public void verifyAdminCanCreateEmployee() {

        pimPage.addEmployee();

        String expectedName = pimPage.fName + " " + pimPage.lName;

        SeleniumUtils.verifyTextInElement(driver, 20, pimPage.fullNameText, expectedName);
        commonPage.pimTab.click();

//        WebElement empIdInTable = driver.findElement(By.xpath("//div[text()='" + pimPage.employeeId + "']"));
//        WebElement firstNameInTable = driver.findElement(By.xpath("//div[text()='" + pimPage.employeeId + "']/following-sibling::div[1]"));
//        WebElement lastNameInTable = driver.findElement(By.xpath("//div[text()='" + pimPage.employeeId + "']/following-sibling::div[2]"));
//
//        SeleniumUtils.verifyTextInElement(driver, 20, empIdInTable, pimPage.employeeId);
//        SeleniumUtils.verifyTextInElement(driver, 20, firstNameInTable, pimPage.fName);
//        SeleniumUtils.verifyTextInElement(driver, 20, lastNameInTable, pimPage.lName);


//        pimPage.getListOfEmpId();
        System.out.println(pimPage.listOfEmpID.size());
    }

    @AfterMethod
    public void endPoint() {

    }
}
