package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerticesPhotoPage {
    WebDriver driver;
    MobileActions ma;

    public VerticesPhotoPage(WebDriver driver) {
        this.driver = driver;
    }

    public By getPhoto() {
        return photo;
    }

    // Locators
    private By photo = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']");

    // Actions
    public VerticesPhotoPage swipeLeftOnPhoto(){
        ma = new MobileActions(driver);
        ma.swipeLeftOnElement(photo);
        return this;
    }
    public VerticesPhotoPage swipeRightOnPhoto(){
        ma = new MobileActions(driver);
        ma.swipeRightOnElement(photo,driver);
        return this;
    }
}
