import Pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class YourLogoTest extends BaseTest {
    private storeMainPage storemainPage;
    private SignInPage signInPage;
    private CreateAccountPage createaccountPage;
    private MyAccountPage myaccountPage;
    private SearchPage searchPage;

    @BeforeMethod
    public void beforeMethod() {
        storemainPage = new storeMainPage(webDriver);
        signInPage = new SignInPage(webDriver);
        createaccountPage = new CreateAccountPage(webDriver);
        myaccountPage = new MyAccountPage(webDriver);
        searchPage = new SearchPage(webDriver);
    }

    @Test(description = "Create new account")
    public void testAccountSignUp() {
        storemainPage.loadMainPage();
        storemainPage.clickSignIn();
        signInPage.chooseEmail("testingaccount50@gmail.com");
        signInPage.clickCreateAccountButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
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

    @Test(description = "Search item")
    public void testSearchItem() {
        storemainPage.loadMainPage();
        storemainPage.clickSignIn();
        signInPage.insertEmailAddress("testingaccount10@gmail.com");
        signInPage.insertPassword("blablabla");
        signInPage.clickSignInButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertEquals(myaccountPage.getAccountTitle(), "Welcome to your account. Here you can manage all of your personal information and orders.");
        Assert.assertEquals(myaccountPage.getUserName(), "Dan Hirian");
        storemainPage.typeKeyword("dress");
        storemainPage.clickSearchButton();
        Assert.assertEquals(searchPage.getLocation(), "Search");
        Assert.assertEquals(searchPage.getPageHeading(), "\"DRESS\"");
    }
}



