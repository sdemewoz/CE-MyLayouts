package runners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageobject {

    WebDriver driver;

    public void LoginIn(String username, String password) throws InterruptedException {

//        try {
//            Thread.sleep(6000);
//        } catch (InterruptedException ignored) {
//        }

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".dialog-window.auth-window iframe")));

        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();
    }

    public void Closebrowser(){
        driver.close();
    }
}
