import PageObjects.*;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class OpenPrintEditor extends base {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver driver = Capabilities();

        ProductSelection home = new ProductSelection(driver);
        PrintSize size = new PrintSize(driver);
        AccessPermission access = new AccessPermission(driver);
        ImportPhotos importPhoto = new ImportPhotos(driver);
        PrintEditorPage printEditorPage = new PrintEditorPage(driver);
        TourPage tourPage = new TourPage(driver);
        Home homepage = new Home(driver);

        WaitForElements element = new WaitForElements();
        element.WaitForElement(driver, homepage.ShopAtAlbelli);
        homepage.ClickShopAtAlbelli();

        tourPage.Skip.click();
        home.clickPrints();
        size.Regular.click();

        if (access.Allow.isDisplayed()) {
            access.Allow.click();
        }

        importPhoto.Camera.click();
        importPhoto.image.click();
        importPhoto.AddButton.click();
        System.out.println(printEditorPage.ImageOnEditor.isDisplayed());
    }
}
