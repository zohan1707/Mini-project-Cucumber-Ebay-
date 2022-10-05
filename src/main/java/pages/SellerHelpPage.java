package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SellerHelpPage extends BasePage{
    public SellerHelpPage(WebDriver driver) {
            super(driver);
            this.driver = driver;
        }

        @FindBy(xpath = "//h1")
        WebElement titleSellerHelpPage;

        public String getTextTitleSellerHelpPage(){
            String TextTitleSellerHelpPage = titleSellerHelpPage.getText();
            return TextTitleSellerHelpPage;
        }
}
