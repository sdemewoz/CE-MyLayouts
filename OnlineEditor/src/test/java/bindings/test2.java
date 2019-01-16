package bindings;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test2 {

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

    @Given("^I open albelli website$")
    public void i_open_albelli_website() throws Exception {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://editor.albelli.nl/html5/?articleType=PhotoBook&papId=PAP_347#/editor");
    }

    @Given("^I login with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_login_with_and(String username, String password) throws InterruptedException {
        LoginIn("seniselam21@gmail.com", "seniselam");
    }

    @When("^I click on one of the buttons$")
    public void i_click_on_one_of_the_buttons() throws Exception {
        //choose product extras
        driver.findElement(By.id("photoCoverNo")).click();
        driver.findElement(By.id("layflatNo")).click();
        driver.findElement(By.id("upsellConfirmationButton")).click();

         Thread.sleep(1000);
//        WebDriverWait wait =  new WebDriverWait(driver, 1000);
//
//        WebElement albelli;
//        albelli= wait.until(ExpectedConditions.(By.id("addPhotoToGalleryButton")));

        WebElement button = driver.findElement(By.cssSelector("div[class*='close icon-exit']"));
        Actions action = new Actions(driver);
        action.moveToElement(button).click().build().perform();

//        String pseudo = ((JavascriptExecutor)driver)
//                .executeScript("return window.getComputedStyle(arguments[0], ':before').getPropertyValue('icon-exit');",button).toString();
//       System.out.println(pseudo);
    }

    @Then("^something is visible$")
    public void something_is_visible() throws Exception {
        WebElement verify = driver.findElement(By.id("addPhotoToGalleryButton"));
        Assert.assertTrue("Button is not enabled", verify.isEnabled());
        //driver.close();
    }
}
