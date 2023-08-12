package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private final By AccessibilityLabel = AppiumBy.accessibilityId("Access'ibility");
    private By AppLabel = AppiumBy.accessibilityId("App");
    private By graphicsLabel =AppiumBy.accessibilityId("Graphics");
    private By viewsLabel = AppiumBy.accessibilityId("Views");

    // Actions
    public AccessibilityPage clickOnAccessibility(){
        driver.findElement(AccessibilityLabel).click();
        return  new AccessibilityPage(driver);
    }
    public AppPage clickOnApp(){
        driver.findElement(AppLabel).click();
        return  new AppPage(driver);
    }
    public GraphicsPage clickOnGraphics(){
        driver.findElement(graphicsLabel).click();
        return  new GraphicsPage(driver);
    }
    public ViewsPage clickOnViews(){
        driver.findElement(viewsLabel).click();
        return  new ViewsPage(driver);
    }



}
