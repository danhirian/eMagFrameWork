package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage{

    private static final String CHOOSE_FIRST_NAME = "//input[@id='firstname']";
    private static final String CHOOSE_LAST_NAME = "//input[@id='lastname']";
    private static final String CHOOSE_CUSTOMER_FIRST_NAME = "//input[@id='customer_firstname']";
    private static final String CHOOSE_CUSTOMER_LAST_NAME = "//input[contains(@id,'customer_lastname')]";
    private static final String CHOOSE_PASSWORD = "//input[contains(@data-validate,'isPasswd')]";
    private static final String GENDER_MALE = "//input[@id='id_gender1']";
    private static final String GENDER_FEMALE = "//input[contains(@id,'id_gender2')]";
    private static final String ADDRESS = "//input[contains(@id,'address1')]";
    private static final String CITY = "//input[contains(@id,'city')]";
    private static final String STATE = "//select[@id='id_state']";
    private static final String POSTAL_CODE = "//input[contains(@id,'postcode')]";
    private static final String COUNTRY = "//select[@id='id_country']";
    private static final String MOBILE_PHONE = "//input[contains(@id,'phone_mobile')]";
    private static final String ALIAS = "//input[contains(@id,'alias')]";
    private static final String REGISTER_BUTTON = "//span[contains(.,'Register')]";

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public By chooseGenderMale() {
        clickElementxPath(GENDER_MALE);

        return null;
    }

    public void chooseCustomerFirstName(String cFirstName) {
        sendKeys(CHOOSE_CUSTOMER_FIRST_NAME, cFirstName);
    }

    public void chooseCustomerLastName(String cLastName) {
        sendKeys(CHOOSE_CUSTOMER_LAST_NAME, cLastName);
    }

    public void chooseFirstName(String firstName) {
        sendKeys(CHOOSE_FIRST_NAME, firstName);
    }

    public void chooseLastName(String lastName) {
        sendKeys(CHOOSE_LAST_NAME, lastName);
    }

    public void choosePassword(String password) {
        sendKeys(CHOOSE_PASSWORD, password);
    }

    public void chooseAddress(String address) {
        sendKeys(ADDRESS, address);
    }

    public void chooseCity(String city) {
        sendKeys(CITY, city);
    }

    public void chooseState(int index) {
        selectFromDropdownValue(STATE, index);
    }

    public void choosePostalCode(String postalCode) {
        sendKeys(POSTAL_CODE, postalCode);
    }

    public void chooseCountry(int index) {
        selectFromDropdownValue(COUNTRY, index);
    }

    public void chooseMobilePhone(String mobilePhone) {
        sendKeys(MOBILE_PHONE, mobilePhone);
    }

    public void chooseAlias(String alias) {
        sendKeys(ALIAS, alias);
    }

    public void clickRegisterButton() {
        clickElementxPath(REGISTER_BUTTON);
    }
}