package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends Page {


    private WebElement textBoxCuilOPasaporte;
    private WebElement textBoxContraseña;
    private WebElement labelOlvidasteContraseña;
    private WebElement buttonIngresar;
    private WebElement buttonFacebook;
    private WebElement buttonGoogle;
    private WebElement buttonCreaTuCuenta;


    public Login(WebDriver webDriver) {
        super(webDriver);
        //this.textBoxCuilOPasaporte = webDriver.findElement(By.id("cuil"));
        this.textBoxCuilOPasaporte = webDriver.findElement(By.xpath("//*[@id='cuil']"));
        this.textBoxContraseña = webDriver.findElement(By.xpath("//*[@id='password_confirmacion']"));
        this.buttonIngresar = webDriver.findElement(By.xpath("//*[@id='login']"));
    }

    public WebElement getTextBoxCuilOPasaporte() {
        return textBoxCuilOPasaporte;
    }

    public void setTextBoxCuilOPasaporte(WebElement textBoxCuilOPasaporte) {
        this.textBoxCuilOPasaporte = textBoxCuilOPasaporte;
    }

    public WebElement getTextBoxContraseña() {
        return textBoxContraseña;
    }

    public void setTextBoxContraseña(WebElement textBoxContraseña) {
        this.textBoxContraseña = textBoxContraseña;
    }

    public WebElement getLabelOlvidasteContraseña() {
        return labelOlvidasteContraseña;
    }

    public void setLabelOlvidasteContraseña(WebElement labelOlvidasteContraseña) {
        this.labelOlvidasteContraseña = labelOlvidasteContraseña;
    }

    public WebElement getButtonIngresar() {
        return buttonIngresar;
    }

    public void setButtonIngresar(WebElement buttonIngresar) {
        this.buttonIngresar = buttonIngresar;
    }

    public WebElement getButtonFacebook() {
        return buttonFacebook;
    }

    public void setButtonFacebook(WebElement buttonFacebook) {
        this.buttonFacebook = buttonFacebook;
    }

    public WebElement getButtonGoogle() {
        return buttonGoogle;
    }

    public void setButtonGoogle(WebElement buttonGoogle) {
        this.buttonGoogle = buttonGoogle;
    }

    public WebElement getButtonCreaTuCuenta() {
        return buttonCreaTuCuenta;
    }

    public void setButtonCreaTuCuenta(WebElement buttonCreaTuCuenta) {
        this.buttonCreaTuCuenta = buttonCreaTuCuenta;
    }
}
