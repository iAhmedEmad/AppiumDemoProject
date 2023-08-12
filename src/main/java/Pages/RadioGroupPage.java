package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioGroupPage {
    WebDriver driver;

    public RadioGroupPage(WebDriver driver) {
        this.driver = driver;
    }
    // Locators
    private By dinnerLabel = AppiumBy.accessibilityId("Dinner");

    public By getDinnerLabel() {
        return dinnerLabel;
    }
// Actions
    public RadioGroupPage clickOnDinner(){
        driver.findElement(dinnerLabel).click();
        return this;
    }
}
