package Pages;

import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {

    private static final String NAVIGATION_PAGE = "//span[@class='navigation_page']";
    private static final String SORT_BY_DROPDOWN = "//select[contains(@id,'selectProductSort')]";
    private static final String PRINTED_DRESS_ITEM = "//img[@src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']";
    private static final String PAGE_HEADING = "//span[contains(@class,'lighter')]";

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public String getLocation() {
        return getElementText(NAVIGATION_PAGE);
    }

    public String getPageHeading() {
        return getElementText(PAGE_HEADING);
    }

    public void sortBy(String sortBy) {
        selectFromDropdownText(SORT_BY_DROPDOWN, sortBy);
    }

    public void clickFirstItem() {
        clickElementxPath(PRINTED_DRESS_ITEM);
    }
}