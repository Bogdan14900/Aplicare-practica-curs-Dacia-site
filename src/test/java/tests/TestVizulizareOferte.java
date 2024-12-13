package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.OverviewBigsterPage;
import pages.VizualizareOfertePage;
import sharedData.Hooks;

import static org.testng.Assert.assertTrue;

public class TestVizulizareOferte extends Hooks {

    @Test
    public void metodaTest() {


        HomePage homePage = new HomePage(getDriver());
        VizualizareOfertePage vizualizareOfertePage = new VizualizareOfertePage(getDriver());

        homePage.clickAcceptareCookies();
        homePage.clickToateOfertele();

        vizualizareOfertePage.selectOffer(0);
        vizualizareOfertePage.switchToOtherTabIfExists();
        //
        assertTrue(vizualizareOfertePage.isLoganPriceDisplayed());
        vizualizareOfertePage.navigateBackOrCloseTab();

        vizualizareOfertePage.selectOffer(1);
        vizualizareOfertePage.switchToOtherTabIfExists();
        //
        assertTrue(vizualizareOfertePage.isSanderoPriceDisplayed());

        vizualizareOfertePage.navigateBackOrCloseTab();

        vizualizareOfertePage.selectOffer(2);
        vizualizareOfertePage.switchToOtherTabIfExists();
        //
        assertTrue(vizualizareOfertePage.isJoggerPriceDisplayed());
        vizualizareOfertePage.navigateBackOrCloseTab();

        vizualizareOfertePage.selectOffer(3);
        vizualizareOfertePage.switchToOtherTabIfExists();
        //
        assertTrue(vizualizareOfertePage.isDusterPriceDisplayed());
        vizualizareOfertePage.navigateBackOrCloseTab();



    }
}
