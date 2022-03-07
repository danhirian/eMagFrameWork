package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BasePage {

    protected WebDriver driver;
    Actions actions = new Actions(driver);

    public BasePage(WebDriver driver) {
        System.setProperty("webdriver.chrome.driver", "\\src\\main\\resources\\chromedriver.exe");
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
