package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppPage {
    WebDriver driver;
    // Constructor
    public AppPage(WebDriver driver) {
        this.driver = driver;
    }


    // Locators
    private By activityLabel = AppiumBy.accessibilityId("Activity");

    // Actions
    public ActivityPage ClickOnActivity (){
        driver.findElement(activityLabel).click();
        return new ActivityPage(driver);
    }

}
