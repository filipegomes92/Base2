package tests;

import com.sun.org.glassfish.gmbal.Description;
import org.junit.After;
import org.junit.Test;
import pages.LoginPage;

public class LoginTests {
    LoginPage loginPage = new LoginPage();
    @Test
    @Description("Valida feedback e usuario ou senha inválidos")
    public void ValidaLoginUserOuSenhaIncorreto(){
        loginPage.TelaDeLogin();
        loginPage.InsereUsuario("Filipe_Gome");
        loginPage.ClickEntrarUsuario();
        loginPage.InsereSenha("teste478");
        loginPage.ClickEntrarSenha();
        loginPage.ValidaUsuarioOuSenhaIncorreto();
    }
    @Test
    @Description("Valida Login com sucesso informando usuario e senha corretos")
    public void ValidaLoginComSucesso(){
        loginPage.TelaDeLogin();
        loginPage.InsereUsuario("Filipe_Gomes");
        loginPage.ClickEntrarUsuario();
        loginPage.InsereSenha("teste123");
        loginPage.ClickEntrarSenha();
        loginPage.ValidaTelaLogado();
    }
    @After
    public void EncerraNavegador(){
        LoginPage.driver.quit();
    }
}
