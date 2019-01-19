import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;

public class keyboardEvents extends base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = Capabilities();

        System.out.println(driver.currentActivity()); //which app is running
        System.out.println(driver.getContext()); //to check automatically wheather it is native or habrid up
        System.out.println(driver.getOrientation()); //what is the current orientation of emulator/device
        System.out.println(driver.isDeviceLocked()); //is the app locked or not?
        driver.pressKeyCode(AndroidKeyCode.BACK); //to use the device buttons back, home
    }
}