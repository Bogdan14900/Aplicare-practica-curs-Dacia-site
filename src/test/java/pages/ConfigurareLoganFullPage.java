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

    @FindBy(xpath = "//p[text()='Pachet Clima']")
    private WebElement openPachetClimaSelector;

    @FindBy(xpath = "//span[text()='SIGURANTA']")
    private WebElement openSigurantaSelector;

    @FindBy(xpath = "//p[text()='Pachet Parking']")
    private WebElement openPachetParkingSelector;

    @FindBy(xpath = "//p[text()='Husa scaun spate de protectie pentru caini']")
    private WebElement openHusaScaunCainiSelector;

    @FindBy(xpath = "//p[text()='Umeraș pe tetieră - Dacia']")
    private WebElement openUmerasTetieraSelector;

    @FindBy(xpath = "//p[text()='Suport multifunctional pe tetiera']")
    private WebElement openSuportMultifunctionalTetieraSelector;

    @FindBy(xpath = "//span[text()='GPS, AUDIO, VIDEO']")
    private WebElement openNavigationSelector;

    @FindBy(xpath = "//p[text()='Suport magnetic pentru smartphone pe aerator']")
    private WebElement openSuportMagneticSelector;

    @FindBy(xpath = "//span[text()='CONFORT SI PROTECTIE']")
    private WebElement openConfortSiProtectieSelector;

    @FindBy(xpath = "//p[text()='Masina de cafea mobila Handpresso']")
    private WebElement openMasinaCafeaSelector;

    @FindBy(xpath = "//p[text()='Carlig si sistem multifunctional']")
    private WebElement openCarligSistemSelector;

    @FindBy(xpath = "//p[text()='Umeras si sistem multifunctional']")
    private WebElement openUmerasSistemSelector;

    @FindBy(xpath = "//p[text()='Tableta spate pentru sistemul multifunctional']")
    private WebElement openTabletaSpateSelector;

    @FindBy(xpath = "//p[text()='Protecție iluminate pentru praguri uși față Logan']")
    private WebElement openProtectieIluminateSelector;

    @FindBy(xpath = "//span[text()='DESIGN']")
    private WebElement openDesignSelector;


    @FindBy(xpath = "//div[text()='Preț total']")
    private WebElement textPretTotal;

    @FindBy(xpath = "//span[contains(@class, 'OneConfigReceiptSummaryPrice__price') and contains(text(), '19.477')]")
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
        elementMethods.waitVisibleElement(optionJante);
        elementMethods.pause(1000);
        elementMethods.clickJSElement(optionJante);
        loggerUtility.infoLog("User clicks on the Jante option.");
    }

    public void clickOptionPachetTehno() {
        elementMethods.scrollToElementJS(optionPachetTehno);
        elementMethods.waitVisibleElement(optionPachetTehno);
        elementMethods.pause(1000);
        elementMethods.clickJSElement(optionPachetTehno);
        loggerUtility.infoLog("User clicks on the Pachet Tehno option.");
    }

    public void clickOpenConfortSelector() {
        elementMethods.scrollToElementJS(openConfortSelector);
        elementMethods.waitVisibleElement(openConfortSelector);
        elementMethods.pause(1000);
        elementMethods.clickJSElement(openConfortSelector);
        loggerUtility.infoLog("User clicks on the open confort selector.");
    }

    public void clickOpenPachetClimaSelector() {
        elementMethods.scrollToElementJS(openPachetClimaSelector);
        elementMethods.waitVisibleElement(openPachetClimaSelector);
        elementMethods.pause(1000);
        elementMethods.clickJSElement(openPachetClimaSelector);
        loggerUtility.infoLog("User clicks on the open pachet clima selector.");
    }

    public void clickOpenSigurantaSelector() {
        elementMethods.scrollToElementJS(openSigurantaSelector);
        elementMethods.waitVisibleElement(openSigurantaSelector);
        elementMethods.pause(1000);
        elementMethods.clickJSElement(openSigurantaSelector);
        loggerUtility.infoLog("User clicks on the open siguranta selector.");
    }

    public void clickOpenPachetParkingSelector() {
        elementMethods.scrollToElementJS(openPachetParkingSelector);
        elementMethods.waitVisibleElement(openPachetParkingSelector);
        elementMethods.pause(1000);
        elementMethods.clickJSElement(openPachetParkingSelector);
        loggerUtility.infoLog("User clicks on the open pachet parking selector.");
    }


    public void clickOpenHusaScaunCainiSelector() {
        elementMethods.scrollToElementJS(openHusaScaunCainiSelector);
        elementMethods.waitVisibleElement(openHusaScaunCainiSelector);
        elementMethods.pause(1000);
        elementMethods.clickJSElement(openHusaScaunCainiSelector);
        loggerUtility.infoLog("User clicks on the husa scaun spate de protectie pentru caini selector.");
    }

    public void clickOpenUmerasTetieraSelector() {
        elementMethods.scrollToElementJS(openUmerasTetieraSelector);
        elementMethods.waitVisibleElement(openUmerasTetieraSelector);
        elementMethods.pause(1000);
        elementMethods.clickJSElement(openUmerasTetieraSelector);
        loggerUtility.infoLog("User clicks on the umeraș pe tetieră selector.");
    }

    public void clickOpenSuportMultifunctionalTetieraSelector() {
        elementMethods.scrollToElementJS(openSuportMultifunctionalTetieraSelector);
        elementMethods.waitVisibleElement(openSuportMultifunctionalTetieraSelector);
        elementMethods.pause(1000);
        elementMethods.clickJSElement(openSuportMultifunctionalTetieraSelector);
        loggerUtility.infoLog("User clicks on the suport multifunctional pe tetiera selector.");
    }

    public void clickNavigationSelector() {
        elementMethods.scrollToElementJS(openNavigationSelector);
        elementMethods.waitVisibleElement(openNavigationSelector);
        elementMethods.pause(1000);
        elementMethods.clickJSElement(openNavigationSelector);
        loggerUtility.infoLog("User clicks on the navigation selector.");
    }

    public void clickOpenSuportMagneticSelector() {
        elementMethods.scrollToElementJS(openSuportMagneticSelector);
        elementMethods.waitVisibleElement(openSuportMagneticSelector);
        elementMethods.pause(1000);
        elementMethods.clickJSElement(openSuportMagneticSelector);
        loggerUtility.infoLog("User clicks on the open suport magnetic selector.");
    }

    public void clickOpenConfortSiProtectieSelector() {
        elementMethods.scrollToElementJS(openConfortSiProtectieSelector);
        elementMethods.waitVisibleElement(openConfortSiProtectieSelector);
        elementMethods.pause(1000);
        elementMethods.clickJSElement(openConfortSiProtectieSelector);
        loggerUtility.infoLog("User clicks on the open confort si protectie selector.");
    }

    public void clickOpenMasinaCafeaSelector() {
        elementMethods.scrollToElementJS(openMasinaCafeaSelector);
        elementMethods.waitVisibleElement(openMasinaCafeaSelector);
        elementMethods.pause(1000);
        elementMethods.clickJSElement(openMasinaCafeaSelector);
        loggerUtility.infoLog("User clicks on the open masina de cafea selector.");
    }

    public void clickOpenCarligSistemSelector() {
        elementMethods.scrollToElementJS(openCarligSistemSelector);
        elementMethods.waitVisibleElement(openCarligSistemSelector);
        elementMethods.pause(1000);
        elementMethods.clickJSElement(openCarligSistemSelector);
        loggerUtility.infoLog("User clicks on the open carlig si sistem selector.");
    }

    public void clickOpenUmerasSistemSelector() {
        elementMethods.scrollToElementJS(openUmerasSistemSelector);
        elementMethods.waitVisibleElement(openUmerasSistemSelector);
        elementMethods.pause(1000);
        elementMethods.clickJSElement(openUmerasSistemSelector);
        loggerUtility.infoLog("User clicks on the open umeras si sistem selector.");
    }

    public void clickOpenTabletaSpateSelector() {
        elementMethods.scrollToElementJS(openTabletaSpateSelector);
        elementMethods.waitVisibleElement(openTabletaSpateSelector);
        elementMethods.pause(1000);
        elementMethods.clickJSElement(openTabletaSpateSelector);
        loggerUtility.infoLog("User clicks on the open tableta spate selector.");
    }

    public void clickOpenDesignSelector() {
        elementMethods.scrollToElementJS(openDesignSelector);
        elementMethods.waitVisibleElement(openDesignSelector);
        elementMethods.pause(1000);
        elementMethods.clickJSElement(openDesignSelector);
        loggerUtility.infoLog("User clicks on the open design selector.");
    }

    public void clickOpenProtectieIluminateSelector() {
        elementMethods.scrollToElementJS(openProtectieIluminateSelector);
        elementMethods.pause(1000);
        elementMethods.clickJSElement(openProtectieIluminateSelector);
        loggerUtility.infoLog("User clicks on the open protectie iluminate selector.");
    }


    public boolean isPretTotal(){
//        elementMethods.scrollToElementJS(textPretTotal);
        elementMethods.waitVisibleElement(textPretTotal);
        return textPretTotal.isDisplayed();
    }

    public boolean textSumaTotal(){
//        elementMethods.scrollToElementJS(textSumaTotal);
        elementMethods.waitVisibleElement(textSumaTotal);
        return textSumaTotal.isDisplayed();
    }





}
