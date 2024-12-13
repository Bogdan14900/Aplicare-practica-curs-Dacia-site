package helpMethods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class TabMethods {
    public WebDriver driver;

    public TabMethods(WebDriver driver) {
        this.driver = driver;
    }

    public int countTabs(){
        List<String> tabsList = new ArrayList<>(driver.getWindowHandles());
        return tabsList.size();
    }

    public void switchSpecificTab(int index){
        List<String> tabsList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabsList.get(index));
    }

    public void closeCurrentTab(){
        driver.close();
    }

    public void quitTab(){
        driver.quit();
    }
}
