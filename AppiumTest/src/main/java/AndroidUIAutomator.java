import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class AndroidUIAutomator extends base {
    public AndroidUIAutomator() throws MalformedURLException {
        AndroidDriver driver = Capabilities();

        //stntax to use androidUIAutomator locator,
        //to click, use attribute and value: driver.findElementByAndroidUIAutomator(ättribute("value"))
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        //to validate, use properties and value: driver.findElementByAndroidUIAutomator("new UiSelector().property(value)")
        System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)").getSize());
    }
}

