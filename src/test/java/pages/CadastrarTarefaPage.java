package pages;

import base.BaseTests;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class CadastrarTarefaPage extends BaseTests {

    LoginPage loginPage = new LoginPage();
    public void ClickCriarTarefa(){
        loginPage.RealizaLogin("Filipe_Gomes","teste123");
        driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[1]/div/a")).click();
    }
    public void SelecionaCategoria(String valorcategoria){
        WebElement categoria = driver.findElement(By.id("category_id"));
        Select select = new Select(categoria);
        select.selectByValue(valorcategoria);
    }
    public void PreencheResumo(String resumo){
        driver.findElement(By.id("summary")).sendKeys(resumo);
    }
    public void PreencheDescricao(String descricao){
        driver.findElement(By.id("description")).sendKeys(descricao);
    }
    public void ClickCriarNovaTarefa(){
        driver.findElement(By.xpath("//*[@id=\"report_bug_form\"]/div/div[2]/div[2]/input")).click();
    }
    public void ValidaerroSemCategoria(){
        String mensagemerro = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/p[2]")).getText();
        Assert.assertEquals("Um campo necessário 'category' estava vazio. Por favor, verifique novamente suas entradas.",mensagemerro);
    }
    public void ValidaCriarNovaTarefaComSucesso(){
        String mensagemsucesso = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div/div[2]/p")).getText();
        Assert.assertEquals("Operação realizada com sucesso.",mensagemsucesso);
    }

}