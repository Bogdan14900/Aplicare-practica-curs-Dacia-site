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
        configurareLoganFullPage.clickOpenPachetClimaSelector();
        configurareLoganFullPage.clickOpenSigurantaSelector();
        configurareLoganFullPage.clickOpenPachetParkingSelector();
        configurareLoganFullPage.clickOpenHusaScaunCainiSelector();
        configurareLoganFullPage.clickOpenUmerasTetieraSelector();
        configurareLoganFullPage.clickOpenSuportMultifunctionalTetieraSelector();
        configurareLoganFullPage.clickNavigationSelector();
        configurareLoganFullPage.clickOpenSuportMagneticSelector();
        configurareLoganFullPage.clickOpenConfortSiProtectieSelector();
        configurareLoganFullPage.clickOpenMasinaCafeaSelector();
        configurareLoganFullPage.clickOpenCarligSistemSelector();
        configurareLoganFullPage.clickOpenUmerasSistemSelector();
        configurareLoganFullPage.clickOpenTabletaSpateSelector();
        configurareLoganFullPage.clickOpenDesignSelector();
        configurareLoganFullPage.clickOpenProtectieIluminateSelector();

        assertTrue(configurareLoganFullPage.isPretTotal());
        assertTrue(configurareLoganFullPage.textSumaTotal());


    }

}
