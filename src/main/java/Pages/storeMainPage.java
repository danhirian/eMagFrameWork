package Pages;

import org.openqa.selenium.WebDriver;

public class storeMainPage extends BasePage {

    private static final String SEARCH_BAR = "//input[contains(@id,'search_query_top')]";
    private static final String SEARCH_BUTTON = "//button[@type='submit'][contains(.,'Search')]";
    private static final String SIGN_IN = "//a[@class='login'][contains(.,'Sign in')]";
    private static final String TITLE = "navbar-brand";

    public storeMainPage(WebDriver driver) {
        super(driver);
    }

    public void loadMainPage() {
        loadUrl("http://automationpractice.com/index.php");
    }

    public void typeKeyword(String key) {
        sendKeysxPath(SEARCH_BAR, key);
    }

    public void clickSearchButton() {
        clickElementxPath(SEARCH_BUTTON);
    }

    public void clickSignIn() {
        clickElementxPath(SIGN_IN);
    }

    public String getTitle() {
        return getElementText(TITLE);
    }
}
