package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessibilityNodeQueryingPage {
    WebDriver driver;

    public AccessibilityNodeQueryingPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By conquerWorldCheckBox = AppiumBy.xpath("//android.widget.TextView[@content-desc='Task Conquer World']//parent::android.widget.LinearLayout/android.widget.CheckBox");

    public By getConquerWorldCheckBox() {
        return conquerWorldCheckBox;
    }

    // Actions
    public AccessibilityNodeQueryingPage clickOnConquerWorldCheckBox() {
        driver.findElement(conquerWorldCheckBox).click();
        return this;
    }


}
