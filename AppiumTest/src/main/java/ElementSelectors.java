import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class ElementSelectors extends base{

    AndroidDriver driver = Capabilities();

    public ElementSelectors() throws MalformedURLException {
        //Valid locator strategies for this request: xpath, id, class name, accessibility id, -android uiautomator
        //class name can be used as tagname
        //the locator value should be unique for each element

       /* Scenario:
        Open Demo app
            Select Preference
        select preference dependecny
        click on wifi checkbox
        click on wifi setting
        enter value
        click ok        */

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
        driver.findElementById("android:id/edit").sendKeys("albelli");
        driver.findElementById("android:id/button1").click();
        //driver.findElementsByClassName("android.widget.Button").get(2).click(); //optional
    }
}
