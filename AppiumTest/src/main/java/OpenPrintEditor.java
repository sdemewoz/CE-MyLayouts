import PageObjects.AccessPermission;
import PageObjects.Home;
import PageObjects.ImportPhotos;
import PageObjects.PrintEditorPage;
import PageObjects.ProductSelection;
import PageObjects.ProductSizes;
import PageObjects.TourPage;
import PageObjects.WaitForElements;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class OpenPrintEditor extends base {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver driver = Capabilities();

        Home homepage = new Home(driver);
      //  WaitForElements element = new WaitForElements();
        WaitForElements.WaitForElement(driver, homepage.ShopAtAlbelli);
        homepage.ClickShopAtAlbelli();

        TourPage tourPage = new TourPage(driver);
        tourPage.Skip.click();

        ProductSelection productSelection = new ProductSelection(driver);
        productSelection.clickPrints();

        ProductSizes size = new ProductSizes(driver);
        size.RegularPrint.click();

        AccessPermission permission = new AccessPermission(driver);
        permission.clickAllowPermision();

        ImportPhotos importPhoto = new ImportPhotos(driver);
        importPhoto.clickCamera();
        importPhoto.Image1.click();
        importPhoto.AddButton.click();

        PrintEditorPage printEditorPage = new PrintEditorPage(driver);
        System.out.println(printEditorPage.ImageOnEditor.isDisplayed());
    }
}
