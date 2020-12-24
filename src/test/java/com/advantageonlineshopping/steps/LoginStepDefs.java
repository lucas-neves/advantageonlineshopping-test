package com.advantageonlineshopping.steps;

import com.advantageonlineshopping.TestApplication;
import com.advantageonlineshopping.pageobjects.LoginPopUp;
import com.advantageonlineshopping.pageobjects.PaginaInicial;
import com.advantageonlineshopping.util.Data;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lucasns
 * @since #1.0
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestApplication.class)
@SpringBootTest
public class LoginStepDefs {

    @Autowired
    private PaginaInicial paginaInicial;
    @Autowired
    private LoginPopUp loginPopUp;

    @When("preencho os dados de login corretamente")
    public void preencherLogin() {
        paginaInicial.clicarBotaoMenuUsuario();
        loginPopUp.preencherUsername(Data.get("username"));
        loginPopUp.preencherSenha("Teste123");
        loginPopUp.clicarBotaoLogin();
    }

    @Then("valido o sucesso no login")
    public void validarLogin() {
        paginaInicial.validarMenuUsuario(Data.get("username"));
    }

    @When("não preencho os dados de login")
    public void preencherLoginVazio() {
        paginaInicial.clicarBotaoMenuUsuario();
        loginPopUp.preencherUsername("");
        loginPopUp.preencherSenha("");
        loginPopUp.clicarCbxLembrarMe();
    }

    @Then("valido as mensagens de obrigatoriedade no login")
    public void validarErrosNosCampos() {
        loginPopUp.validarErroNoCampo("Username field is required");
        loginPopUp.validarErroNoCampo("Password field is required");
    }

    @When("preencho os dados de login incorretamente")
    public void preencherLoginIncorreto() {
        paginaInicial.clicarBotaoMenuUsuario();
        loginPopUp.preencherUsername("incorreto");
        loginPopUp.preencherSenha("incorreto");
        loginPopUp.clicarBotaoLogin();
    }

    @Then("valido a mensagem de erro")
    public void validarErroNoLogin() {
        loginPopUp.validarErroLogin("Incorrect user name or password.");
    }
}
