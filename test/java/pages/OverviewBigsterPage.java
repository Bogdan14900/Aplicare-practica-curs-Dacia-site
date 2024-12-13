package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewBigsterPage extends BasePage{

    public OverviewBigsterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[text()='NOUL BIGSTER']")
    private WebElement textDaciaBigster;

    @FindBy(xpath = "//button[text()='Confortabil']")
    private WebElement calitateConfortabil;

    @FindBy(xpath = "//div[text()='Spațios și bine echipat']")
    private WebElement textSpatiuBineEchipat;

    @FindBy(xpath = "//button[text()='Modular']")
    private WebElement calitateModular;

    @FindBy(xpath = "//div[text()='Versatil și atent proiectat']")
    private WebElement textVersatilAtentProiectat;

    @FindBy(xpath = "//button[text()='Performanțe ridicate']")
    private WebElement calitatePerformanteRidicate;

    @FindBy(xpath = "//div[text()='Hibrid și dinamic']")
    private WebElement textHibridDinamic;

    @FindBy(xpath = "//button[text()='Conectat']")
    private WebElement calitateConectat;

    @FindBy(xpath = "//div[text()='Ca să ajungi întotdeauna în siguranță']")
    private WebElement textSiguranta;

    @FindBy(xpath = "//button[text()='Siguranță']")
    private WebElement calitateSiguranta;

    @FindBy(xpath = "//div[text()='Tehnologii inteligente']")
    private WebElement textTehnologiiInteligente;

/// ///

    public boolean isDaciaBigsterTextDisplayed(){
        elementMethods.waitVisibleElement(textDaciaBigster);
        return textDaciaBigster.isDisplayed();
    }

    public boolean isSpatiuBineEchipatTextDisplayed(){
        elementMethods.waitVisibleElement(textSpatiuBineEchipat);
        return textSpatiuBineEchipat.isDisplayed();
    }

    public boolean isVersatilAtentProiectatTextDisplayed(){
        elementMethods.waitVisibleElement(textVersatilAtentProiectat);
        return textVersatilAtentProiectat.isDisplayed();
    }

    public boolean isHybridDinamicTextDisplayed(){
        elementMethods.waitVisibleElement(textHibridDinamic);
        return textHibridDinamic.isDisplayed();
    }

    public boolean isSigurantaTextDisplayed(){
        elementMethods.waitVisibleElement(textSiguranta);
        return textSiguranta.isDisplayed();
    }

    public boolean isTehnologiiInteligenteTextDisplayed(){
        elementMethods.waitVisibleElement(textTehnologiiInteligente);
        return textTehnologiiInteligente.isDisplayed();
    }


    /// /

    public void clickConfortabil() {
        elementMethods.clickJSElement(calitateConfortabil);
        loggerUtility.infoLog("User clicks on the Rezerva Online option");
    }

    public void clickModular() {
        elementMethods.clickJSElement(calitateModular);
    }

    public void clickPerformanteRidicate() {
        elementMethods.clickJSElement(calitatePerformanteRidicate);
        loggerUtility.infoLog("User clicks on the Performante ridicate tab");
    }

    public void clickConectat() {
        elementMethods.clickJSElement(calitateConectat);
        loggerUtility.infoLog("User clicks on the Conectat tab");
    }

    public void clickSiguranta() {
        elementMethods.clickJSElement(calitateSiguranta);
        loggerUtility.infoLog("User clicks on the Siguranta tab");
    }

}
