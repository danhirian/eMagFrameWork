package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eMagMainPage extends BasePage {

    private static final String SEARCH_TEXT = "searchboxTrigger";
    private static final String SEARCH_BUTTON = "em em-search";
    private static final String USER_ACCOUNT = "//i[contains(@class,'em em-user2 navbar-icon')]";
    private static final String NEW_ACCOUNT = "//a[@href='/user/login?ref=hdr_signup_btn'][contains(.,'Cont nou')]";
    private static final String ACCOUNT = "thumbnail";
    private static final String TITLE = "navbar-brand";

    public WebDriver driver;

    public eMagMainPage(WebDriver driver) {
        super(driver);
    }

    public void loadMainPage() {
        loadUrl("https://www.emag.ro/");
    }

    public void typeKeyword(String key) {
        sendKeys(SEARCH_TEXT, key);
    }

    public void clickSearchButton() {
        clickElementxPath(SEARCH_BUTTON);
    }

    public void hoverOverUser() {
        hoverOverElement(USER_ACCOUNT);
    }

    public void clickNewAccount() {
        clickElementxPath(NEW_ACCOUNT);
    }

    public void clickAccount() {
        clickElementxPath(ACCOUNT);
    }

    public String getTitle() {
        return getElementText(TITLE);
    }





}
