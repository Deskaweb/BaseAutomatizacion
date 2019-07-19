package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageMiArgentina extends Page {

    private WebElement IMG_MIARGENTINA;
    private WebElement TXT_CUIT;
    private WebElement TXT_PASS;
    private WebElement BTN_INGRESAR;

    public LoginPageMiArgentina(WebDriver webDriver) {
        super(webDriver);

    }


    public void buscarElementos(WebDriver webDriver)
    {
        this.IMG_MIARGENTINA = webDriver.findElement(By.xpath("/html/body/header/nav/div/div/div/div/a/img"));
        this.TXT_CUIT = webDriver.findElement(By.xpath("//*[@id='cuil']"));
        this.TXT_PASS = webDriver.findElement(By.xpath("//*[@id='password_confirmacion']"));
        this.BTN_INGRESAR = webDriver.findElement(By.xpath("//*[@id='login']"));

    }

    public void verificarInicio() {
        this.IMG_MIARGENTINA.isDisplayed();

    }

    public void ingresarUsuario(String User, String Pass){
        this.TXT_CUIT.sendKeys(User);
        this.TXT_PASS.sendKeys(Pass);
        this.BTN_INGRESAR.click();
    }

    public void guardarCambios(WebDriver driver)
    {
        WebElement BTN_GUARDARCAMBIOS;
        BTN_GUARDARCAMBIOS = driver.findElement(By.xpath("//*[@class='btn btn-link']"));
        BTN_GUARDARCAMBIOS.click();

    }


}
