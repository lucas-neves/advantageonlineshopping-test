package com.advantageonlineshopping.pageobjects;

import com.advantageonlineshopping.base.BaseForPages;
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
@ConfigurationProperties(prefix = "login")
public class LoginPopUp extends BaseForPages {

    private final By inputUsername = By.name("username");
    private final By inputPassword = By.name("password");
    private final By cbxRememberMe = By.name("remember_me");
    private final By btnSignUp = By.id("sign_in_btnundefined");
    private final By lblInvalidField = By.cssSelector(".login label.invalid");
    private final By lblInvalidLogin = By.cssSelector(".login #signInResultMessage");

    public void preencherUsername(String username) {
        log.debug("preencherUsername");
        preencherCampo(inputUsername, username);
    }

    public void preencherSenha(String password) {
        log.debug("preencherSenha");
        preencherCampo(inputPassword, password);
    }

    public void clicarCbxLembrarMe() {
        log.debug("clicarCbxLembrarMe");
        clicar(cbxRememberMe);
    }

    public void clicarBotaoLogin() {
        log.debug("clicarBotaoLogin");
        clicar(btnSignUp);
    }

    public void validarErroNoCampo(String mensagem) {
        log.debug("validarErroNoCampo");
        List<WebElement> mensagens = checkElements(lblInvalidField);
        Optional<WebElement> elementMsg = mensagens.stream()
                .filter(m -> m.getText().equals(mensagem))
                .findAny();
        Assert.assertTrue("Erro não visível!", elementMsg.isPresent());
    }

    public void validarErroLogin(String mensagem) {
        log.debug("validarErroLogin");
        Assert.assertEquals("Mensagem incorreta!", mensagem, getText(lblInvalidLogin));
    }
}