import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public static WebDriver webDriver;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        System.out.println("Opening Chrome browser...");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hiria\\IdeaProjects\\eMag Testing FrameWork\\src\\main\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void quit() {
        if(webDriver != null) {
            webDriver.quit();
            System.out.println("Closing Chrome browser");
        }
    }



}
