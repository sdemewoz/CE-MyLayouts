package CommonClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

public class UploadPicture {
    WebDriver driver;

    public void UploadPic(String imagePath) {
        File imageDir = new File(imagePath);
        String path = imageDir.getAbsolutePath();
        WebElement upload = driver.findElement(By.cssSelector(".simple-editor .file-reference input"));
        upload.sendKeys(path);
    }

}
