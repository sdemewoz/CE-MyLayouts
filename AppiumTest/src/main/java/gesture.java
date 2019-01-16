import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class gesture extends base {

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = Capabilities();

        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Tap
        TouchAction t =new TouchAction(driver);
        WebElement expandList=	driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
        //WebElement expandList=	driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']");
        t.tap(tapOptions().withElement(element(expandList))).perform();
    }
}
