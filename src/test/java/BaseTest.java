import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hiria\\IdeaProjects\\eMag Testing FrameWork\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }

    public BaseTest(WebDriver driver) {
        this.driver = driver;
    }


}
