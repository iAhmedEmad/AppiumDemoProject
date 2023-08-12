package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GraphicsPage {
    WebDriver driver;
    MobileActions ma;

    public GraphicsPage(WebDriver driver) {
        this.driver = driver;
    }
    // Locators
    private By verticesLabel = AppiumBy.accessibilityId("Vertices");
    private By scaleToFitButton =AppiumBy.accessibilityId("ScaleToFit");

    // Actions
    public GraphicsPage ScrollDownToSpecificText(String text){
        ma = new MobileActions(driver);
        ma.scrollDownToSpecificText(text);
        return this;
    }
    public VerticesPhotoPage clickOnVerticesLabel(){
        driver.findElement(verticesLabel).click();
        return new VerticesPhotoPage(driver);
    }
    public GraphicsPage ClickOnScaleToFit(){
        driver.findElement(scaleToFitButton).click();
        return this;
    }
}