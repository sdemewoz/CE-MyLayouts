import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class scroll {
    public static void main(String[] args) throws MalformedURLException{
        AndroidDriver driver = base.Capabilities();
        //appium doesnt have scroll method but we should use android api methods
        //we need to execute android selectors

        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");



    }
}
