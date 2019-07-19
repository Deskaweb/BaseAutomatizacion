package Steps;
import cucumber.api.java.Before;

public class Hook {


    @Before
    public void beforeScenario(){
        System.setProperty("webdriver.chrome.driver", "./src\\main\\resources\\bin\\chromedriver.exe");
    }
}
