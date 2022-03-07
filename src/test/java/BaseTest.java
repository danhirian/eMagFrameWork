import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    public BaseTest(WebDriver driver) {
        System.setProperty("webdriver.chrome.driver", "\\src\\main\\resources\\chromedriver.exe");
    }


}
