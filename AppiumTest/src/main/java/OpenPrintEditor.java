import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class OpenPrintEditor extends base {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver driver = Capabilities();

        WebElement element = driver.findElementByAndroidUIAutomator("text(\"SHOP AT ALBELLI\")");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(element));

        element.click();
        driver.findElementByAndroidUIAutomator("text(\"SKIP TOUR\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Photo Prints\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Regular prints\")").click();

        //if permission popup displayed, click allow
        WebElement button = driver.findElementByAndroidUIAutomator("text(\"ALLOW\")");
        if (button.isDisplayed()){
            button.click();
        }

        driver.findElementByAndroidUIAutomator("text(\"Camera\")").click();
        driver.findElementById("nl.albumprinter.smartphone.editor:id/import_image").click();
        driver.findElementByXPath("//android.widget.TextView[@content-desc='Add']").click();
        //validate if image edit area is displayed
        System.out.println(driver.findElementByClassName("android.widget.Image").isDisplayed());

        // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Cards\"));");
        //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Personalized mugs\"));"); //investigate
    }
}
