package org.appiumFramework.config;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Appiumconfig {

    //se crean las desiredcapabilities que son las caracteristicas deseadas del telefono y app a automatizar
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
    //la siguiente funcion sirve para devolver las capabilities que seteamos previamente.
    public static DesiredCapabilities getCapabilities() {
        return capabilities;
    }
     //la siguiente funcion sirve para devolver el server del appium para correr nuestros tests.
    public static URL getAppiumServerURL() {
        try {
            return new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
            //devuelve null porque al haber un error tiene que ser detectado.
        }
    }
}

