package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BootsPage extends BasePage{
    public BootsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class = 'b-pageheader__text']")
    WebElement bootsPageTitle;

    public String getTextBootsPageTitle(){
        String TextBootsPageTitle = bootsPageTitle.getText();
        return TextBootsPageTitle;
    }
}
