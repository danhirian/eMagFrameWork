package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountPage extends BasePage{

    private static final String CHOOSE_NAME_SURNAME = "user_register_full_name";
    private static final String CHOOSE_PASSWORD = "user_register_password_first";
    private static final String CONFIRM_PASSWORD = "user_register_password_second";
    private static final String REQUIRED_CHECK = "required";
    private static final String ACTIVATE_LATER_BUTTON = "btn btn-default btn-rounded btn-md mrg-top-sm";

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseUsername(String username) {
        sendKeys(CHOOSE_NAME_SURNAME, username);
    }

    public void choosePassword(String password) {
        sendKeys(CHOOSE_PASSWORD, password);
    }

    public void confirmPassword(String password) {
        sendKeys(CONFIRM_PASSWORD, password);
    }

    public void checkRequired() {
        clickElement(REQUIRED_CHECK);
    }

    public void clickActivateLaterButton() {
        clickElement(ACTIVATE_LATER_BUTTON);
    }
}
