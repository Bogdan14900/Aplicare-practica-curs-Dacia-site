package pages;

import helpMethods.*;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    public LoggerUtility loggerUtility;
    public ElementMethods elementMethods;
    public AlertMethods alertMethods;
    public FrameMethods frameMethods;
    public TabMethods tabMethods;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        loggerUtility = new LoggerUtility();
        elementMethods = new ElementMethods(this.driver);
        alertMethods = new AlertMethods(this.driver);
        frameMethods = new FrameMethods(driver);
        tabMethods = new TabMethods(this.driver);
        PageFactory.initElements(this.driver,this);
    }
}
