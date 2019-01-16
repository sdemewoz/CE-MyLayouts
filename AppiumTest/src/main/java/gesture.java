import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class gesture extends base {

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = Capabilities();

        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Tap
        TouchAction t =new TouchAction(driver);
        WebElement expandList=	driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
        t.tap(tapOptions().withElement(element(expandList))).perform(); //to tab instead of click

        driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
        WebElement presselement = driver.findElementByXPath("//android.widget.TextView[@text='People Names']") ;

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        t.longPress(longPressOptions().withElement(element(presselement)).withDuration(ofSeconds(2))).release().perform();
        //the same validate with different way
        System.out.println(driver.findElementById("android:id/title").isDisplayed());
        System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().enabled(true)")); //android code
    }
}
