package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DirectoryBasePage extends BasePage {

    public DirectoryBasePage() {
        super(Driver.getDriver());
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//label[text()='Job Title']/../following-sibling::div/div")
    public WebElement jobTitleDropdown;

    @FindBy(xpath = "//span[text()='Chief Financial Officer']")
    public WebElement chiefFinancialOfficer;

    @FindBy(css = "button[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    public WebElement searchButton;

    @FindBy(xpath = "//p[text()='New York Sales Office']")
    public WebElement locationOfPerson;

    @FindBy(xpath = "//span[text()='HR Manager']")
    public WebElement hrManager;

    @FindBy(xpath = "//div[@class='oxd-grid-4']/div")
    public List<WebElement> listOfHRManager;

    @FindBy(css = "p[class='oxd-text oxd-text--p orangehrm-directory-card-subtitle --break-words']")
    public WebElement hrManagerTitleText;


    @Override
    public void search(String ... parameters) {
        String employeeName = parameters[0];
        String jobTitle = parameters[1];
        String location = parameters[2];
    }
}
