package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomTitleTypingPage {
    WebDriver driver;

    public CustomTitleTypingPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By textField = AppiumBy.id("io.appium.android.apis:id/left_text_edit");
    private By changeLeftButton = AppiumBy.accessibilityId("Change Left");
    private By textChanged = AppiumBy.id("io.appium.android.apis:id/left_text");

    public By getTextChanged() {
        return textChanged;
    }

    // Actions

    public CustomTitleTypingPage clearTextField() {
        driver.findElement(textField).clear();
        return this;
    }
    public CustomTitleTypingPage typeOnLeftSideTextField(String text) {
        driver.findElement(textField).sendKeys(text);
        return this;
    }

    public CustomTitleTypingPage clickOnChangeLeft() {
        driver.findElement(changeLeftButton).click();
        return this;
    }


}
