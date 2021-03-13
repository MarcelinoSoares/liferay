package stepDefinitions;

import io.cucumber.java.pt.*;
import manager.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.FormularioPage;

public class Formulario {

    private WebDriver driver = DriverManager.getDriver();
    private FormularioPage pageFormulario = new FormularioPage(driver);

    @Dado("^que estou na tela de formulario$")
    public void queEstouNaTelaDeFormulario() {
        pageFormulario.irParaUrlFormulario();
    }

    @Quando("^eu insiro todas as outras informações no formulario do usuário$")
    public void euInsiroTodasAsOutrasInformaçõesNoFormularioDoUsuário() {
        pageFormulario.setData("19", "05", "1980");
        pageFormulario.setMensagem("teste");
    }

    @Mas("^eu preencho o nome apenas com caracteres especiais$")
    public void euPreenchoONomeApenasComCaracteresEspeciais() {
        pageFormulario.setNome("@@@@");
    }

    @E("^faço o envio do formulario$")
    public void façoOEnvioDoFormulario() {
        pageFormulario.clicarBtnSubmeter();
    }

    @Então("^vejo a mensagem de erro \"([^\"]*)\"$")
    public void vejoAMensagemDeErro(String mensagem)  {
        String actualMsg = pageFormulario.getErrorMsg();
        Assert.assertEquals("This field is required", mensagem, actualMsg);
    }

    @Mas("^eu preencho o nome apenas com numeros$")
    public void euPreenchoONomeApenasComNumeros() {
        pageFormulario.setNome("2222");
    }
}
