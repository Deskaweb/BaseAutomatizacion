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

    //private WebDriver webDriver;


    LoginPageMiArgentina page = new LoginPageMiArgentina(webDriver);
    MainPageMiArgentina mainPage = new MainPageMiArgentina(webDriver);

    @Given("^se ingresa a la web Mi Argentina$")
    public void EntrarAGoogle(){
        ////De esto se encarga el TestBase
        System.setProperty("webdriver.chrome.driver", "./src\\main\\resources\\bin\\chromedriver.exe");
        //Se hereda el webdriver del testbase y se abre la pagina desde el metodo de la clase LoginPageMiArgentina

        //page.ingresarWeb(webDriver);

        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://id.argentina.gob.ar/ingresar/?next=/");
        webDriver.manage().window().maximize();
        page.buscarElementos(webDriver);


    }

    @When("^se ingresa con el usuario \"([^\"]*)\" y la \"([^\"]*)\"$")
    public void IngresarConUser(String user, String pass){


        page.ingresarUsuario(user, pass);
    }

    @Then("se verifica menu princial")
    public void VerificarMenuPrincipal(){
        WebElement BTN_GUARDARCAMBIOS;// = webDriver.findElement(By.xpath("/html/body/main/section/div/div/div/div/div[2]/form/fieldset/div[4]/div/div/button"));
        BTN_GUARDARCAMBIOS = webDriver.findElement(By.xpath("//*[@class='btn btn-link']"));
        BTN_GUARDARCAMBIOS.click();

        mainPage.espera(4);
        mainPage.buscarElementos(webDriver);
        mainPage.verificarMenuPrincipal();
    }

    @When("se ingresa al menu \"([^\"]*)\"$")
    public void IngresarAMenu(String Menu){
       if ("Billetera".equals(Menu)) {
           mainPage.ingresarAMiBilletera();
        } else if ("Salud".equals(Menu)) {
           mainPage.ingresarAMiSalud();
        } else if ("Turnos".equals(Menu)) {
           mainPage.ingresarAMisTurnos();
        }

    }


}
