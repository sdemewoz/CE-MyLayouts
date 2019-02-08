package bindings;

import CommonClass.Login;
import CommonClass.UploadPicture;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.io.File;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class filterPicture {

    WebDriver driver;


    public void Login(String username, String password) {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".dialog-window.auth-window iframe")));

        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();
    }

    public void UploadPicture(String imagePath) {
        File imageDir = new File(imagePath);
        String path = imageDir.getAbsolutePath();
        WebElement upload = driver.findElement(By.cssSelector(".simple-editor .file-reference input"));
        upload.sendKeys(path);
    }

    @Given("I open albelli websites")
    public void iOpenAlbelliWebsites() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://editor.albelli.nl/html5/?articleType=PhotoBook&papId=PAP_347#/editor");
    }
    @And("I login with {string} and {string} credencials")
    public void iLoginWithAndCredencials(String username, String password) {
        Login(username, password);
    }

    @When("I dismis the tootltip")
    public void iDismisTheTootltip() throws InterruptedException {
        driver.findElement(By.id("photoCoverNo")).click();
        driver.findElement(By.id("layflatNo")).click();
        driver.findElement(By.id("upsellConfirmationButton")).click();

        Thread.sleep(1000);
        //to click away tooltip
        WebElement button = driver.findElement(By.cssSelector("div[class*='icon-exit']"));
        Actions action = new Actions(driver);
        action.moveToElement(button).click().build().perform();
    }

    @And("I add a picture and select")
    public void iAddAPictureAndSelect() throws InterruptedException, AWTException {

          UploadPicture("src/main/resources/nasa.jpg");
          UploadPicture("src/main/resources/nasa1.jpg");
    }

    @Then("I see edit options")
    public void iSeeEditOptions() throws InterruptedException {

        WebElement from = driver.findElement(By.className("photo-image")); //picture on gallary
        WebElement photo1 = driver.findElement(By.id("productCanvas")); //placeholder on page

       //to drag and drop a picture into page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // query test helper on browser and get first placeholder position
        Map<String, Double> firstPlaceholderPosition =
                (Map<String, Double>) js.executeScript("return window.testHelper.getFirstPlaceholderCoordinates()");

        Actions actions = new Actions(driver);
        Integer placeholderX = photo1.getLocation().getX() + firstPlaceholderPosition.get("centerX").intValue();
        Integer placeholderY = photo1.getLocation().getY() + firstPlaceholderPosition.get("centerY").intValue();

        //x and y coordinate of placeholder on page
        int moveToX = placeholderX - from.getLocation().getX();
        int moveToY = placeholderY - from.getLocation().getY();

        actions.dragAndDropBy(from, moveToX, moveToY).click().build().perform();

        //virify filter option is displayed
        WebElement panel = driver.findElement(By.id("placeholderToolsPanel"));
        System.out.println(panel.isDisplayed());

        //click on rotate option
        driver.findElement(By.id("rotateButton")).click();
        driver.quit();
    }
}

