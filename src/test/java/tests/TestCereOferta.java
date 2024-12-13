package tests;

import org.testng.annotations.Test;
import pages.ConfigurareLoganFullPage;
import pages.HomePage;
import pages.OfertePage;
import sharedData.Hooks;

import static org.testng.Assert.assertTrue;

public class TestCereOferta extends Hooks {

    @Test
    public void metodaTest() {

        HomePage homePage = new HomePage(getDriver());
        OfertePage ofertePage = new OfertePage(getDriver());

        homePage.clickAcceptareCookies();
        homePage.clickAchizitioneaza();
        homePage.clickCereOferta();
        homePage.tabMethods.switchSpecificTab(1);

        ofertePage.selectOffer(2);
        ofertePage.typeText("Bucuresti");
        ofertePage.selectDropdownOption(1);
        assertTrue(ofertePage.isAutoCobalcescuDisplayed());
        ofertePage.clickAlegeButton();
        ofertePage.setNamedropdownOptions(1);
    }
}