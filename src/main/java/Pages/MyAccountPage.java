package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAccountPage extends BasePage {

    private static final String ACCOUNT_TITLE = "//p[contains(@class,'info-account')]";
    private static final String USER_NAME = "//a[contains(@title,'View my customer account')]";
    private static final String MY_PERSONAL_INFORMATION = "//span[contains(.,'My personal information')]";
    private static final String MY_ADDRESSES = "//span[contains(.,'My addresses')]";
    private static final String MY_WISHLISTS = "//span[contains(.,'My wishlists')]";
    private static final String LOGO = "//img[@src='http://automationpractice.com/img/logo.jpg']";

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public String getAccountTitle() {
        return getElementText(ACCOUNT_TITLE);
    }

    public String getUserName() {
        return getElementText(USER_NAME);
    }

    public void clickLogo() {
        clickElementxPath(LOGO);
    }
}


