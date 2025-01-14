package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroPage {

    WebDriver driver;

    //Variavel maiuscula quer Final. Uma variavel que muda pouco ou nunca o seu valor.
    String REGISTRAR = "//a[@id='btnRegister']";
    String EMAIL = "//input[@id='inputEmail']";
    String NOME = "//input[@id='inputName']";
    String SENHA = "//input[@id='inputPassword']";
    String CONFIRM_SENHA = "//input[@id='inputPasswordConfirmation']";
    String CRIAR_SALDO = "//span[@id='toggleAddBalance']";
    String CADASTRAR = "//a[@id='btnRegister']";
    String FECHAR = "//a[contains(text(),'Fechar')]";

    public CadastroPage(WebDriver driverParametro) {//Metodo construtor
        this.driver = driverParametro;

    }

    public void clicarRegistrar() {
        driver.findElement(By.xpath(REGISTRAR)).click();

    }

    public void preencherEmail(String email) {
        driver.findElement(By.xpath(EMAIL)).sendKeys(email);

    }

    public void preencherNome(String nome) {
        driver.findElement(By.xpath(NOME)).sendKeys(nome);
    }

    public void preencherSenha(String senha) {
        driver.findElement(By.xpath(SENHA)).sendKeys(senha);
    }

    public void preencherConfirmacaoSenha(String confirmacao) {
        driver.findElement(By.xpath(CONFIRM_SENHA)).sendKeys(confirmacao);

    }

    public void clicarEmCriarComSaldo() {
        driver.findElement(By.xpath(CRIAR_SALDO)).click();
    }

    public void clicarCadastrar() {
        driver.findElement(By.xpath(CADASTRAR)).click();
    }

    public void clicarFechar() {
        WebElement btnFechar = new WebDriverWait(driver, 10000)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(FECHAR)));
        btnFechar.click();
    }

}
