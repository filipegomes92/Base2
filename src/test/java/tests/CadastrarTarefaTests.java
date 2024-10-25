package tests;

import base.BaseTests;
import com.sun.org.glassfish.gmbal.Description;
import org.junit.After;
import org.junit.Test;
import pages.CadastrarTarefaPage;

public class CadastrarTarefaTests extends BaseTests {
    CadastrarTarefaPage cadastrarTarefaPage = new CadastrarTarefaPage();
    @Test
    @Description("Validar criar Tarefa sem seelcinar campo obrigatório")
    public void CriarTarefaSemCategoria(){
        cadastrarTarefaPage.ClickCriarTarefa();
        cadastrarTarefaPage.PreencheDescricao("Teste Automação");
        cadastrarTarefaPage.PreencheResumo("Resumo Automação");
        cadastrarTarefaPage.ClickCriarNovaTarefa();
        cadastrarTarefaPage.ValidaerroSemCategoria();
    }
    @Test
    @Description("Validar Criar tarefa com Sucesso")
    public void CriarTarefaComSucesso(){
        cadastrarTarefaPage.ClickCriarTarefa();
        cadastrarTarefaPage.SelecionaCategoria("2");
        cadastrarTarefaPage.PreencheDescricao("Teste Automação");
        cadastrarTarefaPage.PreencheResumo("Resumo Automação");
        cadastrarTarefaPage.ClickCriarNovaTarefa();
        cadastrarTarefaPage.ValidaCriarNovaTarefaComSucesso();
    }
    @After
    public void EncerrarNavegador(){
        driver.quit();
    }
}
