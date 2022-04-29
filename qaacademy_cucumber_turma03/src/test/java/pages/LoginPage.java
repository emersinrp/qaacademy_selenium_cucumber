package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    String EMAIL = "//input[@id='inputEmail']";
    String SENHA = "//input[@id='inputPassword']";
    String ACESSAR = "//a[@id='btnAccess']";

    public LoginPage(WebDriver driverVindoDoTeste) {
        this.driver = driverVindoDoTeste;
    }

    public void preencherEmail(String email) {
        driver.findElement(By.xpath(EMAIL)).clear();
        driver.findElement(By.xpath(EMAIL)).sendKeys(email);
    }

    public void preencherSenha(String senha) {
        driver.findElement(By.xpath(SENHA)).clear();
        driver.findElement(By.xpath(SENHA)).sendKeys(senha);
    }

    public void clicarAcessar() {
        driver.findElement(By.xpath(ACESSAR)).click();
    }
}

