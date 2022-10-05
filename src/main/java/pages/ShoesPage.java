package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoesPage extends BasePage{
    public ShoesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id = 's0-16-12-0-1[0]-0-0-27[2]-0-toggle-button']")
    WebElement buttonMenShoes;

    @FindBy(xpath = "//h1[@class = 'b-pageheader']//span")
    WebElement shoesPageTitle;

    @FindBy(xpath = "//a[@_sp = 'p2489527.m4337.l9750.c6']")
    WebElement menBootsFilter;


    public void buttonMenShoesClick(){
        buttonMenShoes.click();
    }

    public String getTextShoesPageTitle(){
        String TextShoesPageTitle = shoesPageTitle.getText();
        return TextShoesPageTitle;
    }

    public void menBootsFilterClick(){
        menBootsFilter.click();
    }
}
