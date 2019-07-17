package Steps;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Login;

public class Tests {

    private WebDriver webDriver;
    private String url= "https://mi.argentina.gob.ar";



    @Test
    public void logearse()
    {
        System.setProperty("webdriver.chrome.driver","src/main/resources/bin/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://mi.argentina.gob.ar");
        Login login = new Login(webDriver);
        login.getTextBoxCuilOPasaporte().sendKeys("20375568897");
        login.getTextBoxContraseña().sendKeys("37556889Ga");
        login.getButtonIngresar().click();

        String bienvenida = webDriver.findElement(By.xpath("//*[@id='misTramitesYTurnos']/div[1]/div/div")).getText();

        System.out.println(bienvenida);


        webDriver.close();
    }
}
