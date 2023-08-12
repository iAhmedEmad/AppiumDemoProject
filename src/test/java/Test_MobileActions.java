import Pages.*;
import Utils.JsonFileManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test_MobileActions{
    WebDriver driver;
    JsonFileManager testData = new JsonFileManager("src//test//resources//TestDataFiles//TestData.json");

    @BeforeMethod(description = "setup")
    public void setup() throws MalformedURLException {
        TestConfigurations testConfigurations = new TestConfigurations();
        driver = testConfigurations.setupDevice();
    }
    @AfterMethod(description = "Tear Down")
    public void tearDown() {
        TestConfigurations testConfigurations = new TestConfigurations();
        testConfigurations.tearDownDevice();
    }
    @Test(description = "Test Click Action")
    public void testClickAction() {
        new HomePage(driver)
                .clickOnAccessibility();

        Assert.assertEquals(driver.findElement(new AccessibilityPage(driver).getAccessibilityNodeProvider())
                .getText(), testData.getTestData("AccessibilityNodeProviderLabel"));
    }
    @Test(description = "Test Typing")
    public void testTyping() {
          // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not
        new HomePage(driver)
                .clickOnApp()
                .ClickOnActivity()
                .clickOnCustomTitle()
                .clearTextField()
                .typeOnLeftSideTextField(testData.getTestData("LeftSideText"))
                .clickOnChangeLeft();
        Assert.assertEquals(driver.findElement(new CustomTitleTypingPage(driver).getTextChanged())
                .getText(), testData.getTestData("LeftSideText"));
    }
    @Test(description = "Test CheckBox")
    public void testCheckBox() {
        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked
        new HomePage(driver)
                .clickOnAccessibility()
                .clickOnAccessibilityNodeQuerying()
                .clickOnConquerWorldCheckBox();
        Assert.assertEquals(driver.findElement(new AccessibilityNodeQueryingPage(driver).getConquerWorldCheckBox())
                .getAttribute("checked"),"true");
    }
    @Test(description = "Test Scrolling")
    public void testScrolling() {
        // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not
        new HomePage(driver)
                .clickOnGraphics()
                .ScrollDownToSpecificText(testData.getTestData("ScaleToFitLabel"))
                .ClickOnScaleToFit();
        Assert.assertEquals(driver.findElement(new ScaleToFitPage(driver).getGraphicsScaleToFitLable())
                .getAttribute("text"),testData.getTestData("TextOnScaleToFitPage"));
    }
    @Test(description = "Test Swiping")
    public void testSwiping() {
        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left
        new HomePage(driver)
                .clickOnGraphics()
                .ScrollDownToSpecificText(testData.getTestData("VerticesLabel"))
                .clickOnVerticesLabel()
                .swipeRightOnPhoto()
                .swipeLeftOnPhoto();
    }
    @Test(description = "Test Radio Button")
    public void testRadioButton() {
        // Navigate to Views , Radio Group , click on any radio button and check If it's selected or not
        new HomePage(driver)
                .clickOnViews()
                .scrollDownToSpecificText(testData.getTestData("RadioGroupLabel"))
                .clickOnRadioGroup()
                .clickOnDinner();
        Assert.assertEquals(driver.findElement(new RadioGroupPage(driver).getDinnerLabel())
                .getAttribute("checked"),"true");
    }
}
