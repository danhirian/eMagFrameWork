import Pages.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class YourLogoTest extends BaseTest {
    private StoreMainPage storemainPage;
    private SignInPage signInPage;
    private CreateAccountPage createaccountPage;
    private MyAccountPage myaccountPage;
    private SearchPage searchPage;

    @BeforeMethod
    public void beforeMethod() {
        storemainPage = new StoreMainPage(webDriver);
        signInPage = new SignInPage(webDriver);
        createaccountPage = new CreateAccountPage(webDriver);
        myaccountPage = new MyAccountPage(webDriver);
        searchPage = new SearchPage(webDriver);
    }

    @Test(description = "Create new account")
    public void testAccountSignUp() throws InterruptedException {
        storemainPage.loadMainPage();
        storemainPage.clickSignIn();
        signInPage.chooseEmail();
        signInPage.clickCreateAccountButton();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        createaccountPage.chooseGenderMale();
        createaccountPage.chooseCustomerFirstName("Dan");
        createaccountPage.chooseCustomerLastName("Hirian");
        createaccountPage.chooseFirstName("Dan");
        createaccountPage.chooseLastName("Hirian");
        createaccountPage.choosePassword("blablabla");
        createaccountPage.chooseAddress("luceafarului nr.3");
        createaccountPage.chooseCity("Timisoara");
        createaccountPage.choosePostalCode("30002");
        createaccountPage.chooseState(2);
        createaccountPage.chooseMobilePhone("0728898989");
        createaccountPage.chooseAlias("Home Address");
        createaccountPage.clickRegisterButton();
        Assert.assertEquals(myaccountPage.getAccountTitle(), "Welcome to your account. Here you can manage all of your personal information and orders.");
        Assert.assertEquals(myaccountPage.getUserName(), "Dan Hirian");
    }

    public void login(String username, String password) {
        storemainPage.loadMainPage();
        storemainPage.clickSignIn();
        signInPage.insertEmailAddress(username);
        signInPage.insertPassword(password);
        signInPage.clickSignInButton();
    }

    @Test(description = "Search item")
    public void testSearchItem() {
        login("testingaccount10@gmail.com", "blablabla");
        Assert.assertEquals(myaccountPage.getAccountTitle(), "Welcome to your account. Here you can manage all of your personal information and orders.");
        Assert.assertEquals(myaccountPage.getUserName(), "Dan Hirian");
        storemainPage.typeKeyword("dress");
        storemainPage.clickSearchButton();
        Assert.assertEquals(searchPage.getLocation(), "Search");
        Assert.assertEquals(searchPage.getPageHeading(), "\"DRESS\"");
    }

    @Test(description = "Add to cart")
    public void testAddToCart() {

    }
}