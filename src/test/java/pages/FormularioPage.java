package pages;

import Utils.Constantes;
import manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utils.Comum;

public class FormularioPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private Comum acoesComuns;

    private By campoNome = By.cssSelector("input[class='dmm-field-text.form-control']");
    private By campoData = By.cssSelector("input[class='form-control.input-group-inset.input-group-inset-after']");
    private By campoMensagem = By.cssSelector("textarea[class='dmm-field-text.form-control']");
    private By btnSubmeter = By.cssSelector("button[class='btn.btn-primary.lfr-ddm-form-submit.pull-right']");
    private By msgErro = By.cssSelector("div[class='form-feedback-item.help-block']");

    public FormularioPage(WebDriver driver){
        this.driver = driver;
        acoesComuns = new Comum(driver);
        wait = DriverManager.getDriverWait();
    }

    public void irParaUrlFormulario(){
        acoesComuns.irParaURL(Constantes.LIFERAY_MAIN_URL);
    }

    public void setNome(String nome) {
        acoesComuns.sendKeys(campoNome, nome);
    }

    public void setData(String data) {
        acoesComuns.sendKeys(campoData, data);
    }

    public void setMensagem(String mensagem) {
        acoesComuns.sendKeys(campoMensagem, mensagem);
    }

    public String getErrorMsg() {
        return acoesComuns.getElementText(msgErro);
    }

    public void clicarBtnSubmeter(){
        acoesComuns.clicar(btnSubmeter);
    }

}
