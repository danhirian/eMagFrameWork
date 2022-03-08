import Pages.*;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmagTest {
    private eMagMainPage emagmainPage;
    private SignInPage signInPage;
    private CreateAccountPage createaccountPage;
    private MyAccountPage myaccountPage;

    @BeforeMethod
    public void beforeMethod() {
        emagmainPage = new eMagMainPage(driver);
        signInPage = new SignInPage(driver);
        createaccountPage = new CreateAccountPage(driver);
        myaccountPage = new MyAccountPage(driver);

    }

    @Test(description = "Create new account")
    public void testAccountSignUp() {
        emagmainPage.loadMainPage();
        emagmainPage.hoverOverUser();
        emagmainPage.clickNewAccount();
        signInPage.typeUsername("autoTest@gmail.com");
        signInPage.clickContinueButton();
        createaccountPage.chooseUsername("Test Account");
        createaccountPage.choosePassword("JustTesting10");
        createaccountPage.confirmPassword("JustTesting10");
        createaccountPage.checkRequired();
        signInPage.clickContinueButton();
        createaccountPage.clickActivateLaterButton();
        Assert.assertEquals(emagmainPage.getTitle(), "eMAG - Libertate în fiecare zi");
        emagmainPage.clickAccount();
        Assert.assertEquals(myaccountPage.getName(), "Test Account");
        Assert.assertEquals(myaccountPage.getEmail(), "autoTest@gmail.com");
        driver.quit();
    }
}

