package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CatalogPage extends BasePage {

    private static final String CATEGORIES_LIST = "//input[contains(@id,'layered_category_9')] //input[contains(@id,'layered_category_10')] //input[contains(@id,'layered_category_11')]";
    private static final String SIZE_LIST = "//input[@id='layered_id_attribute_group_1'] //input[@id='layered_id_attribute_group_2'] //input[contains(@id,'layered_id_attribute_group_3')]";
    private static final String COLOR_LIST = "//input[contains(@id,'layered_id_attribute_group_7')] //input[contains(@id,'layered_id_attribute_group_11')] //input[contains(@id,'layered_id_attribute_group_14')] //input[contains(@id,'layered_id_attribute_group_16')] //input[contains(@id,'layered_id_attribute_group_8')] //input[contains(@id,'layered_id_attribute_group_13')] //input[contains(@id,'layered_id_attribute_group_15')] //input[contains(@id,'layered_id_attribute_group_24')]";
    private static final String COMPOSITIONS_LIST = "//input[contains(@id,'layered_id_feature_5')] //input[contains(@id,'layered_id_feature_3')]";
    private static final String STYLES_LIST = "//input[contains(@id,'layered_id_feature_11')] //input[contains(@id,'layered_id_feature_13')]";
    private static final String PROPERTIES_LIST = "//input[contains(@id,'layered_id_feature_18')] //input[contains(@id,'layered_id_feature_21')]";
    private static final String PRICE_SLIDER = "//a[contains(@class,'ui-slider-handle ui-state-default ui-corner-all ui-state-hover')]";

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public void clickThirdCategory() {
        clickElement(CATEGORIES_LIST, 0);
    }

    public void clickSizeM() {
        clickElement(SIZE_LIST, 1);
    }

    public void clickSecondComposition() {
        clickElement(COMPOSITIONS_LIST, 1);
    }

    public void clickThirdStyle() {
        clickElement(STYLES_LIST, 2);
    }

    public void clickLastProperty() {
        clickElement(PROPERTIES_LIST, 3);
    }






}
