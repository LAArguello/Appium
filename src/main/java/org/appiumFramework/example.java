package org.appiumFramework;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class example {

    //aca empezamos definiendo el driver en vez de ser el "chrome driver como en selenium" utilizamos el Appium driver
    static AppiumDriver<MobileElement> driver_appium;

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        //aca llamamos la funcion que creamos mas abajo para hacer una prueba rapida sin necesidad de la estructura POM
        openApp();
    }

    public static void openApp() throws InterruptedException, MalformedURLException {
        //definimos las capabilities necesarias y las traemos de APPIUMCONFIG
        DesiredCapabilities capabilities = Appiumconfig.getCapabilities();
        //aca traemos la URL que definimos para el server de appium
        URL url = Appiumconfig.getAppiumServerURL();
        if (url == null) {
            System.out.println("Error: Appium Server URL is not valid.");
            return;
        }
        //aca ya inicializamos el driver que creamos pasandole las capabilities necesarias con el server de appium
        driver_appium = new AppiumDriver<>(url, capabilities);
        MobileElement numero2= driver_appium.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"2\"]"));
        MobileElement signomas= driver_appium.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"más\"]"));
        MobileElement signomenos= driver_appium.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"menos\"]"));
        MobileElement igual=driver_appium.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"igual a\"]"));
        numero2.click();
        signomas.click();
        numero2.click();
        igual.click();
        //espera de tiempo
        Thread.sleep(1000);
    }
}
