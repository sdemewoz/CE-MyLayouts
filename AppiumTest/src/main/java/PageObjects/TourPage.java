package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TourPage {
    public TourPage(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

//    @AndroidFindBy(uiAutomator = "new UiSelctor().text(\"SKIP TOUR\")")
//    public WebElement Skip;


//    driver.findElementByAndroidUIAutomator("text(\"SKIP TOUR\")").click();
//    public void clickSkip()
//    {
//        Skip.click();
//    }


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"SKIP TOUR\")")
    public WebElement Skip;

//    public void ClickShopAtAlbelli()
//    {
//        ShopAtAlbelli.click();
//    }

}
