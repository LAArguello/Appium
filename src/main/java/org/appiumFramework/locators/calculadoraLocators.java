package org.appiumFramework.locators;

public class calculadoraLocators {


    //en el siguiente enum (numeracion de elementos) vamos a ir colocando los locators que necesitemos
    public enum locators {
        numerodos("//android.widget.ImageButton[@content-desc=\"2\"]"),
        signomas("//android.widget.ImageButton[@content-desc=\"más\"]"),
        signomenos("//android.widget.ImageButton[@content-desc=\"menos\"]"),
        igual("//android.widget.ImageButton[@content-desc=\"igual a\"]"),
        resultadoFinal("//*[@resource-id=\"com.google.android.calculator:id/result_final\"]");

        public String text;

        locators(String locator) {
            this.text = locator;
        }

        public String getText() {
            return text;
        }
    }
}

