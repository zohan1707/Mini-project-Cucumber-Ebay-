package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
    public ProductPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    @FindBy(xpath = "//h1//span[text() = 'iRobot Roomba E6 Vacuum Cleaning Robot  E6198 Manufacturer Certified Refurbished']")
    WebElement productPageTitle;

    @FindBy(xpath = "//a[@_sp='p2047675.l1473']")
    WebElement buttonViewInCart;

    public void buttonViewInCartClick(){
        buttonViewInCart.click();
    }

    public String getTextProductPageTitle(){
        String TextProductPageTitle = productPageTitle.getText();
        return TextProductPageTitle;
    }
}
