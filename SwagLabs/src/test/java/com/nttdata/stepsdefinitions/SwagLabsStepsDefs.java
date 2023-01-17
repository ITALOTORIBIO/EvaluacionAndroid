package com.nttdata.stepsdefinitions;

import com.nttdata.steps.InventorySwagLabsSteps;
import com.nttdata.steps.LoginSwagLabsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SwagLabsStepsDefs {
    @Steps
    LoginSwagLabsSteps loginSwagLabsSteps;

    @Steps
    InventorySwagLabsSteps inventorySwagLabsSteps;

    @Given("inicio sesión con las credenciales usuario: {string} y contraseña: {string} en la app de Saucedemo")
    public void login(String user, String password) {
        loginSwagLabsSteps.loginCorrect(user,password);
    }

    @Then("valido que debería aparecer el título de {string}")
    public void obtener_titulo(String title){
        Assert.assertEquals(inventorySwagLabsSteps.getTitleText(), title);
    }

    @And("también valido que {string} existe")
    public void obtener_item(String name){
        Assert.assertEquals(inventorySwagLabsSteps.getItemName(), name);
    }



}
