package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage extends BasePage {

    private static final String PLUS_BUTTON = "//i[contains(@class,'icon-plus')]";
    private static final String MINUS_BUTTON = "//i[contains(@class,'icon-minus')]";
    private static final String SIZE_DROPDOWN = "//select[contains(@id,'group_1')]";
    private static final String ADD_TO_WISHLIST = "//a[contains(@id,'button')][@href='#'][contains(.,'Add to wishlist')]";
    private static final String ADD_TO_CART_BUTTON = "//span[contains(.,'Add to cart')]";
    private static final String COLOR_BEIGE = "//a[contains(@id,'color_7')]";
    private static final String COLOR_PINK = "//a[contains(@id,'color_7')]";
    private static final String QUANTITY_BAR = "//input[contains(@id,'quantity_wanted')]";
    private static final String CONFIRMATION_TITLE = "//h2[contains(.,'Product successfully added to your shopping cart')]";
    private static final String PRODUCT_SUCCESSFULLY_ADDED_MODAL = "/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]";
    private static final String CONTINUE_SHOPPING_BUTTON = "(//span[contains(.,'Continue shopping')])[2]";
    private static final String PROCEED_TO_CHECKOUT_BUTTON = "//span[contains(.,'Proceed to checkout')]";
    private static final String ITEM_DESCRIPTION = "(//p[contains(.,'Printed evening dress with straight sleeves with black thin waist belt and ruffled linings.')])[1]";
    private static final String ITEM_NUMBER_CONFIRMATION = "/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/h2/span[1]";

    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

    public void increaseQuantity() {
        clickElementxPath(PLUS_BUTTON);
    }

    public void decreaseQuantity() {
        clickElementxPath(MINUS_BUTTON);
    }

    public void selectSize(int size) {
        selectFromDropdownValue(SIZE_DROPDOWN, size);
    }

    public void addToWishlist() {
        clickElementxPath(ADD_TO_WISHLIST);
    }

    public void addToCart() {
        clickElementxPath(ADD_TO_CART_BUTTON);
    }

    public void selectColorPink() {
        clickElementxPath(COLOR_PINK);
    }

    public String getQuantityInfo() {
        return getElementText(QUANTITY_BAR);
    }

    public String getSizeInfo() {
        return getElementText(SIZE_DROPDOWN);
    }

    public String getTitleText() {
        return getElementText(CONFIRMATION_TITLE);
    }

    public WebElement getConfirmationModal() {
        return getModal(PRODUCT_SUCCESSFULLY_ADDED_MODAL);
    }

    public void clickOnContinueShopping() {
        clickElementxPath(CONTINUE_SHOPPING_BUTTON);
    }

    public void clickOnProceedCheckout() {
        clickElementxPath(PROCEED_TO_CHECKOUT_BUTTON);
    }

    public String getItemDescriptionText() {
        return getElementText(ITEM_DESCRIPTION);
    }

    public String getItemNumberConfirmation() {
        return getElementText(ITEM_NUMBER_CONFIRMATION);
    }
}
