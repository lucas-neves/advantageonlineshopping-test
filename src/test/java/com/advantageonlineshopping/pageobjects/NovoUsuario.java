package com.advantageonlineshopping.pageobjects;

import com.advantageonlineshopping.base.BaseForPages;
import com.advantageonlineshopping.base.Wait;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * @author lucasns
 * @since #1.0
 */
@Component
@ConfigurationProperties(prefix = "novousuario")
public class NovoUsuario extends BaseForPages {

    private final By divRegister = By.id("registerCover");
    private final By inputUsername = By.name("usernameRegisterPage");
    private final By inputEmail = By.name("emailRegisterPage");
    private final By inputPassword = By.name("passwordRegisterPage");
    private final By inputConfirmPassword = By.name("confirm_passwordRegisterPage");
    private final By inputFirstName = By.name("first_nameRegisterPage");
    private final By inputLastName = By.name("last_nameRegisterPage");
    private final By inputPhoneNumber = By.name("phone_numberRegisterPage");
    private final By inputCountry = By.name("countryListboxRegisterPage");
    private final By inputCity = By.name("cityRegisterPage");
    private final By inputAddress = By.name("addressRegisterPage");
    private final By inputState = By.name("state_/_province_/_regionRegisterPage");
    private final By inputPostalCode = By.name("postal_codeRegisterPage");
    private final By cbxTerms = By.name("i_agree");
    private final By btnRegister = By.id("register_btnundefined");
    private final By lblInvalidField = By.cssSelector("#formCover label.invalid");

    public void validarPagina() {
        if (Wait.setWait(5000, () -> Wait.urlContains("/register"))) {
            Assert.assertTrue("Formulário de cadastro não está aparecendo", isDisplayed(divRegister));
        }
    }

    public void preencherUsername(String username) {
        log.debug("preencherUsername");
        preencherCampo(inputUsername, username);
    }

    public void preencherEmail(String email) {
        log.debug("preencherEmail");
        preencherCampo(inputEmail, email);
    }

    public void preencherSenha(String password) {
        log.debug("preencherSenha");
        preencherCampo(inputPassword, password);
        preencherCampo(inputConfirmPassword, password);
    }

    public void preencherNome(String nome, String sobrenome) {
        log.debug("preencherNome");
        preencherCampo(inputFirstName, nome);
        preencherCampo(inputLastName, sobrenome);
    }

    public void preencherTelefone(String telefone) {
        log.debug("preencherTelefone");
        preencherCampo(inputPhoneNumber, telefone);
    }

    public void selecionarPais(String pais) {
        log.debug("selecionarPais");
        selecionarCombo(inputCountry, pais);
    }

    public void preencherCidade(String cidade) {
        log.debug("preencherCidade");
        preencherCampo(inputCity, cidade);
    }

    public void preencherEndereco(String endereco) {
        log.debug("preencherEndereco");
        preencherCampo(inputAddress, endereco);
    }

    public void preencherEstado(String estado) {
        log.debug("preencherEstado");
        preencherCampo(inputState, estado);
    }

    public void preencherPostalCode(String postalCode) {
        log.debug("preencherPostalCode");
        preencherCampo(inputPostalCode, postalCode);
    }

    public void aceitarTermos() {
        log.debug("aceitarTermos");
        clicar(cbxTerms);
    }

    public void clicarBotaoCadastrar() {
        log.debug("clicarBotaoCadastrar");
        clicar(btnRegister);
    }

    public void validarErroNoCampo(String mensagem) {
        log.debug("validarErroNoCampo");
        List<WebElement> mensagens = checkElements(lblInvalidField);
        Optional<WebElement> elementMsg = mensagens.stream()
                .filter(m -> m.getText().equals(mensagem))
                .findAny();
        Assert.assertTrue("Erro não visível!", elementMsg.isPresent());
    }
}