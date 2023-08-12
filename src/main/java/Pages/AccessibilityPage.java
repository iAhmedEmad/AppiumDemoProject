package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessibilityPage {
    WebDriver driver;

    public AccessibilityPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By accessibilityNodeQuerying = AppiumBy.accessibilityId("Accessibility Node Querying");
    private By accessibilityNodeProvider = AppiumBy.accessibilityId("Accessibility Node Provider");

    public By getAccessibilityNodeProvider() {
        return accessibilityNodeProvider;
    }

    // Actions
    public AccessibilityNodeQueryingPage clickOnAccessibilityNodeQuerying() {
        driver.findElement(accessibilityNodeQuerying).click();
        return new AccessibilityNodeQueryingPage(driver);
    }
}
