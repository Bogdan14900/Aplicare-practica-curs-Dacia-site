package tests;

import org.testng.annotations.Test;
import pages.EvaluareMasinaPage;
import pages.HomePage;
import sharedData.Hooks;

public class TestFlowEstimareMasina extends Hooks {

    @Test
    public void metodaTest(){

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAcceptareCookies();
        homePage.elementMethods.pause(1000);
        homePage.clickEvaluareMasina();
        homePage.elementMethods.pause(1000);

        EvaluareMasinaPage evaluareMasinaPage = new EvaluareMasinaPage(getDriver());
        evaluareMasinaPage.tabMethods.switchSpecificTab(1);
        evaluareMasinaPage.clickIncepereEvaluare();
        evaluareMasinaPage.clickAlegereAnInmatriculare();
        evaluareMasinaPage.clickAlegereLunaInmatriculare();

        evaluareMasinaPage.clickOpenDropDownList();
        evaluareMasinaPage.clickCarFromList("SKODA");
        evaluareMasinaPage.clickModelFromList("Octavia Diesel");
        evaluareMasinaPage.clickTipCombustibil();

        evaluareMasinaPage.clickTrimLevelClassic();
        evaluareMasinaPage.clickEngineType("SKODA Octavia 1.6 TDI 105.0CP");

        evaluareMasinaPage.clickOption1();
        evaluareMasinaPage.clickNextButton();

        evaluareMasinaPage.setNumberOfKilometers(150000);
        evaluareMasinaPage.clickNextButton();
        evaluareMasinaPage.clickFirstOwnerOption("da");

        evaluareMasinaPage.selectFrontTiresCondition("Ca noi");

    }

}
