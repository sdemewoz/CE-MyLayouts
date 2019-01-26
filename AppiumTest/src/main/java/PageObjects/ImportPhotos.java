package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ImportPhotos {
    public ImportPhotos(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = ("new UiSelector().text(\"Camera\")"))
    public WebElement Camera;

    @AndroidFindBy(id = "nl.albumprinter.smartphone.editor:id/import_image")
    public WebElement Image1;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Add']")
    public WebElement AddButton;


    public void clickCamera()
    {
        Camera.click();
    }
}
