package com.advantageonlineshopping.pageobjects;

import com.advantageonlineshopping.base.BaseForPages;
import com.advantageonlineshopping.base.Wait;
import com.advantageonlineshopping.util.Data;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author lucasns
 * @since #1.0
 */
@Component
@ConfigurationProperties(prefix = "paginainicial")
public class PaginaInicial extends BaseForPages {

    @Value("${app.baseurl}")
    private String baseurl;
    private final By divOurProducts = By.id("our_products");
    private final By divContact = By.id("contact_us");
    private final By btnMenuUser = By.id("menuUser");
    private final By btnNewAccount = By.cssSelector(".create-new-account");
    private final By btnMenuUserLogged = By.id("menuUserLink");
    private final By divMenuUserLogged = By.id("loginMiniTitle");

    public void iniciar() {
        acessarUrl(baseurl);
        if (Wait.setWait(() -> Wait.visibilityOfElementLocated(divOurProducts))) {
            Wait.setWait(2000);
            Assert.assertTrue("O campo de busca não está aparecendo", isDisplayed(divContact));
        }
    }

    public void clicarBotaoMenuUsuario() {
        log.debug("clicarBotaoMenuUsuario");
        clicar(btnMenuUser);
    }

    public void clicarBotaoNovoUsuario() {
        log.debug("clicarBotaoNovoUsuario");
        clicar(btnNewAccount);
    }

    public void validarMenuUsuario(String usuario) {
        log.debug("validarMenuUsuario");
        Wait.setWait(3000);
        String menuText = getText(btnMenuUserLogged);
        String mensagem = String.format("Menu não contém o nome do usuário. \nUsuario: %s\nMenu: %s", Data.get("usernameTmp"), menuText);
        Assert.assertTrue(mensagem, menuText.contains(usuario));
        clicar(btnMenuUserLogged);
        Assert.assertTrue("Menu não está aparecendo", isDisplayed(divMenuUserLogged));
    }
}