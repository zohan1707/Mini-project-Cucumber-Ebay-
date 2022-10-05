package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class CustomerServicePage extends  BasePage{
    public CustomerServicePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(xpath = "//td[@id='gh-title']")
    WebElement titleCustomerService;

    @FindBy(xpath = "//input[@id='search_input_element']")
    WebElement input;

    @FindBy(xpath = "//span[text()='Seller Help']")
    WebElement titleSellerHelp;



    public String getTextTitleCustomerService(){
        String TextTitleCustomerService = titleCustomerService.getText();
        return TextTitleCustomerService;
    }
    public void inputEntersData(){
        input.sendKeys("Seller Help");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void titleSellerHelpClick(){
        titleSellerHelp.click();
    }
}
