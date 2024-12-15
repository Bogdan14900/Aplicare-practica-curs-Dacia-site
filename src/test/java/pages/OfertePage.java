package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OfertePage extends BasePage {

    public OfertePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".RangeModelCard__link a")
    private List<WebElement> promoLinks;

    @FindBy(id = "textfield")
    private WebElement textField;

    @FindBy(className = "TextFieldCombo__itemButton")
    private List<WebElement> dropdownOptions;

    @FindBy(xpath = "//p[text()='AUTO COBALCESCU']")
    private WebElement textAutoCobalcescu;

    @FindBy(xpath = "//div[text()='Alege']")
    private WebElement butonAlege;

    @FindBy(className="CustomSelect__selectOption")
    private List<WebElement> namedropdownOptions;

    @FindBy(id = "contactFormCivility")
    private WebElement civility;

    @FindBy(xpath = "//div[contains(@class, 'TextField__wrapper')]/input[@type='text' and contains(@name, 'identity[firstName]')]")
    private WebElement lastNameField;

    @FindBy(xpath = "//div[contains(@class, 'TextField__wrapper')]/input[@type='text' and contains(@name, 'identity[lastName]')]")
    private WebElement firstNameField;

    @FindBy(xpath = "//div[contains(@class, 'TextField__wrapper')]/input[@type='email' and contains(@name, 'identity[email]')]")
    private WebElement emailField;

    @FindBy(xpath = "//div[contains(@class, 'TextField__wrapper')]/input[@type='tel' and contains(@name, 'identity[phone]')]")
    private WebElement phoneNumberField;

    @FindBy(xpath = "//label[@for='contactFormGeneralOption-1']")
    private WebElement buttonNoToMarketing;





    public void selectOffer(int i) {
        elementMethods.clickJSElement(promoLinks.get(i));
        loggerUtility.infoLog("User clicks on some offer. Index: " + i);
    }

    public void typeText(String text) {
        textField.sendKeys(text);
    }

    public void selectDropdownOption(int i) {
        elementMethods.clickJSElement(dropdownOptions.get(i));
        loggerUtility.infoLog("User selects an option from the dropdown. Index: " + i);
    }

    public boolean isAutoCobalcescuDisplayed() {
        elementMethods.waitVisibleElement(textAutoCobalcescu);
        return textAutoCobalcescu.isDisplayed();
    }

    public void clickAlegeButton() {
        elementMethods.clickJSElement(butonAlege);
        loggerUtility.infoLog("User clicks on the Alege button.");
    }

    public void setNamedropdownOptions(int i) {
        List<String> options = List.of("Dna", "Dl", "Nu mă pronunț");
        elementMethods.setSelectOption(civility,options.get(i));
        loggerUtility.infoLog("User selects an option from the dropdown. Index: " + i);
    }

    public void enterLastName(String firstName) {
        elementMethods.scrollToElementJS(lastNameField);
        lastNameField.clear();
        lastNameField.sendKeys(firstName);
        loggerUtility.infoLog("User enters the last name: " + firstName);
    }

    public void enterFirstName(String firstName) {
        elementMethods.scrollToElementJS(firstNameField);
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
        loggerUtility.infoLog("User enters the first name: " + firstName);
    }

    public void enterEmail(String email) {
        elementMethods.scrollToElementJS(emailField);
        emailField.clear();
        emailField.sendKeys(email);
        loggerUtility.infoLog("User enters the email: " + email);
    }

    public void enterPhoneNumber(String phoneNumber) {
        elementMethods.scrollToElementJS(phoneNumberField);
        phoneNumberField.clear(); // Clear the field before entering the phone number
        phoneNumberField.sendKeys(phoneNumber); // Enter the phone number
        loggerUtility.infoLog("User enters the phone number: " + phoneNumber);
    }

    public void selectGeneralOptOut() {
        buttonNoToMarketing.click(); // Click on the associated label
    }




}
