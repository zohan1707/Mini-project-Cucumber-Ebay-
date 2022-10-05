package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplePage extends  BasePage{
    public ApplePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(xpath = "//h1")
    WebElement nikePageTitle;

    @FindBy(xpath = "//a[@_sp = 'p2489527.m4335.l8631']")
    WebElement nextPageButton;

    @FindBy(xpath = "//a[@type = 'previous']")
    WebElement previousPageButton;

    @FindBy(xpath = "//h2[@id = 's0-27-9-0-1[0]-0-2-0-title']")
    WebElement titleFirstNikePage;

    public String getTextApplePageTitle(){
        String TextApplePageTitle = nikePageTitle.getText();
        return TextApplePageTitle;
    }

    public void clickNextPageButton(){
        nextPageButton.click();
    }

    public void clickPreviousPageButton(){
        previousPageButton.click();
    }

    public String getTextTitleFirstApplePage(){
        String TextTitleFirstApplePage = titleFirstNikePage.getText();
        return TextTitleFirstApplePage;
    }
}
