package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.print.DocFlavor.URL;


public class Main {
    static AppiumDriver<MobileElement> driverappium;

    public static void main(String[] args) {
       openApp();

    }
    public static void openApp()  {

        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability("deviceName", "S20 FE");
        cap.setCapability("id", "RF8R71SMXAE");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "12.0.0");
        cap.setCapability("appPackage", "com.logictex.contactmanager");
        cap.setCapability("appActivity", "com.logictex.contactmanager.MainActivity");
    //    URL url= new URL("http://127.0.0.1:4723/wd/hub");
        driverappium= new AppiumDriver<MobileElement>(cap);

    }
}
