package manager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactoryManager {
    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage(){return new HomePage(driver);}
    public LoginPage getLoginPage(){return new LoginPage(driver);}

    public SearchPage getSearchPage(){return new SearchPage(driver);}

    public ShoesPage getShoesPage(){return new ShoesPage(driver);}
    public BootsPage getBootsPage(){return new BootsPage(driver);}
    public ApplePage getNikePage(){return new ApplePage(driver);}
    public RegistrationPage getRegistrationPage(){return new RegistrationPage(driver);}
    public ProductPage getProductPage(){return new ProductPage(driver);}
    public BasketPage getBasketPage(){return new BasketPage(driver);}
    public CustomerServicePage getCustomerServicePage(){return new CustomerServicePage(driver);}
    public SellerHelpPage getSellerHelpPage(){return new SellerHelpPage(driver);}


}
