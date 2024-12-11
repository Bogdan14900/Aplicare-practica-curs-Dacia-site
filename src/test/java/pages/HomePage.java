package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@data-track-button-text='evaluează-ți mașina online']")
    private WebElement optiuneEvaluareMasina;

    @FindBy(xpath = "//a[@data-track-button-text='Configurează']")
    private WebElement optiuneConfigurare;

    @FindBy(xpath = "//a[@data-track-button-text='Rezervă online']")
    private WebElement optiuneRezervaOnline;

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement optiuneAcceptareCookies;

    public void clickAcceptareCookies(){
        elementMethods.waitVisibleElement(optiuneAcceptareCookies);
        elementMethods.clickJSElement(optiuneAcceptareCookies);
        loggerUtility.infoLog("User accepts cookies");
    }

    public void clickRezervaOnline(){
        elementMethods.clickJSElement(optiuneRezervaOnline);
        loggerUtility.infoLog("User clicks on the Rezerva Online option");
    }

    public void clickConfigureaza(){
        elementMethods.clickJSElement(optiuneConfigurare);
        loggerUtility.infoLog("User clicks on the Configureaza option");
    }

    public void clickEvaluareMasina(){
        elementMethods.clickJSElement(optiuneEvaluareMasina);
        loggerUtility.infoLog("User clicks on the Rezerva Online option");
    }









}
