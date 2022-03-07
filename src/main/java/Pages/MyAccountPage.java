package Pages;

import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage{

    private static final String NAME = "//span[@class='field-name'][contains(.,'Nume:')]";
    private static final String EMAIL = "//span[@class='field-name'][contains(.,'Email:')]";

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public String getName() {
        return getElementValue(NAME);
    }

    public String getEmail() {
        return getElementValue(EMAIL);
    }
}
