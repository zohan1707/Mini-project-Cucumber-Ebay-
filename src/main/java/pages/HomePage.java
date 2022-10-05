package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@id = 'gh-ug']//a[contains(text(),'Sign in')]")
    WebElement buttonSignIn;

    @FindBy(xpath = "//input[@class = 'gh-tb ui-autocomplete-input']")
    WebElement input;

    @FindBy(xpath = "//input[@class = 'btn btn-prim gh-spr']")
    WebElement buttonSearch;

    @FindBy(xpath = "//button[@id = 'gh-shop-a']")
    WebElement buttonShopByCategory;

    @FindBy(xpath = "//a[text() = 'Shoes']")
    WebElement buttonShoes;

    @FindBy(xpath = "//h3[text() = 'Apple']")
    WebElement iconNike;

    @FindBy(xpath = "//a[@id='gf-fbtn']")
    WebElement iconCurrentLanguage;

    @FindBy(xpath = "//p[text() = 'Spain']")
    WebElement iconSpainLanguage;

    @FindBy(xpath = "//h2[text()='Lo más en eBay']")
    WebElement homePageTitleOnSpain;
    @FindBy(xpath = "//a[@_sp='m570.l2621']")
    WebElement registerButton;

    @FindBy(xpath = "//img[@alt='iRobot Roomba E6 Vacuum Cleaning Robot  E6198 Manufacturer Certified Refurbished']")
    WebElement productIcon;

    @FindBy(xpath = "//button[@_sp='m570.l46241']")
    WebElement buttonShipTo;

    @FindBy(xpath = "//div[@class='flag-wrapper']")
    WebElement listShipTo;

    @FindBy(xpath = "//span[@data-country-text='Albania']")
    WebElement buttonAlbania;

    @FindBy(xpath = "//button[@class='shipto__close-btn']")
    WebElement buttonDone;

    @FindBy(xpath = "//a[@_sp='m570.l1545']")
    WebElement helpAndContact;

    @FindBy(xpath = "//td[@class='gh-td']")
    WebElement refreshButton;

    @FindBy(xpath = "//span[text()='A World of Vehicles']")
    WebElement inscription;

    public void openHomePage(String url) {
        driver.get(url);
    }

    public void buttonSignInClick() {
        buttonSignIn.click();
    }

    public void searchAsusProducts(final String keyword) {
        input.sendKeys(keyword);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void buttonSearchClick() {
        buttonSearch.click();
    }

    public void buttonShopByCategoryClick() {
        buttonShopByCategory.click();
    }

    public void buttonShoesClick() {
        buttonShoes.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void iconNikeClick() {
        iconNike.click();
    }

    public void moveToIconCurrentLanguage() {
        Actions actions = new Actions(driver);
        actions
                .moveToElement(iconCurrentLanguage)
                .build()
                .perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clickIconSpainLanguage() {
        iconSpainLanguage.click();
    }

    public String getTextHomePageTitleOnSpain() {
        String TextHomePageTitleOnSpain = homePageTitleOnSpain.getText();
        return TextHomePageTitleOnSpain;
    }

    public void registerButtonClick() {
        registerButton.click();
    }

    public void productIconClick() {
        productIcon.click();
    }

    public void buttonShipToClick() {
        buttonShipTo.click();
    }

    public void listShipToClick() {
        listShipTo.click();
    }

    public void buttonAlbaniaClick() {
        Actions actions = new Actions(driver);
        actions
                .scrollToElement(buttonAlbania)
                .moveToElement(buttonAlbania)
                .click()
                .build()
                .perform();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void buttonDoneClick() {
        buttonDone.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void helpAndContactClick() {
        helpAndContact.click();
    }

    public void refreshButtonClick() {
        refreshButton.click();
    }

    public String getTextElementInscription() {
        String TextElementInscription = inscription.getText();
        return TextElementInscription;
    }
}
