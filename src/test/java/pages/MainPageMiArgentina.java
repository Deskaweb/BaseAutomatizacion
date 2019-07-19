package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageMiArgentina extends Page {


    private WebElement LBL_MICUENTA;
    private WebElement BTN_MIBILLETERA;
    private WebElement BTN_MISVEHICULOS;
    private WebElement BTN_MISALUD;
    private WebElement BTN_MIEDUCACION;
    private WebElement BTN_MISTURNOS;
    private WebElement BTN_MIPROVINCIA;

    public MainPageMiArgentina(WebDriver webDriver) {
        super(webDriver);

    }

    public void buscarElementos(WebDriver webDriver)
    {
        this.LBL_MICUENTA = webDriver.findElement(By.xpath("//*[@id='dropdown-micuenta']"));
        this.BTN_MIBILLETERA = webDriver.findElement(By.xpath("//*[@id=\"navMenu\"]/ul/li[2]/a/div/div[2]/p"));
        this.BTN_MISVEHICULOS = webDriver.findElement(By.xpath("//*[@id=\"navMenu\"]/ul/li[4]/a/div/div[2]/p"));
        this.BTN_MISALUD = webDriver.findElement(By.xpath("//*[@id=\"navMenu\"]/ul/li[5]/a/div/div[2]/p"));
        this.BTN_MIEDUCACION = webDriver.findElement(By.xpath("//*[@id=\"navMenu\"]/ul/li[6]/a/div/div[2]/p"));
        this.BTN_MISTURNOS = webDriver.findElement(By.xpath("//*[@id=\"navMenu\"]/ul/li[3]/a/div/div[2]/p"));
        this.BTN_MIPROVINCIA = webDriver.findElement(By.xpath("//*[@id=\"navMenu\"]/ul/li[6]/a/div/div[2]/p"));

    }

    public void verificarMenuPrincipal(){

        this.LBL_MICUENTA.isDisplayed();
        Assert.assertTrue(this.BTN_MIBILLETERA.getText().contains("Mi billetera"));
        Assert.assertTrue(this.BTN_MISALUD.getText().contains("Mi salud"));
        Assert.assertTrue(this.BTN_MISVEHICULOS.getText().contains("Mis vehículos"));
        Assert.assertTrue(this.BTN_MIPROVINCIA.getText().contains("Mi provincia"));
    }

    public void ingresarAMiBilletera(){
        BTN_MIBILLETERA.click();
    }

    public void ingresarAMiSalud(){
        BTN_MISALUD.click();
    }

    public void ingresarAMisTurnos(){
        BTN_MISTURNOS.click();
    }


}
