package pages;

import base.BaseTests;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseTests {

    public void InsereUsuario(String user){
        driver.findElement(By.id("username")).sendKeys(user);
    }
    public void ClickEntrarUsuario(){
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/input[2]")).click();
    }
    public void ClickEntrarSenha(){
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/input[3]")).click();
    }
    public void InsereSenha(String senha){
        driver.findElement(By.id("password")).sendKeys(senha);
    }
    public void ValidaUsuarioOuSenhaIncorreto(){
        String valida = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div/div[4]")).getText();
        Assert.assertEquals("Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos.",valida);
    }
    public void ValidaTelaLogado(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("menu-text")));
    }
    public void RealizaLogin(String usuario, String senha){
        TelaDeLogin();
        InsereUsuario(usuario);
        ClickEntrarUsuario();
        InsereSenha(senha);
        ClickEntrarSenha();
        ValidaTelaLogado();
    }
}
