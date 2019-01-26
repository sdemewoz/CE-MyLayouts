import PageObjects.*;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class AddPhotoInToPage {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver driver = base.Capabilities();

        Home homepage = new Home(driver);
        WaitForElements element = new WaitForElements();
        element.WaitForElement(driver, homepage.ShopAtAlbelli);
        homepage.ClickShopAtAlbelli();

        TourPage tour = new TourPage(driver);
        tour.Skip.click();

        ProductSelection products = new ProductSelection(driver);
        products.clickPhotoBooks();

        ProductSizes sizes = new ProductSizes(driver);
        sizes.LandscapeS.click();

        AccessPermission permission = new AccessPermission(driver);
        permission.clickAllowPermision();

       ImportPhotos importPhotos = new ImportPhotos(driver);
       importPhotos.clickCamera();

        importPhotos.Image1.click();
        importPhotos.AddButton.click();

        Preferences start = new Preferences(driver);
        start.StartEmpty.click();
        start.NextButton.click();

        PhotoBookPage photoBookPage = new PhotoBookPage(driver);
        photoBookPage.PhotoTab.click();

        //use swapping
        TouchAction t =new TouchAction(driver);
        t.longPress(element(photoBookPage.Image_1)).moveTo(element(photoBookPage.Page_1)).release().perform(); //if we want to logpress for amount of times, then we should use longpressoption

        //verify that badge is visible on the Image1
        photoBookPage.Badge_1.isDisplayed();
    }
}
