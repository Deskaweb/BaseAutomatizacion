package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PageMiArgentina;


public class DefinitionMiArgentina {

    private WebDriver webDriver;
    PageMiArgentina page = new PageMiArgentina();

    @Given("^se ingresa a la web Mi Argentina$")
    public void EntrarAGoogle(){
        System.setProperty("webdriver.chrome.driver", "./src\\main\\resources\\bin\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://id.argentina.gob.ar/ingresar");
    }

    @When("^se ingresa con el usuario \"([^\"]*)\" y la \"([^\"]*)\"$")
    public void IngresarConUser(String User, String Pass){
        page.ingresarUsuario(User, Pass);
    }

    @Then("se verifica menu princial")
    public void VerificarMenuPrincipal(){
        page.verificarMenuPrincipal();
    }

    @When("se ingresa al menu \"([^\"]*)\"$")
    public void IngresarAMenu(String Menu){
        if ("Billetera".equals(Menu)) {
            page.ingresarAMiBilletera();
        } else if ("Salud".equals(Menu)) {
            page.ingresarAMiSalud();
        } else if ("Turnos".equals(Menu)) {
            page.ingresarAMisTurnos();
        }
    }
}
