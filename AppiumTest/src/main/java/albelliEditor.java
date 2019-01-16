import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class albelliEditor extends base{
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver driver = Capabilities();

//Start editor
        WebElement element = driver.findElementByAndroidUIAutomator("text(\"SHOP AT ALBELLI\")");

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(element));

        element.click();
        driver.findElementByAndroidUIAutomator("text(\"SKIP TOUR\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Photo books\")").click();

    }
}
