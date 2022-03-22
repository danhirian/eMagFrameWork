import Pages.*;
import Utils.Strings;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
    private AddToCartPage addtocartPage;
    private MainPage mainPage;
    private CatalogPage catalogPage;

    @BeforeMethod
    public void beforeMethod() {
        storemainPage = new StoreMainPage(webDriver);
        signInPage = new SignInPage(webDriver);
        createaccountPage = new CreateAccountPage(webDriver);
        myaccountPage = new MyAccountPage(webDriver);
        searchPage = new SearchPage(webDriver);
        addtocartPage = new AddToCartPage(webDriver);
        mainPage = new MainPage(webDriver);
        catalogPage = new CatalogPage(webDriver);
    }

    @Test(description = "SignIn")
    public void testSignIn() {
        login(Strings.LOGIN_EMAIL, Strings.LOGIN_PASSWORD);
        Assert.assertEquals(myaccountPage.getAccountTitle(), Strings.ACCOUNT_TITLE);
        Assert.assertEquals(myaccountPage.getUserName(), Strings.USER_NAME);
    }

    @Test(description = "Create new account")
    public void testAccountSignUp() {
        storemainPage.loadMainPage();
        storemainPage.clickSignIn();
        signInPage.chooseEmail();
        signInPage.clickCreateAccountButton();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        createaccountPage.chooseGenderMale();
        createaccountPage.chooseCustomerFirstName(Strings.CUSTOMER_FIRST_NAME);
        createaccountPage.chooseCustomerLastName(Strings.CUSTOMER_LAST_NAME);
        createaccountPage.chooseFirstName(Strings.FIRST_NAME);
        createaccountPage.chooseLastName(Strings.LAST_NAME);
        createaccountPage.choosePassword(Strings.CHOOSE_PASSWORD);
        createaccountPage.chooseAddress(Strings.ADDRESS);
        createaccountPage.chooseCity(Strings.CITY);
        createaccountPage.choosePostalCode(Strings.POSTAL_CODE);
        createaccountPage.chooseState(2);
        createaccountPage.chooseMobilePhone(Strings.MOBILE_PHONE);
        createaccountPage.chooseAlias(Strings.ALIAS);
        createaccountPage.clickRegisterButton();
        Assert.assertEquals(myaccountPage.getAccountTitle(), Strings.ACCOUNT_TITLE);
        Assert.assertEquals(myaccountPage.getUserName(), Strings.USER_NAME);
    }

    @Test(description = "Search item")
    public void testSearchItem() {
        login(Strings.LOGIN_EMAIL, Strings.LOGIN_PASSWORD);
        storemainPage.typeKeyword(Strings.TYPE_KEYWORD_IN_SEARCH_BAR);
        storemainPage.clickSearchButton();
        Assert.assertEquals(searchPage.getLocation(), Strings.LOCATION);
        Assert.assertEquals(searchPage.getPageHeading(), Strings.PAGE_HEADING);
    }

    @Test(description = "Add to cart")
    public void testAddToCart() {
        login(Strings.LOGIN_EMAIL, Strings.LOGIN_PASSWORD);
        storemainPage.typeKeyword(Strings.TYPE_KEYWORD_IN_SEARCH_BAR);
        storemainPage.clickSearchButton();
        searchPage.sortBy(Strings.SORT_BY_TEXT);
        searchPage.clickFirstItem();
        increaseQuantity(10);
        addtocartPage.selectColorPink();
        addtocartPage.addToCart();
        wait.until(ExpectedConditions.visibilityOf(addtocartPage.getConfirmationModal()));
        Assert.assertEquals(addtocartPage.getTitleText(), Strings.CONFIRMATION_MODAL_TITLE_TEXT);
        addtocartPage.clickOnContinueShopping();
        Assert.assertEquals(addtocartPage.getItemDescriptionText(), Strings.ITEM_DESCRIPTION);
        decreaseQuantity(5);
        addtocartPage.addToCart();
        wait.until(ExpectedConditions.visibilityOf(addtocartPage.getConfirmationModal()));
        Assert.assertEquals(addtocartPage.getItemNumberConfirmation(), Strings.ITEM_NUMBER_CONFIRMATION);
    }

    @Test(description = "Logout")
    public void testLogOut() {
        login(Strings.LOGIN_EMAIL, Strings.LOGIN_PASSWORD);
        signInPage.clickSignOutButton();
        Assert.assertEquals(signInPage.getSignInButtonText(), Strings.SIGN_IN_BUTTON_TEXT);
        login(Strings.LOGIN_EMAIL, Strings.LOGIN_PASSWORD);
        signInPage.clickOnHomeIcon();
        Assert.assertEquals(mainPage.getCustomTextBlock(), Strings.CUSTOM_TEXT_BLOCK);
        signInPage.clickSignOutButton();
        Assert.assertEquals(mainPage.getSignInButtonText(), Strings.SIGN_IN_BUTTON_TEXT);
    }

    @Test(description = "Enable filters")
    public void testFilters() {
        login(Strings.LOGIN_EMAIL, Strings.LOGIN_PASSWORD);
        signInPage.clickOnHomeIcon();
        mainPage.clickDressesButton();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        catalogPage.clickThirdCategory();
        catalogPage.clickSizeM();
        catalogPage.clickLastProperty();
        catalogPage.clickSecondComposition();
        catalogPage.clickThirdStyle();



    }

    public void login(String username, String password) {
        storemainPage.loadMainPage();
        storemainPage.clickSignIn();
        signInPage.insertEmailAddress(username);
        signInPage.insertPassword(password);
        signInPage.clickSignInButton();
    }

    public void increaseQuantity(int quantity) {
        for (int i = 0; i < quantity; i++) {
            addtocartPage.increaseQuantity();
        }
    }

    public void decreaseQuantity(int quantity) {
        for (int i = 0; i < quantity; i++) {
            addtocartPage.decreaseQuantity();
        }
    }
}