package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[text() = 'Continue']")
    WebElement buttonContinue;

    @FindBy(xpath = "//span[@class = 'inline-notice__main']//p//p")
    WebElement errorMessage;

    public void buttonContinueClick(){
        buttonContinue.click();
    }
    public String getTextErrorMessage(){
        String TextErrorMessage = errorMessage.getText();
        return TextErrorMessage;
    }
}
