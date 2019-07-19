package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPageMiArgentina;
import pages.MainPageMiArgentina;


public class DefinitionMiArgentina extends TestBase {

    LoginPageMiArgentina page = new LoginPageMiArgentina(webDriver);
    MainPageMiArgentina mainPage = new MainPageMiArgentina(webDriver);

    @Given("^se ingresa a la web Mi Argentina$")
    public void IngresarAMiArgentina(){

        webDriver = new ChromeDriver();
        webDriver.get("https://id.argentina.gob.ar/ingresar/?next=/");
        webDriver.manage().window().maximize();
        page.buscarElementos(webDriver);


    }

    @When("^se ingresa con el usuario \"([^\"]*)\" y la \"([^\"]*)\"$")
    public void IngresarConUser(String user, String pass){

        //Se ingresa el ususario y la contraseña y hace click en ingresar
        page.ingresarUsuario(user, pass);
    }

    @Then("se verifica menu princial")
    public void VerificarMenuPrincipal(){
        //Metodo que hace click en guardar cambios
        page.guardarCambios(webDriver);

        mainPage.espera(4);
        //Se buscan los elementos de la mainpage
        mainPage.buscarElementos(webDriver);
        //ESTE ESTA DANDO ERROR
        mainPage.verificarMenuPrincipal();
    }

    @When("se ingresa al menu \"([^\"]*)\"$")
    public void IngresarAMenu(String menu){
       if ("Billetera".equals(menu)) {
           mainPage.ingresarAMiBilletera();
        } else if ("Salud".equals(menu)) {
           mainPage.ingresarAMiSalud();
        } else if ("Turnos".equals(menu)) {
           mainPage.ingresarAMisTurnos();
        }

    }


}
