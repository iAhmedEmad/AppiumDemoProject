package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScaleToFitPage {
    WebDriver driver;

    public ScaleToFitPage(WebDriver driver) {
        this.driver = driver;
    }
    // Locators
    private By GraphicsScaleToFitLable = AppiumBy.xpath("//android.widget.TextView[@text ='Graphics/ScaleToFit']");

    public By getGraphicsScaleToFitLable() {
        return GraphicsScaleToFitLable;
    }
// Actions
}
