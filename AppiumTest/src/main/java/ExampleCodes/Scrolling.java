package ExampleCodes;//package com.albelli.Pageobject;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.android.AndroidDriver;
//import org.openqa.selenium.Dimension;
//
//public class Scrolling {
//    AndroidDriver driver;
//
//    Dimension size = driver.manage().window().getSize();
//    int x = size.getWidth()/2;
//    int starty = (int) (size.getHeight() * 0.60);
//    int endy = (int) (size.getHeight() * 0.10);
//    driver.swipe(x, starty, x, endy, 2000);
//
//
//    TouchAction action = new TouchAction(driver);
//     action.press(x, starty).moveTo((endX - startX), (endY-startY)).release().perform();
//
//    // Horizontal Swipe by percentages
//    public void horizontalSwipeByPercentage(double startPercentage, double endPercentage, double anchorPercentage) {
//        Dimension size = driver.manage().window().getSize();
//        int anchor = (int) (size.height * anchorPercentage);
//        int startPoint = (int) (size.width * startPercentage);
//        int endPoint = (int) (size.width * endPercentage);
//
//        new TouchAction(driver).press(point(startPoint, anchor)).waitAction(waitOptions(ofMillis(1000)))
//                .moveTo(point(endPoint, anchor)).release().perform();
//    }
//
//    // Vertical Swipe by percentages
//    public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
//        Dimension size = driver.manage().window().getSize();
//        int anchor = (int) (size.width * anchorPercentage);
//        int startPoint = (int) (size.height * startPercentage);
//        int endPoint = (int) (size.height * endPercentage);
//
//        new TouchAction(driver).press(point(anchor, startPoint)).waitAction(waitOptions(ofMillis(1000)))
//                .moveTo(point(anchor, endPoint)).release().perform();
//    }
//}
