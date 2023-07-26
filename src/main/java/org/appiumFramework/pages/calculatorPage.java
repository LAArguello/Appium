package org.appiumFramework.pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import config.Appiumconfig;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import static org.appiumFramework.locators.calculadoraLocators.locators.*;
import java.net.URL;
import junit.framework.Assert;



public class calculatorPage {
      AppiumDriver<MobileElement> driver_appium;
    public calculatorPage() {
        DesiredCapabilities capabilities = Appiumconfig.getCapabilities();
        URL url = Appiumconfig.getAppiumServerURL();
        if (url == null) {
            System.out.println("Error: Appium Server URL is not valid.");
            return;
        }
        driver_appium = new AppiumDriver<>(url, capabilities);
    }

  public void sumar(){
        driver_appium.findElement(By.xpath(numerodos.getText())).click();
        driver_appium.findElement(By.xpath(signomas.getText())).click();
      driver_appium.findElement(By.xpath(numerodos.getText())).click();
      driver_appium.findElement(By.xpath(igual.getText())).click();
  }
  public void comprobarResultadodeSuma(){
      String resultado=  driver_appium.findElement(By.xpath(resultadoFinal.getText())).getText();
        if(resultado.equals("4")){
            Assert.assertTrue("Correcto", true);

        }
  }


}
