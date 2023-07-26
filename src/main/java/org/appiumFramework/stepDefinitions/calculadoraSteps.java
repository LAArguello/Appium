package org.appiumFramework.stepDefinitions;
import org.appiumFramework.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class calculadoraSteps {

    //instanciamos la clase de la page que creamos previamente para poder utilizar las funciones creadas.
    calculatorPage page= new calculatorPage();

    @Given("el usuario se encuentra en la calculadora")
    public void iniciarCalculadora() {
// este paso esta vacio porque el constructor solo ya inicia el driver y la application
    }
    @When("se realiza la suma dos mas dos")
    public void seRealizaSuma() {
    page.sumar();
    }
    @When("se muestra el resultado")
    public void seVerificaResultado() {

        page.comprobarResultadodeSuma();
    }

}
