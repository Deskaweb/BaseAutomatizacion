package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

import static org.junit.Assert.*;

public class LoginPageMiArgentina extends Page {

    //private WebDriver webDriver;






    //private WebElement IMG_MIARGENTINA() {return webDriver.findElement(By.xpath("/html/body/header/nav/div/div/div/div/a/img"));}
    //private WebElement TXT_CUIT() {return webDriver.findElement(By.xpath("//*[@id='cuil']"));}
    //private WebElement TXT_PASS() {return webDriver.findElement(By.xpath("//*[@id='password_confirmacion']"));}
    //private WebElement BTN_INGRESAR() {return webDriver.findElement(By.xpath("//*[@id='login']"));}
    //private WebElement LBL_MICUENTA() {return webDriver.findElement(By.xpath("//*[@id='dropdown-micuenta']/span"));}

    //this.LBL_MICUENTA = webDriver.findElement(By.xpath("//*[@id='dropdown-micuenta']/span"));
    /*private WebElement BTN_MIBILLETERA(){return webDriver.findElement(By.xpath("//*[@id=\"navMenu\"]/ul/li[2]/a/div/div[2]/p"));}
    private WebElement BTN_MISVEHICULOS(){return webDriver.findElement(By.xpath("//*[@id=\"navMenu\"]/ul/li[4]/a/div/div[2]/p"));}
    private WebElement BTN_MISALUD(){return webDriver.findElement(By.xpath("//*[@id=\"navMenu\"]/ul/li[5]/a/div/div[2]/p"));}
    private WebElement BTN_MIEDUCACION(){return webDriver.findElement(By.xpath("//*[@id=\"navMenu\"]/ul/li[6]/a/div/div[2]/p"));}
    private WebElement BTN_MISTURNOS(){return webDriver.findElement(By.xpath("//*[@id=\"navMenu\"]/ul/li[3]/a/div/div[2]/p"));}
    private WebElement BTN_MIPROVINCIA(){return webDriver.findElement(By.xpath("//*[@id=\"navMenu\"]/ul/li[6]/a/div/div[2]/p"));}*/

    //@FindBy(xpath = ("/html/body/header/nav/div/div/div/div/a/img"))
    private WebElement IMG_MIARGENTINA;
    //@FindBy(xpath = ("//*[@id='cuil']"))
    private WebElement TXT_CUIT;
    //@FindBy(xpath = ("//*[@id='password_confirmacion']"))
    private WebElement TXT_PASS;
    //@FindBy(xpath = ("//*[@id='login']"))
    private WebElement BTN_INGRESAR;
    //@FindBy(xpath = ("//*[@id='dropdown-micuenta']/span"))
    private WebElement LBL_MICUENTA;

    private WebElement BTN_GUARDARCAMBIOS;

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
    public void ingresarWeb(WebDriver webDriver){
        //De esto se encarga el TestBase
        //System.setProperty("webdriver.chrome.driver", "./src\\main\\resources\\bin\\chromedriver.exe");
        //webDriver.manage().window().maximize();
        webDriver.get("https://id.argentina.gob.ar/ingresar");
        espera(3);
    }

    public void verificarInicio() {
        this.IMG_MIARGENTINA.isDisplayed();

    }

    public void ingresarUsuario(String User, String Pass){
        this.TXT_CUIT.sendKeys(User);
        this.TXT_PASS.sendKeys(Pass);
        this.BTN_INGRESAR.click();
    }
/*
    public void verificarMenuPrincipal(){
        this.LBL_MICUENTA.isDisplayed();
        assertTrue(BTN_MIBILLETERA().getText().contains("Mi Billetera"));
        assertTrue(BTN_MISALUD().getText().contains("Salud"));
        assertTrue(BTN_MISVEHICULOS().getText().contains("Vehiculos"));
        assertTrue(BTN_MIPROVINCIA().getText().contains("Provincia"));
    }

    public void ingresarAMiBilletera(){
        BTN_MIBILLETERA().click();
    }

    public void ingresarAMiSalud(){
        BTN_MISALUD().click();
    }

    public void ingresarAMisTurnos(){
        BTN_MISTURNOS().click();
    }
*/

}
