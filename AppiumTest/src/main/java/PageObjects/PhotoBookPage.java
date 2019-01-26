package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PhotoBookPage {
    public PhotoBookPage(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"PHOTOS\")")
    public WebElement PhotoTab;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"PHOTOS\")")
    public WebElement LayoutTab;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"PHOTOS\")")
    public WebElement ColorsTab;

    @AndroidFindBy(xpath = "//android.view.View[@bounds='[357,2380][672,2695]']")
    public WebElement Image_1;

    @AndroidFindBy(xpath = "//android.view.View[@bounds='[420,353][1029,672]']")
    public WebElement Page_1;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"1\")")
    public WebElement Badge_1;
}
