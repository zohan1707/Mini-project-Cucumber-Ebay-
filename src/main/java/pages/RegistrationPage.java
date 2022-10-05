package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class RegistrationPage extends BasePage{
    public RegistrationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@type='password']")
    WebElement passwordField;
    @FindBy(xpath = "//span[@id='Email_err']")
    WebElement errorMassage;


    public void entersIncorrectDataInEmailField(){
        emailField.sendKeys("USA");
    }
    public void passwordFieldClick(){
        passwordField.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public String getTextErrorMassage(){
        String TextErrorMassage = errorMassage.getText();
        return TextErrorMassage;
    }
}
