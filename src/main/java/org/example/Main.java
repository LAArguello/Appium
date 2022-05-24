package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.print.DocFlavor.URL;


public class Main {
    static AppiumDriver<MobileElement> driverappium;

    public static void main(String[] args) throws InterruptedException {
       openApp();

    }
    public static void openApp() throws InterruptedException {

        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability("deviceName", "S20 FE");
        cap.setCapability("id", "RF8R71SMXAE");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "12.0.0");
        cap.setCapability("appPackage", "com.logictex.contactmanager");
        cap.setCapability("appActivity", "com.logictex.contactmanager.MainActivity");
     // URL url= new URL("localhost/wd/hub");
        driverappium= new AppiumDriver<MobileElement>(cap);
        MobileElement numeroTelefono= driverappium.findElement(By.id("com.logictex.contactmanager:id/TextPhone"));
        MobileElement mail= driverappium.findElement(By.id("com.logictex.contactmanager:id/TextEmail"));
        MobileElement direccion= driverappium.findElement(By.id("com.logictex.contactmanager:id/TextAddress"));
        MobileElement nombreContacto= driverappium.findElement(By.id("com.logictex.contactmanager:id/TextName"));
        MobileElement btnAgregar= driverappium.findElement(By.id("com.logictex.contactmanager:id/BtnAdd"));
        nombreContacto.sendKeys("Marcos Orona");
        mail.sendKeys("Markitosorona@gmail.com");
        direccion.sendKeys("En un barrio de negros");
        numeroTelefono.sendKeys("3804988783");
        btnAgregar.click();

    }
}
