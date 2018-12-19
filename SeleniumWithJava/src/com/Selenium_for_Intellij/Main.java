package com.Selenium_for_Intellij;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello Selenium");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sdemewoz\\Downloads\\chromedriver.exe");
       // System.setProperty("webdriver.gecko.driver","C:\\Users\\sdemewoz\\Downloads\\geckodriver.exe");

        //WebDriver obj =  new FirefoxDriver();
        WebDriver obj1 = new ChromeDriver();
        obj1.get("https://www.google.com");
    }
}
