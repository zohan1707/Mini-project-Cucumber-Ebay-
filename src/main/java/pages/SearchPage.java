package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class SearchPage extends BasePage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@aria-label = '16 GB']")
    WebElement filter16GB;

    @FindBy(xpath = "//a[@class = 'srp-carousel-list__item-link']//div[text() = '16 GB']")
    WebElement button16GB;



    public void clickFilter(){
        filter16GB.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public String getTextFilterButton(){
        String TextFilterButton = button16GB.getText();
        return TextFilterButton;
    }
}
