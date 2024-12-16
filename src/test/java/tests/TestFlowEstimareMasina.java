package tests;

import org.testng.annotations.Test;
import pages.EvaluareMasinaPage;
import pages.HomePage;
import sharedData.Hooks;

import java.util.Arrays;

public class TestFlowEstimareMasina extends Hooks {

    @Test
    public void metodaTest(){

        //Scurta descriere test:
        //Acest test trece prin mai multe filtre sa analizeze un model de masina second hand a proprietarului, in cazul de fata o Skoda Octavia,
        //se contureaza starea actuala a vehiculului si se completeaza un formular cu datele proprietarului

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAcceptareCookies();
        homePage.elementMethods.pause(1000);
        homePage.clickEvaluareMasina();
        homePage.elementMethods.pause(1000);

        EvaluareMasinaPage evaluareMasinaPage = new EvaluareMasinaPage(getDriver());
        evaluareMasinaPage.tabMethods.switchSpecificTab(1);
        evaluareMasinaPage.clickIncepereEvaluare();
        evaluareMasinaPage.clickAlegereAnInmatriculare("2011");
        evaluareMasinaPage.clickAlegereLunaInmatriculare(2);

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

        evaluareMasinaPage.clickTiresCondition("front","Ca noi");
        evaluareMasinaPage.clickTiresCondition("back","Uzate 50%");

        evaluareMasinaPage.clickDateContact();

        evaluareMasinaPage.setNamedropdownOptions(1);
        evaluareMasinaPage.enterLastName("George");
        evaluareMasinaPage.enterFirstName("Ion");
        evaluareMasinaPage.enterEmail("george@gmail.com");
        evaluareMasinaPage.enterPhoneNumber("0720000011");
        evaluareMasinaPage.selectVehicleOption("Nu");
        evaluareMasinaPage.clickCheckbox();
        evaluareMasinaPage.clickNoMarketing();
        evaluareMasinaPage.clickPartnerButton();




    }

}
