import PageObjects.Home;
import PageObjects.WaitForElements;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class AddPhotoInToPage {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver driver = base.Capabilities();

        Home homepage = new Home(driver);
        WaitForElements element = new WaitForElements();
        element.WaitForElement(driver, homepage.ShopAtAlbelli);
        homepage.ClickShopAtAlbelli();

       // element.click();
        driver.findElementByAndroidUIAutomator("text(\"SKIP TOUR\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Photo books\")").click();
        driver.findElementByAndroidUIAutomator("text(\"13 x 10 cm\")").click();

        //if permission popup displayed, click allow
        WebElement button = driver.findElementByAndroidUIAutomator("text(\"ALLOW\")");
        if (button.isDisplayed()) {
            button.click();
        }

        driver.findElementByAndroidUIAutomator("text(\"Camera\")").click();
        driver.findElementById("nl.albumprinter.smartphone.editor:id/import_image").click();
        driver.findElementByXPath("//android.widget.TextView[@content-desc='Add']").click();
        driver.findElementByAndroidUIAutomator("text(\"icon-pencil\")").click();
        driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
        driver.findElementByAndroidUIAutomator("text(\"PHOTOS\")").click();

        //use swapping
        TouchAction t =new TouchAction(driver);
        WebElement photo =	driver.findElementByXPath("//android.view.View[@bounds='[357,2380][672,2695]']"); //image doesnt have proper value, id or text
        WebElement page =	driver.findElementByXPath("//android.view.View[@bounds='[420,353][1029,672]']");
        t.longPress(element(photo)).moveTo(element(page)).release().perform(); //if we want to logpress for amount of times, then we should use longpressoption

        //verify that badge is visible on the image
        driver.findElementByAndroidUIAutomator("text(\"1\")").isDisplayed();
    }
}
