package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PrintSize {
    public PrintSize(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Regular prints\")")
    public WebElement Regular;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Square prints\")")
    public WebElement Square;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Retro prints\")")
    public WebElement Retro;
}
