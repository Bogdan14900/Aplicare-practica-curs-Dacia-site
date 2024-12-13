package tests;

import org.testng.annotations.Test;
import pages.EvaluareMasinaPage;
import pages.HomePage;
import sharedData.Hooks;

import static org.testng.Assert.assertTrue;

public class TestFlowEstimareMasina extends Hooks {

    @Test
    public void metodaTest(){

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAcceptareCookies();
        homePage.clickEvaluareMasina();


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

        evaluareMasinaPage.clickTiresCondition("Front","Ca noi");
        evaluareMasinaPage.clickTiresCondition("Back","Ca noi");
    }

}
