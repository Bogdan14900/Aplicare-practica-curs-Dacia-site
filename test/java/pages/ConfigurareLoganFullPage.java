package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ConfigurareLoganFullPage extends BasePage{
    public ConfigurareLoganFullPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@class='RangeModelCard__imageLink']")
    private List<WebElement> promoLinks;

    @FindBy(xpath = "//span[text()='EXPRESSION']")
    private WebElement optionExpression;

    @FindBy(xpath = "//span[text()='TCe 90 CVT']")
    private WebElement optionCutieViteze;

    @FindBy(xpath = "//img[@alt='IRON BLUE']")
    private WebElement optionCuloareMasina;

    @FindBy(xpath = "//*[@alt='Jante aliaj usor 16\", design Randia']")
    private WebElement optionJante;

    @FindBy(xpath = "//p[text()='Pachet Techno']")
    private WebElement optionPachetTehno;

    @FindBy(xpath = "//span[text()='CONFORT']")
    private WebElement openConfortSelector;

    @FindBy(xpath = "//div[text()='Preț total']")
    private WebElement textPretTotal;

    @FindBy(xpath = "//span[text()='17.710 EUR']")
    private WebElement textSumaTotal;



    /// /////////////////////////////////////////////////////////////
    public void selectOffer(int i) {
        elementMethods.clickJSElement(promoLinks.get(i));
        loggerUtility.infoLog("User clicks on the Logan offer. Index: " + i);
    }

    public void clickOptionExpression() {
        elementMethods.clickJSElement(optionExpression);
        loggerUtility.infoLog("User clicks on the Expression option.");
    }

    public void clickOptionCutieViteze() {
        elementMethods.clickJSElement(optionCutieViteze);
        loggerUtility.infoLog("User clicks on the Cutie Viteze option.");
    }

    public void clickOptionCuloareMasina() {
        elementMethods.clickJSElement(optionCuloareMasina);
        loggerUtility.infoLog("User clicks on the Iron Blue option.");
    }

    public void clickOptionJante() {
        elementMethods.scrollToElementJS(optionJante);
        elementMethods.clickJSElement(optionJante);
        loggerUtility.infoLog("User clicks on the Jante option.");
    }

    public void clickOptionPachetTehno() {
        elementMethods.scrollToElementJS(optionPachetTehno);
        elementMethods.clickJSElement(optionPachetTehno);
        loggerUtility.infoLog("User clicks on the Pachet Tehno option.");
    }

    public void clickOpenConfortSelector() {
        elementMethods.clickJSElement(openConfortSelector);
        loggerUtility.infoLog("User clicks on the open confort selector.");
    }

    public boolean isPretTotal(){
        elementMethods.scrollToElementJS(textPretTotal);
        elementMethods.waitVisibleElement(textPretTotal);
        return textPretTotal.isDisplayed();
    }

    public boolean textSumaTotal(){
        elementMethods.scrollToElementJS(textSumaTotal);
        elementMethods.waitVisibleElement(textSumaTotal);
        return textSumaTotal.isDisplayed();
    }





}
