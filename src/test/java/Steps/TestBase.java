package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import cucumber.api.java.Before;
import cucumber.api.java.After;


public class TestBase {


        protected WebDriver webDriver;


        @BeforeMethod
        public void setUp(){
            System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chrome/chromedriver.exe");
            webDriver = new ChromeDriver();
        }


        @AfterMethod
        public void closeDown(){
            webDriver.close();
        }



}
