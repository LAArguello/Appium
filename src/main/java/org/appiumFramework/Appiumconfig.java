package org.appiumFramework;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Appiumconfig {
    private static final DesiredCapabilities capabilities = new DesiredCapabilities();

    //aca se van a ingresar las capabilities deseadas del mobile a utilizar
    static {
        capabilities.setCapability("deviceName", "R58T406W5WM");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "13.0.0");
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("app", "C:\\Users\\u632698\\Desktop\\Appium\\calculadora.apk");
    }

    public static DesiredCapabilities getCapabilities() {
        return capabilities;
    }
//aca se coloca el servidor de appium
    public static URL getAppiumServerURL() {
        try {
            return new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

