package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSteps {


    private WebDriver driver;
    private WebElement BUSCARBOX() {return driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input"));}

    @Given("^se entra a Google$")
    public void EntrarAGoogle(){
        System.setProperty("webdriver.chrome.driver", "./src\\main\\resources\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @When("^se busca la frase")
    public void BuscarPalabra(){
        BUSCARBOX().sendKeys("Esto es una frase");
        BUSCARBOX().submit();
    }

}
