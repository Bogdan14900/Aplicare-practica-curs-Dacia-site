package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class EvaluareMasinaPage extends BasePage{
    public EvaluareMasinaPage(WebDriver driver) {
        super(driver);
    }

    //locators

    @FindBy(xpath = "//button[@title='Apasă pentru a selecta vehiculul']")
    private WebElement butonIncepereEvaluare;

    @FindAll({
            @FindBy(xpath = "//div[@class='FunnelSelect FunnelSelect_year']//div[@class='BlockSelect__element']//button")
    })
    private List<WebElement> anPrimaInmatriculare;

    @FindAll({
            @FindBy(xpath = "//div[@class='FunnelSelect FunnelSelect_month']//div[@class='BlockSelect__element']//button")
    })
    private List<WebElement> lunaPrimaInmatriculare;

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement optiuneAcceptareCookies;

    @FindBy(xpath = "//button[contains(@class, 'ComboBoxToggle')]")
    private WebElement openDropDownList;

    @FindBy(xpath = "//div[contains(@class,'RichSelect')]")
    private WebElement selectCarFromList;

    @FindBy(xpath = "//div[contains(@class,'BlockSelect')]")
    private WebElement selectModelFromList;

    @FindBy(xpath = "//div[@class='Button__content']")
    private WebElement butonTipCombustibil;

    @FindBy(xpath = "//div[text()='Classic']")
    private WebElement trimClassic;

    @FindBy(xpath = "//tbody[contains(@class, 'DataTable__body')]//tr[contains(@class, 'DataTable__bodyRow')]//td[contains(@class, 'DataTable__box')]")
    private List<WebElement> engineOptions;

    @FindBy(xpath = "//span[text()='Inst. curatat faruri + verificare nivel lichid de spalare']")
    private WebElement optionHeadlightClean;

    @FindBy(className = "FunnelPage__buttonLabel_next")
    private WebElement nextStepButton;

    @FindBy(id = "tfid-0-0")
    private WebElement numberOfKilometers;

    @FindBy(css=".FunnelSelect_firstHand button")
    private List<WebElement> firstOwnerOptions;

    @FindBy(xpath="//div[@class='FunnelSelect FunnelSelect_tiresFront']")
    private WebElement frontTiresSelector;

    @FindBy(xpath="//div[@class='FunnelSelect FunnelSelect_tiresBack']")
    private WebElement rearTiresSelector;

    //methods
    public void clickAcceptareCookies(){
        elementMethods.clickJSElement(optiuneAcceptareCookies);
        loggerUtility.infoLog("User accepts cookies");
    }

    public void clickIncepereEvaluare(){
        elementMethods.clickJSElement(butonIncepereEvaluare);
        loggerUtility.infoLog("User click on 'Apasa aici pentru a incepe procesul de evaluare!' button");
    }


    public void clickAlegereAnInmatriculare(String year) {
        for (WebElement element : anPrimaInmatriculare) {
            if (element.getText().trim().equals(year)) {
                elementMethods.clickJSElement(element);
                loggerUtility.infoLog("User clicks on the year: " + year);
                return;
            }
        }
    }

//    public void clickAlegereLunaInmatriculare(){
//        elementMethods.clickJSElement(lunaPrimaInmatriculare.get(2));
//        loggerUtility.infoLog("User clicks on the third month in the list");
//    }

    public void clickAlegereLunaInmatriculare(int monthIndex){
        // Add a check to ensure the index is valid
        if (monthIndex < 0 || monthIndex >= lunaPrimaInmatriculare.size()) {
            throw new IllegalArgumentException("Invalid month index. Must be between 0 and " + (lunaPrimaInmatriculare.size() - 1));
        }

        elementMethods.clickJSElement(lunaPrimaInmatriculare.get(monthIndex));
        loggerUtility.infoLog("User clicks on month at index: " + monthIndex);
    }


    public void clickOpenDropDownList() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(openDropDownList));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", openDropDownList);

        loggerUtility.infoLog("User clicks to open dropdown list");
    }

    public void clickCarFromList(String carName){
        elementMethods.selectCustomDropDownElement(selectCarFromList,carName);
    }

    public void clickModelFromList(String modelName) {
        elementMethods.waitVisibleElement(selectModelFromList);
        String modelXpath = ".//div[@class='Button__content' and text()='" + modelName + "']";
        WebElement modelElement = selectModelFromList.findElement(By.xpath(modelXpath));
        elementMethods.pause(1000);
        modelElement.click();
    }

    public void clickTipCombustibil(){
        elementMethods.pause(1000);
        elementMethods.clickJSElement(butonTipCombustibil);
        loggerUtility.infoLog("User chooses the fuel type");
    }


    public void clickTrimLevelClassic(){
        elementMethods.clickJSElement(trimClassic);
        loggerUtility.infoLog("User chooses the Classic trim level");
    }

    public void clickEngineType(String engineType) {
        elementMethods.waitVisibleElement(engineOptions.get(0));
        for (WebElement engineOption : engineOptions) {
            if (engineOption.getText().trim().equalsIgnoreCase(engineType)) {
                engineOption.click();
                break;
            }
        }
    }

    public void clickOption1(){
        elementMethods.clickJSElement(optionHeadlightClean);
        loggerUtility.infoLog("User chooses the Headlight clean option");
    }

    public void clickNextButton(){
        elementMethods.clickJSElement(nextStepButton);
        loggerUtility.infoLog("User clicks the next step button");
    }

    public void setNumberOfKilometers(int kilometers) {
        elementMethods.waitVisibleElement(numberOfKilometers);
        numberOfKilometers.clear();
        numberOfKilometers.sendKeys(String.valueOf(kilometers));
    }


    public void clickFirstOwnerOption(String option) {
        int index = option.equalsIgnoreCase("nu") ? 1 : 0;
        firstOwnerOptions.get(index).click();
    }

    public void clickTiresCondition(String side, String optionText) {
        elementMethods.pause(500);
        WebElement element = side.equalsIgnoreCase("front") ? frontTiresSelector : rearTiresSelector;
        WebElement option = element.findElement(By.xpath(".//button/div[text()='" + optionText + "']"));
        option.click();
    }



}




