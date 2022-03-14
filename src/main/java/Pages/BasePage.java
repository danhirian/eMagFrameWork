package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void sendKeys(String xpathSelector, String text) {
        driver.findElement(By.xpath(xpathSelector)).sendKeys(text);
    }

    protected void clickElementxPath(String xpathLocator) {
        driver.findElement(By.xpath(xpathLocator)).click();
    }

    protected void loadUrl(String url) {
        driver.get(url);
    }

    protected String getElementText(String xpathLocator) {
        return driver.findElement(By.xpath(xpathLocator)).getText();
    }

    protected String getElementValue(String xpathLocator) {
        return driver.findElement(By.xpath(xpathLocator)).getCssValue(xpathLocator);
    }

    protected void hoverOverElement(String xpathSelector) {
        Actions actions = new Actions(driver);
        WebElement hover = driver.findElement(By.xpath(xpathSelector));
        actions.moveToElement(hover).perform();
    }

    protected void selectFromDropdownValue(String xpathLocator, int index) {
        Select selector = new Select(driver.findElement(By.xpath(xpathLocator)));
        selector.selectByIndex(index);
    }

    protected void selectFromDropdownText(String xpathLocator, String text) {
        Select selector = new Select(driver.findElement(By.xpath(xpathLocator)));
        selector.selectByVisibleText(text);
    }
}