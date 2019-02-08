package CommonClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    WebDriver driver;

    public void Login(String username, String password) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".dialog-window.auth-window iframe")));

        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();
    }
}
