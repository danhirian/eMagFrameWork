package Pages;

import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {

    private static final String CREATE_ACCOUNT_EMAIL_ADDRESS = "//input[contains(@id,'email_create')]";
    private static final String EMAIL_ADDRESS = "email";
    private static final String CREATE_ACCOUNT_BUTTON = "//span[contains(.,'Create an account')]";
    private static final String SIGN_IN_BUTTON = "//span[contains(.,'Sign in')]";
    private static final String PASSWORD = "passwd";

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void chooseEmail(String email) {
        sendKeysxPath(CREATE_ACCOUNT_EMAIL_ADDRESS, email);
    }

    public void clickCreateAccountButton() {
        clickElementxPath(CREATE_ACCOUNT_BUTTON);
    }

    public void clickSignInButton() {
        clickElementxPath(SIGN_IN_BUTTON);
    }

    public void insertEmailAddress(String email) {
        sendKeysCSS(EMAIL_ADDRESS, email);
    }

    public void insertPassword(String password) {
        sendKeysCSS(PASSWORD, password);
    }
}