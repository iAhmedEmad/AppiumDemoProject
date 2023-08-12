package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewsPage {
    WebDriver driver;
    MobileActions ma;

    public ViewsPage(WebDriver driver) {
        this.driver = driver;
    }
    // Locators
    private By radioGroupLabel = AppiumBy.accessibilityId("Radio Group");

    // Actions
    public ViewsPage scrollDownToSpecificText(String text) {
        ma = new MobileActions(driver);
        ma.scrollDownToSpecificText(text);
        return this;
    }
    public RadioGroupPage clickOnRadioGroup(){
        driver.findElement(radioGroupLabel).click();
        return new RadioGroupPage(driver);
    }

}
