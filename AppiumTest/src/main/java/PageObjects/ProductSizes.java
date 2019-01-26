package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProductSizes {
    public ProductSizes(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Regular prints\")")
    public WebElement RegularPrint;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Square prints\")")
    public WebElement SquarePrint;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Retro prints\")")
    public WebElement RetroPrint;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"13 x 10 cm\")")
    public WebElement LandscapeS;


}