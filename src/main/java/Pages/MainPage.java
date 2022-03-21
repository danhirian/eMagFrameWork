package Pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    private static final String CUSTOM_TEXT_BLOCK = "//p[contains(.,'Selenium Framework website was designed solely to help folks get over the fear of Automation. The website was an inspiration from the fact that there is no website that can bridge the gaps between the differences among various programming languages and help non-programmers get a taste of Automation.')]";
    private static final String SIGN_IN_BUTTON = "//a[@class='login'][contains(.,'Sign in')]";
    private static final String DRESSES_BUTTON = "(//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category'][contains(.,'Dresses')])[2]";


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getCustomTextBlock() {
        return getElementText(CUSTOM_TEXT_BLOCK);
    }

    public String getSignInButtonText() {
        return getElementText(SIGN_IN_BUTTON);
    }

    public void clickDressesButton() {
        clickElementxPath(DRESSES_BUTTON);
    }
}
