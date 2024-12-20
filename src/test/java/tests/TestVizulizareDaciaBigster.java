package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.OverviewBigsterPage;
import sharedData.Hooks;

import static org.testng.Assert.assertTrue;

public class TestVizulizareDaciaBigster extends Hooks {

    @Test
    public void metodaTest() {

        //Scurta descriere test:
        //Acest test deschide meniul drepata sus si selecteaza modelul Dacia Bigster, si trece prin toate taburile de prezentare a calitatilor, validand pt fiecare tab textul

        HomePage homePage = new HomePage(getDriver());
        OverviewBigsterPage overviewBigsterPage = new OverviewBigsterPage(getDriver());

        homePage.clickAcceptareCookies();
        homePage.clickClickHamburger();
        homePage.clickDaciaBigster();

        assertTrue(overviewBigsterPage.isDaciaBigsterTextDisplayed());
        overviewBigsterPage.clickConfortabil();
        assertTrue(overviewBigsterPage.isSpatiuBineEchipatTextDisplayed());
        overviewBigsterPage.clickModular();
        assertTrue(overviewBigsterPage.isVersatilAtentProiectatTextDisplayed());
        overviewBigsterPage.clickPerformanteRidicate();
        assertTrue(overviewBigsterPage.isHybridDinamicTextDisplayed());
        overviewBigsterPage.clickConectat();
        assertTrue(overviewBigsterPage.isSigurantaTextDisplayed());
        overviewBigsterPage.clickSiguranta();
        assertTrue(overviewBigsterPage.isTehnologiiInteligenteTextDisplayed());
    }

}
