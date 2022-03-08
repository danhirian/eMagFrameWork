package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;
    Actions actions = new Actions(driver);

    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hiria\\IdeaProjects\\eMag Testing FrameWork\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void sendKeys(String cssLocator, String text) {
        driver.findElement(By.cssSelector(cssLocator)).sendKeys(text);
    }

    protected void clickElement(String cssLocator) {
        driver.findElement(By.cssSelector(cssLocator)).click();
    }

    protected void loadUrl(String url) {
        driver.get(url);
    }

    protected String getElementText(String cssLocator) {
        return driver.findElement(By.cssSelector(cssLocator)).getText();
    }

    protected String getElementValue(String xpath) {
        return driver.findElement(By.xpath(xpath)).getCssValue(xpath);
    }

    protected void hoverOverElement(String cssLocator) {
        WebElement hover = driver.findElement(By.cssSelector(cssLocator));
        actions.moveToElement(hover).perform();
    }

    protected void quit() {
        driver.quit();
    }


}
