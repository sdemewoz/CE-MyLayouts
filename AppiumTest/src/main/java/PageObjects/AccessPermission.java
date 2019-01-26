package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AccessPermission {
    public AccessPermission(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = ( "new UiSelector().text(\"ALLOW\")"))
    public WebElement Allow;

    //if permission popup displayed, click allow
    public void clickAllowPermision(){
        if (Allow.isDisplayed()) {
            Allow.click();
        }
    }

}
