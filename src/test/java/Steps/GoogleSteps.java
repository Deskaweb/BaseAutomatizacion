package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSteps {


    private WebDriver driver;

    private WebElement TXT_CUIT() {return driver.findElement(By.cssSelector("#cuil"));}
    private WebElement TXT_PASS() {return driver.findElement(By.xpath("//*[@id='password_confirmacion']"));}
    private WebElement BTN_INGRESAR() {return driver.findElement(By.xpath("//*[@id='login']"));}

    @Given("^se entra a Google$")
    public void EntrarAGoogle(){
        System.setProperty("webdriver.chrome.driver", "./src\\main\\resources\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://id.argentina.gob.ar/ingresar");
    }

    @When("^se busca la frase")
    public void BuscarPalabra(){
        TXT_CUIT().sendKeys("20387030019");
        TXT_PASS().sendKeys("Brenda1502");
        BTN_INGRESAR().click();
    }

}
