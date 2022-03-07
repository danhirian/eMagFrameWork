package Pages;

import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {

    private static final String USERNAME = "user_login_email";
    private static final String CONTINUE_BUTTON = "user_login_continue";
    private static final String PASSWORD = "user_login_password";
    private static final String ERROR_MESSAGE = "help-block text-left";
    private static final String MY_ACCOUNT = "visible-lg-inline";

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void typeUsername(String username) {
        sendKeys(USERNAME, username);
    }

    public void typePassword(String password) {
        sendKeys(PASSWORD, password);
    }

    public void clickContinueButton() {
        clickElement(CONTINUE_BUTTON);
    }

    public String getErrorMessage() {
        return getElementText(ERROR_MESSAGE);
    }

    public void clickMyAccount() {
        clickElement(MY_ACCOUNT);
    }





}
