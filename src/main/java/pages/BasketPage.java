package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage {
    public BasketPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[text() = 'iRobot Roomba E6 Vacuum Cleaning Robot  E6198 Manufacturer Certified Refurbished']")
    WebElement productTitle;

    public String getTextProductTitle() {
        String TextProductTitle = productTitle.getText();
        return TextProductTitle;
    }
}
