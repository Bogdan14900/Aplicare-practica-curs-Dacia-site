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

//    @FindBy(xpath = "//div[@class='CustomSelect__input']")
//    private WebElement listSelect;


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
}
