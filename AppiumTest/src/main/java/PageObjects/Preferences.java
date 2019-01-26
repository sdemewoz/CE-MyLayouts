package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Preferences {
    public Preferences(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"icon-pencil\")")
    public WebElement StartEmpty;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"smallThumbnail\")")
    public WebElement UseQuickFill;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"NEXT\")")
    public WebElement NextButton;
}
