package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class eMagMainPage extends BasePage {

    private static final String SEARCH_TEXT = "searchboxTrigger";
    private static final String SEARCH_BUTTON = "em em-search";
    private static final String HOVER_OVER_USER = "em em-user2 navbar-icon";
    private static final String NEW_ACCOUNT = "btn btn-link btn-sm";
    private static final String ACCOUNT = "thumbnail";
    private static final String TITLE = "navbar-brand";

    public eMagMainPage() {

    }


    public void loadMainPage() {
        loadUrl("https://www.emag.ro/");
    }

    public void typeKeyword(String key) {
        sendKeys(SEARCH_TEXT, key);
    }

    public void clickSearchButton() {
        clickElement(SEARCH_BUTTON);
    }

    public void hoverOverUser() {
        hoverOverElement(HOVER_OVER_USER);
    }

    public void clickNewAccount() {
        clickElement(NEW_ACCOUNT);
    }

    public void clickAccount() {
        clickElement(ACCOUNT);
    }

    public String getTitle() {
        return getElementText(TITLE);
    }





}
