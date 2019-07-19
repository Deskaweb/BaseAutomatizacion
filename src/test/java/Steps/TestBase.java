package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase {


        protected WebDriver webDriver;

        @BeforeMethod(alwaysRun = true)
        public void setUp(){
            System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chrome/chromedriver.exe");
            webDriver = new ChromeDriver();
        }


        @AfterMethod(alwaysRun = true)
        public void closeDown(){
            webDriver.close();
        }


}
