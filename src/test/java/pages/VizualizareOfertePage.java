package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VizualizareOfertePage extends BasePage {
    WebDriver driver;

    public VizualizareOfertePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(css = ".FeaturePromoWithCopy__element a.is-link-arrow")
    private List<WebElement> promoLinks;

    @FindBy(xpath = "//p[text()='Logan Essential ECO-G 100 MT5 De la 13.100 EUR* (TVA inclus)']")
    private WebElement textPretLogan;

    @FindBy(xpath = "//p[text()='Sandero Stepway Essential ECO-G 100 de la 13.900 EUR* (TVA INCLUS)']")
    private WebElement textPretSandero;

    @FindBy(xpath = "//p[text()='Jogger Essential ECO-G 100 (5 locuri) DE LA 16.390 EUR* (TVA INCLUS)']")
    private WebElement textPretJogger;

    @FindBy(xpath = "//p[text()='NOUL DUSTER ESSENTIAL ECO-G 100 DE LA 17.750 EUR* (TVA INCLUS)']")
    private WebElement textPretDuster;



    public void selectOffer(int i) {
        elementMethods.clickJSElement(promoLinks.get(i));
        loggerUtility.infoLog("User clicks on the chosen offer. Index: " + i);
    }

    public void switchToOtherTabIfExists() {
        if (tabMethods.countTabs() > 1) {
            tabMethods.switchSpecificTab(1);
            elementMethods.pause(1500);
        }
    }

    public void navigateBackOrCloseTab() {

        if (tabMethods.countTabs() > 1) {
            tabMethods.closeCurrentTab();
            tabMethods.switchSpecificTab(0);
        } else {
            driver.navigate().back();
        }

    }

    public boolean isLoganPriceDisplayed(){
        elementMethods.waitVisibleElement(textPretLogan);
        return textPretLogan.isDisplayed();
    }

    public boolean isSanderoPriceDisplayed(){
        elementMethods.waitVisibleElement(textPretSandero);
        return textPretSandero.isDisplayed();
    }

    public boolean isJoggerPriceDisplayed(){
        elementMethods.waitVisibleElement(textPretJogger);
        return textPretJogger.isDisplayed();
    }

    public boolean isDusterPriceDisplayed(){
        elementMethods.waitVisibleElement(textPretDuster);
        return textPretDuster.isDisplayed();

    }


}
