import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    public BaseTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hiria\\IdeaProjects\\eMag Testing FrameWork\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }


}
