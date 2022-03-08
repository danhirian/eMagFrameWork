package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAccountPage extends BasePage{

    private static final String NAME = "//span[@class='field-name'][contains(.,'Nume:')]";
    private static final String EMAIL = "//span[@class='field-name'][contains(.,'Email:')]";

    public WebDriver driver;

    public MyAccountPage(WebDriver driver){
        this.driver = driver;
    }

    public String getName() {
        return getElementValue(NAME);
    }

    public String getEmail() {
        return getElementValue(EMAIL);
    }
}
