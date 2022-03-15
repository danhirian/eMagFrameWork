package Pages;

import org.openqa.selenium.WebDriver;

import java.util.Random;

public class SignInPage extends BasePage {

    private static final String CREATE_ACCOUNT_EMAIL_ADDRESS = "//input[contains(@id,'email_create')]";
    private static final String EMAIL_ADDRESS = "//input[@id='email']";
    private static final String CREATE_ACCOUNT_BUTTON = "//span[contains(.,'Create an account')]";
    private static final String SIGN_IN_BUTTON = "//span[contains(.,'Sign in')]";
    private static final String PASSWORD = "//input[contains(@data-validate,'isPasswd')]";

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void chooseEmail() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        sendKeys(CREATE_ACCOUNT_EMAIL_ADDRESS, "username" + randomInt + "@gmail.com");
    }

    public void clickCreateAccountButton() {
        clickElementxPath(CREATE_ACCOUNT_BUTTON);
    }

    public void clickSignInButton() {
        clickElementxPath(SIGN_IN_BUTTON);
    }

    public void insertEmailAddress(String email) {
        sendKeys(EMAIL_ADDRESS, email);
    }

    public void insertPassword(String password) {
        sendKeys(PASSWORD, password);
    }
}