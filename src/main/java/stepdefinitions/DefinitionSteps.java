package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.junit.Assert.assertEquals;

public class DefinitionSteps {

    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    SearchPage searchPage;
    ShoesPage shoesPage;
    BootsPage bootsPage;
    ApplePage nikePage;
    RegistrationPage registrationPage;
    ProductPage productPage;
    BasketPage basketPage;
    CustomerServicePage customerServicePage;
    SellerHelpPage sellerHelpPage;
    PageFactoryManager pageFactoryManager;



    @Before
    public void testsSetUp(){
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }
    @And("User opens {string} page")
    public void openPage (final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }
    @And("User clicks the Sign-In button")
    public void clickButtonSignIn() {
        homePage = pageFactoryManager.getHomePage();
        homePage.buttonSignInClick();
    }
    @And("User clicks continue button on login page")
    public void clickButtonContinue() {
        loginPage = pageFactoryManager.getLoginPage();
        loginPage.buttonContinueClick();
    }
    @Then("User checks if warning message is displayed")
    public void checkingWarningMessage(){
        loginPage = pageFactoryManager.getLoginPage();
        assertEquals("Oops, that's not a match.", loginPage.getTextErrorMessage());
    }
    @And("User enters data in input field")
    public void entersDataInInput(){
        homePage = pageFactoryManager.getHomePage();
        homePage.searchAsusProducts("Asus");
    }
    @And("User clicks the Search button")
    public void clickSearchButton(){
        homePage = pageFactoryManager.getHomePage();
        homePage.buttonSearchClick();
    }
    @Then("User selects one of the filters")
    public void selectFilter(){
        searchPage = pageFactoryManager.getSearchPage();
        searchPage.clickFilter();
    }
    @And("User clicks the Shop by category button")
    public void clickShopByCategoryButton(){
        homePage = pageFactoryManager.getHomePage();
        homePage.buttonShopByCategoryClick();
    }
    @And("User clicks the Shoes button")
    public void clickShoesButton(){
        homePage = pageFactoryManager.getHomePage();
        homePage.buttonShoesClick();
    }
    @And("User checks if he is on the page Shoes")
    public void checksShoesPage(){
        shoesPage = pageFactoryManager.getShoesPage();
        assertEquals("Shoes", shoesPage.getTextShoesPageTitle());
    }
    @And("User clicks filter Men's shoes")
    public void clickMenShoesFilter(){
        shoesPage = pageFactoryManager.getShoesPage();
        shoesPage.buttonMenShoesClick();
    }
    @And("User clicks filter Men's boots")
    public void clickMenBootsFilter(){
        shoesPage = pageFactoryManager.getShoesPage();
        shoesPage.menBootsFilterClick();
    }
    @Then("User checks if he is on the page Men's boots")
    public void checksBootsPage(){
        bootsPage = pageFactoryManager.getBootsPage();
        assertEquals("Men's Boots", bootsPage.getTextBootsPageTitle());
    }
    @And("User click on the Apple brand icon")
    public void iconNikeClick(){
        homePage = pageFactoryManager.getHomePage();
        homePage.iconNikeClick();
    }
    @And("User check if he is on page Apple")
    public void checksNikePage(){
        nikePage = pageFactoryManager.getNikePage();
        assertEquals("Apple", nikePage.getTextApplePageTitle());
    }
    @And("User clicks the next page at the bottom of the page")
    public void clickNextPageButton(){
        nikePage = pageFactoryManager.getNikePage();
        nikePage.clickNextPageButton();
    }
    @And("User clicks on the previous page at the bottom of the page")
    public void clickPreviousPageButton(){
        nikePage = pageFactoryManager.getNikePage();
        nikePage.clickPreviousPageButton();
    }
    @Then("User checks whether he has returned to the initial page")
    public void checkNikePage(){
        nikePage = pageFactoryManager.getNikePage();
        assertEquals("Explore Popular Products", nikePage.getTextTitleFirstApplePage());
    }
    @And("User hovers over the icon of the current language on the site")
    public void moveToIconCurrentLanguage(){
        homePage = pageFactoryManager.getHomePage();
        homePage.moveToIconCurrentLanguage();
    }
    @And("User click on the language in which the site will be")
    public void clickIconSpainLanguage(){
        homePage = pageFactoryManager.getHomePage();
        homePage.clickIconSpainLanguage();
    }
    @Then("User checks whether the site has been translated")
    public void checkTextHomePageTitleOnSpain(){
        homePage = pageFactoryManager.getHomePage();
        assertEquals("Lo más en eBay", homePage.getTextHomePageTitleOnSpain());
    }
    @And("User clicks the register button")
    public void clickRegisterButton(){
        homePage = pageFactoryManager.getHomePage();
        homePage.registerButtonClick();
    }
    @And("User enters incorrect data in email field")
    public void entersIncorrectDataInEmailField(){
        registrationPage = pageFactoryManager.getRegistrationPage();
        registrationPage.entersIncorrectDataInEmailField();
        registrationPage.passwordFieldClick();
    }
    @Then("User checks if warning message email field is displayed")
    public void checkWarningMessage(){
        registrationPage = pageFactoryManager.getRegistrationPage();
        assertEquals("Email address should be at least 6 characters.", registrationPage.getTextErrorMassage());
    }
    @And("User clicks on product icon")
    public void clickProductIcon(){
        homePage = pageFactoryManager.getHomePage();
        homePage.productIconClick();
    }
    @And("User check is he on a product page")
    public void checkProductPage(){
        productPage = pageFactoryManager.getProductPage();
        assertEquals("iRobot Roomba E6 Vacuum Cleaning Robot E6198 Manufacturer Certified Refurbished",productPage.getTextProductPageTitle());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @And("User clicks button Add to cart")
    public void viewInCartButtonClick(){
        productPage = pageFactoryManager.getProductPage();
        productPage.buttonViewInCartClick();
    }
    @Then("User checks whether the product has been added to the basket")
    public void checkAddProductToBasket(){
        basketPage = pageFactoryManager.getBasketPage();
        assertEquals("iRobot Roomba E6 Vacuum Cleaning Robot E6198 Manufacturer Certified Refurbished", basketPage.getTextProductTitle());
    }
    @And("User clicks Ship to button")
    public void shipToButtonClick(){
        homePage = pageFactoryManager.getHomePage();
        homePage.buttonShipToClick();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @And("User click Ship to: list")
    public void shipToListClick(){
        homePage = pageFactoryManager.getHomePage();
        homePage.listShipToClick();
    }
    @And("User selects country")
    public void buttonUkraineClick(){
        homePage = pageFactoryManager.getHomePage();
        homePage.buttonAlbaniaClick();
    }
    @Then("User click Done button")
    public void buttonDoneClick(){
        homePage = pageFactoryManager.getHomePage();
        homePage.buttonDoneClick();
    }
    @And("User clicks help & contact button")
    public void helpAndContactClick(){
        homePage = pageFactoryManager.getHomePage();
        homePage.helpAndContactClick();
    }
    @And("User check is he on a customer service page")
    public void checkIsUserOnACustomerServicePage(){
        customerServicePage = pageFactoryManager.getCustomerServicePage();
        assertEquals("Customer Service", customerServicePage.getTextTitleCustomerService());
    }
    @And("User enters in the input field what he wants to find information about")
    public void inputEntersData(){
        customerServicePage = pageFactoryManager.getCustomerServicePage();
        customerServicePage.inputEntersData();
    }
    @And("User clicks on the title of the information he needs")
    public void titleSellerHelpClick(){
        customerServicePage = pageFactoryManager.getCustomerServicePage();
        customerServicePage.titleSellerHelpClick();
    }
    @Then("User checks whether he is on the page with the necessary information")
    public void checkSellerHelpPage(){
        sellerHelpPage = pageFactoryManager.getSellerHelpPage();
        assertEquals("Seller Help",sellerHelpPage.getTextTitleSellerHelpPage());
    }
    @And("User clicks refresh button ebay")
    public void clickRefreshButton(){
        homePage = pageFactoryManager.getHomePage();
        homePage.refreshButtonClick();
    }
    @Then("User checks to see if he has returned to the initial page")
    public void startPage(){
        homePage = pageFactoryManager.getHomePage();
        assertEquals("A World of Vehicles",homePage.getTextElementInscription());
    }

    @After
    public void tearDown(){driver.close();}

}
