package Pages;

import io.appium.java_client.AppiumBy;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivityPage {

    WebDriver driver;

    public ActivityPage(WebDriver driver) {
        this.driver = driver;
    }
    // Locators
    private By customTitleLabel = AppiumBy.accessibilityId("Custom Title");

    // Actions
    public CustomTitleTypingPage clickOnCustomTitle() {
        driver.findElement(customTitleLabel).click();
        return new CustomTitleTypingPage(driver);
    }


}
