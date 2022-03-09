package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void sendKeys(String xpathSelector, String text) {
        driver.findElement(By.xpath(xpathSelector)).sendKeys(text);
    }

    protected void sendKeysCSS(String cssLocator, String text) {
        driver.findElement(By.cssSelector(cssLocator)).sendKeys(text);
    }

    protected void clickElementxPath(String xpathLocator) {
        driver.findElement(By.xpath(xpathLocator)).click();
    }

    protected void clickElementCSS(String cssLocator) {
        driver.findElement(By.cssSelector(cssLocator));
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

    protected void hoverOverElement(String xpathSelector) {
        Actions actions = new Actions(driver);
        WebElement hover = driver.findElement(By.xpath(xpathSelector));
        actions.moveToElement(hover).perform();
    }

    protected void quit() {
        driver.quit();
    }


}
