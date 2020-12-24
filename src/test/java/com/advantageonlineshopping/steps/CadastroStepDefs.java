package com.advantageonlineshopping.steps;

import com.advantageonlineshopping.TestApplication;
import com.advantageonlineshopping.driver.WebDriverFactory;
import com.advantageonlineshopping.driver.WebDriverRecicle;
import com.advantageonlineshopping.pageobjects.NovoUsuario;
import com.advantageonlineshopping.pageobjects.PaginaInicial;
import com.advantageonlineshopping.util.Data;
import com.github.javafaker.Faker;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.Locale;

import static com.advantageonlineshopping.driver.WebDriverFactory.webDriverInstance;

/**
 * @author lucasns
 * @since #1.0
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestApplication.class)
@SpringBootTest
public class CadastroStepDefs {

    @Autowired
    private PaginaInicial paginaInicial;
    @Autowired
    private NovoUsuario novoUsuario;

    protected Faker faker;

    @Before
    public void setUpBase() {
        faker = new Faker(new Locale("pt-BR"));
        WebDriverFactory.criarNovoWebDriver();
    }

    @Given("estou na página inicial")
    public void acessarPaginaInicial() {
        paginaInicial.iniciar();
    }

    @When("acesso a tela de novo cadastro")
    public void acessarTelaNovoCadastro() {
        paginaInicial.clicarBotaoMenuUsuario();
        paginaInicial.clicarBotaoNovoUsuario();
        novoUsuario.validarPagina();
    }

    @And("preencho todos os campos corretamente")
    public void preencherCadastro() {
        String username = faker.name().username();
        if (username.length() > 15) username = username.substring(15);
        Data.set("usernameTmp", username);
        String email = faker.internet().emailAddress();
        String telefone = faker.phoneNumber().cellPhone();
        String cidade = faker.address().city();
        String endereco = faker.address().fullAddress();
        if (endereco.length() > 50) endereco = endereco.substring(50);
        String estado = faker.address().stateAbbr();
        String cep = faker.address().zipCode();

        novoUsuario.preencherUsername(username);
        novoUsuario.preencherEmail(email);
        novoUsuario.preencherSenha("Teste123");
        novoUsuario.preencherNome("Teste", "QA Automação");
        novoUsuario.preencherTelefone(telefone);
        novoUsuario.selecionarPais("Brazil");
        novoUsuario.preencherCidade(cidade);
        novoUsuario.preencherEndereco(endereco);
        novoUsuario.preencherEstado(estado);
        novoUsuario.preencherPostalCode(cep);
        novoUsuario.aceitarTermos();
        novoUsuario.clicarBotaoCadastrar();
    }

    @Then("valido o sucesso no cadastro")
    public void validarCadastro() {
        paginaInicial.validarMenuUsuario(Data.get("usernameTmp"));
        Data.set("username", Data.get("usernameTmp"));
    }

    @And("não preencho os campos obrigatórios")
    public void preencherCamposVazios() {
        novoUsuario.preencherUsername("");
        novoUsuario.preencherEmail("");
        novoUsuario.preencherSenha("");
        novoUsuario.preencherNome("a", "a");
    }

    @Then("valido as mensagens de obrigatoriedade no cadastro")
    public void validarErrosNosCampos() {
        novoUsuario.validarErroNoCampo("Username field is required");
        novoUsuario.validarErroNoCampo("Email field is required");
        novoUsuario.validarErroNoCampo("Password field is required");
        novoUsuario.validarErroNoCampo("Confirm password field is required");
        novoUsuario.validarErroNoCampo("Use 2 character or longer");
    }

    @After
    public void tearDown(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) webDriverInstance).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
        WebDriverRecicle.recicleWebDriver();
    }
}
