package tests;

import org.testng.annotations.Test;
import pages.ConfigurareLoganFullPage;
import pages.HomePage;
import pages.VizualizareOfertePage;
import sharedData.Hooks;

import static org.testng.Assert.assertTrue;

public class TestConfigurareLoganFullOption extends Hooks {
    @Test
    public void metodaTest() {

        HomePage homePage = new HomePage(getDriver());
        ConfigurareLoganFullPage configurareLoganFullPage = new ConfigurareLoganFullPage(getDriver());

        homePage.clickAcceptareCookies();
        homePage.clickConfigureaza();

        configurareLoganFullPage.selectOffer(4);
        configurareLoganFullPage.clickOptionExpression();
        configurareLoganFullPage.clickOptionCutieViteze();
        configurareLoganFullPage.clickOptionCuloareMasina();
        configurareLoganFullPage.clickOptionJante();
        configurareLoganFullPage.clickOptionPachetTehno();
        configurareLoganFullPage.clickOpenConfortSelector();
        assertTrue(configurareLoganFullPage.isPretTotal());
        assertTrue(configurareLoganFullPage.isPretTotal());


    }

}
