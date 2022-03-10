package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountPage extends BasePage{

    private static final String CHOOSE_FIRST_NAME = "firstname";
    private static final String CHOOSE_LAST_NAME = "lastname";
    private static final String CHOOSE_CUSTOMER_FIRST_NAME = "//input[@id='customer_firstname']";
    private static final String CHOOSE_CUSTOMER_LAST_NAME = "customer_lastname";
    private static final String CHOOSE_PASSWORD = "passwd";
    private static final String GENDER_MALE = "//input[@id='id_gender1']";
    private static final String GENDER_FEMALE = "id_gender2";
    private static final String ADDRESS = "address1";
    private static final String CITY = "city";
    private static final String STATE = "//select[@id='id_state']";
    private static final String POSTAL_CODE = "postcode";
    private static final String COUNTRY = "//select[@id='id_country']";
    private static final String MOBILE_PHONE = "phone_mobile";
    private static final String ALIAS = "alias";
    private static final String REGISTER_BUTTON = "//span[contains(.,'Register')]";

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public void chooseGenderMale() {
        clickElementxPath(GENDER_MALE);
    }

    public void chooseCustomerFirstName(String cFirstName) {
        sendKeysxPath(CHOOSE_CUSTOMER_FIRST_NAME, cFirstName);
    }

    public void chooseCustomerLastName(String cLastName) {
        sendKeysCSS(CHOOSE_CUSTOMER_LAST_NAME, cLastName);
    }

    public void chooseFirstName(String firstName) {
        sendKeysCSS(CHOOSE_FIRST_NAME, firstName);
    }

    public void chooseLastName(String lastName) {
        sendKeysCSS(CHOOSE_LAST_NAME, lastName);
    }

    public void choosePassword(String password) {
        sendKeysCSS(CHOOSE_PASSWORD, password);
    }

    public void chooseAddress(String address) {
        sendKeysCSS(ADDRESS, address);
    }

    public void chooseCity(String city) {
        sendKeysCSS(CITY, city);
    }

    public void chooseState(int index) {
        selectFromDropdownValue(STATE, index);
    }

    public void choosePostalCode(String postalCode) {
        sendKeysCSS(POSTAL_CODE, postalCode);
    }

    public void chooseCountry(int index) {
        selectFromDropdownValue(COUNTRY, index);
    }

    public void chooseMobilePhone(String mobilePhone) {
        sendKeysCSS(MOBILE_PHONE, mobilePhone);
    }

    public void chooseAlias(String alias) {
        sendKeysCSS(ALIAS, alias);
    }

    public void clickRegisterButton() {
        clickElementxPath(REGISTER_BUTTON);
    }
}
