package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProductSelection {

       //concatenate driver
    public ProductSelection(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //driver.findElementByAndroidUIAutomator("text(\"Photo Prints\")")
    //@AndroidFindBy() page obeject factory
    @AndroidFindBy(uiAutomator = " new UiSelector().text(\"Photo books\")")
    public WebElement books;

    @AndroidFindBy(uiAutomator = " new UiSelector().text(\"Photo Prints\")")
    public WebElement prints;
    //cards, mugs can be added here

    public void  clickPhotoBooks()
    {
        books.click();
    }
    public void clickPrints()
    {
        prints.click();
    }
}
